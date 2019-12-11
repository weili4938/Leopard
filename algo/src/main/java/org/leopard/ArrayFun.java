package org.leopard;

public class ArrayFun
{



    public static void  main(String [] arg){

       ArrayFun af = new ArrayFun();
       af.removeElement(12);
       af.dedupArrary();
    }



    // the problem is this approach is that we cannot reduce the array size
    void removeElement(int intToRemove){
        int[] intArry ={12,32,34,54,94,110};
        int l = intArry.length;
       for (int i=0; i<l; i++){
           if (intArry[i]==intToRemove){
               for(int j=i; j<l-1; j++){
                   intArry[j] =intArry[j+1];
               }
           }
       }
        //printArray(intArry);
    }

    void dedupArrary(){
        int[] orgArr = {12,12,23,23,23,45,49,58,58,58,69,69,69};
        int arrLength= orgArr.length;
        //first pass, determine new array length
        for (int i=0; i<orgArr.length-1; i++){
            if (orgArr[i]==orgArr[i+1]){
                arrLength--;
            }
        }
        //construct the correct element
        int[] newArr = new int[arrLength];

        //second pass to fill the new array
        int j=0;
        for (int i=0; i<orgArr.length-1; i++){
            if(orgArr[i]!=orgArr[i+1]){
                newArr[j]=orgArr[i];
                j++;
            }
        }
        //take care of last one
        newArr[j] = orgArr[orgArr.length-1];

        printArray(newArr);

//        System.out.println(arrLength);
    }

    static void printArray(int[] a){
        for(int i: a){
            System.out.println(i+" ");
        }
    }

}
