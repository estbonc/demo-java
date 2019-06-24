package com.lss.study.io.o;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 用字符流写入文件
public class Demo06 {

	public static void main(String[] args) {

		Writer writer = null;

		try {
			writer = new FileWriter("hello3.txt");
			writer.write("hello\r\n大家好\r\n大家都是好学生\r\n");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer != null){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}


	}

}
