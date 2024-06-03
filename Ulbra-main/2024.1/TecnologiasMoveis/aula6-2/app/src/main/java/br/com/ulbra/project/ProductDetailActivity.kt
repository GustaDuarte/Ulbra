package br.com.ulbra.project

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productBundle = intent.getSerializableExtra("data") as? Product

        val image = findViewById<ImageView>(R.id.imgProduct)
        val price = findViewById<TextView>(R.id.tvProductPrice)
        val name = findViewById<TextView>(R.id.tvProductName)

        price.text = productBundle?.price
        name.text = productBundle?.name

        Glide.with(this).load(productBundle?.urlImage) .into(image)
    }
}