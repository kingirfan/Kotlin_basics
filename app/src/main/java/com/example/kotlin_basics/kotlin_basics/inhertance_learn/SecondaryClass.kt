package com.example.kotlin_basics.kotlin_basics.inhertance_learn

class SecondaryClass : BaseClass(), FirstInterface{
    override fun role() {
//        super.role()
        println("From roles secondary class")
    }

    override fun firstInterface() {
//        super.firstInterface()
        println("Called from seocndary class of method ")
    }

    override fun firstInterfaceCheck() {
        println("Called from seocndary class ")
    }
}