package org.scalawebtest.demo

import org.scalawebtest.core.gauge.Gauge.fits

/**
  * @author Daniel.Rey
  */
class Demo extends DemoBaseSpec{

  path = "/scalawebtest_homepage.html"

  "Homepage" should "contain the navigation" in {
    fits(
      <div id="nav-wrapper">
        <!-- Nav -->
        <nav id="nav">
          <ul>
            <li class="home"><a href="/index.html">ScalaWebTest </a></li>

            <li><a href="/download.html" title="Download"></a></li>

            <li><a>CommunitY</a></li>

          </ul>
        </nav>
      </div>
    )
  }

}
