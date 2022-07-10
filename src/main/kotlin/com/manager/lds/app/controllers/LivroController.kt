package com.manager.lds.app.controllers

import com.manager.lds.domain.models.Livro
import com.manager.lds.domain.models.LivroDTO
import com.manager.lds.domain.services.LivroService
import com.manager.lds.infrastruct.mappers.toEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/livros")
class LivroController(@Autowired val livroService: LivroService) {

    @GetMapping
    fun listar() = livroService.listarTodos();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun adicionar(@RequestBody livro: LivroDTO) = livroService.salvarLivro(livro.toEntity());

}