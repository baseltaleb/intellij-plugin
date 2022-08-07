package com.github.baseltaleb.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.baseltaleb.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
