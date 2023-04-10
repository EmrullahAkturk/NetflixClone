package com.yargisoft.netflixclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.yargisoft.netflixclone.data.entity.Filmler
import com.yargisoft.netflixclone.databinding.CardTasarimFilmBinding
import com.yargisoft.netflixclone.ui.fragment.AnaSayfaFragmentDirections

class FilmlerAdapter(var mContext: Context, var filmlerListesi: List<Filmler>) :
    RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: CardTasarimFilmBinding) :
        RecyclerView.ViewHolder(tasarim.root) {
        var tasarim: CardTasarimFilmBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimFilmBinding.inflate(layoutInflater, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = filmlerListesi.get(position)
        val t = holder.tasarim

        t.imageViewFilm.setImageResource(
            mContext.resources.getIdentifier(film.filmResimAd,
                "drawable",
                mContext.packageName))

        t.imageViewFilm.setOnClickListener {
            val gecis = AnaSayfaFragmentDirections.filmDetayGecis(film = film)
            Navigation.findNavController(it).navigate(gecis)
        }
    }


}