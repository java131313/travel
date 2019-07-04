package com.it;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Delete1 {
    public static void main(String[] args) {
        String a = "xxbbacaegge";
     //   String pattern="(\\w)\\1{1,}";
        //System.out.println(delete(a));
        System.out.println(removeDuplicates(a));
    }
    public static String delete(String a ){
        System.out.println(a);
        String r = "(\\w)\\1{1,}";
        Pattern pattern = Pattern.compile(r);
        Matcher matcher = pattern.matcher(a);
        if(matcher.find()){

            return delete(a.replaceFirst(r, ""));
        }
        return a;
    }
    public static  String removeDuplicates(String S) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(a.length()==0){
                a.append(S.charAt(i));
            }else if(a.charAt(a.length()-1)==S.charAt(i)){
                a.delete(a.length()-1,a.length());
            }else{
                a.append(S.charAt(i));
            }
        }
        return  a.toString();
    }

    public String removeDuplicates1(String S) {

        int now =S.length();
        int next = 1;
        while(now != next){
            now =  S.length();

            S=S.replace("aa","").replace("bb","").replace("cc","").replace("dd","").replace("ee","").replace("ff","").replace("gg","").replace("hh","").replace("ii","").replace("jj","").replace("kk","").replace("ll","").replace("mm","").replace("nn","").replace("oo","").replace("pp","").replace("qq","").replace("rr","").replace("ss","").replace("tt","").replace("uu","").replace("vv","").replace("ww","").replace("xx","").replace("yy","").replace("zz","");

            next =  S.length();

        }


        return S;
    }
}
