package insideglobe.gittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView testGit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testGit=(TextView) findViewById(R.id.testGit);

        if (testGit != null) {
            testGit.setText(R.string.abc);
        }
    }
}
