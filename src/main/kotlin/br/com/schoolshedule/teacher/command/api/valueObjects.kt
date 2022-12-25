package br.com.schoolshedule.teacher.command.api

import net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Anonymous
import java.util.UUID

data class TeacherId(val identifier: UUID = UUID.randomUUID()) {
    override fun toString(): String = identifier.toString()
}

data class TeacherLessonsId(val identifier: UUID = UUID.randomUUID()) {
    override fun toString(): String = identifier.toString()
}

const val ANONYMOUS = "anonymous"