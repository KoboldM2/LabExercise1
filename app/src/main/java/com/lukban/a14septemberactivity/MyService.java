import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }

    protected void onHandleIntent(Intent intent) {
        for (int i = 0; i < 10; i++) {
            Log.d("Greet","Good afternoon");
        }
    }
}