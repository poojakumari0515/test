import org.apache.spark.sql.SparkSession

object myrun extends App{

  println("hello")
  val spark: SparkSession = SparkSession.builder()
    .master("local[1]")
    .appName("SparkByExamples1.com")
    .getOrCreate()
 val myList  = List("1","2")
  val myList2 = List.empty
  for (a <- myList){
    println(a)
  }

  for (a <- myList2){
    println(a)
  }
}

