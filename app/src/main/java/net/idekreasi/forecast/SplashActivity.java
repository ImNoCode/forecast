package net.idekreasi.forecast;

/**
 * Created by imno on 16/06/16.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

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
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);

                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
        finish();
    }

}
