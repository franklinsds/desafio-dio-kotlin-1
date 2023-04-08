import enuns.LessonTier
import models.CodeChallenge
import models.Course
import models.ProjectChallenge
import models.Student
import java.time.LocalDate
import java.util.*

var course1: Course? = null;
var course2: Course? = null;
var course3: Course? = null;
var course4: Course? = null;
var course5: Course? = null;
var course6: Course? = null;
var course7: Course? = null;

var projectChallenge1: ProjectChallenge? = null;
var projectChallenge2: ProjectChallenge? = null;
var projectChallenge3: ProjectChallenge? = null;

var codeChallenge1: CodeChallenge? = null;
var codeChallenge2: CodeChallenge? = null;
var codeChallenge3: CodeChallenge? = null;

var student1: Student? = null;
var student2: Student? = null;
var student3: Student? = null;
var student4: Student? = null;
var student5: Student? = null;

fun main() {
    createMockData();
    print(student4);
}
fun createMockData(): Unit{
    createCourses();
    createProjectChallenges()
    createCodeChallenges()
    createStudents()
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
fun createProjectChallenges(): Unit{
    projectChallenge1 = ProjectChallenge(
        description = "Projeto de Java",
        courseLoad = 2,
        lessonTier = LessonTier.Intermediário
    )

    projectChallenge2 = ProjectChallenge(
        description = "Projeto de Kotlin",
        courseLoad = 2,
        lessonTier = LessonTier.Intermediário
    )

    projectChallenge3 = ProjectChallenge(
        description = "Projeto de Spring FrameWork",
        courseLoad = 2,
        lessonTier = LessonTier.Avançado
    )
}
fun createCodeChallenges(): Unit{
    codeChallenge1 = CodeChallenge(
        description = "Desafio de Java",
        courseLoad = 2,
        lessonTier = LessonTier.Básico
    )

    codeChallenge2 = CodeChallenge(
        description = "Desafio de Kotlin",
        courseLoad = 2,
        lessonTier = LessonTier.Intermediário
    )

    codeChallenge3 = CodeChallenge(
        description = "Desafio de Spring FrameWork",
        courseLoad = 4,
        lessonTier = LessonTier.Avançado
    )
}
fun createStudents(): Unit{
    student1 = Student(
        name = "Ana",
        email = "ana@email.com",
        registrationDate = LocalDate.of(2023,4,2)
    );
    student2 = Student(
        name = "Ze",
        email = "ze@email.com",
        registrationDate = LocalDate.of(2023,4,22)
    );
    student3 = Student(
        name = "Sara",
        email = "sara@email.com",
        registrationDate = LocalDate.of(2023,4,8)
    );
    student4 = Student(
        name = "Bia",
        email = "bia@email.com",
        registrationDate = LocalDate.of(2023,4,10)
    );
    student5 = Student(
        name = "Jao",
        email = "jao@email.com",
        registrationDate = LocalDate.of(2023,4,19)
    );
}