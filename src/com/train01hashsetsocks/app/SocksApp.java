package com.train01hashsetsocks.app;
import java.util.HashSet;
public class SocksApp {

	public static void main(String[] args) {
		/*
		 * 	HackerRank
		 *  ========== Sock Merchant ===========
		 *  	John works at a clothing store. He has a large pile of socks that 
		 *  he must pair by color for sale. Given an array of integers representing 
		 *  the color of each sock, determine how many pairs of socks with matching 
		 *  colors there are. 
		 *  For example, there are 'n =7' socks with colors 'ar = [1,2,1,2,1,3,2]. 
		 *  There is one pair of color '1' and one of color '2'. There are three odd
		 *  socks left, one of each color. The number of pairs is '2'.
		 *  
		 *  - Function Description
		 *  Complete the sockMerchant function in the editor below. It must return 
		 *  an integer representing the number of matching pairs of socks that are 
		 *  available. sockMerchant has the following parameter(s):
		 *  	- 'n': the number of socks in the pile
		 *  	- 'ar': the colors of each sock
		 *  
		 *  - Input Format
		 *  The first line contains an integer , the number of socks represented in 
		 *  'ar'.
		 *  The second line contains 'n' space-separated integers describing the 
		 *  colors  of the socks in the pile.
		 * */
		int number = 9;
		int[] socks = new int[] {10,20,20,10,10,30,50,10,20};
		System.out.print(sockMerchant(number,socks));

	}
	public static int sockMerchant(int n, int[] ar) {
		// Variables
        int pairs = 0;
        // Objects
        HashSet <Integer> mySocks = new HashSet<Integer>();
        // If 'ar' is empty return 0
        if(ar.length == 0){return pairs;}
        // Go though the socks to find the pair
        for(int i = 0; i < ar.length; i++){
            // if there is the same sock in the pile
            if(mySocks.contains(ar[i])){
                pairs++;
                mySocks.remove(ar[i]);
            }
            // if you dont find another sock
            else{
                mySocks.add(ar[i]);
            }
        }
        return pairs;
	}
}
