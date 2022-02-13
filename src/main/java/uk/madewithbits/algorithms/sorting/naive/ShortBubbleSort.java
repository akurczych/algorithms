package uk.madewithbits.algorithms.sorting.naive;

import static java.lang.System.out;

import java.util.Arrays;

public class ShortBubbleSort {

    public static int[] sort(int[] numbers) {
    	out.format("numbers  : %s \n", Arrays.toString(numbers));
    	final int[] result = numbers.clone();
    	int passNum = numbers.length - 1;
    	boolean hasExchanged = true;
    	
        while (passNum > 0 && hasExchanged) {
            hasExchanged = false;
            for (int i = 0; i < passNum; i++) {
                if (result[i] > result[i + 1]) {
                	hasExchanged = true;
                    int temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                }
            }
            out.format("passNum %d: %s \n", passNum, Arrays.toString(result));
            passNum--;
        }
        
        return result;
    }
}
