package example

opaque type B = Int

object B {
  def apply(value: Int): B = value

  extension (self: B) {
    def value: Int = self
    def add(n: Int): B = self + n
  }
}
