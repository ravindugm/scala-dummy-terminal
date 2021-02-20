package org.scala.dummy.terminal.commands

import org.scala.dummy.terminal.filesystem.State

trait Command {

  def apply(state: State): State
}

object Command {
  def from(input: String): Command = new UnknownCommand
}
