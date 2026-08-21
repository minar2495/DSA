//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort();

        System.out.println();
        System.out.println("----------------------");
        System.out.println("Insertion Sorting");
        System.out.println("----------------------");


        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort();
    }
    //Development Branch Code

}