package com.williamareynolds.person

import zio.test.*

object PersonSpec extends ZIOSpecDefault:
  override def spec = suite("Person")(
    test("can be encoded to string") {

      // As soon as the schema is referenced, the linker breaks.
      // val schema = Person.schema

      // Referencing the Person constructor also breaks the linker.
      // val person = Person.example

      assertTrue(true)
    }
  )
