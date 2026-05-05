package com.leticiaalmeida.todolist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

/**
 * Fragment que exibe a lista de tarefas.
 */
class TasksFragment : Fragment() {

    private val TAG = "Lifecycle_TasksFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView chamado")
        return inflater.inflate(R.layout.fragment_tasks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated chamado")

        val rvTasks = view.findViewById<RecyclerView>(R.id.rvTasks)
        
        // Criando dados fictícios para demonstração
        val tarefas = listOf(
            Tarefa(1, "Estudar Kotlin", "Revisar conceitos de data class e fragments", true),
            Tarefa(2, "Fazer Atividade", "Implementar Bottom Navigation e RecyclerView", true),
            Tarefa(3, "Gravar Vídeo", "Explicar o projeto e demonstrar funcionamento"),
            Tarefa(4, "Enviar Trabalho", "Submeter o link do repositório/arquivo zip"),
            Tarefa(5, "Academia", "Treino de pernas às 18h", true),
            Tarefa(6, "Supermercado", "Comprar leite, ovos e frutas")
        )

        rvTasks.adapter = TarefaAdapter(tarefas)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause chamado")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView chamado")
    }
}
