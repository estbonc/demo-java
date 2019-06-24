package com.lss.study.io.file;

import java.io.File;

public class Demo04 {

	public static void main(String[] args) {


		File file = new File("D://java SE");

		printAllFiles(file, 0);

	}


	/**
	 * 打印文件夹中的所有文件
	 * @param dir
	 * @param level 层级
	 */
	private static void printAllFiles(File dir, int level){
		if(dir != null && dir.isDirectory()){
			// 获得dir里的所有文件
			File[] files = dir.listFiles();
			// 循环打印
			for(int i = 0 ; i < files.length ; i++){
				// 打印层级
				for(int j = 0; j < level; j ++){
					System.out.print("|--");
				}
				System.out.println(files[i].getName());
				// 如果是文件夹，要继续深入
				if(files[i].isDirectory()){
					printAllFiles(files[i], level+1);
				}
			}
		}
	}
}
