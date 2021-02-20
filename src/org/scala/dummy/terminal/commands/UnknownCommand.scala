package org.scala.dummy.terminal.commands
import org.scala.dummy.terminal.filesystem.State

class UnknownCommand extends Command {

  override def apply(state: State): State =
    state.setMessage("Command not found!")
}
