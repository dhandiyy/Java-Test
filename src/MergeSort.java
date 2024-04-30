public class MergeSort {

    public static void divideArray(int[] inputArray){
        int lengthInputArray = inputArray.length;

        if(lengthInputArray < 2) return;

        int midIndex = lengthInputArray / 2;

        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[lengthInputArray - midIndex];

        for (int i = 0; i < midIndex; i++){
            leftArray[i] = inputArray[i];
        }

        for (int i = midIndex; i < lengthInputArray; i++){
            rightArray[i - midIndex] = inputArray[i];

        }

        divideArray(leftArray);
        divideArray(rightArray);
        mergeArray(leftArray, rightArray, inputArray);


    }

    public static void mergeArray(int[] leftArray, int[] rightArray, int[] inputArray){

        int lengthLeftArray = leftArray.length;
        int lengthRightArray = rightArray.length;

        int x = 0, y = 0, z = 0;

        while (x < lengthLeftArray && y < lengthRightArray){
            if(leftArray[x] <= rightArray[y]){
                inputArray[z] = leftArray[x];
                x++;
            }else{
                inputArray[z] = rightArray[y];
                y++;
            }
            z++;
        }

        while (x < lengthLeftArray){
            inputArray[z] = leftArray[x];
            x++;
            z++;
        }

        while (y < lengthRightArray){
            inputArray[z] = rightArray[y];
            y++;
            z++;
        }

    }

    public static void mergeSort(){
        int[] inputArray = {9, 5, 1, 7, 3, 6, -1, 0, 12, 100};

        divideArray(inputArray);

        for(int a : inputArray){
            System.out.print(a + " ");
        }
    }

}
