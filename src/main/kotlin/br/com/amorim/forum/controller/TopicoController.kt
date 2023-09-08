package br.com.amorim.forum.controller


import br.com.amorim.forum.dto.NovoTopicoDto
import br.com.amorim.forum.model.Curso
import br.com.amorim.forum.model.Topico
import br.com.amorim.forum.model.Usuario
import br.com.amorim.forum.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController (private val service: TopicoService){

    @GetMapping
    fun listar(): List<Topico>{
         return service.listar()
    }
    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico {
        return service.buscarPorId(id)
    }
    @PostMapping
    fun cadastrar(@RequestBody dto: NovoTopicoDto) {
        service.cadastrar(dto)
    }

}