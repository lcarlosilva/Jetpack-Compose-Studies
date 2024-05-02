package br.com.luiz.jetpack_compose_studies.chipfilterexamples.single_selection

import java.util.UUID

data class NameItemData(
    val itemId: UUID = UUID.randomUUID(),
    val name: String = "item",
    val isSelected: Boolean = false
)
