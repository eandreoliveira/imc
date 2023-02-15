package br.com.saude.imc.exception

import java.lang.RuntimeException

class NotFoundException(message: String?) : RuntimeException(message) {
}