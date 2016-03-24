package net.ccmcomputing.leftpad;

public class LeftPad{
   public static String leftpad(String str, int len){
      return leftpad(str, len, null);
   }

   public static String leftpad(String str, int len, String ch){
      int i = -1;

      if(ch == null || ch.isEmpty()) {
         ch = " ";
      }

      len = len - str.length();

      while(++i < len){
         str = ch + str;
      }

      return str;
   }
}
