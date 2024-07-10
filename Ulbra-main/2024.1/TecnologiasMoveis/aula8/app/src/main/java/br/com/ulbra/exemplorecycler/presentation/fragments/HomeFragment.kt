package br.com.ulbra.exemplorecycler.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import br.com.ulbra.exemplorecycler.data.Product
import br.com.ulbra.exemplorecycler.presentation.adapters.ProductAdapter
import br.com.ulbra.exemplorecycler.R
import br.com.ulbra.exemplorecycler.commons.Resultado
import br.com.ulbra.exemplorecycler.databinding.FragmentHomeBinding
import br.com.ulbra.exemplorecycler.presentation.viewmodels.ProductViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var adapter: ProductAdapter
    private lateinit var binding: FragmentHomeBinding
    private val mainViewModel: ProductViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ProductAdapter(
            goToDetails = ::goToDetail,
            removeItem = {
//                mainViewModel.removeItem(it)
            }
        )

        observers()
        mainViewModel.getProducts()

        binding.rcProduct.adapter = adapter
    }

    private fun observers() {
        mainViewModel.products.observe(viewLifecycleOwner) { resultadoObservado ->
            when (resultadoObservado) {
                is Resultado.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                    binding.rcProduct.visibility = View.GONE
                }
                is Resultado.Success -> {
                    binding.progressBar.visibility = View.GONE
                    binding.rcProduct.visibility = View.VISIBLE
                    adapter.setUpList(resultadoObservado.data)
                }
                is Resultado.Error -> {
                    binding.progressBar.visibility = View.GONE
                }
            }
        }
    }


    private fun goToDetail(product: Product) {
        Log.i("produto", product.toString())
        val bundle = bundleOf("data" to product)
        findNavController().navigate(R.id.action_homeFragment_to_produtoDetalheActivity, bundle)
    }
}