/**
 * 
 */
package device.seckill.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author lvqiang
 *
 */
public class HTMLUtil {

	public static String getHtmlContent(String urlStr) throws IOException {
		URL url = new URL(urlStr); 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
		StringBuilder content = new StringBuilder();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			content.append(line);
		}
		return content.toString();
	}
	
	public static Document getHtmlDom(String urlStr) throws IOException {
		Document doc = Jsoup.connect(urlStr).get(); 
		return doc;
	}
}