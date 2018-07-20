package com.example.demo


import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class BigClassScalaTest extends FunSuite {

  test("Very Basic") {
    assert(1 == 2)
  }

}
