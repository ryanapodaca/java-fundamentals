/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package basiclibrary;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public int[] roll(int n) {
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            int result = rand.nextInt(6)+1;
            array[i] = result;
        }
        return array;
    }

    public boolean containsDuplicates(int[] array){
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++){
          for (int j = i + 1; j < array.length; j++){
              if (array[i] == array[j]){
                  hasDuplicates = true;
                  break;
              }
          }
       }
       return hasDuplicates;
    }

    public float averages(int[]array){
        int acc = 0;
        for (int i = 0; i < array.length; i++) {
          acc= acc + array[i];
        }
        float ave = (float)acc / (float)array.length;
        return ave;
    }

    public int[] lowestArrayAve(int[][]arr){
        float[] newArr = new float[arr.length];
        for (int i = 0; i < arr.length; i++){
            int acc = 0;
            for (int j = 0; j < arr[i].length; j++) {
                acc= acc + arr[i][j];
            }
            float ave = (float)acc / (float)arr[i].length;
            newArr[i] = ave;
        }

        int index = 0;
        for (int i = 0; i < newArr.length; i++){
            for (int j = i + 1; j < newArr.length; j++){
                if (newArr[i] < newArr[j]){
                    index = i;
                } else if (newArr[i] > newArr[j]){
                    index = j;
                }
            }
        }
        return arr[index];
    }

    public String findLoHiAndNotExistingTemp(int[][] monthArray){
        //Declare vars
        int minTemp = monthArray[0][0]; //Integer.MAX_VALUE;
        int maxTemp = monthArray[0][0];

        //find min and max
        for(int[] weeklyTemps : monthArray){
            for(int temp : weeklyTemps){
                if (temp < minTemp){
                    minTemp = temp;
                }
                if (temp > maxTemp){
                    maxTemp = temp;
                }
            }
        }

        //Find novel temps through HashSet
        HashSet<Integer> uniqueTemps = new HashSet<>();

        for(int[] weeklyTemps : monthArray){
            for(int temp : weeklyTemps){
                uniqueTemps.add(temp);
            }
        }

        String output = "High: " + maxTemp + "\nLow: " + minTemp;

        for(int temp = minTemp; temp <= maxTemp; temp++){
            if(!uniqueTemps.contains(temp)){
                output = output.concat("\nNever saw temperature: " + temp);
            }
        }

        return output;
    }

    public String tally(ArrayList<String> arr){
        HashMap<String, Integer> voteCounts = new HashMap<>();
        for(String vote : arr) {
            voteCounts.put(vote, voteCounts.getOrDefault(vote, 0)+1);
        }

        int maxVotes = 0;
        String winner = null;

        for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) {
            String candidate = entry.getKey();
            int voteCount = entry.getValue();
            if (voteCount > maxVotes) {
                maxVotes = voteCount;
                winner = candidate;
            }
        }
        return winner;


    }


}


