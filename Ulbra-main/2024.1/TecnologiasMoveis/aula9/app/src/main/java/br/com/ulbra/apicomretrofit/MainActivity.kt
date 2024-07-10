package br.com.ulbra.apicomretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import br.com.ulbra.apicomretrofit.commons.Resultado
import br.com.ulbra.apicomretrofit.databinding.ActivityMainBinding
import br.com.ulbra.apicomretrofit.ui.CharactersViewModel
import br.com.ulbra.apicomretrofit.ui.adapters.CharacterAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CharacterAdapter
    private val charactersViewModel: CharactersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar RecyclerView e Adapter
        adapter = CharacterAdapter()
        binding.rcCharacters.adapter = adapter

        // Observar a lista de personagens de Demon Slayer
        observeCharacters()

        // Chamar método para buscar personagens de Demon Slayer
        charactersViewModel.fetchDemonSlayerCharacters()
    }

    private fun observeCharacters() {
        charactersViewModel.demonSlayerCharacters.observe(this, Observer { result ->
            when (result) {
                is Resultado.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                is Resultado.Success -> {
                    binding.progressBar.visibility = View.GONE
                    adapter.setUpCharacters(result.data)
                }
                is Resultado.Error -> {
                    binding.progressBar.visibility = View.GONE
                    // Implementar tratamento de erro, se necessário
                }
            }
        })
    }

}
