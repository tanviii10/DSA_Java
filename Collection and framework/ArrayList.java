import java.util.*;
class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();

        //add ele
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get ele
        int element=list.get(0);
        System.out.println(element);

        //add ele in between
        list.add(1, 9);
        System.out.println(list);

        //set ele
        list.set(0, 8);
        System.out.println(list);

        //delete ele
        list.remove(3);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }

}