package br.com.saude.imc.controller

import br.com.saude.imc.dto.ImcRequest
import br.com.saude.imc.dto.ImcResponse
import br.com.saude.imc.log.logger
import br.com.saude.imc.service.CalculateImcService
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/imc")
class CalculateImcController (
    private val service: CalculateImcService
        ){

    @PostMapping("/calculate")
    @Transactional
    fun calculate(@RequestBody imcRequest: ImcRequest): ImcResponse {
        logger.info{ "Requisicao do Calculo de IMC" }
        return service.cadastrar(imcRequest)
    }

}