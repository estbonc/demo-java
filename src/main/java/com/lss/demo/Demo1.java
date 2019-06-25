package com.lss.demo;

import java.util.Arrays;

/**
 * @author liushuaishuai
 * @date 2019/6/25 10:01
 * <p>
 * remark:
 */
public class Demo1 {
    public static void main(String[] args) {
        Arrays.asList( "a", "b", "d" ).stream().forEach(e -> System.out.println( e ) );

        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
    }
}
