package me.devcetus

import java.awt.EventQueue
import javax.swing.JFrame
import javax.swing.ImageIcon

class Snake : JFrame() {

    init {
        initUI()
    }

    private fun initUI() {

        val icon = ImageIcon(javaClass.getResource("/snake.png")).image

        add(Board())

        title = "Snake"

        isResizable = false
        iconImage = icon
        pack()

        setLocationRelativeTo(null)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            EventQueue.invokeLater {
                val ex = Snake()
                ex.isVisible = true
            }
        }
    }
}
