package br.com.ulbra.project

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter(private val items: MutableList<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        holder.priceProduct.text = items[position].price
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
}