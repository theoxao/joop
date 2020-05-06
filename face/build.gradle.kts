plugins {
  id("com.moowork.node") version "1.3.1"
}

tasks.register("npmBuild", com.moowork.gradle.node.npm.NpmTask::class.java) {
  this.setArgs(arrayListOf("run", "build"))
}

tasks.register<Copy>("copyDist") {
  dependsOn("npmBuild")
  fileTree("${projectDir.parent}/resources/static").forEach {
    delete(it.absolutePath)
  }
  from("$buildDir/dist")
  into("${projectDir.parent}/resources/static")
}
