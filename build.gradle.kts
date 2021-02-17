import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        // mavenLocal()
        maven("http://artifacts.hyattdev.com/artifactory/plugins-release")
        maven("https://artifacts.hyattdev.com/artifactory/remote-repos")
    }
}

plugins {
    java
    idea
    kotlin("jvm") version "1.4.30"
}

apply(plugin = "java")

group = "me.ddaypunk"
version = ""

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    // mavenLocal()
    maven("https://artifacts.hyattdev.com/artifactory/remote-repos")
}

dependencies {
    testImplementation(kotlin("test-junit"))
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnit()
}