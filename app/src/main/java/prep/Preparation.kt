package prep

fun main() {
    // countTheEachString()
    //  bestTimeBuyStock()
    // missingNumber()
    // arrayIsSorted()
    // removeDuplicate()
    // countTheString()
    // twoSums()
    // sortList()
    // findTheLargestAndSecondLargest()
    //maxMinMaxMin()
    // moveAllNonZero()
    reverseAnArray()
}

fun countTheEachString() {
    val input = "aabbccddaaaaefccczzz"

    var result = ""
    var count = 1

    for (i in 1..input.length - 1) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            result += input[i - 1] + count.toString()
            count = 1
        }
    }

    result += input[input.length - 1] + count.toString()

    println(result)
}

fun bestTimeBuyStock() {
    var numbers = arrayListOf(12, 24, 6, 45, 23, 98, 76, 2)

    var minPrice = numbers[0]
    var maxProfit = 0
    var buyAt = numbers[0]
    var sellAt = numbers[0]

    for (i in 1 until numbers.size) {
        val profit = numbers[i] - minPrice

        if (profit > maxProfit) {
            maxProfit = profit
            buyAt = minPrice
            sellAt = numbers[i]
        }

        if (numbers[i] < minPrice) {
            minPrice = numbers[i]
        }

    }
    println("buy at $buyAt and sell at $sellAt with profit of $maxProfit ")
}

fun missingNumber() {
    val numbers = listOf(2, 4, 7, 12)

    var maxNumber = numbers.maxOrNull() ?: 0
    var minNumber = numbers.minOrNull() ?: 0

    var boolList = BooleanArray(maxNumber + 1) { false }

    for (element in numbers) {
        boolList[element] = true
    }

    var missingNumber = arrayListOf<Int>()

    for (i in minNumber until maxNumber) {
        if (!boolList[i]) {
            missingNumber.add(i)
        }
    }

    println(missingNumber)

}

fun arrayIsSorted() {
//    val arr1 = listOf(1, 2, 3, 4, 5)
    val arr1 = listOf(5, 3, 2, 1)
//    val arr1 = listOf(1, 2, 3, 4, 5)
    var ascending = false
    var desending = false

    for (i in 1 until arr1.size - 1) {
        if (arr1[i] > arr1[i + 1]) ascending = true
        if (arr1[i] < arr1[i + 1]) desending = true
    }

    when {
        !ascending -> print("SOrted in Asscending")
        !desending -> print("SOrted in Desending")
        else -> print("Array not sorted")
    }
}

fun removeDuplicate() {
    val numbers = arrayListOf(10, 20, 10, 30, 20, 40, 20, 50, 30)

    for (i in 0 until numbers.size - 1) {
        for (j in numbers.size - 1 downTo i + 1) {
            if (numbers[i] == numbers[j]) {
                numbers.removeAt(j)
            }
        }
    }


    print(numbers)

}

fun countTheString() {
    val input = "aabbccddaaaaefccczzz"
    var mapIs = mutableMapOf<Char, Int>()

    for (i in 0..input.length - 1) {
        val ch = input[i]
        var count = mapIs[ch] ?: 0
        mapIs[ch] = count + 1
    }

    print(mapIs)
}

fun twoSums() {
    val nums = intArrayOf(3, 2, 4)
    val target = 5

    var mapIs = mutableMapOf<Int, Int>()

    for (i in 0..nums.size - 1) {
        var diff = target - nums[i]
        if (mapIs.containsKey(diff)) {
            println("$i :: ${mapIs[diff]}")
            return
        }

        mapIs[nums[i]] = i
    }


}

fun sortList() {
    val items = mutableListOf(10, "wach", 20, "sorry", 10, 30, "apple", "cat", "ball", "apple")

    items.sortWith { a, b ->
        when {
            a is String && b is String -> a.compareTo(b)
            a is Int && b is Int -> a.compareTo(b)
            a is String && b is Int -> -1
            a is Int && b is String -> 1
            else -> 0
        }
    }

    for (i in items.size - 1 downTo 1) {
        if (items[i] == items[i - 1]) {
            items.removeAt(i)
        }
    }

    println(items)

}

fun findTheLargestAndSecondLargest() {
    val numbers = arrayListOf(10, 25, 87, 7, 98, 99, 56, 42, 13)

    var largest = numbers[0]
    var secondLargest = numbers[0]

    for (element in numbers) {
        if (element > largest) {
            secondLargest = largest
            largest = element
        } else if (element > secondLargest && element != largest) {
            secondLargest = element
        }
    }

    println("largest $largest : Second $secondLargest")
}

fun maxMinMaxMin() {
    val numbers = arrayListOf(10, 20, 10, 30, 20, 40, 20, 8, 9, 11, 50, 30)
    var result = arrayListOf<Int>()
    numbers.sortDescending()

    var left = 0
    var right = numbers.size - 1

    while (left <= right) {
        result.add(numbers[left])
        if (left != right) {
            result.add(numbers[right])
        }

        left++
        right--
    }

    println(result)

}

fun moveAllNonZero() {
    var listOf = arrayListOf<Int>(4, 0, 5, 0, 0, 10)

    var zeroCount = listOf.count() { it == 0 }

    listOf.removeAll { it == 0 }

    listOf.addAll(listOf.size, List(zeroCount) { 0 })

    println(listOf)
}

fun reverseAnArray() {
    val arr1 = mutableListOf(5, 3, 2, 1)

    var size = arr1.size

    for (i in 0 until size / 2) {
        var temp = arr1[i]
        arr1[i] = arr1[size - 1 - i]
        arr1[size - 1 - i] = temp
    }

    println(arr1)
}


