package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex21 {
	public static void main(String[] args) {
		// 바이트-문자 결합 : 체인방식
		// 출력 : OutputStreamWriter : OutputStream -> Writer
		//       OutputStream -> OuputStreamWriter -> Writer -> BufferedWriter
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			bw.write("Welcome");
			bw.newLine();
			bw.write("to my world");
			bw.newLine();
			
			bw.flush();
			
			
			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
	}
}
