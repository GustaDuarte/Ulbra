package br.com.ulbra.project.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import br.com.ulbra.project.presentation.viewmodels.MainViewModel
import br.com.ulbra.project.R
import br.com.ulbra.project.presentation.adapters.ProductAdapter

//exibir os detalhes na home do app
class HomeFragment : Fragment() {
    private lateinit var productAdapter: ProductAdapter
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { //RecyclerView and adaptador
        super.onViewCreated(view, savedInstanceState)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        //Recycler
        val recycler = view.findViewById<RecyclerView>(R.id.recycler)

        val listOfProducts = mainViewModel.getProducts()
        productAdapter = ProductAdapter(listOfProducts){
            val bundle = bundleOf("data" to it)
            findNavController().navigate(R.id.action_homeFragment_to_productDetailActivity, bundle)
        }

        recycler.adapter = productAdapter
    }
}