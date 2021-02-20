package org.scala.dummy.terminal.filesystem

import org.scala.dummy.terminal.commands.Command
import org.scala.dummy.terminal.files.Directory

import java.util.Scanner

object FileSystem extends App {

  val root = Directory.ROOT
  var state = State(root, root)
  val scanner = new Scanner(System.in)

  while (true) {
    state.show
    val input = scanner.nextLine()
    state = Command.from(input).apply(state)
  }
}
