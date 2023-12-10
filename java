package javaapplication25;

public class JavaApplication25 {


    public static void main(String[] args) {
        NewClass std=new NewClass();
        std.setId(10);
        std.setname("Duaa");
        std.sayHello();

    }
    
}

------------------------


package javaapplication25;


public class NewClass {
    private int id;
    private String name;
    
    public int getId(){
    return id;
    }
    
    public void setId(int id){
    this.id = id;
    }
    
    
    public String getName(){
    return name;
    }
    
    public void setname(String name){
    this.name = name;
    }
    public void sayHello(){
    System.out.println("Hello my name is "+name);
    }

}
