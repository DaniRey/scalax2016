package org.scalawebtest.demo

import org.openqa.selenium.By.ByCssSelector

class SeleniumSpec extends DemoBaseSpec {
  path = "/startpage.html"

  "The start page" should "contain the tab navigation" in {
    val commitLink = find(CssSelectorQuery("ul.numbers-summary > li.commits > a")).get
    commitLink.attribute("href").get should endWith("/unic/ScalaWebTest/commits/master")
    commitLink.text should endWith("commits")

    val summaryLinks = findAll(CssSelectorQuery("ul.numbers-summary > li > a"))
    val branchLink = summaryLinks.find(_.attribute("href").get endsWith "/unic/ScalaWebTest/branches").get
    val branchSpan = branchLink.underlying.findElement(new ByCssSelector("span"))
    branchSpan.getText.trim should fullyMatch regex "\\d+"
    branchLink.text should endWith("branches")

    val releaseLink = summaryLinks.find(_.attribute("href").get endsWith "/unic/ScalaWebTest/releases").get
    val releaseSpan = releaseLink.underlying.findElement(new ByCssSelector("span"))
    releaseSpan.getText.trim should fullyMatch regex "\\d+"
    releaseLink.text should endWith("releases")

    val contributorsLink = summaryLinks.find(_.attribute("href").get endsWith "/unic/ScalaWebTest/graphs/contributors").get
    val contributorsSpan = contributorsLink.underlying.findElement(new ByCssSelector("span"))
    contributorsSpan.getText.trim should fullyMatch regex "\\d+"
    contributorsLink.text should endWith("contributors")

    val licenceLink = summaryLinks.find(_.attribute("href").get endsWith "https://github.com/unic/ScalaWebTest/blob/master/LICENSE").get
    licenceLink.text should endWith("Apache-2.0")
  }
}