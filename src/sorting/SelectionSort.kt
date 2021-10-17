package sorting

/**
 * Selection sort is an algorithm which sorts an array
 *
 * * Worst-case performance	O(n2)
 * * Best-case performance	O(n2)
 * * Average performance	O(n2)
 *
 * @param list which will be sorted
 * @return sorted list
 */

fun <T : Comparable<T>> selectionSort(list: List<T>): List<T> {

    val cpyList = list.toMutableList()

    for (i in cpyList.indices){
        for (j in i+1 until cpyList.size){
            if(cpyList[i] > cpyList[j]){
                val temp = cpyList[i]
                cpyList[i] = cpyList[j]
                cpyList[j] = temp
            }
        }
    }

    return cpyList
}

fun <T : Comparable<T>> findSmallest(list: List<T>): Int {

    var smallestIndex = 0

    list.forEachIndexed { index, value ->
        if (list[smallestIndex] > value) {
            smallestIndex = index
        }
    }

    return smallestIndex
}


fun main() {

    val list = listOf(5, 6, 8, 0, 9, 1, 2)

    println(selectionSort(list))

}