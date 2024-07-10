package br.com.ulbra.apicomretrofit.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.ulbra.apicomretrofit.data.Character
import br.com.ulbra.apicomretrofit.databinding.CharacterItemBinding

class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {
    private lateinit var context: Context
    private var listCharacters: List<Character> = emptyList()

    fun setUpCharacters(characters: List<Character>) {
        this.listCharacters = characters
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val binding = CharacterItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listCharacters.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listCharacters[position])
    }

    inner class ViewHolder(private val binding: CharacterItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(character: Character) {
            binding.character = character
            binding.executePendingBindings()
        }
    }
}