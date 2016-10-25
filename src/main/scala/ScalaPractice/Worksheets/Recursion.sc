object Recursion {

  def fibonacci(n: Int): Int = {
    if (n < 2) return n
    fibonacci(n-1) + fibonacci(n-2)
  }
  fibonacci(0)
  fibonacci(1)
  fibonacci(2)
  fibonacci(3)
  fibonacci(5)
  fibonacci(7)
  fibonacci(9)

}