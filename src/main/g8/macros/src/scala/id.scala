package $organization$.$name;format="camel"$
package macros

import scala.language.experimental.macros
import scala.reflect.macros.Context

/**
 * An identity macro which performs no AST manipulation on what it receives.
 *
 * The advantage is that when the -Ymacro-debug-lite options is present
 * you will be able to see the AST representation of the code. Useful for
 * exploration and learning
 */
object id {
  def apply[A](a: A): A = macro applyMacro[A]
  def applyMacro[A](c: Context)(a: c.Expr[A]): c.Expr[A] = a
}
