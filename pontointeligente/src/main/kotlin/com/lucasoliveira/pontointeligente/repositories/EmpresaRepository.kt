package com.lucasoliveira.pontointeligente.repositories

import com.lucasoliveira.pontointeligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa,String>{

    fun findByCnpj(cnpj:String): Empresa?

}