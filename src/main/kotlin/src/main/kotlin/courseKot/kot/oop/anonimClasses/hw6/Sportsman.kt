package courseKot.kot.oop.anonimClasses.hw6

class Sportsman {
    fun invokeWaterBoy(waterBoy: WaterBoy) {
        waterBoy.bringWater()
    }

    inline fun invokeWaterBoy(bringWater: () -> Unit) {
        bringWater()
    }
}


//asked -- inline
fun main() {
    val sportsman = Sportsman()
//    sportsman.invokeWaterBoy(object : WaterBoy {
//        override fun bringWater() {
//            println("Water is brought")
//        }
//
//    })

    sportsman.invokeWaterBoy { println("Water is brought") }
}