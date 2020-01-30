/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bacon.domain

import java.util.Objects

class Product {

    var id: Long = 0

    var code: String? = null
    var name: String? = null
    var price: Double = 0.toDouble()
    var image: String? = null
    var description: String? = null
    var category: String? = null
    var isVariablePrice: Boolean = false
    private val ingredients: MutableList<Ingredient>? = null

    constructor(id: Long) {
        this.id = id
    }

    constructor(id: Long, name: String, price: Double, category: String,image: String) {
        this.id = id
        this.name = name
        this.price = price
        this.category = category
        this.image = image
    }

    constructor() {}

    fun getIngredients(): List<*>? {
        return ingredients
    }

    fun addIngredients(ingredient: Ingredient) {
        ingredients!!.add(ingredient)
    }

    override fun equals(obj: Any?): Boolean {
        if (obj === this) {
            return true
        }
        if (obj == null || obj.javaClass != this.javaClass) {
            return false
        }
        val prod = obj as Product?
        return if (!name!!.equals(prod!!.name!!, ignoreCase = true)) {
            false
        } else price == prod.price

    }

    override fun hashCode(): Int {
        var hash = 5
        hash = 97 * hash + Objects.hashCode(this.name)
        hash =
            97 * hash + (java.lang.Double.doubleToLongBits(this.price) xor java.lang.Double.doubleToLongBits(
                this.price
            ).ushr(32)).toInt()
        return hash
    }

    override fun toString(): String {
        return ("Product ["
                + "\nid:" + id
                + "\nname:" + name
                + "\ncode:" + code
                + "\nprice:" + price
                + "\ncategory:" + category
                + "\n]")
    }

}
