package task2

open class SmartDevice(val name: String) {
    var status = "off"

    open fun turnOn() {
        status = "on"
        println("$name is ON")
    }

    open fun turnOff() {
        status = "off"
        println("$name is OFF")
    }
}

class SmartTvDevice(name: String) : SmartDevice(name) {

    var speakerVolume = 5
        private set(value) {
            field = value.coerceIn(0, 100)
        }

    var channelNumber = 1

    override fun turnOn() {
        super.turnOn()
        println("TV: display on")
    }

    fun increaseVolume() {
        speakerVolume++
        println("Volume: $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel: $channelNumber")
    }
}

fun main() {
    val tv = SmartTvDevice("Living Room TV")
    tv.turnOn()
    tv.nextChannel()
    tv.increaseVolume()
    tv.turnOff()

    // tv.speakerVolume = 80   // ERROR kalau diaktifkan: private set
}