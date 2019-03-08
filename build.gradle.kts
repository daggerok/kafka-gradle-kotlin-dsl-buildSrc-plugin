plugins {
    `java-library`
    kafka
}

kafka {
    workDir = "/tmp/1"
}

group = "com.github.daggerok"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

defaultTasks("build")

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
