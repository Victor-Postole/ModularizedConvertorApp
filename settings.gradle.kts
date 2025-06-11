gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:convention:testClasses"))


pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ModularizedConvertorApp"
include(":app")
include(":core")
include(":core:network")
include(":core:ui")
include(":core:model")
include(":core:data")
include(":core:database")
include(":core:testing")
include(":core:common")
include(":core:designssistem")
include(":feature")
include(":feature:currency-convertor")
