package com.github.lokkersp

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

class GraphPlugin implements Plugin<Project>{
    @Override
    void apply(Project project) {
        def graph = project.tasks.create('graph',GraphTask)
    }

    static void afterEvaluate(){
        //def
    }
}


class GraphPluginExt {
    void afterEvaluate(Project project) {
        GraphPlugin.afterEvaluate(project)
        project.tasks.graph.afterEvaluate()
    }
}