package com.github.henrijs.twigextended.services

import com.github.henrijs.twigextended.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
