package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// subsequence of a string.
        subSequences("","");

    }
    public static void subSequences(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSequences(p+ch,up.substring(1)); // take
        subSequences(p,up.substring(1)); // reject.

    // the above two recursive calls will specify that we have to take or reject.
    }
}
