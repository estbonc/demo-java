package com.lss.study.list;

public class Demo03 {

	public static void main(String[] args) {
		
		/*
		 * �������Э���ԣ����A����չB�࣬��ôA������Ҳ����B������
		 * ������ȫ��������ҪB[]�ĵط�ʹ��A[]
		 */
		
		Integer[] intArr = {1,2,3};
		Number[] numArr = intArr;
		
		/*
		 * ���Ͳ���Э���
		 */
		List<Integer> intList = new ArrList<Integer>();
		List<Number> numList = intList;
		
		/*
		 * ͨ���
		 * List<?> ���κ�List<>���͵ĸ�����
		 * ����List<Integer>��List<List<Integer>>
		 */
		List<?> numList2 = intList;
		
		/*
		 * �ϱ߽�
		 * ? extends XXX
		 */
		
		List<? extends Number> numList3 = new ArrList<Integer>();
		
		/*
		 * �±߽�
		 * ? super XXX
		 */
		List<? super Integer> intList2 = new ArrList<Number>();
		
		
	}
	
}
