package br.com.ulbra.project.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.ulbra.project.R
import br.com.ulbra.project.convertToMoneyWithSymbol
import br.com.ulbra.project.data.models.Product
import com.bumptech.glide.Glide

//Adapter
class ProductAdapter(
    private val items: MutableList<Product>,
    private val goToDetail: (item: Product) -> Unit
) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() { //usado para exibir listas grandes de dados de forma eficiente

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ViewHolder(view) // para visualização do item
    }

    //liga dados do produto ao viewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.rootView.setOnClickListener{
            goToDetail(items[position])
        }

        holder.itemView.rootView.setOnLongClickListener {
            showPopUpMenu(holder.itemView, position)
            true
        }

        holder.priceProduct.text = items[position].price.convertToMoneyWithSymbol()
        holder.nameProduct.text = items[position].name

        Glide.with(context).load(items[position].urlImage).into(holder.imageProduct)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageProduct: ImageView = view.findViewById(R.id.imgProduct)
        val nameProduct: TextView = view.findViewById(R.id.tvProductName)
        val priceProduct: TextView = view.findViewById(R.id.tvProductPrice)
    }

    private fun showPopUpMenu(view: View, position: Int){
        PopupMenu(context, view).apply {
            setOnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.deletar -> {
                        removeItem(items[position])
                        true
                    }

                    else -> false
                }
            }
            inflate(R.menu.menu_popup)
            show()
        }
    }

    fun removeItem(product: Product){
        items.remove(product)
        notifyDataSetChanged()
    }
}