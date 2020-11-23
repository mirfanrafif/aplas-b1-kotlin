package org.aplas.basicapp

class Weight {
    var gram = 0.0;
    var ounce: Double
        set(gram) {
            this.gram = gram * 28.3495231
        }
        get() = gram / 28.3495231

    var pound: Double
        set(gram) {this.gram = gram * 453.59237}
        get() = gram / 453.59237

    fun convert(oriUnit: String, convUnit: String, value: Double): Double {
        if (oriUnit == "Grm") {
            gram = value
        } else if (oriUnit == "Onc") {
            ounce = value
        } else {
            pound = value
        }
        return if (convUnit == "Grm") {
            gram
        } else if (convUnit == "Onc") {
            ounce
        } else {
            pound
        }
    }

}