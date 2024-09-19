plugins {
    id("java")
    id("war")
    id("checkstyle")
    id("io.freefair.lombok") version "8.10"
}

group = "webapp.code"
version = "1.0-SNAPSHOT"


repositories {
    jcenter()
}

dependencies {
    providedCompile ("javax.servlet:javax.servlet-api:3.1.0")
    testImplementation ("junit:junit:4.13.1")
}