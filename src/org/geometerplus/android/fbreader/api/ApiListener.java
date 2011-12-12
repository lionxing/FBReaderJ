/*
 * This code is in the public domain.
 */

package org.geometerplus.android.fbreader.api;

public interface ApiListener {
	int EVENT_READ_MODE_OPENED = 1;
	int EVENT_READ_MODE_CLOSED = 2;

	void onEvent(int event);
}
