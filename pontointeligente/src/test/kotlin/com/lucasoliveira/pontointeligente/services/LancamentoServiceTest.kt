package com.lucasoliveira.pontointeligente.services

import com.lucasoliveira.pontointeligente.repositories.LancamentoRepository
import org.junit.jupiter.api.BeforeEach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import java.lang.Exception

@SpringBootTest
class LancamentoServiceTest {

    @MockBean
    private val lancamentoRepository : LancamentoRepository? = null

    @Autowired
    private val lancamentoService: LancamentoService? = null

    @BeforeEach
    @Throws(Exception::class)
    fun setUp(){

    }

}