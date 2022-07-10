package com.manager.lds.domain.models

import com.sun.istack.NotNull

data class LivroDTO(@NotNull var titulo: String, @NotNull var categoria: String, @NotNull var exemplares: Int)