/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;

/**
 *
 * @author nguye
 */
public class Province {
    private String name;
    private int code;

    public Province(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public Province() {
    }
    

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return name;
    }
}
