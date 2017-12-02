package connection

/**
  * Created by ousminho on 02/12/17.
  */
class MysqlJDBCConnection(connectionString:String, user:String, password:String) extends JDBCConnection(connectionString,user,password)
{
  override def getDriver(): String = { return "com.mysql.jdbc.Driver" }

}

