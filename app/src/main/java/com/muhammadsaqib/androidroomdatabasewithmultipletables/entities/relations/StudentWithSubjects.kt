package com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.Student
import com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subject: List<Subject>
)
