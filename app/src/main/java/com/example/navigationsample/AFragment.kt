package com.example.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_a.*

/**
 * A simple [Fragment] subclass.
 */
class AFragment : Fragment(R.layout.fragment_a) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gotoB.setOnClickListener {
            findNavController().navigate(R.id.BFragment)
        }
    }
}
