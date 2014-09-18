package edu.ucuccs.urdinespot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void Location(View v) {
		Intent loc = new Intent(this, AddLocation.class);
		startActivity(loc);
	}

	public void Explore(View v) {
		Intent loc = new Intent(this, ExploreDish.class);
		startActivity(loc);
	}

	public void Spot(View v) {
		Intent loc = new Intent(this, SpotaDish.class);
		startActivity(loc);
	}

	public void View(View v) {
		Intent loc = new Intent(this, ViewProfile.class);
		startActivity(loc);
	}

	public void Sign(View v) {
		Intent loc = new Intent(this, SignIn.class);
		startActivity(loc);
	}

}
