package br.com.saude.imc.dto

data class ImcRequest(
    val nome: String,
    val peso: Double,
    val altura: Double
)