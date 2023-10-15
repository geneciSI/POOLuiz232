package Treino;


class Arguments {
    public static void main (String[] args){
        
        int c;
        for (c = 1; c <= 10; c++){
            System.out.println(c);
            args[c-1]="c";
        }
        for ( String t: args){
            System.out.println("teste: " + t);
        }
        
    }
    
}
