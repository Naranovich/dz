package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class task8 {

    public static void main(String[] args) {
        System.out.println("print");
        Scanner scan = new Scanner(System.in);
        ArrayList<String> textArr = new ArrayList<>();
        ItemArray itemArr = new task8().new ItemArray();
        do {
            itemArr = parseString(scan.nextLine(), "`");
            if (itemArr.index != -1) {
                if (itemArr.text.equals("print")){
                    boolean isOutOrEmpty = itemArr.index > textArr.size() || textArr.get(itemArr.index).isEmpty();
                    if (isOutOrEmpty) {
                        System.out.println("\"\"");
                    } else {
                        System.out.println(textArr.get(itemArr.index));
                        textArr.set(itemArr.index, "");
                    }
                } else appendArrLst(textArr, itemArr);
            }
        } while (!itemArr.text.equals("exit"));
        scan.close();
    }
    public class ItemArray {
        String text;
        int index;
    }
    public static ItemArray parseString(String str, String sep) {
        String[] arr = str.split(sep);
        ItemArray item = new task8().new ItemArray();
        try {
            item.index = Integer.parseInt(arr[1]);
        } catch (Exception e){
            item.index = -1;
        }
        if (item.index < 0) item.index = -1;
        item.text = arr[0];
        return item;
    }
    public static void appendArrLst(ArrayList<String> arr, ItemArray item) {
        if (item.index >= arr.size()){
            for (int i = arr.size(); i <= item.index; i++) {
                arr.add("");
            }
        }
        arr.set(item.index, item.text);
    }
}