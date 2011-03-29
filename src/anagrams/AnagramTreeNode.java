package anagrams;

public class AnagramTreeNode {
    AnagramNode theAnagram;
    AnagramTreeNode left;
    AnagramTreeNode right;

    public AnagramTreeNode(String data) {
        this.theAnagram = new AnagramNode(data);
    }
}
