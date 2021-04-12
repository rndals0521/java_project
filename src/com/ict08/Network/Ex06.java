package com.ict08.Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


//ÆÄ½Ì(Parsing) : µ¥ÀÌÅÍ¸¦ ºĞÇØÇØ¼­ ¿øÇÏ´Â µ¥ÀÌÅÍ¸¦ Ãß­xÇÏ´Â °Í.
//ÆÄ¼­          : ÆÄ½ÌÀ» ÇØÁÖ´Â ÇÁ·Î±×·¥

//XML ÆÄ½Ì : ±â»óÃ»
public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		// xml ÆÄ½ÌÇÏ±â : ÆäÀÌÁö¿¡ Á¢±ÙÇØÁÙ Document°´Ã¼ »ı¼º
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			String msg=null;
			StringBuffer sb = new StringBuffer();
			while((msg=br.readLine())!=null) {
				sb.append(msg+'\n');
			}
			//System.out.println(sb.toString());
			
			
			// StringBuffer ¿¡ ÀúÀåµÈ ³»¿ë ÀĞ±â
			InputSource is = new InputSource(new StringReader(sb.toString()));
			
			//xml ÆÄ½ÌÇÏ±â
			builder = factory.newDocumentBuilder();
			doc = builder.parse(is);
			
			// ÅÂ±×¿Í ¼Ó¼º
			// 1. local ÅÂ±×µéÀ» ÃßÃâÇÑ´Ù. (¿©·¯°³ ÀÌ¸é ¹è¿­¿¡ ÀúÀåµÈ´Ù.)	
			NodeList local = doc.getElementsByTagName("local");
			
			// 2. for¹®À» »ç¿ëÇØ local °¹¼ö¸¸Å­ ¹İº¹ÇÏÀÚ
			StringBuffer sb2 = new StringBuffer();
			for (int i = 0; i < local.getLength(); i++) {
				// ÅÂ±×ÀÇ ±ÛÀÚ ÃßÃâ : .getFirstChild().getNodeValue()
				sb2.append(local.item(i).getFirstChild().getNodeValue()+", ");
				// ÅÂ±×ÀÇ ¼Ó¼º ÃßÃâ : ((Element)local.item(i)).getAttribute("")
				sb2.append( ((Element)local.item(i)).getAttribute("ta")+", ");
				sb2.append( ((Element)local.item(i)).getAttribute("desc")+"\n");
				
			}
			
			System.out.println(sb2.toString());
			
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				
			} catch (Exception e2) {
			}
		}
	}
}
