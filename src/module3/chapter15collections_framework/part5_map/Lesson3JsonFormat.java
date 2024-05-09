package module3.chapter15collections_framework.part5_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Lesson3JsonFormat {
    public static void main(String[] args) {
        /*  Jason Format
         *  <String,Object>
         * */
        Map <String,Object> hashMap = new HashMap<>();
        hashMap.put("agentName","Mg Mg");
        hashMap.put("agentNo",001);
        System.out.println(hashMap);

    }
}
