package com.joescii.sbtjs

import sbt.{File, SettingKey, TaskKey}

trait SbtJsTestKeys {
  val jsResources = SettingKey[Seq[File]]("jsResources", "JavaScript directories and files needed for running tests")
  val jsTestColor = SettingKey[Boolean]("jsTestColor", "Enables the use of color in console messages")
  val jsTestBrowsers = SettingKey[Seq[Browser]]("jsTestBrowsers", "The list of browsers to emulate for tests")

  val jsTestTargetDir = SettingKey[File]("jsTestTargetDir", "Target directory for sbt-js-test to work in")
  val jsResourceTargetDir = SettingKey[File]("jsResourceTargetDir", "Target directory for writing JavaScript assets from the classpath")
  val consoleHtml = SettingKey[File]("consoleHtml", "Location for writing console.html")

  val jsTest = TaskKey[Unit]("jsTest", "Run JavaScript tests")
  val jsLs = TaskKey[Unit]("jsLs", "Lists all js files configured for testing")
  val writeJsAssets = TaskKey[Seq[File]]("writeJsAssets", "Writes JavaScript assets to target for HtmlUnit to consume")
  val writeConsoleHtml = TaskKey[File]("writeConsoleHtml", "Writes an HTML file containing all of the JavaScript resources for tests")
}
