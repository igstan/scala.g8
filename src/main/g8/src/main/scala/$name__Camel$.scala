package $organization$.$name;format="camel"$

import org.slf4j.LoggerFactory

object $name;format="Camel"$ {
  val logger = LoggerFactory.getLogger("$name;format="Camel"$Test")

  def main(args: Array[String]): Unit = {
    logger.info("Running main...")
    println("Hello, World!")
  }
}
