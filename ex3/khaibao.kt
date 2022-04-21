package com.`class`

class khaibao {
    class Student2 {
        var id = 0
        var name: String? = null

        // phương thức insertRecord
        fun insertRecord(id: Int, name: String?) {
            this.id = id
            this.name = name
        }

        // phương thức displayInformation
        fun displayInformation() {
            println("$id $name")
        }

        companion object {
            @JvmStatic
            fun main(args: Array<String>) {
                val s1 = Student2()
                val s2 = Student2()
                val s3 = Student2()
                s1.insertRecord(111, "Viet")
                s2.insertRecord(222, "Tuts")
                s3.insertRecord(111,"huy")
                s1.displayInformation()
                s2.displayInformation()
                s3.displayInformation()
            }
        }
    }
}