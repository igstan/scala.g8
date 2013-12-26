package $organization$.test
package $name;format="camel"$

import ch.qos.logback.classic.Level
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.pattern.color.ANSIConstants._
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase

class LogLevelHighlighting extends ForegroundCompositeConverterBase[ILoggingEvent] {
  override def getForegroundColorCode(event: ILoggingEvent): String = {
    (event.getLevel.toInt: @annotation.switch) match {
      case Level.INFO_INT  => CYAN_FG
      case Level.WARN_INT  => YELLOW_FG
      case Level.ERROR_INT => RED_FG
      case Level.DEBUG_INT => MAGENTA_FG
      case Level.TRACE_INT => BLUE_FG
      case _               => DEFAULT_FG
    }
  }
}
