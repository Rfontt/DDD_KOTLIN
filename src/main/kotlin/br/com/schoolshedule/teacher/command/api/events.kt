package br.com.schoolshedule.teacher.command.api

import br.com.schoolshedule.api.AuditEntry
import java.io.Serializable

abstract class AuditableAbstractEvent(open val auditEntry: AuditEntry) : Serializable

abstract class TeacherEvent(
    open val aggregateIdentifier: TeacherId,
    override val auditEntry: AuditEntry
): AuditableAbstractEvent(auditEntry)

abstract class TeacherLessonEvent(
    open val aggregateIdentifier: TeacherLessonsId,
    override val auditEntry: AuditEntry
): AuditableAbstractEvent(auditEntry)

data class TeacherRegisteredEvent(
    val name: String,
    val email: String,
    override val aggregateIdentifier: TeacherId,
    override val auditEntry: AuditEntry
): TeacherEvent(aggregateIdentifier, auditEntry)

data class TeacherLessonAssignedEvent(
    override val aggregateIdentifier: TeacherLessonsId,
    override val auditEntry: AuditEntry
) : TeacherLessonEvent(aggregateIdentifier, auditEntry)