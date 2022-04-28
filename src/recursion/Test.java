package recursion;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static int commonTwo(String[] a, String[] b) {
        List<String> aList = new ArrayList<>();
        List<String> bList = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            if(!aList.contains(a[i])) aList.add(a[i]);
        }
        for(int i = 0; i < b.length; i++){
            if(!bList.contains(b[i])) bList.add(b[i]);
        }
        System.out.println(aList);
        System.out.println(bList);
        int count = 0;
        for(int i = 0; i < aList.size();i++){
            for(int j = 0; j < bList.size(); j++){
                if(a[i].equals(b[j])) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(commonTwo(new String[]{"a", "b", "c", "c", "d"}, new String[]{"a", "b", "b", "c", "d", "d"}));

    }

}
