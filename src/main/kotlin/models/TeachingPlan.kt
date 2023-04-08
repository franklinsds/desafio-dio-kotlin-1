package models

import enuns.LessonType
import interfaces.Lesson
import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class TeachingPlan(
    val description: String,
    val endDate: LocalDate
){
    val subscribed: MutableSet<Student> = mutableSetOf();
    val lessons: MutableSet<Lesson> = mutableSetOf();

    fun addStudent(vararg students: Student){
        this.subscribed.addAll(students);
    }
    fun addLesson(vararg lessons: Lesson){
        this.lessons.addAll(lessons);
    }

    fun showOverView(): Unit{
        println();
        println(description);
        println("Data limite para conclusão: ${endDate.format(
            DateTimeFormatter.ofPattern("dd/MM/yyyy")
        )}");
        println("Tempo total dos módulos: ${
            lessons
                .map { it.courseLoad }
                .reduce { acc, i ->  acc + i}
        }hrs");
        println("Quantidade de Aulas: ${
            lessons
                .filter { it.lessonType == LessonType.Course }
                .count()
        }");
        println("Quantidade de Desafios de Código: ${
            lessons
                .filter { it.lessonType == LessonType.CodeChallenge }
                .count()
        }");
        println("Quantidade de Desafios de Projeto: ${
            lessons
                .filter { it.lessonType == LessonType.ProjectChallenge }
                .count()
        }");
        println("Quantidade de Inscritos: ${subscribed.count()}");
    }
}
