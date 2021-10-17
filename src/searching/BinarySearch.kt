package searching

/**
 * Binary search is an algorithm which finds the position of a target value within an array (Sorted)
 *
 * * Worst-case performance	O(log(n))
 * * Best-case performance	O(1)
 * * Average performance	O(log(n))
 *
 * @param list is an array where the element should be found
 * @param item is the element which should be found
 * @return index of element if found or -1 if not found
 */

fun <T : Comparable<T>> binarySearch(list:List<T>,item:T): Int {

    var start = 0

    var end = list.size-1

    var mid:Int

    if (item == list[start]){
        return start
    }

    if (item == list[end]){
        return end
    }

    while(start <= end){

        mid = (start+end)/2

        when{
            item > list[mid] -> start = mid+1
            item < list[mid] -> end = mid-1
            else -> return mid
        }
    }

    return -1
}

fun main(){
    val list = listOf(1,5,6,9,10,20)

    val value = binarySearch(list,30)

    if (value != -1){
        print("Item is found")
    }else{
        print("Item is not found")
    }
}