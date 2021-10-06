package com.qdot.randomid

class RandomID {

    companion object Get{
        fun getAlphanumericID(length:Int) : String {
            val charPool: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
            return (1..length)
                .map{ kotlin.random.Random.nextInt(0, charPool.size) }
                .map(charPool::get)
                .joinToString("")
        }
    }

}