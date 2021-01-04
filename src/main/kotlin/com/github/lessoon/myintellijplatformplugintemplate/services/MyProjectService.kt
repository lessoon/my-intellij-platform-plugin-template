package com.github.lessoon.myintellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.lessoon.myintellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
