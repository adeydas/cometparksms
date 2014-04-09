package ws.abhis.cometparksms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageQueue {
	public static Map<String, TextType> messageQueue = new HashMap<String, TextType>();
	public static List<String> usedSids = new ArrayList<String>();
	public static List<TextType> mQueue = new ArrayList<TextType>();
	public static long lastUpdateTime;
	public static int keepCount = 0;
}
