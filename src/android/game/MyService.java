package android.game;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
public class MyService extends Service {
//        private static final String TAG = "MyService";
        MediaPlayer player;
        
        @Override
        public IBinder onBind(Intent intent) {
                return null;
        }
        
        @Override
        public void onCreate() {
                //Toast.makeText(this, "Music on", Toast.LENGTH_LONG).show();
                player = MediaPlayer.create(this, R.raw.bg);
                player.setLooping(true); // зацикливаем
        }

        @Override
        public void onDestroy() {
                //Toast.makeText(this, "Music off", Toast.LENGTH_LONG).show();
                player.stop();
        }
        
        @Override
        public void onStart(Intent intent, int startid) {
                //Toast.makeText(this, "My Service Started", Toast.LENGTH_LONG).show();
                player.start();
        }
}