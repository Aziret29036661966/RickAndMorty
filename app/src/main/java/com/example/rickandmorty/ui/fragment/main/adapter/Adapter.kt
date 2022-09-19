package com.example.rickandmorty.ui.fragment.main.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rickandmorty.databinding.ItemRAndMBinding
import com.example.rickandmorty.domain.model.CharacterResult

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    private var list = listOf<CharacterResult>()

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CharacterResult>){
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemRAndMBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(private val binding : ItemRAndMBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun onBind(model: CharacterResult) {
                binding.txtNameCharacter.text = model.name
                binding.txtStatus.text = model.status
                Glide.with(binding.imgCharacter).load(model.image).into(binding.imgCharacter)
            }
    }
}