package models

import enuns.LessonTier
import enuns.LessonType
import interfaces.Lesson

data class ProjectChallenge(
    override val description: String,
    override val courseLoad: Int,
    override val lessonTier: LessonTier,
    override val lessonType: LessonType = LessonType.ProjectChallenge
    ) : Lesson
