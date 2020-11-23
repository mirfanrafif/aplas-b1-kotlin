package org.aplas.basicapp

class Distance {
    var meter = 0.0
    var inch: Double
        set(meter) {this.meter = meter / 39.3701}
        get() =  meter * 39.3701

    var mile: Double
        set(meter) {this.meter = meter / 0.000621371}
        get() = meter * 0.000621371

    var foot: Double
        set(meter) {this.meter = meter / 3.28084}
        get() = meter * 3.28084

    fun convert(oriUnit: String, convUnit: String, value: Double): Double {
        if (oriUnit == "Mtr") {
            meter = value
        } else if (oriUnit == "Inc") {
            inch = value
        } else if (oriUnit == "Mil") {
            mile = value
        } else {
            foot = value
        }
        return if (convUnit == "Mtr") {
            meter
        } else if (convUnit == "Inc") {
            inch
        } else if (convUnit == "Mil") {
            mile
        } else {
            foot
        }
    }

}