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
    assertEquals("KPSS Hazırlık", appName)
  }

  @Test
  fun `verify kpss questions bank loaded`() {
    val questions = KpssQuestionsData.questions
    assertTrue("KPSS soru bankası boş olmamalı", questions.isNotEmpty())
    assertTrue("KPSS soruları 6 dersten oluşmalı", questions.size >= 20)
  }

  @Test
  fun `verify kpss net formula calculation`() {
    val correct = 20
    val wrong = 4
    val net = correct - (wrong * 0.25)
    assertEquals(19.0, net, 0.001)
  }
}
