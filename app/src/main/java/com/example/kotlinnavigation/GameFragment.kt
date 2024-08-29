package com.example.kotlinnavigation
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.kotlinnavigation.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    private lateinit var _binding: FragmentGameBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGameBinding.inflate(inflater, container, false)
        val view = binding.root

        //val bundle : GameFragmentArgs by navArgs()
        //val gelenAd = bundle.ad
        //val gelenYas = bundle.yas
        //val gelenBoy = bundle.boy
        //val gelenBekar = bundle.bekarMi

        //Log.e("gelenAd", gelenAd)
        //Log.e("gelenYas", gelenYas.toString())
       // Log.e("gelenBoy", gelenBoy.toString())
       // Log.e("gelenBekar", gelenBekar.toString())

        /*binding.btnBitir.setOnClickListener {


            Navigation.findNavController(it).navigate(R.id.goToResultScreen)

        }*/

        return view
    }
}