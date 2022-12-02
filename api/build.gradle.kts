plugins {
    id("java")
}

group = "com.vitamax"
version = "1.0"

dependencies{
    implementation(project(":shared"))
}

tasks.withType(JavaCompile::class.java) {
    options.encoding = "UTF-8"
}

tasks.create("api-task") {
    dependsOn(":shared:shared-task")
    doFirst {
        val sharedMap = rootProject.ext.get("sharedMap") as MutableMap<String, Any>
        println("sharedMap in api-task: $sharedMap")
    }
}
