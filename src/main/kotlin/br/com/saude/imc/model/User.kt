package br.com.saude.imc.model

data class User(
    val imc: Double,
){
    fun getmensagem() = when {
        imc < 18.5 -> "Magreza"
        imc < 24.9 -> "Peso Normal"
        imc < 29.9 -> "Sobrepeso"
        imc < 34.9 -> "Obesidade grau I"
        imc < 40 -> "Obesidade grau II"
        else -> "Obesidade grau III"
    }
}