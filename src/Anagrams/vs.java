package Anagrams;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;




public class vs {



    public char[] swap (char[] array,int first_element,int second_element){

        char tmp=array[first_element];

        array[first_element]=array[second_element];
        array[second_element]=tmp;


        return array;
    }




    public String motor (String string) {


        char array[] = string.toCharArray();

        int k = 0;
        for (char o : array) {
            if (Character.isLetter(o)) k++;
        }
        k = k / 2;

        int forward=0;
        int back=array.length-1;

        for (int i=0;i<k;i++) {

            while (!Character.isLetter(array[forward])){
               forward++;
            }
            while (!Character.isLetter(array[back])){
                back--;
            }
            swap(array,forward,back);
            forward++;back--;

        }
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(array);


        return stringBuilder.toString();
     }

     public String changer(String string){

        String space=" ";

        String[] stringarray=string.split(space);
         StringBuilder stringBuilder=new StringBuilder();

         for(String s:stringarray){
            stringBuilder.append(motor(s));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }







}
