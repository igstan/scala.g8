package $organization$.$name;format="camel"$

import org.slf4j.LoggerFactory

object Main {
  val logger = LoggerFactory.getLogger("Main")

  def main(args: Array[String]): Unit = {
    logger.info("Running main...")
    println("Hello, World!")
  }
}
