import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Word implements Comparable<Word> {
    String word;
    int length;

    public Word(String word) {
        this.word = word;
        length = word.length();
    }

    @Override
    public int compareTo(Word word) {
        if(this.length > word.length) {
            return 1;
        }
        else if(this.length < word.length) {
            return -1;
        }
        else {
            for(int i = 0; i < length; i++) {
                if(this.word.charAt(i) > word.word.charAt(i))
                    return 1;
                else if(this.word.charAt(i) < word.word.charAt(i))
                    return -1;
            }
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        Word[] words = new Word[n];

        for(int i = 0; i < n; i++) {
            words[i] = new Word(bufferedReader.readLine());
        }

        Arrays.sort(words);

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                stringBuilder.append(words[i].word).append('\n');
                continue;
            }

            if(! words[i - 1].word.equals(words[i].word))
                stringBuilder.append(words[i].word).append('\n');
        }

        System.out.print(stringBuilder);
    }
}
