package org.example.react

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import kotlin.test.Test
import kotlin.test.assertNotNull

class BuildPluginTest {
    @Test fun `plugin creates task`() {
        // Create a test project and apply the plugin
        val project = ProjectBuilder.builder().build()

        mockReactNativeBundleTask(project)

        val buildPlugin = BuildPlugin()
        buildPlugin.attachPostBundleTask(project)

        // Verify the result
        assertNotNull(project.tasks.findByName("examplePostBundleTask"))
    }

    private fun mockReactNativeBundleTask(project: Project) {
      project.tasks.create("createBundleReleaseJsAndAssets")
    }
}
