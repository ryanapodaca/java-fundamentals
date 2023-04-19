/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package basiclibrary;
import java.util.Random;

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
}
