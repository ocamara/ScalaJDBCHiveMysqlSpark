package connection
/**
  * Created by ousminho on 02/12/17.
  */
class HiveJDBCConnection(connectionString:String,user:String,password:String) extends JDBCConnection(connectionString,user,password)
{
  override def getDriver(): String = { return "org.apache.hive.jdbc.HiveDriver" }
}

