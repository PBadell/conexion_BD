package conexion_BD;
import java.sql.*;

public class conexion_estudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		Connection miConection =DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgress","postgress","elimora");
			  
		Statement miStatement =miConection.createStatement ();
			    	
		ResultSet miResulest=miStatement.executeQuery("SELECT * FROM estudiantes");
			    	
			    	
	while    ( miResulest.next() ) {
			        	
			  System.out.println("Nombre: "+miResulest.getString("Nombre") + ", Apellido "+miResulest.getString("Apellido")+ ", Carreras: "+miResulest.getString("Carreras"));
			        }
	
			 }
			   catch (Exception e) {
			    System.out.println("no conecta");
			     e.printStackTrace();
			     }
		}

}
