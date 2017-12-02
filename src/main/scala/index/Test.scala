package index

import implementation.{ImplementationHive, ImplementationMysql}


object Test
{
  def main(args:Array[String]): Unit =
  {
   /*val spark = SparkSession
      .builder()
       .master("local[*]")
      .appName("Spark Hive Example")
      .getOrCreate()
      */
    /* first start hive thirf connection before to test hive connection
      ./sbin/start-thriftserver.sh
      https://spark.apache.org/docs/2.1.0/sql-programming-guide.html#jdbc-to-other-databases
     */
    ImplementationHive.testHiveConnection()
    ImplementationMysql.testMysqlConnection()
  }
}