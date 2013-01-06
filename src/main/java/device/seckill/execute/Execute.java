/**
 * 
 */
package device.seckill.execute;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.nodes.Document;
import org.xml.sax.SAXException;

import device.seckill.util.HTMLUtil;

/**
 * @author lvqiang
 *
 */
public class Execute {
	private static Log logger = LogFactory.getLog(Execute.class);

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		String itemUrl = "http://item.taobao.com/item.htm?id=14220438511";
		logger.info("seckill device starts.");
		Document document = HTMLUtil.getHtmlDom(itemUrl);
		if (document.getElementsByClass("tb-btn-buy") != null) {
			logger.info(document.getElementsByClass("tb-btn-buy"));
			logger.info("item is alive");
		} else if (document.getElementsByClass("tb-btn-wait") != null) {
			logger.info(document.getElementsByClass("tb-btn-wait"));
			logger.info("item is wait");
		} else {
			logger.error("item is broken");
		}
	}
}
