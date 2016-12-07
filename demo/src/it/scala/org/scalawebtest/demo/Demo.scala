package org.scalawebtest.demo

import org.scalawebtest.core.gauge.Gauge

/**
  * @author Daniel.Rey
  */
class Demo extends DemoBaseSpec {
  path = "/scalawebtest_homepage.html"

  "Homepage" should "contain navigation" in {
    Gauge.fits(
      <div id="nav-wrapper">
        <!-- Nav -->
        <nav id="nav">
          <ul>
            <li class="home"><a href="/index.html">ScalaWebTest </a></li>

            <li><a href="/documentation.html" title="Documentation">Documentation</a></li>

            <li><a href="/download.html" title="Download">Download</a></li>

            <li><a href="/community.html" title="Community">CommunitY</a></li>

          </ul>
        </nav>
      </div>
    )
  }

}
