package collections.logical

fun main() {
//   findTheMaxAndMin()
//    removeDuplicates()
//    listIsPalindrome()
//    rotate()
//    reverseArrayList()
//    findTheLargest()
//    arrayIsSortedOrNot()
//    isSortedAscendingOrDesending()
//    twoSums()
//    missingNumber()
    maxMin()
}


fun findTheMaxAndMin() {

    var numbers = arrayListOf(12, 24, 7, 45, 23, 98, 76, 2)

    var max = numbers[0]
    var min = numbers[0]

    for (number in numbers) {
        if (number > max) max = number
        if (number < min) min = number
    }

    println("max number is $max : $min")
}

fun removeDuplicates() {
    val numbers = arrayListOf(10, 20, 10, 30, 20, 40, 50, 30)

//    val uniqueList = arrayListOf<Int>()
//
//    for (number in numbers) {
//        if (!uniqueList.contains(number)) {
//            uniqueList.add(number)
//        }
//    }

    println(numbers.distinct())
}

fun listIsPalindrome() {
    val list1 = arrayListOf(1, 2, 3, 2, 1)
    val list2 = arrayListOf(1, 2, 3, 4, 5)
//    if (list2 == list2.reversed())
//        print("Give list is palindrome")
//    else
//        print("Given list is not a palindrome")

    for (i in 0 until list2.size / 2) {
        if (list2[i] != list2[list2.size - 1 - i]) {
            println("Not a palindrome")
            return
        }
    }

    print("Palindrome ")

}

fun rotate() {
    var k = 1
    val list = arrayListOf(1, 2, 3, 4, 5)

    repeat(k) {
        var last = list.removeAt(list.size - 1)
        list.add(0, last)
    }

    print(list)

}

fun reverseArrayList() {
    val list = arrayListOf(10, 20, 30, 40, 50)
//    val reversed = ArrayList<Int>()
//    for (i in list.size - 1 downTo 0) {
//        reversed.add(list[i])
//    }
//    print(reversed)

    var i = 0
    var j = list.size - 1

    while (i < j) {
        var temp = list[i]
        list[i] = list[j]
        list[j] = temp

        i++
        j--
    }
    print(list)

}

fun findTheLargest() {
    val numbers = arrayListOf(10, 25, 87, 7, 98, 56, 42, 13)
//    val largest = numbers.maxOrNull()

    var sorted = numbers.distinct().sortedDescending()
    println(sorted)

    var largest = numbers[0]
    var secondLargest = numbers[0]

    for (number in numbers) {
        if (number > largest) {
            secondLargest = largest
            largest = number
        } else if ((number > secondLargest) && (number != largest)) {
            secondLargest = number
        }
    }

    print("largest is $largest second largest $secondLargest")
}

fun arrayIsSortedOrNot() {
//    val arr1 = listOf(1, 2, 3, 4, 5)
    val arr1 = listOf(5, 3, 2, 1)

    for (i in 0 until arr1.size - 1) {
        if (arr1[i] > arr1[i + 1]) {
            println("Array Is Not Sorted")
            return
        }
    }

    print("Array is Sorted")

}

fun isSortedAscendingOrDesending() {
    val arr1 = listOf(5, 3, 2, 1)
//        val arr1 = listOf(1, 2, 3, 4, 5)

    var ascending = false
    var desending = false

    for (i in 0 until arr1.size - 1) {
        if (arr1[i] > arr1[i + 1]) ascending = true
        if (arr1[i] < arr1[i + 1]) desending = true
    }

    when {
        !ascending -> print("Array is sorted in assceding")
        !desending -> print("Array is sorted in descending")
        else -> print("Array is not sorted ")
    }

}

fun twoSums() {
    val nums = intArrayOf(3, 2, 4)
    val target = 6

    val mapIs = mutableMapOf<Int, Int>()
    for ((i, num) in nums.withIndex()) {
        var diff = target - nums[i]
        if (mapIs.contains(diff)) {
            print("${mapIs[diff]}  :  $i ")
        }
        mapIs[num] = i
    }
}

fun missingNumber() {
    val numbers = listOf(2, 4, 7, 12)

    val maxNumber = numbers.maxOrNull() ?: 0

    val boolList = BooleanArray(maxNumber + 1) { false }

    for (element in numbers) {
        boolList[element] = true
    }

    var missingNumber = mutableListOf<Int>()

    for (i in 1 until maxNumber) {
        if (!boolList[i]) {
            missingNumber.add(i)
        }
    }


    println(missingNumber)


}

fun maxMin() {
    val arr = listOf(1, 2, 3, 4, 5, 6, 7)
    var sorted = arr.sorted()
    var result = arrayListOf<Int>()

    print(sorted)
    var left = 0
    var right = sorted.size - 1

    while (left <= right) {
        if (left != right) {
            result.add(sorted[right--])
            result.add(sorted[left++])
        } else {
            result.add(sorted[left])
            left++
        }
    }

    print(result)

}

fun countTheEachString() {
    var str = "Helloo"
    val mapIs = str.groupingBy { it }.eachCount()
    println("mapIs $mapIs")
}


fun countTheString() {
    val input: String = "aabbccddaaefccc"

    var result = ""
    var count = 1

    for (i in 1..<input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            result += input[i - 1] + count.toString()
            count = 1
        }
    }

    result += input[input.length - 1] + count.toString()
    print("resultIs $result")
}




