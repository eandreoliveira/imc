package br.com.saude.imc.service

import br.com.saude.imc.dto.ImcRequest
import br.com.saude.imc.dto.ImcResponse
import org.springframework.stereotype.Service
import kotlin.math.roundToInt

@Service
class CalculateImcService{
    fun calculate(imcRequest: ImcRequest): ImcResponse {

        val imcValue = imcRequest.peso / (imcRequest.altura * imcRequest.altura)
        val imcNearValue = (imcValue * 100.0).roundToInt() / 100.0

        return ImcResponse(imcNearValue)
    }
}