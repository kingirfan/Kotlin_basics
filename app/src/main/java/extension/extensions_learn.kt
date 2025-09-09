package extension

import android.content.Context


fun main() {
    print("Madam".isPalindrome())
}

fun Context.showToast(){

}

fun String.isPalindrome() : Boolean{
    return this.lowercase() == this.lowercase().reversed()
}