package example

final class A(val value: Int) extends AnyVal {
  def add(n: Int): A = A(value + n)
}
