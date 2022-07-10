package com.manager.lds.infrastruct.mappers

import com.manager.lds.domain.models.Livro
import com.manager.lds.domain.models.LivroDTO

fun LivroDTO.toEntity() = Livro(
        titulo = titulo,
        categoria = categoria,
        ativo = true,
        disponivel = true,
        exemplares = exemplares
)