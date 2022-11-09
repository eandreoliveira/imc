package br.com.saude.imc.controller

import br.com.saude.imc.dto.ImcForm
import br.com.saude.imc.model.User
import br.com.saude.imc.service.CalculateImcService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calculate")
class CalculateImcController (
    private val service: CalculateImcService
        ){

    @PostMapping
    fun calculate(@RequestBody imcForm: ImcForm): User {
        return service.calculate(imcForm)
    }
}