package com.torres.nodocivico.data.model

data class Report(
    val id: Int,
    val title: String,
    val description: String,
    val category: String,
    val priority: String,
    val date: String,
    val status: String
)