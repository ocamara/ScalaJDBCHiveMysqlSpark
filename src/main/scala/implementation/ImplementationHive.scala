package implementation

import connection.HiveJDBCConnection

import scala.collection.mutable

/**
  * Created by ousminho on 02/12/17.
  */
object ImplementationHive {

  def testHiveConnection()=
  {
    val implementationHive=new HiveJDBCConnection("jdbc:hive2://localhost:10000/default","hduser","")
    implementationHive.init()

    var query="create table if not exists semaine(id int,name string)"
    var valid = implementationHive.executeNotSelectQuery(query)
    println(query+" "+valid)

    query="insert into semaine values ('3','dimanche')"
    valid = implementationHive.executeNotSelectQuery(query)
    println(query+"  "+valid)

    query="select * from semaine"
    var columns=Array("id","name")
    try {
      var lines: mutable.MutableList[String] = implementationHive.executeSelectQuery(query, columns)
      lines.foreach(println)
    }
    catch
    {
      case e:Exception => println("Exception "+e.getMessage)
    }
  }

}
