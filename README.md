# scalax2016
Writing integration tests for web applications and enjoy doing so

#start presentation
cd presentation
grunt serve

#call demo
sbt
it:test-only org.scalawebtest.demo.Demo
it:test-only org.scalawebtest.demo.DemoBackup
