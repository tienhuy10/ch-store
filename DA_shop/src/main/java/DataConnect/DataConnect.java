package DataConnect;


import java.sql.Connection;
import java.sql.DriverManager;


public class DataConnect {

    public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber + "\\" + instance +";databaseName="+dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }   
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "DESKTOP-NQBR7PJ\\SQLEXPRESS01";
    private final String dbName = "dataDA";
    private final String portNumber = "1433";
    private final String instance="";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final String userID = "sa";
    private final String password = "123456";
    
    public static void main(String[] args) {
    	try {
    		System.out.println(new DataConnect().getConnection());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

}
