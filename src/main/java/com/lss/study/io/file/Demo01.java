package com.lss.study.io.file;

import java.io.File;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) {

		File file = new File("hello.txt");
		File file2 = new File("hello2.txt");
		// new File("d://hello.txt");

		// 创建文件
//		try {
//			boolean success = file.createNewFile();
//			if(success){
//				System.out.println("创建成功");
//			}else{
//				System.out.println("创建失败");
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("创建异常");
//		}

		// 删除文件
//		if(file.delete()){
//			System.out.println("删除成功");
//		}else{
//			System.out.println("删除失败");
//		}

		// 重命名
		file.renameTo(file2);

		// 结果肯定是只剩下一个 hello2.txt
		System.out.println(file.exists());
		System.out.println(file2.exists());


	}

}
