package com.mdasrafulalam78.navigationcomponentdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.mdasrafulalam78.navigationcomponentdemo.R
import kotlinx.android.synthetic.main.fragment_about.*

class AboutFragment : Fragment() {
    private val getArgs:AboutFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            val name = getArgs.trainee?.name
            val id = getArgs.trainee?.id
            val dept = getArgs.trainee?.department
            about_value_tv.text = "${name}\nId: ${id}\nDepartment: ${dept}"
        btn_about_to_home.setOnClickListener(View.OnClickListener {
            val action = AboutFragmentDirections.actionAboutFragmentToHomeFragment()
            findNavController().navigate(action)
        })
        btn_about_to_profile.setOnClickListener(View.OnClickListener {
            val action = AboutFragmentDirections.actionAboutFragmentToProfile()
            findNavController().navigate(action)
        })
    }

}