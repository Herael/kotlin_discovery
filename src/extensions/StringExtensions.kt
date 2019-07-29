package extensions

fun String.sayHello() = println("This variable contains : $this")

fun String.toPlural() = this+"s"