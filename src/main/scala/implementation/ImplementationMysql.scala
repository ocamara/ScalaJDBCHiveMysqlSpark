package implementation

import connection.MysqlJDBCConnection

import scala.collection.mutable

/**
  * Created by ousminho on 02/12/17.
  */
object ImplementationMysql {

  def testMysqlConnection()=
  {
    val driverName = "com.mysql.jdbc.Driver"
    Class.forName(driverName)
    val implementationMysql=new MysqlJDBCConnection("jdbc:mysql://localhost/metastore","root","root")
    implementationMysql.init()
    var query="select * from ROLES"
    var columns=Array("ROLE_ID","CREATE_TIME","OWNER_NAME","ROLE_NAME")
    var lines:mutable.MutableList[String] = implementationMysql.executeSelectQuery(query,columns)
    lines.foreach(println)
  }

}
