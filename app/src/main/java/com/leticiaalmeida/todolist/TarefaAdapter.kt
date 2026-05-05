package com.leticiaalmeida.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Adaptador para a lista de tarefas no RecyclerView.
 */
class TarefaAdapter(private val listaTarefas: List<Tarefa>) :
    RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    class TarefaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitulo: TextView = view.findViewById(R.id.tvTaskTitle)
        val tvDescricao: TextView = view.findViewById(R.id.tvTaskDescription)
        val cbStatus: CheckBox = view.findViewById(R.id.cbTaskStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_task, parent, false)
        return TarefaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listaTarefas[position]
        holder.tvTitulo.text = tarefa.titulo
        holder.tvDescricao.text = tarefa.descricao
        holder.cbStatus.isChecked = tarefa.concluida
    }

    override fun getItemCount(): Int = listaTarefas.size
}
