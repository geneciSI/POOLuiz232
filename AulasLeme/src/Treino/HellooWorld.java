
package Treino;

public class HellooWorld {
    public String print(int i){
        String msg = "Hello";
        if (i == 1){
            msg = "World";
        }
        else {
            msg = "Java";
        }
        return msg;
    }
    public static void main(String[] args) {
        HellooWorld obj = new HellooWorld();
        System.out.println(obj.print(2));
    }
    
}
