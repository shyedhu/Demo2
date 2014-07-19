package com.client.demoapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

   private EditText  username=null;
   private EditText  password=null;
  
   private Button login;
   
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      username = (EditText)findViewById(R.id.editText1);
      password = (EditText)findViewById(R.id.editText2);
      login = (Button)findViewById(R.id.button1);
   }

   public void login(View view){
      if(username.getText().toString().equals("admin") && 
      password.getText().toString().equals("admin")){
       setContentView(R.layout.activity_fullscreen);  
   }	
   else{
	   setContentView(R.layout.fragment_error); 
	  

   }

}
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }

}