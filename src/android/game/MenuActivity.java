package android.game;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		startService(new Intent(this, MyService.class));	
	}
	
	public void onBackPressed() {
	     stopService(new Intent(this, MyService.class));
	     finish();
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
	
	public void startClick(View v)
    {
    	Intent intent = new Intent(MenuActivity.this, MainAct.class);
    	startActivity(intent);    
    }
	
	public void rulesClick(View v)
    {
    	Intent intent = new Intent(MenuActivity.this, RulesActivity.class);
    	startActivity(intent);    
    }
	
	public void scoreClick(View v)
    {
    	Intent intent = new Intent(MenuActivity.this, ScoreActivity.class);
    	startActivity(intent);    
    }
	
	
}
