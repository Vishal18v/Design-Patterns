package observerPattern

interface Observer {
    fun update()
}

class Tv : Observer {
    override fun update() {
        println("TV: I'm watching the weather updates")
    }
}

class Radio : Observer {
    override fun update() {
        println("Radio: I'm listening to the weather updates")
    }
}