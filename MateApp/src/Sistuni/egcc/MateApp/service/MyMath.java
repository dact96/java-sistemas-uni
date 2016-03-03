package Sistuni.egcc.MateApp.service;

/**
 *
 * @author Diego
 */
public final class MyMath {

    private MyMath() {
        
    }
    //metodo para hallar el factorial
    public static long factorial(int n){
        
        long fact=1;
        while(n>1){
            fact*=n;
            n--;
        }
    return fact;
    }
    public static int mcd(int n1, int n2){
        int menor=Math.min(n1, n2);
        int mayor=Math.max(n1, n2);
        int resto;
        do
            {resto=mayor%menor;
             mayor=menor;
                if (resto!=0)
                    menor=resto;            
            } while (resto!=0);
    return menor;   
    }
    public static int mcm(int n1,int n2){
        int menor=Math.min(n1, n2);
        int mayor=Math.max(n1, n2);
        int mcm=(mayor/mcd(menor,mayor))*menor;
        return mcm;
    }
    public static String Fibonacci(int n){
        int a=1,b=1,aux;
        String fib=a+" - ";
        for(int i=2;i<=n;i++){
            fib+=b+" - ";
            b+=a;
            a=b-a;
          }
        fib=fib.substring(0, fib.length()-2);
        return fib;
    }
    public static boolean Primo(int n){
       int a=0;
      for(int i=2;i<n;i++){
          if(n%i==0)
              a++;
      }  
      if (a==0)
          return true;
      else
          return false;
    }
        
}
    
    
