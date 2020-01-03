package org.leopard;

public class Recursive {

    public int sum(int n){
        int result = 0;
        for(int i=0; i<=n; i++){
            result = result+i;
        }
        return result;
    }

    public int sumR(int n){
        if (n==1){
            return n;
        }else{
            return n+sumR(n-1);
        }
    }
    public static void main(String[] arg){
        Recursive r = new Recursive();
        int i =9;
        System.out.println(r.sum(i));
        System.out.println(r.sumR(i));

    }

}

