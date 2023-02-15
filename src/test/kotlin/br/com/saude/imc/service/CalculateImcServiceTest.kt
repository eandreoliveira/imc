package br.com.saude.imc.service

import br.com.saude.imc.dto.ImcRequest
import br.com.saude.imc.repository.ImcRepository
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculateImcServiceTest {
    private val repository: ImcRepository = mockk()
    private val calculateImcService = CalculateImcService(repository)

    @BeforeEach
    fun setup() {
        every {
            repository.save(any())
        } returnsArgument (0)
    }

    @Test
    fun deveRetornarSobrePeso() {
        val imcRequest = ImcRequest("Teste", 90.0, 1.85)
        val imcResponse = calculateImcService.cadastrar(imcRequest)
        assertEquals(imcResponse.getmensagem(), "Sobrepeso")
    }

    @Test
    fun deveRetornarPesoNormal() {
        val imcRequest = ImcRequest("Teste", 80.0, 1.85)
        val imcResponse = calculateImcService.cadastrar(imcRequest)
        assertEquals(imcResponse.getmensagem(), "Peso Normal")
    }

    @Test
    fun deveRetornarValorCorretoImc() {
        val imcRequest = ImcRequest("Teste", 80.0, 1.85)
        val imcResponse = calculateImcService.cadastrar(imcRequest)
        assertEquals(imcResponse.imc, 23.37)
    }
}