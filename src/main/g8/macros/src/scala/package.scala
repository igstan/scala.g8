package $organization$.$name;format="Camel"$

import scala.language.experimental.macros
import scala.reflect.macros.Context

package object macros {
  /**
   * An identity macros which spits out what it receives.
   *
   * The advantage is that when the -Ymacro-debug-lite options is present
   * you will be able to see the AST representation of the code. Useful for
   * exploration and learning
   */
  def id[A](a: A): A = macro idMacro[A]
  def idMacro[A](c: Context)(a: c.Expr[A]): c.Expr[A] = a
}
