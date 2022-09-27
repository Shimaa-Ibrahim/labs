
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class DBmanager {

    public Vector<Employee> emp = new Vector<Employee>();
    Connection con;
    ResultSet rs;
    String queryString;
    java.sql.Statement stmt;

    public DBmanager() {

        try {
            Employee e;

            con = DriverManager.getConnection("jdbc:ucanaccess://D:/ITI/ARCHIEVE/DATABASE/db.accdb");
            stmt = con.createStatement();
            queryString = new String("SELECT * FROM Employee");
            rs = stmt.executeQuery(queryString);

            while (rs.next()) {
                e = new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                emp.add(e);
            }

            //stmt.close();
            //con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBmanager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteEmp(String s) {

        try {
            PreparedStatement pst = con.prepareStatement(" DELETE FROM Employee WHERE Fname = ?");
            pst.setString(1, s);
            pst.executeUpdate();
        } catch (SQLException ex) {

            Logger.getLogger(DBmanager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateteEmp(String fn, String ls, String ad, String sa, String id) {
        try {
            PreparedStatement pst = con.prepareStatement(" Update Employee Set Fname = ?, Lname= ?,"
                    + " Address = ? , Salary = ? WHERE ID = ? ");
            pst.setString(1, fn);
            pst.setString(2, ls);
            pst.setString(3, ad);
            pst.setString(4, sa);
            pst.setString(5, id);

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBmanager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addEmp(String fn, String ls, String ad, String sa) {

        try {
            PreparedStatement pst = con.prepareStatement(" INSERT INTO Employee (Fname ,Lname ,Address ,Salary)"
                    + "VALUES (? , ? , ? , ?)");
            pst.setString(1, fn);
            pst.setString(2, ls);
            pst.setString(3, ad);
            pst.setString(4, sa);
            pst.executeUpdate();
            emp.clear();
            queryString = new String("SELECT * FROM Employee");
            rs = stmt.executeQuery(queryString);
            Employee e;

            while (rs.next()) {
                e = new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                emp.add(e);
            }
        } catch (SQLException ex) {

            Logger.getLogger(DBmanager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public class Employee {

        String Id;
        String Fname;
        String lname;
        String add;
        String salary;

        public Employee(String id, String fn, String ls, String ad, String sa) {
            Id = id;
            Fname = fn;
            lname = ls;
            add = ad;
            salary = sa;
        }
    }

}
