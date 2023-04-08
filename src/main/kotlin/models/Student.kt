package models

import java.time.LocalDate

data class Student(
    val name: String,
    val email: String,
    val registrationDate: LocalDate,
)