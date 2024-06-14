package com.fangao.android

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Create by fanrui07 
 * Date: 2024/6/14
 * Describe:
 */
class GroovyPlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {
        println(">>>>>>>>>>>>>>>Hello World")
    }
}
