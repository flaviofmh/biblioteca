package com.manager.lds.domain.repository

import com.manager.lds.domain.models.Livro
import org.springframework.data.jpa.repository.JpaRepository

interface LivroRepository : JpaRepository<Livro, Long> {
}