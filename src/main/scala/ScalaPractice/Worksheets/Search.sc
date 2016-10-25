object Search {

  def binarySearchImplementation(array: Array[Int], value: Int, lowerIndex: Int, upperIndex: Int) :Int = {
    if (upperIndex < lowerIndex) return -1

    val mid = lowerIndex + (upperIndex - lowerIndex) / 2;
    if (array(mid) == value) mid
    else if (array(mid) > value) binarySearchImplementation(array, value, lowerIndex, mid-1)
    else binarySearchImplementation(array, value, mid+1, upperIndex)
  }
  def binarySearch(array: Array[Int], value:Int): Int = binarySearchImplementation(array, value, 0, (array.length-1))
  binarySearch(Array(0, 0, 2, 3, 4), 2)
  binarySearch((0 to 10).toArray, 0)
  binarySearch((0 to 10).toArray, 10)
  binarySearch((0 to 10).toArray, 999)
  binarySearch((0 to 10).toArray, -1)

}