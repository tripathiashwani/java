package package2;
import package1.*;
// import package4.Animal;
import package5.Dog;
public class Main {
    // int k=90;
    public static void main(String[] str){
        System.out.println("this is main of package 2");
        // Main temp=new Main();
        child2 temp= new child2();
        System.out.println(temp.k);
        // int k=Animal.val;
        int k=Dog.val_of_Dog;
    }
}
