plugins {
    java
    kafka
}

kafka {
    workDir = "/tmp/1"
}

group = "com.github.daggerok"
version = "1.0-SNAPSHOT"

defaultTasks("build")

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<Wrapper> {
    gradleVersion = Globals.gradleVersion
    distributionType = Wrapper.DistributionType.BIN
}
