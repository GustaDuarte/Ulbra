package br.com.ulbra.exemplorecycler.presentation.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.recyclerview.widget.RecyclerView
import br.com.ulbra.exemplorecycler.R
import br.com.ulbra.exemplorecycler.data.Product
import br.com.ulbra.exemplorecycler.databinding.ProductItemBinding

class ProductAdapter(
    val goToDetails: (product: Product) -> Unit,
    val removeItem: (product: Product) -> Unit,
) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    private lateinit var context: Context
    private lateinit var binding: ProductItemBinding
    private var list: List<Product> = emptyList()

    fun setUpList(products: List<Product>) {
        this.list = products
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context

        binding = ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[holder.adapterPosition])
        binding.executePendingBindings()
    }

    /// EXPLICAR AULA QUE VEM
    inner class ViewHolder(val binding: ProductItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(product: Product) {
            binding.produto = product

            binding.root.setOnClickListener {
                goToDetails(product)
            }

            binding.root.setOnLongClickListener {
                showPopUpMenu(it, product, context)
                true
            }
        }
    }

    private fun showPopUpMenu(view: View, product: Product, context: Context) {
        PopupMenu(context, view).apply {
            setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.remove -> {
                        removeItem(product)
                        notifyDataSetChanged()
                        true
                    }

                    else -> {
                        Log.i("erro", "erro")
                        false
                    }
                }
            }
            inflate(R.menu.menu_popup)
            show()
        }
    }
}

