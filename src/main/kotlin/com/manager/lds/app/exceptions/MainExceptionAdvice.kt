package com.manager.lds.app.exceptions

import com.manager.lds.app.exceptions.dtos.Problem
import com.manager.lds.app.exceptions.dtos.ProblemType
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.time.OffsetDateTime


@ControllerAdvice
class MainExceptionAdvice : ResponseEntityExceptionHandler() {

    val MSG_ERRO_GENERICA_USUARIO_FINAL = "Ocorreu um erro interno inesperado no sistema. Tente novamente e se o " +
            "problema persistir, entre em contato com o administrador do sistema."

    @ExceptionHandler(Exception::class)
    fun handleUncaught(ex: Exception, request: WebRequest?): ResponseEntity<*> {
        val status = HttpStatus.INTERNAL_SERVER_ERROR
        val problemType: ProblemType = ProblemType.ERRO_DE_SISTEMA
        val detail: String = MSG_ERRO_GENERICA_USUARIO_FINAL
        ex.printStackTrace()
        val problem: Problem = Problem(status.value(), OffsetDateTime.now(), problemType.uri, problemType.title,
                detail, "", emptyArray<com.manager.lds.app.exceptions.dtos.Object>())
        return handleExceptionInternal(ex, problem, HttpHeaders(), status, request!!)
    }

    override fun handleExceptionInternal(ex: java.lang.Exception, body: Any?, headers: HttpHeaders, status: HttpStatus,
                                         request: WebRequest): ResponseEntity<Any> {

        if (body == null) {
            val problem: Problem = Problem(status.value(), OffsetDateTime.now(), "", "",
                "", "", emptyArray<com.manager.lds.app.exceptions.dtos.Object>())
        } else if (body is String) {
            val problem: Problem = Problem(status.value(), OffsetDateTime.now(), "", "",
                "", "", emptyArray<com.manager.lds.app.exceptions.dtos.Object>())
        }
        return super.handleExceptionInternal(ex, body, headers, status, request)
    }

}