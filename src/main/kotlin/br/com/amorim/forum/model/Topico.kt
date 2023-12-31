package br.com.amorim.forum.model

import java.time.LocalDateTime

data class Topico (
    val id: Long? = null,
    val titulo: String,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val curso: Curso,
    val autor: Usuario,
    val satus: StatusTopico = StatusTopico.NAO_RESPONDIDO,
    val respostas: List<Resposta> = ArrayList()
)