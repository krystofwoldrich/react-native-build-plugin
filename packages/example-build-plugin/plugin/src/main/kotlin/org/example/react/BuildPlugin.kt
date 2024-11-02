package org.example.react

import org.gradle.api.Project
import org.gradle.api.Plugin

/**
 * A simple plugin which attaches a task after the React Native bundle task.
 */
class BuildPlugin: Plugin<Project> {
    private val reactNativeBundleTaskName = Regex("^(?:createBundle|bundle).*JsAndAssets$")

    override fun apply(project: Project) {
        project.gradle.projectsEvaluated {
            attachPostBundleTask(project)
        }
    }

    internal fun attachPostBundleTask(project: Project) {
        // Executes after React Native Gradle plugin registered its tasks

        val reactNativeBundleTask = project.tasks.find { task ->
            task.name.matches(reactNativeBundleTaskName)
        }

        if (reactNativeBundleTask == null) {
            println("React Native Bundle Task not found!")
            return
        }

        project.tasks.create("examplePostBundleTask", ExamplePostBundleTask::class.java) {
            reactNativeBundleTask.finalizedBy(it)
        }
    }
}
