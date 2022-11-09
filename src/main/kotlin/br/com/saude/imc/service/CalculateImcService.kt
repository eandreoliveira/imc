package br.com.saude.imc.service

import br.com.saude.imc.dto.ImcForm
import br.com.saude.imc.model.User
import org.springframework.stereotype.Service

@Service
class CalculateImcService{
    fun calculate(imcForm: ImcForm): User {
        val imcValue = imcForm.peso / (imcForm.altura * imcForm.altura)
        return User(imc = imcValue)
    }
}