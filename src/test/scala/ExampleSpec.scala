package com.example

import org.specs._

import dispatch._

/** TODO repackage in lib */
trait Served extends Specification {
  shareVariables()

  import unfiltered.server._
  def setup: (Server => Server)
  val port = 9090
  lazy val server = setup(new Http(port))
  val host = :/("localhost", port)

  doBeforeSpec { server.start() }
  doAfterSpec { server.stop() }
}
 
object ExampleSpec extends Specification with Served {
  
  import dispatch._
  
  def setup = { _.filter(new App) }
  
  "The example app" should {
    "serve unfiltered text" in {
      Http(host as_str) must_=="unfiltered example"
    }
  }
}