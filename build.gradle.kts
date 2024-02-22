plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.13.2")
    implementation("junit:junit:4.13.2")
    implementation("junit:junit:4.13.2")
    implementation("junit:junit-dep:4.11")
    implementation("junit:junit-dep:4.11")
    implementation("junit:junit-dep:4.11")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}