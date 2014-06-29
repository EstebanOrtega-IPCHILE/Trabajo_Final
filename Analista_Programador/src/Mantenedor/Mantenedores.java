package Mantenedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import android.content.Context;
import android.widget.Toast;

import Datos.Conexion;


import com.mysql.jdbc.CallableStatement;

import example.analista_programador.MainActivity;
import Datos.Conexion;
import Entidades.Usuario;



public class Mantenedores  {
	
	
	public boolean  ValidarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		Connection conn = null;
	    PreparedStatement pst = null;
		
		MainActivity main = new MainActivity();
    	
    	 String sql ="select * from usuario where usuario='" +usuario.getUsuario() +"' and pass='" +usuario.getPass() +"'";
         
    	 try {
 			conn = Conexion.conectorBd();
 			Statement stmt = conn.createStatement();
 			ResultSet res = stmt.executeQuery(sql);
 			if(res.next()){		
 				return true;	
 				
 			}else{
 				return false;
 				
 			}
 			
 		} catch (Exception e) {
 			// TODO: handle exception
 			System.out.println(e);
 			return false;
 		}
 		

 	}
         
        
 		
 

                                     
     
	
	

	private Context getApplicationContext() {
		// TODO Auto-generated method stub
		return null;
	}

	
		
	}

