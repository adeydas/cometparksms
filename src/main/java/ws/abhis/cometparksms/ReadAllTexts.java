package ws.abhis.cometparksms;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.instance.Message;
import com.twilio.sdk.resource.list.MessageList;

public class ReadAllTexts {
	// Find your Account Sid and Token at twilio.com/user/account
	public static final String ACCOUNT_SID = "AC5a016b801a8131bd96bc3e6c7e9a04cf";
	public static final String AUTH_TOKEN = "76c167f7f5372c8722b4d72d76181da3";

	public void readAll() throws TwilioRestException {
		DatabaseConnect objDatabaseConnect = new DatabaseConnect();
		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

		MessageList messages = client.getAccount().getMessages();

		// Loop over messages and print out a property for each one.
		for (Message message : messages) {
			if (message.getStatus().equals("received")) {
				
				if (!MessageQueue.messageQueue.containsKey(message.getSid())) {
					MessageQueue.messageQueue.put(message.getSid(), new TextType(message.getSid(), message
						.getBody(), message.getFrom()));
				}
				
			}

		}

	}
}
