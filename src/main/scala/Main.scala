package example

import org.openjdk.jmh.annotations.Benchmark

object Main {
  val size = 100_000

  val valuesA: Seq[A] = (1 to size).map(A(_))

  val valuesB: Seq[B] = (1 to size).map(B(_))
}

class Main {
  @Benchmark
  def value_class: Seq[A] = {
    Main.valuesA.map(_.add(1))
  }

  @Benchmark
  def opaque_type: Seq[B] = {
    Main.valuesB.map(_.add(1))
  }
}
