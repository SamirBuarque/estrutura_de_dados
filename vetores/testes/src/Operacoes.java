public class Operacoes {
   /*public static int soma(int a, int b) {
        return a+b;
        }*/

    /*public static int fatorial(int x) {
        if (x==1 || x==0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i<=x; i++) {
                result = result * i; 
            }
            return result;
        }
    }*/

    /*public static int fatorialRecursivo(int x) {
        System.out.println("chamada recursiva com " + x);
        if (x==1 || x==0) {
            return 1;
        } else {
            return fatorialRecursivo(x-1)*x; 
        }
    }*/

    public static int fibonnaciRecursivo(int x) {
        if (x<2) {
            return x;
        } else {
            return fibonnaciRecursivo(x-1) + fibonnaciRecursivo(x-2);
        }
    }

    public static void main(String[] args) {
        //System.out.println(soma(10,5));
        //System.out.println(fatorial(1));
        //System.out.println(fatorialRecursivo(5));
        System.out.println(fibonnaciRecursivo(5)); // 0 1 1 2 3
    }

   }



