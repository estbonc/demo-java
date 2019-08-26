package com.geektime.lss.study.io.file;

import java.io.File;
import java.io.IOException;

public class Demo02 {

	public static void main(String[] args) {

		File file = new File("files/a/b/c");
		File file2 = new File("files/a/b/d");

		// 创建文件夹
//		 boolean success = file.mkdirs();
//		 System.out.println(success);

		// 删除
//		if (file.delete()) {
//			System.out.println("删除成功");
//			System.out.println(file.exists());
//		} else {
//			System.out.println("删除失败");
//		}

//		file.deleteOnExit();
//		System.out.println(file.exists());
//		System.out.println("程序结束");

		// 重命名
		file.renameTo(file2);

	}

}
