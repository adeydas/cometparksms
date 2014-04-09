package ws.abhis.cometparksms;

import com.twilio.sdk.TwilioRestException;

public class EntryPoint {
	public static void main(String[] args) throws TwilioRestException {
		ReadAllTexts objReadAllTexts = new ReadAllTexts();
		ProcessQueue objProcessQueue = new ProcessQueue();
		
		while (true) {
			objReadAllTexts.readAll();
			objProcessQueue.process();
		}
	}
}
