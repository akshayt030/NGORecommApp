package com.softdaze;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	EditText name,mob,email,city,skill;
	Button submit;
	Spinner dropdown;
	String[] items;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		name=(EditText)findViewById(R.id.editText1);
		mob=(EditText)findViewById(R.id.editText2);
		email=(EditText)findViewById(R.id.editText3);
		city=(EditText)findViewById(R.id.editText4);
		skill=(EditText)findViewById(R.id.editText5);
		submit=(Button)findViewById(R.id.button1);
		submit.setOnClickListener(this);
		dropdown = (Spinner)findViewById(R.id.spinner1);
		items = new String[]{"rural health","child education", "sustainable farming","rejuvenating dried up rivers"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
		dropdown.setAdapter(adapter);
		
		
	}
	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.button1)
		{
			int position = dropdown.getSelectedItemPosition();
			Intent i=new Intent(MainActivity.this,Show.class);
			i.putExtra("name", name.getText().toString());
			i.putExtra("mob", mob.getText().toString());
			i.putExtra("email",email.getText().toString());
			i.putExtra("city", city.getText().toString());
			i.putExtra("area", items[+position]);
			startActivity(i);
		}
		
	}
	
}
