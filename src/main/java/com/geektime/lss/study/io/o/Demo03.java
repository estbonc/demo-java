package com.geektime.lss.study.io.o;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 字节流写文件
public class Demo03 {

	public static void main(String[] args) {


		OutputStream os = null;
		try {
			os = new FileOutputStream("hello3.txt",true);
			os.write("world".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(os != null){
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}


	}

}
