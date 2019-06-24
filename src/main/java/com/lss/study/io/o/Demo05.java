package com.lss.study.io.o;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// 用字符流读取文件内容
public class Demo05 {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("hello2.txt");
			// 准备 char 类型缓冲区
			char[] c = new char[10];
			int len = 0;
			// 循环读取
			while((len = reader.read(c)) != -1){
				System.out.print(new String(c, 0, len));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}


	}

}
