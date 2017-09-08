package cn.ac.iie.spidercraw.util;

public class StringUtil {
     public static boolean isEmpty(String str) {
    	 return "".equals(str)||str==null;
     }
     
     public static boolean isEmpty(Object object) {
    	 return object==null||"".equals(object);
     }
     
}
