package models

import enuns.*
import interfaces.Lesson

data class Course(
    override val description: String,
    override val courseLoad: Int,
    override val lessonTier: LessonTier,
    override val lessonType: LessonType = LessonType.Course
    ) : Lesson
