package example.analista_programador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import Datos.Conexion;
import Entidades.Usuario;

import Mantenedor.Mantenedores;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	
	private EditText etUsuario, etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etUsuario = (EditText)findViewById(R.id.etUsuario);
        etPass = (EditText)findViewById(R.id.etPass);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void Conectar(View view){
    	
    	Mantenedores man = new Mantenedores();
    	Usuario usuario = new Usuario();
    	   	
    	usuario.setUsuario(etUsuario.getText().toString());
    	usuario.setPass(etPass.getText().toString());
    	man.ValidarUsuario(usuario);
    	
    	if(man.ValidarUsuario(usuario)== true){
			Toast toast = Toast.makeText(this, "datos  ok", Toast.LENGTH_SHORT);
	        toast.show();
		}else{
			Toast toast = Toast.makeText(this, "datos erroneos", Toast.LENGTH_SHORT);
	        toast.show();
		}
		
	
    	
    	
    	
    }
    
    public void Ok(boolean valor){
		if(valor == true){
		Toast toast = Toast.makeText(this, "Conexion correcta", Toast.LENGTH_SHORT);
        toast.show();
        //Intent i = new Intent(this, inicio.class );
       // startActivity(i);
		}else{
			Toast toast = Toast.makeText(this, "Verificar datos", Toast.LENGTH_SHORT);
	        toast.show();
		}
	}
    
    
    
    }
    

