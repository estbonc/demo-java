package com.lss.study.io.o;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 高层流写文件
public class Demo08 {

	public static void main(String[] args) {

		Writer writer = null;
		BufferedWriter bw = null;
		try {
			writer = new FileWriter("hello3.txt");
			bw = new BufferedWriter(writer);
			bw.write("你们好，欢迎使用高层流");
			// 注意： 使用带缓冲的流，每次写完数据，必须刷新缓冲区
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
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
