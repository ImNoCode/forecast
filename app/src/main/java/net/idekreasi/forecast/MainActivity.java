package net.idekreasi.forecast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

    /* kode untuk menampilkan splash screen selama 2 detik */
    private final int SPLASH_DISPLAY_LENGHT = 2000;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
		/* layout splashscreen dengan background gambar */
        setContentView(R.layout.activity_splash);
	/* handler untuk menjalankan splashscreen selama 2 detik lalu
	 * membuat HomeActivity
	 */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = null;

                mainIntent = new Intent(MainActivity.this, SplashActivity.class);

                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
    }

}
