package br.com.saude.imc.service

import br.com.saude.imc.dto.ImcRequest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculateImcServiceTest {
    private val calculateImcService = CalculateImcService()

    @Test
    fun deveRetornarSobrePeso() {
        val imcRequest = ImcRequest(90.0, 1.85)
        val imcResponse = calculateImcService.calculate(imcRequest)
        assertEquals(imcResponse.getmensagem(), "Sobrepeso")
    }

    @Test
    fun deveRetornarPesoNormal() {
        val imcRequest = ImcRequest(80.0, 1.85)
        val imcResponse = calculateImcService.calculate(imcRequest)
        assertEquals(imcResponse.getmensagem(), "Peso Normal")
    }

    @Test
    fun deveRetornarValorCorretoImc() {
        val imcRequest = ImcRequest(80.0, 1.85)
        val imcResponse = calculateImcService.calculate(imcRequest)
        assertEquals(imcResponse.imc, 23.37)
    }
}