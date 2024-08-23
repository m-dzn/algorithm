import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String[] int_arr = br.readLine().split(" ");
            String[] int_targt = br.readLine().split(" ");
            StringJoiner sj = new StringJoiner(" ");
            
            for(int i = 0; i < Integer.parseInt(int_arr[0]); i++){
                if(Integer.parseInt(int_arr[1]) > Integer.parseInt(int_targt[i])){
                    sj.add(int_targt[i]);
                }
            }
            
            System.out.print(sj);
            
        } catch (NumberFormatException e){
            
        }
    }
}