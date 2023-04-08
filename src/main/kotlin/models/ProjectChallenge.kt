package models

import enuns.*
import interfaces.Lesson

data class ProjectChallenge(
    override val description: String,
    override val courseLoad: Int,
    override val lessonTier: LessonTier,
    override val lessonType: LessonType = LessonType.ProjectChallenge
    ) : Lesson
