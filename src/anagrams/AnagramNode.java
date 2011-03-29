package anagrams;

public class AnagramNode {

    int length;
    String theString;
    char[] theCharacters = new char[length];
    char indexLetter;

    public AnagramNode(String theStringToProcess) {
        this.theString = theStringToProcess;
        this.length = theString.length();
        this.theCharacters = theString.toCharArray();
        quicksort(0, theCharacters.length - 1);
        indexLetter = this.theCharacters[0];
    }

    private void quicksort(int first, int last) {
        int a = first;
        int b = last;
        if (theCharacters.length > 1) {
            char pivot = theCharacters[(first + last) / 2];

            while (a <= b) {
                while (theCharacters[a] < pivot) a++;
                while (theCharacters[b] > pivot) b--;

                if (a <= b) {
                    exchange(a, b);
                    a++;
                    b--;
                }
            }
            if (first < b) quicksort(first, b);
            if (a < last) quicksort(a, last);
        }

    }

    private void exchange(int origin, int destination) {
        char aux;
        aux = theCharacters[destination];
        theCharacters[destination] = theCharacters[origin];
        theCharacters[origin] = aux;
    }
}
