package com.github.lara.sodre.to_do_list_cp.repository

import com.github.lara.sodre.to_do_list_cp.data.Tarefa
import com.github.lara.sodre.to_do_list_cp.data.TarefaDao
import kotlinx.coroutines.flow.Flow


class TarefaRepository(private val dao: TarefaDao) {

    val tarefas: Flow<List<Tarefa>> = dao.listarTodas()

    suspend fun inserir(tarefa: Tarefa) = dao.inserir(tarefa)

    suspend fun atualizar(tarefa: Tarefa) = dao.atualizar(tarefa)

    suspend fun deletar(tarefa: Tarefa) = dao.deletar(tarefa)
}