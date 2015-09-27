package com.softdaze;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Logo extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logo);
		Thread logoTimer = new Thread() {
            public void run(){
                try{
                    int logoTimer = 0;
                    while(logoTimer < 5000){
                        sleep(40);
                        logoTimer = logoTimer +60;
                    };
                   // startActivity(new Intent(this,MainActivity.class));
                    Intent i=new Intent(Logo.this,MainActivity.class);
        			startActivity(i);
                } 
                 
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                 
                finally{
                    finish();
                }
	}

		};
		logoTimer.start();
	}

}
