
package anagrams;

public class AnagramTree {

    private static AnagramTreeNode ROOT_NODE = null;

    public static void insertNode(String data) {
        ROOT_NODE = insertNode(ROOT_NODE,data);
    }

    public static void findAnagrams(AnagramNode data) {
        findAnagrams(ROOT_NODE,data);
    }

    private static void findAnagrams(AnagramTreeNode theNode,AnagramNode data) {
        if(theNode!=null) {
            if(data.indexLetter==theNode.theAnagram.indexLetter) {
                if(data.length == theNode.theAnagram.length) {
                    if(areCharactersEquals(data.theCharacters,theNode.theAnagram.theCharacters)) {
                        System.out.format("%s is an anamagram of %s \n", theNode.theAnagram.theString,data.theString);
                        findAnagrams(theNode.right, data);
                    } else {
                        findAnagrams(theNode.right, data);
                    }
                } else {
                     findAnagrams(theNode.right, data);
                }
            } else if(data.indexLetter<theNode.theAnagram.indexLetter) {
                findAnagrams(theNode.left, data);
            } else if(data.indexLetter>theNode.theAnagram.indexLetter) {
                findAnagrams(theNode.right,data);
            }
        }
    }

    private static boolean areCharactersEquals(char[] origin, char [] destination) {
        boolean equals = true;
        int index = 0;
        do {
            if(origin[index]!=destination[index]) {
                equals = false;
            }
            index++;
        } while ((equals!=false) && index<origin.length - 1);

        return equals;
    }

    private static AnagramTreeNode insertNode(AnagramTreeNode theNode,String data) {
        if(theNode == null) {
            return new AnagramTreeNode(data);
        } else {
            if (theNode.theAnagram.indexLetter>data.toCharArray()[0]) {
                theNode.left = insertNode(theNode.left, data);
            } else {
                theNode.right = insertNode(theNode.right, data);
            }
            return theNode;
        }
    }
}
