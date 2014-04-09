package ws.abhis.cometparksms;

import com.twilio.sdk.TwilioRestException;

import junit.framework.TestCase;

public class ReadAllTextsTest extends TestCase {
	public void testReadAll() {
		ReadAllTexts obj = new ReadAllTexts();
		try {
			obj.readAll();
		} catch (TwilioRestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
