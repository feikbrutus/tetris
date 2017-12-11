package android.game.score;

import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;

public class ScoreHud {

	public ScoreHud() {
		// TODO Auto-generated constructor stub
	}
	
	public static void paintRightHud(Canvas canvas, Paint paint, int right, int top, ScoreManager s) {
		//top scores
		displayTopScores(canvas, paint, s.getTopScores(), right, top, Align.RIGHT);
	}
	
	public static void displayTopScores(Canvas canvas, Paint p, Cursor c, int x, int y, Align a ){
		x = 180;
		y = 30;
		String name;
		int score;
		int colScore = c.getColumnIndex(ScoreManager.DATABASE_TABLE_SCORES_SCORE);
		int colName  = c.getColumnIndex(ScoreManager.DATABASE_TABLE_SCORES_NAME);
		
		c.moveToLast(); 
		p.setTextAlign(a);
		//paint title
		p.setColor(Color.WHITE);
		canvas.drawText("Лучшие игроки. Результаты:", 225, y, p);
		y+=20;
		
		for (int i  = 0; i < c.getCount() && i < ScoreManager.TOP_SCORE_NB; i++,c.moveToPrevious(),y+=14) {

			score = c.getInt(colScore);
			name = c.getString(colName);
			p.setColor(Color.GREEN);
			canvas.drawText((i+1)+". "+name+": "+score, x, y, p);
		}
		c.close();
	}

}
