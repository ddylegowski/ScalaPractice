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
}