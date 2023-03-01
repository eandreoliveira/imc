package br.com.saude.imc.repository

import br.com.saude.imc.model.Imc
import org.springframework.data.jpa.repository.JpaRepository

interface ImcRepository: JpaRepository<Imc, Long> {
    fun findByNome(nome: String): List<Imc>
}