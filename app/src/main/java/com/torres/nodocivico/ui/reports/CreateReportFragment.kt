package com.torres.nodocivico.ui.reports

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.torres.nodocivico.R
import com.torres.nodocivico.data.local.database.AppDatabase
import com.torres.nodocivico.data.local.entity.ReportEntity
import kotlinx.coroutines.launch

class CreateReportFragment : Fragment(R.layout.fragment_create_report) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val etTitle = view.findViewById<EditText>(R.id.etTitle)
        val etDescription = view.findViewById<EditText>(R.id.etDescription)
        val btn = view.findViewById<Button>(R.id.btnSave)

        val db = AppDatabase.getDatabase(requireContext())

        btn.setOnClickListener {

            val title = etTitle.text.toString()
            val description = etDescription.text.toString()

            if (title.isEmpty() || description.isEmpty()) {
                Toast.makeText(requireContext(), "Campos obligatorios", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val report = ReportEntity(
                title = title,
                description = description,
                category = "General",
                priority = "Alta",
                date = "2026-05-15",
                status = "Pendiente"
            )

            lifecycleScope.launch {
                db.reportDao().insertReport(report)

                Toast.makeText(requireContext(), "Guardado en BD", Toast.LENGTH_SHORT).show()
            }
        }
    }
}