package org.scalawebtest.demo

import org.scalawebtest.core.gauge.Gauge

class DemoBackup extends DemoBaseSpec {
  path = "/scalawebtest_homepage.html"

  case class Page(name: String, path: String)

  val documentation =  Page("Documentation", "/documentation.html")
  val download =  Page("Download", "/download.html")
  val community =  Page("Community", "/community.html")

  "The homepage" should "show the navigation" in  {
    Gauge.fits(
      <div id="nav-wrapper">
        <!-- Nav -->
        <nav id="nav">
          <ul>
            <li class="home"><a>Home</a></li>

            <li><a href={documentation.path}>{documentation.name}</a></li>
            <li><a href={download.path}>{download.name}</a></li>
            <li><a href={community.path}>{community.name}</a></li>
          </ul>
        </nav>
      </div>
    )
  }

}
