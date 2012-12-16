package ru.gang018.expandabletextview;

import ru.gang018.expandabletextview.ui.ExpandableTextView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		final ExpandableTextView tv = (ExpandableTextView) findViewById(R.id.expandable_text_test);
		tv.setText("When the above touch mode is set as TOUCHMODE_FULLSCREEN, the sliding menu is openable with a swipe gesture to the right, starting anywhere on the screen. This does not interfere with other UI elements like buttons, spinners, etc. When the behind touch mode is set as TOUCHMODE_FULLSCREEN, the sliding menu is closeable with a swipe to the left. However, the sliding menu will also close with a tap anywhere, and any UI elements placed in the behind view are non-interactive. I believe this is not the intended behavior.");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
