import java.util.*;
class ArrayLists {
public static void main (String args[]){
//create an array listed object
ArrayList<String> a1 = new ArrayList<String>();
System.out.println("Initial size of al: " + a1.size());
//add elements to the array list
a1.add("a");
a1.add("b");
a1.add("c");
a1.add("d");
a1.add("e");
a1.add("f");
a1.add(1,"a2");
System.out.println("Size of a1 after additions: " +
a1.size());
//display the array list contents
System.out.println("contents of a1:" + a1);
//the indexed get and set methods
String str = a1.get(2);
a1.set(2,str+"updated");
System.out.println("contents of a1 after updation:" + a1);
//remove elements from the array list
a1.remove("d");
a1.remove(2);
System.out.println("size of a1 after deletions:" + a1.size());
System.out.println("contents of a1:" + a1);
}
}

