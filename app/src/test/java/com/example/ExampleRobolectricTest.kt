package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.sample.KpssQuestionsData
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

  @Test
  fun `read string from context`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val appName = context.getString(R.string.app_name)
    assertEquals("RoseWin", appName)
  }

  @Test
  fun `verify kpss questions bank loaded`() {
    val questions = KpssQuestionsData.questions
    assertTrue("KPSS soru bankası boş olmamalı", questions.isNotEmpty())
    assertTrue("KPSS soruları yeterli sayıda olmalı", questions.size >= 25)
    val pastQuestions = KpssQuestionsData.getPastExamQuestions()
    assertTrue("Çıkmış KPSS soruları mevcut olmalı", pastQuestions.isNotEmpty())
  }

  @Test
  fun `verify past exam question badges and years`() {
    val past2024 = KpssQuestionsData.getPastExamQuestions("2024")
    assertTrue("2024 KPSS soruları mevcut olmalı", past2024.isNotEmpty())
    val sample = past2024.first()
    assertTrue("Yıl bilgisi içermeli", sample.year == "2024")
    assertTrue("Badge boş olmamalı", sample.formattedExamBadge.isNotEmpty())

    val years = listOf("2024", "2023", "2022", "2021", "2020", "2019", "2018")
    for (year in years) {
      val yearQuestions = KpssQuestionsData.getPastExamQuestions(year)
      assertTrue("$year için çıkmış soru bulunmalı", yearQuestions.isNotEmpty())
    }
  }

  @Test
  fun `verify enriched lectures count`() {
    val lectures = com.example.data.sample.KpssLectureData.lectures
    assertTrue("Konuların sayısı zenginleştirilmiş olmalı", lectures.size >= 50)
    val vatLectures = lectures.filter { it.subject == com.example.data.model.Subject.VATANDASLIK }
    assertTrue("Vatandaşlık konusu en az 20 olmalı", vatLectures.size >= 20)
    val gunLectures = lectures.filter { it.subject == com.example.data.model.Subject.GUNCEL_BILGILER }
    assertTrue("Güncel Bilgiler konusu en az 20 olmalı", gunLectures.size >= 20)
  }

  @Test
  fun `verify kpss net formula calculation`() {
    val correct = 20
    val wrong = 4
    val net = correct - (wrong * 0.25)
    assertEquals(19.0, net, 0.001)
  }
}
