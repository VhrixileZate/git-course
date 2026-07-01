public class ArraySearch {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7, 9};
        int target = 7;

        int result = linearSearch(nums, target);
        System.out.println("Linear: " + result);

        int resultv1 = binarySearch(nums, target);
        System.out.println("Binary: " + resultv1);

        int arrarList[] = {5,1,8,2,9};
        int sortedArray[] = bubbleSort(arrarList);
        
        System.out.print("Buble Sorted Array: ");
        for(int numbers: sortedArray) {
            System.out.print(numbers + " ");
        }

        System.out.println("============================");
        
        int arrarListV2[] = {5,1,8,2,9};
        int sortedArrayV2[] = selectionSort(arrarListV2);

        System.out.print("Selection Sorted Array: ");
        for(int numbers: sortedArrayV2) {
            System.out.print(numbers + " ");
        }
    }

    private static int[] selectionSort(int[] arrarList) {
        int size = arrarList.length;

        for(int i=0; i<size; i++) {
            int highestNum = 0;
            int swapIndex = 0;
            for(int j=0; j<size-i-1; j++) {
                
                if(highestNum < arrarList[j]) {
                    highestNum = arrarList[j];
                    swapIndex = j;
                }

                arrarList[swapIndex] = arrarList[size-i-1];
                arrarList[size-i - 1] = highestNum;
            }
            
                System.out.println("-----" + arrarList[size-1] + " " + i);
        }
        return arrarList;
    }
    

    private static int[] bubbleSort(int[] arrarList) {
        int size = arrarList.length;

        for(int i=0; i<size; i++) {
            for(int j=0; j<size-i-1; j++) {
                int currNumber = arrarList[j];
                if(arrarList[j] > arrarList[j+1]) {
                    arrarList[j] = arrarList[j+1];
                    arrarList[j+1] = currNumber;
                }
            }
        }


        return arrarList;
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while(left <= right ) {
            steps++;
            int mid = left + right;

            if(nums[mid] == target) {
                System.out.println("Binary Steps Total: " + steps);
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Binary Steps Total: " + steps);
        return -1;
    }

    private static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i=0; i < nums.length; i++) {
            steps++;
            if(target == nums[i]) {
                System.out.println("Linear Steps Total: : " + steps);
                return i;
            }
        }
        System.out.println("Linear Steps Total: " + steps);
        return -1;
    }
}
