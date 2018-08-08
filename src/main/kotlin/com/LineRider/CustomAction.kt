package com.LineRider

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.ScrollType

abstract class CustomAction: AnAction() {

    fun moveCaret(editor: Editor, linePosition: Int, withSelection: Boolean) {
        val col = editor.caretModel.currentCaret.logicalPosition.column
        editor.caretModel.allCarets.forEach {
            it.moveCaretRelatively(col, linePosition, withSelection, true)
        }
    }

    fun getEditor(e: AnActionEvent): Editor? = e.getData(CommonDataKeys.EDITOR)
}