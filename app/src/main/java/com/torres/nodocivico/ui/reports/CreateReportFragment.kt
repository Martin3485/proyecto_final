package com.torres.nodocivico.ui.reports

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.torres.nodocivico.R

class CreateReportFragment : Fragment(R.layout.fragment_create_report) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val btn = view.findViewById<Button>(R.id.btnSave)

        btn.setOnClickListener {
            Toast.makeText(
                requireContext(),
                "Reporte guardado (simulado)",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
