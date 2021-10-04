package latihan;



public class Main {

    static LinkedList list = new LinkedList();

    public static void main(String[] args) {


        int [] arr = new int[500];

        list.append(6);
        list.append(7);

        list.insertFirst(9);
        list.insertFirst(10);
        list.insertFirst(134);
        System.out.println(list);


        list.insertAfter(list.getHead().getNextNode(), 3);

        System.out.println(list);

        ListNode a =  list.deleteFisrt();
        System.out.println(list);
        System.out.println(a.getNode());

        ListNode b = list.deleteLast();
        System.out.println(list);
        System.out.println(b.getNode());
        list.deleteLast();
        System.out.println(list);



        // --- FIll Array
        // for(int i = 0 ; i < arr.length ; i++){
        //   arr[i] = randomNumber();
        // }

        // ---Print Array
        // for(int i  : arr) System.out.print(i + " ");

        // ---Call Function
        // findFirstAndLast(arr, 50);


    }
    // ---Random given number Function
    public static int randomNumber(){
        int rand = (int) ( Math.random() * 99 ) + 0;
        return rand;
    }

    // ---Find find first index and last index function
    public static void findFirstAndLast(int arr[], int x){

        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                if(list.isEmpty())
                    list.append(i);
                else
                    list.append(i);
            }
        }
        if(list.isEmpty() == false){
            System.out.println("\nIndex kemnculan pertama  : " +  list.getFirstIndex());
            System.out.println("Index kemnculan Terakhir  : " +  list.getLastIndex());
            System.out.println("semua Kemunculan ada pada index : " + list);

        } else{
            System.out.println("\nTidak ditemukan");
        }

    }


}