package com.lucasoliveira.pontointeligente.services.impl

import com.lucasoliveira.pontointeligente.documents.Empresa
import com.lucasoliveira.pontointeligente.repositories.EmpresaRepository
import com.lucasoliveira.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository): EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)
}