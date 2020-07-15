package learningArray;

public class UseArray1 {

    public static void main(String[] args) {
 //Array is a fixed size
        int [] list = new int[10];  //learn the role how to write array, list is the array name

        list [0] = 4; //list is the name of the array
        list [1] = 18;
        
        
        
        
        list [6] = 56;
        list [7] = 57;
        list [8] = 58;
        list [9] = 59;
        
        System.out.println(list[0]);
        System.out.println(list[6]);
        System.out.println(list[1]);
        System.out.println(list[5]);
        System.out.println(list.length);
        System.out.println(list[list.length-1]);
    }
}
