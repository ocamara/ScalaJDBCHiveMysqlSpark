package connection

import java.sql.{Connection, DriverManager, ResultSet}

import scala.collection.mutable.MutableList

/**
  * Created by ousminho on 02/12/17.
  */
abstract class JDBCConnection(val connectionString:String,val user:String, val password:String)
{
  private var connection:Connection=_

  def getDriver():String

  def init() =
  {
    val driverName = getDriver()
    Class.forName(driverName)
    connection = DriverManager.getConnection(this.connectionString,this.user,this.password)
  }

  def getConnection():Connection =
  {
    println("connection :",connection)
    return connection
  }

  def executeSelectQuery(query:String,columns:Array[String]):MutableList[String]=
  {
    this.init()
    val fetchedRes:MutableList[String] = MutableList[String]()
    val res: ResultSet = getConnection().createStatement.executeQuery(query)
    var line:String=""
    while(res.next())
    {
      line=""
      for(column<-columns)
      {
        line+=res.getString(column)+";"
      }
      fetchedRes += line.substring(0,line.length-1)
    }

    return fetchedRes
  }

  def executeNotSelectQuery(query:String): Boolean =
  {
    this.init()
    val res: Boolean = getConnection().createStatement.execute(query)
    return res
  }

}
