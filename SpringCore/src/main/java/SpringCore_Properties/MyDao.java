package SpringCore_Properties;

public class MyDao {
private String dbServer;
private String dbPort;
private String dbUser;
private String dbPass;
MyDao(String dbServer, String dbPort, String dbUser, String dbPass){
}

public String toString() {
	return "MyDao[dbServer=" +dbServer +" dbPort=" +dbPort +"]";  //dbPrt=" +dbPort+ "dbUser="+dbUser+"dbPass="+dbpass+"]";
	
}
}