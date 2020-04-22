package com.lucasoliveira.pontointeligente.services.impl

import com.lucasoliveira.pontointeligente.documents.Lancamento
import com.lucasoliveira.pontointeligente.repositories.LancamentoRepository
import com.lucasoliveira.pontointeligente.services.LancamentoService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class LancamentoServiceImpl(val lancamentoRepository: LancamentoRepository) : LancamentoService {

    override fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento> {
        TODO("Not yet implemented")
    }

    override fun buscarPorId(id: String): Lancamento? {
        TODO("Not yet implemented")
    }

    override fun persistir(lancamento: Lancamento): Lancamento {
        TODO("Not yet implemented")
    }

    override fun remover(id: String) {
        TODO("Not yet implemented")
    }
}