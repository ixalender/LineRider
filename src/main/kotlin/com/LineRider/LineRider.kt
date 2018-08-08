package com.LineRider

import com.intellij.openapi.components.ApplicationComponent

class LineRider : ApplicationComponent {
    override fun getComponentName(): String {
        return "LineRider"
    }
}