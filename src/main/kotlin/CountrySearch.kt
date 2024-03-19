import org.openrndr.application
import org.openrndr.color.ColorRGBa

fun main() = application {
    configure {
        width = 1280
        height = 720
        title = "Country Search"
    }

    program {
        extend {
            drawer.fill = ColorRGBa.BLACK
        }
    }
}