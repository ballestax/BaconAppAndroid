package com.ballestax.baconapp.model

import com.bacon.domain.Product

class DataProvider {

    private val products: MutableList<Product> = ArrayList()

    constructor(){


        var product = Product(1, "tradicional de carne", 13000.0, "hamburguesas","tradicional.png")
        product.description = "160 gr de carne, queso mozarella,lechuga, tomate, tocineta, salsas de la casa"
        products?.add(product)

        product = Product(2, "tradicional de pollo", 13000.0, "hamburguesas","noimage.jpg")
        product.description = "160 de pollo, lechuga, tomate, tocineta, queso mozarela, salsas de la casa"
        products?.add(product)

        product = Product(3, "bacon 57", 15000.0,"hamburguesas","noimage.jpg")
        product.description = "160 gr de carne, cebolla grille con tocineta, lechuga, tomate, jamon, tocineta, salsas de la casa"
        products?.add(product)

        product = Product(4, "chicken special", 16000.0,"hamburguesas","noimage.jpg")
        product.description = "160 gr de pollo bañado en salsa de champiñones, jamon de pollo, lechuga, tomate, tocineta, queso mozarella"
        products?.add(product)

        product = Product(5, "pavita bacon", 15000.0,"hamburguesas","noimage.jpg")
        product.description = "160 gr de carne, cebolla grille con tocineta, lechuga, tomate, jamon, tocineta, salsas de la casa"
        products?.add(product)

        product = Product(6, "choriburger", 15000.0,"hamburguesas","noimage.jpg")
        product.description = "160 gr de carne, lechua, jamon, cebolla caramelizada, 1/2 chorizo, salsas de la casa"
        products?.add(product)

        product = Product(7, "doble carne", 18000.0,"hamburguesas","noimage.jpg")
        product.description = "dos carnes de 160 gr cada una, dos tocinetas, queso americano, queso mozarella, cebolla caramelizada, lechuga tomate, salsas de la casa"
        products?.add(product)

        product = Product(8, "rib 57", 18000.0,"hamburguesas","noimage.jpg")
        product.description = "160 gr de carne, cerdo desmenuzado, trocitos crocantes de piel de cerdo, lechuga, tomate, tocineta, salsas de la casa"
        products?.add(product)

        product = Product(9, "rellenita", 20000.0,"hamburguesas","noimage.jpg")
        product.description = "230 gr de carne, rellena de cebolla grille con tocineta, quezo mozarella, salchicha ranchera molida, lechuga, tomate, tocineta ,queso americano, cebolla caramelizada, jamon, salsas de la casa"
        products?.add(product)


    }

    fun getProducts(): MutableList<Product>?{
        return products
    }






}