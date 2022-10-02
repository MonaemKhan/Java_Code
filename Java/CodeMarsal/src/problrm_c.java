
import java.util.*;

public class problrm_c {

    public static int pellindrom(String sst) {
        StringBuilder sb = new StringBuilder(sst);
        String str = sb.reverse().toString();
        if (sst.equals(str)) {
            return 1;
        } else {
            return -1;
        }
    }

    public static String charrm(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int t,x=1,test,qurie,start,end,flag,count,index,i;
        String s,st,str;
        char rep;
        
        t = scan.nextInt();
        
        while (t-- > 0) {
            
            s = scan.next();
            test = scan.nextInt();
            System.out.println("case "+x+": ");
            while (test-- > 0) {
                qurie = scan.nextInt();

                if (qurie == 1) {
                    start = scan.nextInt();
                    end = scan.nextInt();

                    str = s.substring(start - 1, end);
                    //System.out.println(str);

                    flag = 0;
                    count = 0;

                    flag = pellindrom(str);

                    if (flag == 1) {
                        System.out.println("0");
                    } else {
                        for (i = 0; i < str.length() - 1; i++) {
                            flag = pellindrom(charrm(str, i));
                            if (flag == 1) {
                                //System.out.println(i);
                                count = i + 1;
                                break;
                            }
                        }
                        if (count == 0) {
                            System.out.println("-1");
                        } else {
                            System.out.println(count);
                        }
                    }

                } else {
                    index = scan.nextInt();
                    rep = scan.next().charAt(0);
                    st = "";
                    for (i = 0; i < s.length(); i++) {
                        if (i == index - 1) {
                            st += rep;
                        } else {
                            st += s.charAt(i);
                        }
                    }
                    s = st;
                }

            }
            x++;
        }

    }

}
