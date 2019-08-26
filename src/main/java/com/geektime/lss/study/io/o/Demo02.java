package com.geektime.lss.study.io.o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo02 {

	public static void main(String[] args) {

		InputStream is = null;
		try {
			// 获得字节输入流
			is = new FileInputStream("hello2.txt");
			// 准备一个字节型缓冲区
			byte[] b = new byte[10];
			// 读到的字节数
			int len = 0;
			// 内存中准备一个字符串接收所有读到的内容
			String s = "";
			while((len = is.read(b)) != -1){
				s += new String(b, 0, len);
			}
			System.out.println(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭流
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
