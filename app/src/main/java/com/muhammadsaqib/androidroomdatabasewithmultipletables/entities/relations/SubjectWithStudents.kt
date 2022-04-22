package com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.Student
import com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val student: List<Student>
)
