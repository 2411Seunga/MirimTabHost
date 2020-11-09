package kr.hs.emirim.s2019w34.mirimtabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecMal = tabHost.newTabSpec("Mal").setIndicator("말티푸");
        tabSpecMal.setContent(R.id.linear_maltifu);
        tabHost.addTab(tabSpecMal);

        TabHost.TabSpec tabSpecPome = tabHost.newTabSpec("Pome").setIndicator("포메라니안");
        tabSpecPome.setContent(R.id.linear_pome);
        tabHost.addTab(tabSpecPome);

        TabHost.TabSpec tabSpecHowl = tabHost.newTabSpec("Howl").setIndicator("하울");
        tabSpecHowl.setContent(R.id.linear_howl);
        tabHost.addTab(tabSpecHowl);

        tabHost.setCameraDistance(0);
    }
}