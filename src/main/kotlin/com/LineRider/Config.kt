package com.LineRider

import java.util.Properties

class ApplicationProperty(fileName: String) {
    private var props: Properties = Properties().apply {
        load(ApplicationProperty::class.java.classLoader.getResourceAsStream(fileName))
    }

    fun getProperty(name: String): String {
        return props.getProperty(name)
    }
}

object ConfigRepository {
    private const val propertyFile = "app.properties"

    fun getOffset(): Int =
        ApplicationProperty(propertyFile).run {
            getProperty("editor.caret.offset").toInt()
        }
}