package com.bacon.domain

import java.util.Objects

class Ingredient {

    var id: Long = 0

    var code: String = ""
    var name: String = ""
    var measure: String = ""
    var quantity: Int = 0
    var isOpcional: Boolean = false

    constructor() {}

    constructor(id: Long) {
        this.id =
            id
    }

    constructor(code: String, nombre: String) {
        this.code = code
        this.name = nombre
    }

    constructor(id: Long, code: String, name: String, measure: String) {
        this.id = id
        this.code = code
        this.name = name
        this.measure = measure
    }

    override fun toString(): String {
        return "[$code] $name"
    }

    override fun equals(obj: Any?): Boolean {
        if (obj === this) {
            return true
        }
        if (obj !is Ingredient) {
            return false
        }
        val ing = obj as Ingredient?
        return name.equals(ing!!.name, ignoreCase = true)
    }

    override fun hashCode(): Int {
        var hash = 7
        hash = 97 * hash + Objects.hashCode(this.name)
        return hash
    }


}
