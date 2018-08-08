package com.LineRider

import com.intellij.openapi.actionSystem.AnActionEvent

class CaretUpAction : CustomAction() {

    override fun actionPerformed(e: AnActionEvent) {
        moveCaretUp(e)
    }

    private fun moveCaretUp(e: AnActionEvent) {
        val editor = getEditor(e) ?: return
        moveCaret(
            editor,
            ConfigRepository.getOffset() * -1,
            e.inputEvent.isShiftDown
        )
    }
}