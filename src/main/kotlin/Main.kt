import enuns.LessonTier
import models.Course

    var course1: Course? = null;
    var course2: Course? = null;
    var course3: Course? = null;
    var course4: Course? = null;
    var course5: Course? = null;
    var course6: Course? = null;
    var course7: Course? = null;

fun main() {
    createCourses();
    print(course1);
}
fun createCourses(): Unit{
    course1 = Course(
        description = "Princípios de Agilidade e Desenvolvimento de Software",
        courseLoad = 10,
        lessonTier = LessonTier.Básico
    )

    course2 = Course(
        description = "Introdução ao Java",
        courseLoad = 8,
        lessonTier = LessonTier.Básico
    )

    course3 = Course(
        description = "Aprofundando em Java",
        courseLoad = 10,
        lessonTier = LessonTier.Intermediário
    )

    course4 = Course(
        description = "Introdução ao Kotlin",
        courseLoad = 6,
        lessonTier = LessonTier.Básico
    )

    course5 = Course(
        description = "Aprofundando em Kotlin",
        courseLoad = 8,
        lessonTier = LessonTier.Intermediário
    )

    course6 = Course(
        description = "Spring FrameWork",
        courseLoad = 16,
        lessonTier = LessonTier.Avançado
    )

    course7 = Course(
        description = "Docker",
        courseLoad = 14,
        lessonTier = LessonTier.Avançado
    )
}