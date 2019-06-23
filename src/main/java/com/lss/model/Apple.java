package main.java.com.lss.model;

/**
 * Author: liushuaishuai
 * Email: liushuaishuai@91zdan.com
 * Date: 2017-11-04 20:57
 * Description:
 * History:
 */


public class Apple {

    private String color;
    private Integer weight;


    public Apple() {
    }

    public Apple(Integer weight,String color) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
