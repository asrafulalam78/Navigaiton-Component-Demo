package com.mdasrafulalam78.navigationcomponentdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.mdasrafulalam78.navigationcomponentdemo.R
import com.mdasrafulalam78.navigationcomponentdemo.Trainee
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {

    val args:ProfileFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val number = args.number
        profile_value_tv.text = number.toString()
        btn_profile_to_home.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileToHomeFragment()
            findNavController().navigate(action)
        }
        btn_profile_to_about.setOnClickListener {
            val trainee = Trainee("Md. Asraful Alam", 30032, "Android")
            val action = ProfileFragmentDirections.actionProfileToAboutFragment(trainee)
            findNavController().navigate(action)
        }
    }
}