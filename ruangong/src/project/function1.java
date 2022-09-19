package project;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class function1 {
    static int num=0,a=0;
    static String word[]=new String[1000000];
    static int wordnum[]=new int[1000000];
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try{
            String path = "D:\\article.TXT";
            File file = new File(path);
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
            BufferedReader br = new BufferedReader(new FileReader(file));
            File file2 = new File("wenijan.txt");
            file2.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(file2));
            String s="";
            s=br.readLine();
            while(s!=null) {
                s=s.toLowerCase();// 大写转小写
                StringTokenizer st = new StringTokenizer(s," .,?;!:“”‘: ");
                while(st.hasMoreElements()) {
                    String str =(String)st.nextElement();
                    for(int j=0;j<num;j++) {
                        if(str.equals(word[j])) {
                            wordnum[j]++;
                        }else a++;
                    }
                    if(a==num) {
                        word[num]=str;
                        wordnum[num]++;
                        num++;
                    }
                    a=0;
                }
                s=br.readLine();
            }
            for(int i=0;i<num;i++) {
                for(int j=i+1;j<num;j++) {
                    if(wordnum[j]>wordnum[i]) {
                        int temp=wordnum[i];
                        wordnum[i]=wordnum[j];
                        wordnum[j]=temp;
                        String Temp=word[i];
                        word[i]=word[j];
                        word[j]=Temp;
                    }
                }
            }
            int m=scanner.nextInt();
            for(int i=0;i<num;i++) {
                System.out.println(word[i]+" "+wordnum[i]);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
