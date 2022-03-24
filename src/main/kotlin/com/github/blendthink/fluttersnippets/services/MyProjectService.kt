package com.github.blendthink.fluttersnippets.services

import com.intellij.openapi.project.Project
import com.github.blendthink.fluttersnippets.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
