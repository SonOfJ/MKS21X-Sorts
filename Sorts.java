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
  public static void main(String[] args) {
    int[] ha = new int[parseInt(args[0])]; //Creates a new integer array with the same size as specified by the first argument
    if (args[1] == "selection") { //If the second argument is "selection," use the selection sort
      selectionSort(ha); //Perform the selection sort on the integer array
    }
  }
}
