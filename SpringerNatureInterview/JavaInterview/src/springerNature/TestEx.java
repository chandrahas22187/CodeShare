package springerNature;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Chandrahas
 */
public class TestEx {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        /*long startTime = System.nanoTime();
        System.out.println("Start time  " +startTime);
        long endTime = System.nanoTime() - startTime;
        Date date = new Date();
        date.getTime()
        System.out.println(endTime);
        System.out.println(endTime-startTime);
         if (System.currentTimeMillis() >= endTime){
         list.remove(1);
        }
        System.out.println(endTime);
        System.out.println(list.toString());*/

        usingDate();

    }

    public static  void usingDate(){
        System.out.println(new Date().getTime());
        long timeStart  = new Date().getTime();
        int endtime = new Date().getMinutes();
        System.out.println("End time "+ endtime);
        List<String> list = Arrays.asList("a", "b", "c");
        if (endtime > 36){
            list.remove(1);
        }
        System.out.println(list.toString());
    }
}
