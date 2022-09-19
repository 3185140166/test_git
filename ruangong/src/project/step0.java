package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class step0 {
    static String a = new String();
    static String b[] = new String[100000];
    static String c[] = new String[10000000];
    static int n = 0;
    static int d[] = new int[10000000];

    public static void main(String[] args) {
        try {
            String pathname = "D:\\article.TXT";
            File filename = new File(pathname);
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); //
            BufferedReader br = new BufferedReader(reader); //
            String line = "";
            int i = 0;
            for (i = 0; i <= 52; i++) {
                d[i] = 0;


            }
            line = br.readLine();

            while (line != null) {
                a = line;

                zimu(a);
                line = br.readLine();

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        sort();
    }

    public static void sort() {
        char q = 'A';
        char p = 'a';
        int sum = 0;
        for (int i = 1; i <= 52; i++) {

            sum = d[i] + sum;
        }
        char k = 'A';
        char f[] = new char[53];
        for (int i = 1; i <= 52; i++) {
            if (i == 27) {
                k = 'a';
                f[i] = k;

            }
            f[i] = k;

            k++;

        }
        int n = 0;
        k = 'a';
        for (int i = 1; i <= 52; i++) {
            for (int j = i + 1; j < 52; j++) {
                if (d[i] < d[j]) {
                    n = d[i];
                    d[i] = d[j];
                    d[j] = n;
                    k = f[i];
                    f[i] = f[j];
                    f[j] = k;

                }


            }

        }


        for (int i = 1; i <= 52; i++) {
            System.out.print(f[i] + "概率");
            System.out.printf("%.2f", d[i] * 1.0 / sum * 100);
            System.out.println("%");
        }


    }

    public static void zimu(String a) {
        String b[] = a.split("");
        int i, j;
        int m;
        m = 0;

        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b[i].length(); j++) {
                if ((b[i].charAt(j) >= 65 && b[i].charAt(j) <= 90) || (b[i].charAt(j) >= 97 && b[i].charAt(j) <= 122)) {
                    if ((b[i].charAt(j) >= 65 && b[i].charAt(j) <= 90)) {
                        m = (int) (b[i].charAt(j)) - 64;
                    }
                    if (b[i].charAt(j) >= 97 && b[i].charAt(j) <= 122) {
                        m = (int) (b[i].charAt(j)) - 70;
                    }
                    d[m]++;

                } else {
                    continue;
                }


            }


        }


    }
}
