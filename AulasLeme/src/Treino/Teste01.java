
package Treino;

public class Teste01 {
    public static void main(String[] args) {
        int i = 1;
        do {
            int num = 1;
            for (int j = i; j <= 1; j++){
                System.out.println(num + "G");
                num += 2;
            }
            System.out.println();
            i++;
        } while (i <= 5);
    }    
}
/*
public class Teste01 {
    public static void main(String[] args) {
        int i = 5;
        while (i >= 1){
            int num = 1;
            for (int j = i; j <= 1; j++){
                System.out.println(num + "***");
                num *= 2;
            }
            System.out.println();
            i--;
        }
    }    
}
*/
/*
public class Teste01 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            for (int j = i; j > 1; j--)
                System.out.println(j + " ");
            System.out.println("****");
            i++;
        }
    }    
}
*/
/*
public class Teste01 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++){
            int j = 0;
            while (j < i){
                System.out.println(j + " ");
                j ++;
            }
        }
    }
    
}

*/