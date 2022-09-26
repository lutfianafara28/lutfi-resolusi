class Controller(private val callback: CallBack){
    fun banding(data1: String, data2: String ){
        when (data1 + data2) {
            "gunting" + "kertas", "kertas" + "batu", "batu" + "gunting"-> {
                callback.tampilkanHasil(result = "Kamu Menang!")
            }
            "kertas" + "gunting", "gunting" + "batu", "batu" + "kertas"-> {
                callback.tampilkanHasil(result = "Kamu Kalah!")
            }
            "kertas" + "kertas", "batu" + "batu", "gunting" + "gunting"-> {
                callback.tampilkanHasil(result = "Draw")

            }
        }
    }

}
