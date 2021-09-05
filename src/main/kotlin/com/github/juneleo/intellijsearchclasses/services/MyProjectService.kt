package com.github.juneleo.intellijsearchclasses.services

import com.github.juneleo.intellijsearchclasses.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
