package br.com.ulbra.apicomretrofit.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.ulbra.apicomretrofit.data.DemonSlayerCharacter // Importe o modelo DemonSlayerCharacter
import br.com.ulbra.apicomretrofit.databinding.CharacterItemBinding

class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {
    private lateinit var context: Context
    private lateinit var binding: CharacterItemBinding
    private var listCharacters: List<Any> = emptyList() // Use Any para suportar ambos os tipos

    fun setUpCharacters(characters: List<Any>) { // Use Any para suportar ambos os tipos
        this.listCharacters = characters
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        binding = CharacterItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listCharacters.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listCharacters[position]
        if (item is Character) {
            holder.bindCharacter(item)
        } else if (item is DemonSlayerCharacter) {
            holder.bindDemonSlayerCharacter(item)
        }
    }

    inner class ViewHolder(private val binding: CharacterItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindCharacter(character: Character) {
            binding.character = character
            binding.executePendingBindings()
        }

        fun bindDemonSlayerCharacter(demonSlayerCharacter: DemonSlayerCharacter) {
            // Bind Demon Slayer character here if needed
        }
    }
}
