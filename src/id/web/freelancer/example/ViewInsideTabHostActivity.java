package id.web.freelancer.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class ViewInsideTabHostActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
		tabHost.setup();

		TabHost.TabSpec spec1 = tabHost.newTabSpec("Populars");
		spec1.setContent(R.id.tabContent1);
		spec1.setIndicator("Populars");
		tabHost.addTab(spec1);

		TabHost.TabSpec spec2 = tabHost.newTabSpec("Trendings");
		spec2.setContent(R.id.tabContent2);
		spec2.setIndicator("Trendings");
		tabHost.addTab(spec2);

		TabHost.TabSpec spec3 = tabHost.newTabSpec("Search");
		spec3.setContent(R.id.tabContent3);
		spec3.setIndicator("Search");
		tabHost.addTab(spec3);
    }
}