package com.lss.study.io.o;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// 高层流读取文件内容（一行一行读）
public class Demo07 {

	public static void main(String[] args) {
		// 基础流
		Reader reader = null;
		// 高层流
		BufferedReader br = null;
		try {
			reader = new FileReader("hello3.txt");
			// 在基础流的基础上，搭建高层流
			br = new BufferedReader(reader);
			// 把读到的内容放到line中
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

		}


	}

}
