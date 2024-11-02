# Example Build Plugin

This is an example of an NPM package that includes a Gradle plugin, which can be used in React Native application builds.

## How to add this plugin

1. Install the package (npm, yarn, ...)
2. Include the package build in `android/settings.gradle(.kts)`

  ```groovy
  includeBuild('../node_modules/example-build-plugin')
  ```

3. Add the plugin as dependency in `android/build.gradle(.kts)`

  ```groovy
  classpath("org.example.react:plugin")
  ```

4. Apply the plugin in `android/app/build.gradle(.kts)`

  ```groovy
  apply plugin: "org.example.react"
  ```

5. Done. Build your Android RN app.
