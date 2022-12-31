package br.com.schoolshedule.teacher.command

import br.com.schoolshedule.teacher.command.api.TeacherId
import org.axonframework.spring.stereotype.Aggregate

@Aggregate
class Teacher {
    private lateinit var id: TeacherId
    private lateinit var name: String
    private lateinit var email: String

    private constructor()
}