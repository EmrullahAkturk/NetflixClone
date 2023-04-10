package com.yargisoft.netflixclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.yargisoft.netflixclone.R
import com.yargisoft.netflixclone.data.entity.Filmler
import com.yargisoft.netflixclone.databinding.FragmentAnaSayfaBinding
import com.yargisoft.netflixclone.ui.adapter.FilmlerAdapter


class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_ana_sayfa, container, false)

        binding.rv.layoutManager =StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.rv2.layoutManager =StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.rv3.layoutManager =StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.rv4.layoutManager =StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        val filmlerListesi = ArrayList<Filmler>()
        val filmlerListesi2 = ArrayList<Filmler>()
        val filmlerListesi3 = ArrayList<Filmler>()
        val filmlerListesi4 = ArrayList<Filmler>()

        //Filmler (Veritabanı)
        val f1 = Filmler(1, "The Witcher", "Aksiyon", "the_witcher")
        val f2 = Filmler(2, "Narcos Mexico", "Aksiyon", "narcos")
        val f3 = Filmler(3, "Peaky Blinders", "Gerilim", "peaky_blinders")
        val f4 = Filmler(4, "Breaking Bad", "Aksiyon", "breaking_bad")
        val f5 = Filmler(5, "Coffee Kareem", "Aksiyon", "coffee_kareem")
        val f6 = Filmler(6, "The All The Boys", "Aksiyon", "the_all_the_boys")
        val f7 = Filmler(7, "Ozark", "Aksiyon", "ozark")
        val f8 = Filmler(8, "Sex Education", "Aşk", "sex_education")
        val f9 = Filmler(9, "Six Underground", "Aksiyon", "six_underground")
        val f10 = Filmler(10, "Tiger King", "Aksiyon", "tiger_king")

        //Liste1
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f7)
        filmlerListesi.add(f5)

        //Liste2 eleman ekleme
        filmlerListesi2.add(f10)
        filmlerListesi2.add(f8)
        filmlerListesi2.add(f9)
        filmlerListesi2.add(f3)
        filmlerListesi2.add(f4)
        filmlerListesi2.add(f2)
        filmlerListesi2.add(f1)

        //Liste3 eleman ekleme
        filmlerListesi3.add(f7)
        filmlerListesi3.add(f5)
        filmlerListesi3.add(f6)
        filmlerListesi3.add(f4)
        filmlerListesi3.add(f3)
        filmlerListesi3.add(f10)
        filmlerListesi3.add(f9)

        //Liste 4
        filmlerListesi4.add(f6)
        filmlerListesi4.add(f1)
        filmlerListesi4.add(f9)
        filmlerListesi4.add(f5)
        filmlerListesi4.add(f10)
        filmlerListesi4.add(f8)
        filmlerListesi4.add(f2)

        val adapter = FilmlerAdapter(requireContext(), filmlerListesi)
        val adapter2 = FilmlerAdapter(requireContext(), filmlerListesi2)
        val adapter3 = FilmlerAdapter(requireContext(), filmlerListesi3)
        val adapter4 = FilmlerAdapter(requireContext(), filmlerListesi4)
        binding.rv.adapter = adapter
        binding.rv2.adapter = adapter2
        binding.rv3.adapter = adapter3
        binding.rv4.adapter = adapter4
        return binding.root
    }

}
