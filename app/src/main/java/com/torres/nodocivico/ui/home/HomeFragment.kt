package com.torres.nodocivico.ui.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.torres.nodocivico.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val btnViewReports = view.findViewById<Button>(R.id.btnViewReports)
        val btnCreateReport = view.findViewById<Button>(R.id.btnCreateReport)

        btnViewReports.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_list)
        }

        btnCreateReport.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_create)
        }
    }
}