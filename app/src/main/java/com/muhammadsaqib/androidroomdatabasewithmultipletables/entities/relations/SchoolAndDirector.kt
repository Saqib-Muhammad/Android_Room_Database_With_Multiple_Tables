package com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.Director
import com.muhammadsaqib.androidroomdatabasewithmultipletables.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)
