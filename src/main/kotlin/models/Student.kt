package models

import java.time.LocalDate
import java.util.Date

data class Student(
    val name: String,
    val email: String,
    val registrationDate: LocalDate,
) {
}