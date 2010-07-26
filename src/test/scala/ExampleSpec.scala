package com.example

import org.specs._

import dispatch._

object ExampleSpec extends Specification with unfiltered.spec.Served {
  
  import dispatch._
  
  def setup = { _.filter(new App) }
  
  "The example app" should {
    "serve unfiltered text" in {
      Http(host as_str) must_=="unfiltered example"
    }
  }
}