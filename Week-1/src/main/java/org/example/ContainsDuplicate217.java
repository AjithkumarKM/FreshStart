package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter no of integers:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // for (int i=0;i<nums.length;i++){
        //     int count = 0;
        //     for (int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j])
        //             count++;
        //     }
        //     if(count != 0)
        //         return true;
        // }
        // return false;

        boolean containsDuplicate = false;
        Set<Integer> s = new HashSet<Integer>();
        for(int z=0; z<list.size(); z++){
            if(!s.add(list.get(z)))
                containsDuplicate = true;
        }
        System.out.println("Does contain duplicate? "+ containsDuplicate);

        // List<Integer> res = Arrays.stream(nums)
        // .boxed()
        // .collect(Collectors.toList());
        // Collections.sort(res);
        // for(int k=0;k<nums.length-1;k++){
        //     if(res.get(k)==res.get(k+1))
        //         return true;
        // }
        // return false;
    }
}
