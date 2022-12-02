plugins {
    id("java")
}

tasks.create("api-task") {
    dependsOn(":shared:shared-task")
    doFirst {
        val sharedMap = rootProject.ext.get("sharedMap") as MutableMap<String, Any>
        println("sharedMap in api-task: $sharedMap")
    }
}
