tasks.create("shared-task") {
    val sharedMap = mutableMapOf(
        "name" to "Max",
        "age" to 31,
    )
    println("sharedMap in shared-task: $sharedMap")
    rootProject.ext.set("sharedMap", sharedMap)
}
