package org.scalawebtest.demo

import org.scalawebtest.core.IntegrationFlatSpec

import scala.language.postfixOps

trait DemoBaseSpec extends IntegrationFlatSpec {
  override val host = "http://localhost:8080"
}