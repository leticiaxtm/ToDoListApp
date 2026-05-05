package com.leticiaalmeida.todolist

/**
 * Representa uma tarefa no sistema.
 * Este é um exemplo de data class e também serve como a nossa Entidade.
 */
data class Tarefa(
    val id: Int,
    val titulo: String,
    val descricao: String,
    val concluida: Boolean = false
)
