package com.yargisoft.netflixclone.ui.fragment

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.yargisoft.netflixclone.R
import com.yargisoft.netflixclone.databinding.FragmentFilmDetayBinding

class FilmDetayFragment() : Fragment() {
    private lateinit var binding: FragmentFilmDetayBinding
    lateinit var mContext: Context
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_film_detay, container, false)

        val bundle: FilmDetayFragmentArgs by navArgs()
        val gelenFilm = bundle.film


        binding.tvFilmAdi.text = gelenFilm.film_ad
        binding.tvFilmTuru.text = "*${gelenFilm.film_turu}"
        val res: Resources = resources
        val resourceId: Int = res.getIdentifier(
            gelenFilm.filmResimAd, "drawable", "com.yargisoft.netflixclone"
        )
        binding.filmImage.setImageResource(resourceId)

        return binding.root
    }

}