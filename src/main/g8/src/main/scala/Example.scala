package com.example

import unfiltered.request._
import unfiltered.response._

/** unfiltered plan */
class App extends unfiltered.Planify ({
  case _ => ResponseString("unfiltered example")
})

/** embedded server */
object Server {
  def main(args: Array[String]) {
    unfiltered.server.Http(8080).filter(new App).run
  }
}
