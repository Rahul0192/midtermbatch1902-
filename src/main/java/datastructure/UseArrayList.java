package datastructure;

import db.DbConnection;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Class.forName;
import static java.util.List.*;

/**
 * @author Jahidul Islam
 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 * Store all the sorted data into one of the databases.
 *
 */


public class UseArrayList {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		List<String> name = new ArrayList<>();
		name.add("Rahul");
		name.add("joy");
		name.add("Nayem");
		name.add("zahid");
		System.out.println("Student name list= " + " " + name);
		System.out.println(name.get(3));
		System.out.println(name.remove(1));
		System.out.println(name);



		}

		}







