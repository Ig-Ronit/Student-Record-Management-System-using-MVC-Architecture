package MVC;
import java.sql.*;
import java.util.*;
	
public class studModel {
	public void saveRec(Students s1)
	{
		try {
			MyConnection mycon = new MyConnection ();
			PreparedStatement stat = mycon.con.prepareStatement("INSERT INTO Students VALUES (?,?,?)");
			stat.setInt(1, s1.getRollno());
			stat.setString(2, s1.getName());
			stat.setInt(3, s1.getMarks());
			stat.executeUpdate();
			System.out.println("Record Inserted");
			mycon.con.close();	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void updateRec(Students s1) 
	{
		try {
			MyConnection mycon = new MyConnection ();
			PreparedStatement stat = mycon.con.prepareStatement("Update Students Set Name=?, Marks=? Where ID = ?");
			stat.setInt(3, s1.getRollno());
			stat.setString(1, s1.getName());
			stat.setInt(2, s1.getMarks());
			stat.executeUpdate();
			System.out.println("Record Updated");
			mycon.con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void delRec(Students s1) 
	{
		try {
			MyConnection mycon = new MyConnection ();
			PreparedStatement stat = mycon.con.prepareStatement("DELETE FROM Students Where ID = ?");
			stat.setInt(1, s1.getRollno());
			stat.executeUpdate();
			System.out.println("Record Deleted");
			mycon.con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public Students searchRec(Students s1)
	{
		try {
			MyConnection mycon = new MyConnection ();
			PreparedStatement stat = mycon.con.prepareStatement("SELECT * FROM Students WHERE ID = ?");
			stat.setInt(1, s1.getRollno());
			ResultSet rSet = stat.executeQuery();
			if(rSet.next())
			{
				s1.setName(rSet.getString(2));
				s1.setMarks(rSet.getInt(3));
			}
			mycon.con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return s1;
	}

}
