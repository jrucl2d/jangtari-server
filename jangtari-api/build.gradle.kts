tasks.getByName("bootJar") {
    enabled = true
}

dependencies {
    implementation(project(":jangtari-application"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}
