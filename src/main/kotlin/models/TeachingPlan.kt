package models

import interfaces.Lesson
import java.time.LocalDate

data class TeachingPlan(
    val description: String,
    val endDate: LocalDate
){
    val subscribed: MutableSet<Student> = mutableSetOf();
    val lessons: MutableSet<Lesson> = mutableSetOf()

    fun addStudent(vararg students: Student){
        this.subscribed.addAll(students);
    }
    fun addLesson(vararg lessons: Lesson){
        this.lessons.addAll(lessons);
    }
}
