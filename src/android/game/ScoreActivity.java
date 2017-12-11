package android.game;

import android.os.Bundle;
import android.app.Activity;
import android.game.score.ScoreView;
import android.view.Menu;

public class ScoreActivity extends Activity {

	ScoreView gV;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_score);
		gV = new ScoreView(this);
        setContentView(gV);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.score, menu);
		return true;
	}
	
	
}
