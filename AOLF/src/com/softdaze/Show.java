package com.softdaze;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Show extends Activity {
	
	TextView tv1,tv2,tv3,tv4;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show);
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		tv3=(TextView)findViewById(R.id.textView3);
		tv4=(TextView)findViewById(R.id.textView4);
		Intent intent = getIntent();
		String name = intent.getStringExtra("name");
		String mob = intent.getStringExtra("mob");
		String email = intent.getStringExtra("email");
		String city = intent.getStringExtra("city");
		String area = intent.getStringExtra("area");
		//tv2.setText("welcome"+area);
		tv1.setText("welcome"+name);
		if(area.equals("rural health"))
		{
			tv2.setText("suited volunteer for:-"+"1.basic needs of the rural poor");
			tv3.setText("2.Fruit and vegetable consumption and prevention of cancer");
			tv4.setText("3.Community empowerment in rural health care ");
			
		}
		if(area.equals("sustainable farming"))
		{
			tv2.setText("suited volunteer for:-"+"1.The effects of ethnicity, families and culture on entrepreneurial experience");
			tv3.setText("2.The Sustainable Farm Families Project");
			tv4.setText("3.Family factors affecting adoption of sustainable farming systems");
			
		}
		if(area.equals("child education"))
		{
			tv2.setText("suited volunteer for:-"+"1.Access to Quality Education in Rural");
			tv3.setText("2.Children’s Learning Centers");
			
			
		}
		else if(area.equals("rejuvenating dried up rivers"))
		{
			tv2.setText("suited volunteer for:-"+"1.The reversible process concept applied to the environmental management of large river systems");
			tv3.setText("2.Need for ecosystem management of large rivers and their floodplains");
			tv4.setText("3.Subsurface dams to harvest rainwater");
			
		}
	}
	

}
