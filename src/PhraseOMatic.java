/**
 * Created by DELEMAX on 2/24/2016.
 */;
public class PhraseOMatic {
   public static String[] wordList = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
   public static String[] wordList2 = {"empowered", "strictly", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "out-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerate"};
   public static String[] wordList3 = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
    //getting the length of each String array

    public static int lengthWordList = wordList.length;
    public static int lengthWordList2 = wordList2.length;
    public static int lengthWordList3 = wordList3.length;

    //generate random numbers based on the lenght to use in getting elements from the array

    public static int rand1 = (int) (Math.random() * lengthWordList);
    public static int rand2 = (int) (Math.random() * lengthWordList2);
    public static int rand3 = (int) (Math.random() * lengthWordList3);
    //now building a phrase

    public static void print() {
        String phrase = wordList[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
        System.out.println("What we need is a "+phrase);
    }
}

