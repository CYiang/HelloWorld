package tw.edu.pu.o1073004.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txv = (TextView) findViewById(R.id.txv);
        //txv.setText("Hello CYiang");
        //TestMaster();
        //TestDev();
        txv.setText("嗨，我是智楊");
    }

    public void TestMaster() {
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Master分支");
    }
    public void TestDev(){
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Dev分支");
    }
}
