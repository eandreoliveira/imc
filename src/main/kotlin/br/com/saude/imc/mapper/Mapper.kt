package br.com.saude.imc.mapper

import br.com.saude.imc.dto.ImcRequest
import br.com.saude.imc.dto.ImcResponse
import br.com.saude.imc.model.Imc


fun mapToImc(form: ImcRequest, imc: Double) = Imc(
    nome = form.nome,
    peso = form.peso,
    altura = form.altura,
    imc = imc
)


fun mapToImcResponse(imc: Imc) = ImcResponse(
    nome = imc.nome,
    imc = imc.imc
)