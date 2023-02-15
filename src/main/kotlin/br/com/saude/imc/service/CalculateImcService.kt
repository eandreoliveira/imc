package br.com.saude.imc.service

import br.com.saude.imc.dto.ImcRequest
import br.com.saude.imc.dto.ImcResponse
import br.com.saude.imc.log.logger
import br.com.saude.imc.mapper.mapToImc
import br.com.saude.imc.mapper.mapToImcResponse
import br.com.saude.imc.repository.ImcRepository
import org.springframework.stereotype.Service
import kotlin.math.roundToInt

@Service
class CalculateImcService(
    private val repository: ImcRepository
){
    fun cadastrar(imcRequest: ImcRequest): ImcResponse {
        val imcNearValue = calculaImc(imcRequest)
        val imc = mapToImc(imcRequest, imcNearValue)
        repository.save(imc)
        return mapToImcResponse(imc)
    }

    private fun calculaImc(imcRequest: ImcRequest): Double {
        val imcValue = imcRequest.peso / (imcRequest.altura * imcRequest.altura)
        val imcNearValue = (imcValue * 100.0).roundToInt() / 100.0
        logger.debug("Calculo do IMC")
        logger.info(imcNearValue.toString())
        return imcNearValue
    }
}