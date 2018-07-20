package com.example.demo

import org.junit.Assert
import org.junit.Test
import org.scalatest.FunSuite


class BigClassTest {

  @Test
  def test() {
    val x = new BigClass
    Assert.assertEquals(x.getNiceField, "Hellor")
  }

}
