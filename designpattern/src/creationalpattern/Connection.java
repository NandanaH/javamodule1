package creationalpattern;

public class Connection {
	
	static Connection con = new Connection();
	private Connection() {
		
		
	}
	public static Connection getConnection() {
//		return new Connection();
		if(con!=null)
			return con;
		else
			con=new Connection();
		    return con;
	}

}
