package com.williamareynolds.person

import zio.schema.*
import zio.schema.codec.JsonCodec

case class Person(
    age: Int,
    firstName: String,
    lastName: String
)

object Person:
  given schema: Schema[Person] = Schema.derived[Person]

  val example: Person = Person(25, "Jeremy", "Guitard")
