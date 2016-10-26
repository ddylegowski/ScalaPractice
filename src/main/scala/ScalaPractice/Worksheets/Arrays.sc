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

  def majorityItem(array: Array[Int]) = {
    var majorityItem = array(0)
    var majorityCount = 1

    var potentialMajorityItem = array(0)
    var potentialMajorityCount = 1
    for (index <- 1 to array.length-1 ) {
      if (array(index) == potentialMajorityItem) potentialMajorityCount+=1
      else {
        potentialMajorityItem = array(index)
        potentialMajorityCount = 1
      }

      if (potentialMajorityCount > majorityCount) {
        majorityItem = potentialMajorityItem
        majorityCount = potentialMajorityCount
      }
    }

    majorityItem
  }
  majorityItem(Array(1,1,1,1,1,2))
  majorityItem(Array(1, 2, 1, 2, 1))
  majorityItem(Array(1, 2, 1, 2, 2))

  def shuffle(array: Array[Int]) = {
    val indices = array.length - 1
    for (i <- 0 to indices) {
      val shuffleIndex = ((Math.random()*(array.length - i)) + i).toInt
      val temp = array(i)
      array(i) = array(shuffleIndex)
      array(shuffleIndex) = temp
    }
    array
  }
  shuffle(1 to 10 toArray)
  shuffle(1 to 10 toArray)
  shuffle(1 to 10 toArray)
  shuffle(1 to 10 toArray)

}