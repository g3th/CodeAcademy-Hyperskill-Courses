fun countVowels(charSequence: CharSequence): Int {
    var counter = 0
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    for (i in charSequence) {
        for (j in vowels) {
            if (i.equals(j, true)) {
                counter ++
            }
        }
    }
    return counter
}

fun main(){
	countVowels("Hello")
}
