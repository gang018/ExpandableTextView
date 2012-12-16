package ru.gang018.expandabletextview;

import android.util.Log;

public class Logger
{
	private final static boolean DEBUG = true;
	
	private final static String LOG = "expandable_text_view";
	
	/**Simple Log.i()
	 * 
	 * @param text - {@link String}
	 */
	public static void i(final String text)
	{
		if (DEBUG)
			Log.i(LOG, text);
	}
}