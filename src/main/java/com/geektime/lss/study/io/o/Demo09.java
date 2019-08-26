package com.geektime.lss.study.io.o;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// 字节流转化成字符流
public class Demo09 {

	public static void main(String[] args) {
		InputStream is = null;
		Reader reader = null;
		BufferedReader br = null;
		try {
			is = new FileInputStream("hello2.txt");
			// is -> reader
			reader = new InputStreamReader(is);
			br = new BufferedReader(reader);
			String line = null;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if(is != null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}


	}

}
