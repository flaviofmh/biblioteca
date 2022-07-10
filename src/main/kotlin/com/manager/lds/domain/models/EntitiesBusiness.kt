package com.manager.lds.domain.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Livro (@Id @GeneratedValue var id: Long? = null
, var titulo: String, var categoria: String, var exemplares: Int, var disponivel: Boolean, var ativo: Boolean)