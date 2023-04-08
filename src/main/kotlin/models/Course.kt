package models

import enuns.LessonTier
import enuns.LessonType
import interfaces.Lesson

data class Course(
    override val description: String,
    override val courseLoad: Int,
    override val lessonTier: LessonTier,
    override val lessonType: LessonType
    ) : Lesson
