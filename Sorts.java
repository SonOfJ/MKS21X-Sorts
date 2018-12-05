public class Sorts{
  public static void selectionsort(int[] ary) {
    for(int i = 0; i < ary.length - 1; i = i + 1) { //General loop
      int chosen = ary[i]; //Chosen will change depending on the size of the other elements
      for(int j = i + 1; j < ary.length; j = j + 1) { //This is the loop that will actually be finding the smallest element
        if (ary[j] < chosen) { //If the element is smaller than chosen
          chosen = ary[j]; //Make that element chosen
        }
      }
      ary[i] = chosen; //Put the smallest element at the current index
    }
  }
}
