tasks.getByName("jar") {
    enabled = true
}

tasks.getByName("bootJar") {
    enabled = false
}

dependencies {
    api(project(":jangtari-domain"))
    implementation(project(":jangtari-infrastructure"))

    implementation("org.springframework.boot:spring-boot-starter")
}
