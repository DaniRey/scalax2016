package org.scalawebtest.demo

import org.scalawebtest.core.gauge.Gauge.fits

class GaugeSpec extends DemoBaseSpec {
  path = "/startpage.html"

  "The start page" should "contain the tab navigation" in {
    fits(
      <ul class="numbers-summary">
        <li class="commits">
          <a href="/unic/ScalaWebTest/commits/master">
            <span>@regex \d+</span>
            commits
          </a>
        </li>
        <li>
          <a href="/unic/ScalaWebTest/branches">
            <span>@regex \d+</span>
            branches
          </a>
        </li>
        <li>
          <a href="/unic/ScalaWebTest/releases">
            <span>@regex \d+</span>
            releases
          </a>
        </li>
        <li>
          <a href="/unic/ScalaWebTest/graphs/contributors">
            <span>@regex \d+</span>
            contributors
          </a>
        </li>
        <li>
          <a href="https://github.com/unic/ScalaWebTest/blob/master/LICENSE">
            <svg></svg>
            Apache-2.0
          </a>
        </li>
      </ul>
    )
  }
}