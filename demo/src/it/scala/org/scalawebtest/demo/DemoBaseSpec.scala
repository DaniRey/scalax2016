package org.scalawebtest.demo

import org.scalatest.concurrent.PatienceConfiguration.Timeout
import org.scalatest.time.SpanSugar._
import org.scalawebtest.core.{FormBasedLogin, IntegrationFlatSpec}

import scala.language.postfixOps

trait DemoBaseSpec extends IntegrationFlatSpec {
  override val host = "http://localhost:8080"
//  override val loginPath = "/fakeLogin.jsp"

  override val projectRoot = ""

//  override def loginTimeout = Timeout(5 seconds)
}