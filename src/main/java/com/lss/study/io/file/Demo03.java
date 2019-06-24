package com.lss.study.io.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03 {


	public static void main(String[] args) {

		File file = new File("D://CentOS//CentOS.hdd");
		printFileInfo(file);

	}

	/*
	 * 1. 封装一个方法，传入一个File对象 打印以下信息
	 文件名：
	 文件路径：
	 绝对路径：
	 父文件夹名称：
	 文件是否存在：
	 文件是否可写：
	 文件是否可读：
	 文件是不是目录？
	 文件是不是文件？
	 路径是不是绝对路径？
	 文件最后修改时间
	 文件的大小
	 */

	/**
	 * 打印文件信息
	 * @param f 要打印的文件
	 */
	private static void printFileInfo(File f){
		System.out.println("文件名：" + f.getName());
		System.out.println("文件路径：" + f.getPath());
		System.out.println("绝对路径：" + f.getAbsolutePath());
		System.out.println("父文件夹名称：" + f.getParent());
		System.out.println(f.exists() ? "文件存在" : "文件不存在");
		System.out.println(f.canWrite() ? "文件可写" : "文件不可写");
		System.out.println(f.canRead() ? "文件可读" : "文件不可读");
		System.out.println(f.isDirectory()?"文件是目录" :"文件不是目录");
		System.out.println(f.isFile()?"文件是文件" :"文件不是文件");
		System.out.println(f.isAbsolute() ? "是绝对路径" : "不是绝对路径");

		long time = f.lastModified();
		// 2016/01/20 11:23:46
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String res = format.format(new Date(time));
		System.out.println("最后修改时间：" + res);


		System.out.println("文件的大小：" + f.length());
	}


}
