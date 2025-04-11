public class SortArray {
  public static void main(String[] args){
    int[] numbers = {23, 5, 67, 89, 12};
    sortAscending(numbers);
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }

  public static void sortAscending(int[] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr.length - 1; j++){
        if(arr[j] > arr[j + 1]){
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}

