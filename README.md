# scalax2016
Writing integration tests for web applications and enjoy doing so

#start presentation
```
cd presentation
grunt serve
```

#call demo
You may execute the Demo as follows. The error in Demo.scala is intended,
 and the same one I showed during my presentation.

```
sbt
sbt> jetty:start
sbt> it:test
sbt> it:test-only org.scalawebtest.demo.Demo
sbt> jetty:stop
```
