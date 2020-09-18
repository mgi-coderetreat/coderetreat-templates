package com.okta.developer

fun String.sort(): List<Char> = this.toList().sorted()

class Anagrams {

    fun count(s: String): Int {
        var count = 0
        for (i in 1 until s.length) {
            var substrings = s.windowed(i,  1)
                .map { it.sort() }
                .toMutableList()
            while (substrings.isNotEmpty()) {
                val substring = substrings.removeAt(0)
                count += substrings.count{ it == substring }
            }
        }
        return count
    }
}






