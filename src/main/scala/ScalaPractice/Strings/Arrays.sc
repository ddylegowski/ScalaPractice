import scala.collection.mutable

object Arrays {

  def twoSum(array: Array[Int], target: Int): Tuple2[Int, Int] = {
    var complementMap = mutable.HashMap[Int, Int]()
    for (index <- 0 to array.length -1) {
      val complement = target - array(index)
      if (complementMap.contains(complement)) {
        return (complementMap(complement), index)
      }
      complementMap.+=(array(index) -> index)
    }
    (-1,-1)
  }
  twoSum(Array(2, 7, 11, 15), 9)
  twoSum(Array(0,1,9), 2)
  twoSum(Array(0,0,0,0,0,1), 1)
  twoSum(Array(0,0,0,0,0,1), 0)
}