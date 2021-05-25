package com.github.developerutils.kotlinfunctionargumentshelper.demo.model

data class Car(
    val id: Int,
    val name: String,
    val type: VehicleType,
    var price: Money,
    val manufacturer: Manufacturer,
    val engine: Engine,
    val color: String,
    val wheel: Map<String, Wheel>,
    val windows: List<Window>,
    val isPrototype: Boolean
)
