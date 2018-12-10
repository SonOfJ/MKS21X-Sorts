public class Sorts{
  public static void selectionSort(int[] ary) {
    for(int i = 0; i < ary.length - 1; i = i + 1) { //General loop
      int chosen = ary[i]; //Chosen will change depending on the size of the other elements
      int index = i; //This is going to be the index of the chosen element
      for(int j = i + 1; j < ary.length; j = j + 1) { //This is the loop that will actually be finding the smallest element
        if (ary[j] < chosen) { //If the element is smaller than chosen
          chosen = ary[j]; //Make that element the chosen
          index = j; //Record the index of the chosen element
        }
      }
      ary[index] = ary[i]; //Substitue the chosen element with the old element
      ary[i] = chosen; //Put the smallest element at the current index
    }
  }
  public static void bubbleSort(int[] data) {
    int ginga = data.length; //This will change every time the sort is completed
    for(int i = 0; i < data.length - 1; i = i + 1) { //First loop that runs exactly one less times than the length
      for(int j = 0; j < ginga - 1; j = j + 1) { //The second loop is the one that checks and swaps
        if (data[j] > data[j + 1]) { //If the element is bigger than the one after it
          int element = data[j]; //Store element
          data[j] = data[j + 1]; //Element becomes the one after it
          data[j + 1] = element; //The one after it becomes the element
          ginga = ginga - 1; //We know for the fact that the largest element is at the end now so we don't check the last one
        }
      }
    }
  }
  public static void main(String[] args) {
    int[] ha = new int[parseInt(args[0])]; //Creates a new integer array with the same size as specified by the first argument
    if (args[1] == "selection") { //If the second argument is "selection," use the selection sort
      selectionSort(ha); //Perform the selection sort on the integer array
    }
  }
}
