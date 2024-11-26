fun main(args: Array<String>) {

    val circle = Circle(5f, 0f, 0f)
    println("Площадь круга = ${circle.area()}")
    circle.resize(2)
    println("Площадь круга после увеличения в 2раза - ${circle.area()}")

    println("Координаты до поворота \nX: ${circle.X}, Y: ${circle.Y}")

    circle.rotate(RotateDirection.CounterClockwise, -1, 1)

    println("Координаты после поворота \nX: ${circle.X}, Y: ${circle.Y}")

    val rect = Rect(0f, 0f, 4f, 2f)
    rect.move(2, 4)
    println("""
        Координаты до поворота
        x1: ${rect.x1}, y1: ${rect.y1}
        x2: ${rect.x2}, y2: ${rect.y2}
        x3: ${rect.x3}, y3: ${rect.y3}
        x4: ${rect.x4}, y4: ${rect.y4}
    """.trimIndent())
    rect.rotate(RotateDirection.CounterClockwise, 3, -3)
    println("""
        Координаты после поворота
        x1: ${rect.x1}, y1: ${rect.y1}
        x2: ${rect.x2}, y2: ${rect.y2}
        x3: ${rect.x3}, y3: ${rect.y3}
        x4: ${rect.x4}, y4: ${rect.y4}
    """.trimIndent())

    println("Площадь = ${rect.area()}")
    val rect2 = Rect(rect)
    println("Площадь скопированного прямоугольника = ${rect2.area()}")

    val square = Square(2f, 0f, 0f)
    println("Площадь до увеличения = ${square.area()}")
    square.resize(3)
    println("Площадь после увеличения в 3раза = ${square.area()}")
    println("""
        Координаты до перемещения
        x1: ${square.x1}, y1: ${square.y1}
        x2: ${square.x2}, y2: ${square.y2}
        x3: ${square.x3}, y3: ${square.y3}
        x4: ${square.x4}, y4: ${square.y4}
    """.trimIndent())
    square.move(2, 4)
    println("""
        Координаты после перемещения
        x1: ${square.x1}, y1: ${square.y1}
        x2: ${square.x2}, y2: ${square.y2}
        x3: ${square.x3}, y3: ${square.y3}
        x4: ${square.x4}, y4: ${square.y4}
    """.trimIndent())

}
