# Gradle-core-variable-share
This is a simple gradle demo project to demonstrate that you can share variables between
modules in multi module project structure

## Tree structure of this project

```
└── gradle-core-variable-share/
    ├── api/
    │   └── build.gradle.kts
    ├── shared/
    │   └── build.gradle.kts
    └── settings.gradle.kts
```

If you run,

```shell
./gradlew :api:api-task 
```

the result will look like below
```shell
> Configure project :shared
sharedMap in shared-task: {name=Max, age=31}

> Task :api:api-task
sharedMap in api-task: {name=Max, age=31}

BUILD SUCCESSFUL in 1s
1 actionable task: 1 executed
```
