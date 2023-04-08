package interfaces

import enuns.LessonTier
import enuns.LessonType

interface Lesson {
    val description: String;
    val courseLoad: Int;
    val lessonTier: LessonTier;
    val lessonType: LessonType;
}