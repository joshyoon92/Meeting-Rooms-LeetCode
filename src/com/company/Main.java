package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[][] interval = {{0,4}, {6,9},{16,20},{12,16}};
        boolean tf = canAttendMeetings(interval);
        System.out.println(tf);
    }

    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        for (int i=0; i<intervals.length-1; i++){
            if (intervals[i][1] > intervals[i+1][0]) {
                return false;
            }
        }
        return true;
    }
}
