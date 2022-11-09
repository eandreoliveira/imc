package br.com.saude.imc.service

import br.com.saude.imc.dto.ImcForm
import br.com.saude.imc.model.User
import org.springframework.stereotype.Service
import kotlin.math.roundToInt

@Service
class CalculateImcService{
    fun calculate(imcForm: ImcForm): User {

        val imcValue = imcForm.peso / (imcForm.altura * imcForm.altura)
        val imcNearValue = (imcValue * 100.0).roundToInt() / 100.0

        return User(imcNearValue)
    }
}