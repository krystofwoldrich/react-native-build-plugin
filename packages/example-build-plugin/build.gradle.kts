
plugins { alias(libs.plugins.kotlin.jvm).apply(false) }

tasks.register("build") {
  dependsOn(
      ":plugin:build",
  )
}

tasks.register("clean") {
  dependsOn(
      ":plugin:clean",
  )
}
