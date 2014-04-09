package ws.abhis.cometparksms;

import java.util.Iterator;
import java.util.Map;

public class ProcessQueue {
	public void process() {
		DatabaseConnect objDatabaseConnect = new DatabaseConnect();

		Iterator it = MessageQueue.messageQueue.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			TextType tt = (TextType) pairs.getValue();
			

			// Logic
			if (!MessageQueue.usedSids.contains(tt.getSid())) {
				System.out.println("Got body " + tt.getBody());
				if (tt.getBody().contains("10")) {
					objDatabaseConnect
							.runSqlQuery("update tbl_SensorStatus set status='true' where sensorid='1'");
					System.out.println("Ran update true");
					// MessageQueue.mQueue.remove(i);
				} else if (tt.getBody().contains("11")) {
					objDatabaseConnect
							.runSqlQuery("update tbl_SensorStatus set status='false' where sensorid='1'");
					System.out.println("Ran update false");
					// MessageQueue.mQueue.remove(i);
				}

				System.out.println(pairs.getKey() + " = " + pairs.getValue());
				it.remove(); // avoids a ConcurrentModificationException
				MessageQueue.usedSids.add(tt.getSid());
			}
		}

	}
}
