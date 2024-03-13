package busResv;

import java.sql.*;

public class BusDAO {

	public void displayBusInfo() throws SQLException {
		Connection con = DbConnection.getConnection();
		Statement st  = con.createStatement();
		ResultSet rs = st.executeQuery("select * from bus");
		while(rs.next()) {
			System.out.println("Bus No : "+rs.getInt(1));
			
			if (rs.getInt(2)==1) {
				System.out.println("AC : Yes");
			}else {
				System.out.println("AC : No");
			}
			System.out.println("Total Capacity : "+rs.getInt(3));
		}
		
		System.out.println("-----------------");
	}

	public int getCapacity(int busNo) throws SQLException{
		String query = "select capacity from bus where id="+busNo;
		Connection con = DbConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}

}
