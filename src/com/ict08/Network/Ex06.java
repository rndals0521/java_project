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


//파싱(Parsing) : 데이터를 분해해서 원하는 데이터를 추춝하는 것.
//파서          : 파싱을 해주는 프로그램

//XML 파싱 : 기상청
public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		// xml 파싱하기 : 페이지에 접근해줄 Document객체 생성
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
			
			
			// StringBuffer 에 저장된 내용 읽기
			InputSource is = new InputSource(new StringReader(sb.toString()));
			
			//xml 파싱하기
			builder = factory.newDocumentBuilder();
			doc = builder.parse(is);
			
			// 태그와 속성
			// 1. local 태그들을 추출한다. (여러개 이면 배열에 저장된다.)	
			NodeList local = doc.getElementsByTagName("local");
			
			// 2. for문을 사용해 local 갯수만큼 반복하자
			StringBuffer sb2 = new StringBuffer();
			for (int i = 0; i < local.getLength(); i++) {
				// 태그의 글자 추출 : .getFirstChild().getNodeValue()
				sb2.append(local.item(i).getFirstChild().getNodeValue()+", ");
				// 태그의 속성 추출 : ((Element)local.item(i)).getAttribute("")
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
