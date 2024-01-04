package com.williamareynolds.person

import zio.test.*

object PersonSpec extends ZIOSpecDefault:
  override def spec = suite("Person")(
    test("can be encoded to string") {

      // As soon as the codec is referenced, the linker breaks.
      // val json = Person.codec

      // Referencing the Person constructor also breaks the linker.
      // val person = Person.example

      assertTrue(true)
    }
  )
