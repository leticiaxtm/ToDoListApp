package com.leticiaalmeida.todolist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Fragment que exibe informações sobre o projeto.
 */
class InfoFragment : Fragment() {

    private val TAG = "Lifecycle_InfoFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView chamado")
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause chamado")
    }
}
