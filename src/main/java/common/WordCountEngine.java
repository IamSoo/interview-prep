package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class WordCountEngine {

    public static void main(String [] args){
        String testString = "Practice makes perfect. you'll only get Perfect by practice. just practice!";
        wordCountEngine(testString);
    }

    public static List<List<String>> wordCountEngine(String line){
        List<List<String>> returningList = new ArrayList<>();

        HashMap<String,Integer> dataMap = new HashMap<>();
        String [] words = line.toLowerCase().split("[^a-zA-z]+");
        for(String s : words)
            if(dataMap.containsKey(s)){
                dataMap.put(s,dataMap.get(s)+1);
            }else{
                dataMap.put(s,1);
        }
        List<Word> dataList = new ArrayList<>();
         for(String key : dataMap.keySet()){
              dataList.add(new Word(key, dataMap.get(key)));
         }

         Collections.sort(dataList);

        for(Word word : dataList){
            ArrayList<String> innertList = new ArrayList<>();
            innertList.add(word.word);
            innertList.add(String.valueOf(word.count));
            returningList.add(innertList);
        }
       return returningList;
    }

    static class Word implements Comparable<Word>{

        private String word;
        private Integer count;

        public Word(String s, Integer seq){
            word = s;
            count = seq;
        }

        public int compareTo(Word c){
            return c.count - this.count;
        }

        @Override
        public String toString(){
            return " [" + word + " ,  " + count + " ]";
        }

    }


}
