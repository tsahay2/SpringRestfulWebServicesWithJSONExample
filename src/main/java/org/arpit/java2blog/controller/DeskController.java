package org.arpit.java2blog.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.arpit.java2blog.bean.Country;
import org.arpit.java2blog.bean.Desk;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeskController {

	public DeskController() throws SQLException {
	}

	@RequestMapping(value = "/desks", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Desk> getDesk() throws SQLException, ClassNotFoundException {

        List<Desk> listofDesk = new ArrayList<Desk>();
        listofDesk=createListDesk();
		return listofDesk;
	}

	@RequestMapping(value = "/test",method = RequestMethod.GET)
    public String printHello(@RequestParam(value = "name",defaultValue = "Tushki") String name){

        return "Hello "+name;
    }

// Utiliy method to create country list.
	public List<Desk> createListDesk() throws ClassNotFoundException, SQLException {


             Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/excel", "root", "");
	        java.sql.Statement stmt = con.createStatement();

	        String sql = "SELECT * from Desk;";
	        ResultSet rt = stmt.executeQuery(sql);
            List<Desk> listOfDesk = new ArrayList<Desk>();

        while(rt.next()){

            Desk desk = new Desk();
            desk.setDesk_id(rt.getInt(1));
            desk.setX(rt.getInt(2));
            desk.setY(rt.getInt(3));
            desk.setWidth(rt.getInt(4));
            desk.setHeight(rt.getInt(5));
            desk.setBrid(rt.getInt(6));
            listOfDesk.add(desk);

        }



		return listOfDesk;
	}
}
