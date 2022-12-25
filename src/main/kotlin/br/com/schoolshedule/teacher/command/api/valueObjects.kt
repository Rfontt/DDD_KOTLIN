package br.com.schoolshedule.teacher.command.api

import java.util.UUID

data class TeacherId(val identifier: UUID = UUID.randomUUID()) {
    override fun toString(): String = identifier.toString()
}