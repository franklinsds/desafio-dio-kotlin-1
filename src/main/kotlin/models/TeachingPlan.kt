package models

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import enuns.LessonType
import interfaces.Lesson

data class TeachingPlan(
    val description: String,
    val endDate: LocalDate
){
    private val subscribed: MutableSet<Student> = mutableSetOf()
    private val lessons: MutableSet<Lesson> = mutableSetOf()

    fun addStudent(vararg students: Student){
        this.subscribed.addAll(students)
    }
    fun addLesson(vararg lessons: Lesson){
        this.lessons.addAll(lessons)
    }

    /* Shows in console some current data from the teaching plan */
    fun showOverView(){
        println()
        println(description)
        println("Data limite para conclusão: ${endDate.format(
            DateTimeFormatter.ofPattern("dd/MM/yyyy")
        )}")
        println("Tempo total dos módulos: ${
            lessons
                .map { it.courseLoad }
                .reduce { acc, i ->  acc + i}
        }hrs")
        println("Quantidade de Aulas: ${
            lessons.count { it.lessonType == LessonType.Course }
        }")
        println("Quantidade de Desafios de Código: ${
            lessons.count { it.lessonType == LessonType.CodeChallenge }
        }")
        println("Quantidade de Desafios de Projeto: ${
            lessons.count { it.lessonType == LessonType.ProjectChallenge }
        }")
        println("Quantidade de Inscritos: ${subscribed.count()}")
    }
}
