package com.LineRider

import com.intellij.openapi.actionSystem.AnActionEvent

class CaretDownAction : CustomAction() {

    override fun actionPerformed(e: AnActionEvent) {
        moveCaretDown(e)
    }

    private fun moveCaretDown(e: AnActionEvent) {
        val editor = getEditor(e) ?: return
        moveCaret(
            editor,
            ConfigRepository.getOffset(),
            e.inputEvent.isShiftDown
        )
    }
}