package $organization$.$name;format="camel"$
package test

import org.slf4j.LoggerFactory

class MainTest extends FunSuite with Matchers {
  val logger = LoggerFactory.getLogger("MainTest")

  test("tests setup") {
    logger.info("Logging infrastructure is working.")
    true should be(true)
  }
}
