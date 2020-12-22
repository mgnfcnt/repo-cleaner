package com.github.mgnfcnt.repocleaner.services

import com.intellij.openapi.project.Project
import com.github.mgnfcnt.repocleaner.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
