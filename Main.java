import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(addNums(1, 2));


    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    System.out.println(addNumsArrayRecurs(myNumbers));
    
  }

  static int addNums(int a, int b){
    return a + b;
  }

  static int addNumsArrayRecurs(ArrayList<Integer>arr){
    if(arr.size()==0){
      return 0;
    }
    int lastItem = arr.get(arr.size()-1);
    arr.remove(arr.size()-1);
    return lastItem + addNumsArrayRecurs(arr);
  }
}