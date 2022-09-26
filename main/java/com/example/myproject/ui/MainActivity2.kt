fun main(args: Array<String>) {
    print("Input Pemain 1: ")
    val data1 = readLine()!!
    print("Input Pemain 2: ")
    val data2 = readLine()!!
    val controller = Controller(object : CallBack{
        override fun tampilkanHasil(result: String) {
            println(result)
        }

    })
    controller.banding(data1, data2)
}