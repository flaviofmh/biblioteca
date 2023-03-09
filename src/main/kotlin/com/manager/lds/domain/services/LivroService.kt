package com.manager.lds.domain.services

import com.manager.lds.domain.models.Livro
import com.manager.lds.domain.repository.LivroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LivroService(@Autowired var livroRepository: LivroRepository) {

    fun listarTodos() = livroRepository.findAll();

    fun salvarLivro(livro: Livro) : Livro {

        if (livro.categoria != null) {
            throw Exception()
        }

        return livroRepository.save(livro)
    }

}