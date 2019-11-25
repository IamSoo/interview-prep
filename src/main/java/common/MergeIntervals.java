package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {


    public static void main(String[] args) {
        Interval interval1 = new Interval(1,3);
        Interval interval2 = new Interval(2,6);
        Interval interval3 = new Interval(8,10);
        Interval interval4 = new Interval(15,16);
        List<Interval> intervals = new ArrayList<>();
        intervals.add(interval4);
        intervals.add(interval3);
        intervals.add(interval2);
        intervals.add(interval1);
    }


    static class Interval{
        int start;
        int end;

        public Interval(int start, int end){
            this.start = start;
            this.end  = end;
        }
    }

}
