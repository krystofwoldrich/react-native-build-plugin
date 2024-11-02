package org.example.react

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class ExamplePostBundleTask: DefaultTask() {
    @TaskAction
    fun run() {
        println("Running from " + this.name + "after React Native bundle task.")
    }
}
