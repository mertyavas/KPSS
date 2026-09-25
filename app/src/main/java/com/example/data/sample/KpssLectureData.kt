package com.example.data.sample

import com.example.data.model.Subject
import com.example.data.model.TopicLecture
import com.example.data.sample.lectures.KpssCitizenshipLectures
import com.example.data.sample.lectures.KpssCurrentAffairsLectures
import com.example.data.sample.lectures.KpssGeographyLectures
import com.example.data.sample.lectures.KpssHistoryLectures
import com.example.data.sample.lectures.KpssMathLectures
import com.example.data.sample.lectures.KpssTurkishLectures

object KpssLectureData {

    val lectures: List<TopicLecture> =
        KpssCitizenshipLectures.list +
        KpssCurrentAffairsLectures.list +
        KpssHistoryLectures.list +
        KpssGeographyLectures.list +
        KpssTurkishLectures.list +
        KpssMathLectures.list

    fun getLecturesBySubject(subject: Subject): List<TopicLecture> {
        return lectures.filter { it.subject == subject }
    }

    fun getLectureById(id: String): TopicLecture? {
        return lectures.firstOrNull { it.id == id }
    }
}
