package br.com.saude.imc.dto

data class ImcResponse(
    val nome: String,
    val imc: Double

) {
    fun getmensagem() = when {
        imc < 18.5 -> "Magreza"
        imc < 25.0 -> "Peso Normal"
        imc < 30.0 -> "Sobrepeso"
        imc < 35.0 -> "Obesidade grau I"
        imc < 40.0 -> "Obesidade grau II"
        else -> "Obesidade grau III"
    }
}