import scala.collection.mutable

object Strings {

  def firstNonrepeatedChar(string: String) = {
    var charMap = new mutable.LinkedHashMap[Char, Int]()

    for (ch <- string) {
      if (!charMap.contains(ch)) charMap.+=(ch -> 1)
      else charMap.+=(ch -> (charMap(ch) + 1))
    }

    val result = charMap.retain((ch, count) => count == 1)
    if (!result.isEmpty) result.head._1 else null
  }
  firstNonrepeatedChar("total")
  firstNonrepeatedChar("aaa")
  firstNonrepeatedChar("aab")
  firstNonrepeatedChar("")

  def reverseString(string: String) = {
    if (string.length < 2) string
    else {
      var builder = new StringBuilder(string)
      var j = builder.length -1
      val halfLength = builder.length / 2
      for (i <- 0 to halfLength-1) {
        val c = builder.charAt(i)
        builder.setCharAt(i, builder.charAt(j))
        builder.setCharAt(j, c)
        j-=1
      }
      builder.toString
    }
  }
  reverseString("a")
  reverseString("ab")
  reverseString("abba")
  reverseString("this is a string")
}