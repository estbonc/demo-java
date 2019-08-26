package com.geektime.lss.study.io.o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo01 {

	public static void main(String[] args) {

		// 获得一个字节型输入流
		try {
			InputStream is = new FileInputStream("hello2.txt");

			while(true){
				int i = is.read();
				if(i == -1){
					break;
				}
				System.out.print((char)i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
