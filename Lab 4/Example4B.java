package lab.pkg4;

import java.sql.*;
import javax.sql.rowset.*;
public class Example4B {
    public static void main (String[] args)throws Exception{
      Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
        rs.setUrl("jdbc:mysql://localhost:3307/account");
        rs.setUsername("root");
        rs.setPassword("");
        rs.setCommand("SELECT * FROM student");
        rs.execute();
        rs.absolute(1);
        System.out.println("id\tname\temail\tsem");
        System.out.println(rs.getInt(1)+ "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));

    }
    
}
