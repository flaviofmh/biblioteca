package com.manager.lds.app.exceptions.dtos

import java.time.OffsetDateTime

data class Problem(val status: Int, val timestamp: OffsetDateTime, val type: String, val title: String, val detail: String,
                   val userMessage: String, val objects: Array<Object>)

data class Object(val name: String, val userMessage: String)

enum class ProblemType(val title: String, val uri: String) {
    DADOS_INVALIDOS("Dados inválidos", "/dados-invalidos"),
    ERRO_DE_SISTEMA("Erro de sistema", "/erro-de-sistema"),
    RECURSO_NAO_ENCONTRADO("Recurso não encontrado", "/recurso-nao-encontrado"),
    ERRO_NEGOCIO("Violação de regra de negócio", "/erro-negocio");
}