package com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.School
import com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.Student

data class SchoolWithStudents(
    @Embedded
    val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)
