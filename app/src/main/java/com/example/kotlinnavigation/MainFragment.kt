package com.example.kotlinnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.kotlinnavigation.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root

        /*binding.btnBasla.setOnClickListener {


            val insan = Kisiler(15, "erçin")

            val gecis = MainFragmentDirections.goToGameScreen(insan, "bayram", 23, 170f, true)

            Navigation.findNavController(it).navigate(R.id.goToGameScreen)

        }*/

        return view
    }

}