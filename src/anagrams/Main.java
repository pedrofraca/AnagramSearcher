package anagrams;

public class Main {

    public static void main(String[] args) {

        /*INPUT
         abel able bale bela elba
         caret carte cater crate trace
         angel angle galen glean lange
         alger glare lager large regal
         elan lane lean lena neal
        evil levi live veil vile
         */
        AnagramTree.insertNode("abel");
        AnagramTree.insertNode("able");
        AnagramTree.insertNode("bela");
        AnagramTree.insertNode("elba");

        AnagramTree.insertNode("caret");
        AnagramTree.insertNode("carte");
        AnagramTree.insertNode("cater");
        AnagramTree.insertNode("crate");
        AnagramTree.insertNode("trace");

        AnagramTree.insertNode("angel");
        AnagramTree.insertNode("angle");
        AnagramTree.insertNode("galen");
        AnagramTree.insertNode("glean");
        AnagramTree.insertNode("lange");

        AnagramTree.insertNode("alger");
        AnagramTree.insertNode("glare");
        AnagramTree.insertNode("lager");
        AnagramTree.insertNode("large");
        AnagramTree.insertNode("regal");

        AnagramTree.insertNode("elan");
        AnagramTree.insertNode("lane");
        AnagramTree.insertNode("lean");
        AnagramTree.insertNode("lena");
        AnagramTree.insertNode("neal");

        AnagramTree.insertNode("evil");
        AnagramTree.insertNode("levi");
        AnagramTree.insertNode("live");
        AnagramTree.insertNode("veil");
        AnagramTree.insertNode("vile");

        AnagramTree.findAnagrams(new AnagramNode("abel"));
    }

}
