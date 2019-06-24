package com.lss.study.io.o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 字节流复制文件
public class Demo04 {

	public static void main(String[] args) {
		File sFile = new File("C://toolsbackups//jdk-7u45-windows-i586.exe");
		File dFile = new File("D://jdk1.7.exe");

		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream(sFile);
			os = new FileOutputStream(dFile);

			byte[] b = new byte[1024];
			int len = 0;

			while((len = is.read(b)) != -1){
				os.write(b, 0, len);
			}

			System.out.println("复制完毕！");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(is != null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

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
