package br.com.ulbra.exemplorecycler.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import br.com.ulbra.exemplorecycler.R
import br.com.ulbra.exemplorecycler.data.Product
import br.com.ulbra.exemplorecycler.databinding.FragmentAdicionarBinding
import br.com.ulbra.exemplorecycler.presentation.viewmodels.ProductViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AdicionarFragment : Fragment() {
    private lateinit var binding: FragmentAdicionarBinding
    private val mainViewModel: ProductViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAdicionarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSalvar.setOnClickListener {
            val name = binding.inputNome.text.toString()
            val price = binding.inputPreco.text.toString()
            val urlImg = binding.inputUrl.text.toString()

            val product = Product(name = name, price = price, urlImage = urlImg)
            mainViewModel.insertProduct(product)

            findNavController().navigate(R.id.action_adicionarFragment_to_homeFragment)
        }
    }

}