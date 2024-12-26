package observerPattern

class WeatherStation : Subject {
    private val observers: MutableList<Observer> = mutableListOf()
    private var temperature: Float = 0.0f

    fun setTemperature(temperature: Float) {
        this.temperature = temperature
        notifyObservers()
    }

    fun getTemperature(): Float {
        return temperature
    }

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach { it.update() }
    }
}