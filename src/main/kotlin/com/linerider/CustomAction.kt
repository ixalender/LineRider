package com.linerider

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.editor.Editor

abstract class CustomAction: AnAction() {

    fun moveCaret(editor: Editor, lineOffset: Int, withSelection: Boolean) {
        editor.caretModel.allCarets.forEach {
            it.moveCaretRelatively(
                it.logicalPosition.column,
                lineOffset,
                withSelection,
                true
            )
        }
    }

    fun getEditor(e: AnActionEvent): Editor? = e.getData(CommonDataKeys.EDITOR)
}