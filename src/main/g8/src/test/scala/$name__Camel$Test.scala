package $organization$.test
package $name;format="camel"$

import org.slf4j.LoggerFactory

class $name;format="Camel"$Test extends FunSuite with Matchers {
  val logger = LoggerFactory.getLogger("$name;format="Camel"$Test")

  test("tests setup") {
    logger.info("Logging infrastructure is working.")
    true should be(true)
  }
}
