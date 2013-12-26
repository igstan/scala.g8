package $organization$.$name;format="camel"$

import org.slf4j.LoggerFactory

object $name;format="Camel"$ {
  val logger = LoggerFactory.getLogger("$name;format="Camel"$")

  def main(args: Array[String]): Unit = {
    logger.info("Hello, World!")
  }
}
