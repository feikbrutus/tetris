package android.game.score;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class ScoreView extends View {
	private ScoreManager scoreManager;
	private Paint mPaint;
	
	public ScoreView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		mPaint = new Paint();
		scoreManager = new ScoreManager(context);
	}
	
	protected void onDraw(Canvas canvas) {
		
		//so ugly to update in draw but i'm to lazy to implement a real game loop
		//update(); //TODO Separate update from draw, and call both inside a clean game loop
		
		super.onDraw(canvas);
		
		//paint elements
		//grid.paint(canvas, mPaint);
		
		//paint HUD
		ScoreHud.paintRightHud(canvas, mPaint, getRight(), getTop(), scoreManager);
		
		//make sure draw will be recalled.
		invalidate();
	}

	

}
