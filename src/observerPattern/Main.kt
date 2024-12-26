package observerPattern

fun main() {
    val weatherStation = WeatherStation()
    val tv = Tv()
    val radio = Radio()
    weatherStation.addObserver(tv)
    weatherStation.addObserver(radio)

    weatherStation.setTemperature(20.0f)
    weatherStation.setTemperature(25.0f)
}