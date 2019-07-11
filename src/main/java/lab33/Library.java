/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab33;

import java.util.HashSet;

public class Library {
    public String repeatedWord(String inputWord) {

            if(inputWord.isEmpty()) return "Empty String";
            inputWord=inputWord.replace(',', ' ');
            inputWord = inputWord.replace('.', ' ');
            String[] arr = inputWord.split(" ");

            //initialize a hashset to store unique word
            HashSet<String> hs = new HashSet<>();

            for(int i = 0; i < arr.length; i++)
            {
                arr[i]= arr[i].toLowerCase();
                if (!hs.add(arr[i]))
                {  //find the one already exsits in hashset return that word
                    return arr[i];
                }

            }

            return "No repeated word in this string";
        }
    }



