import java.util.*;
import java.io.*;
import java.util.Map.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        String[] nums = br.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        String input = "";

        //* 시스템
        for (int key = 1; key < n+1; key++) {
            input = br.readLine();
            map.put(key, input);
            map2.put(input, key);

        }

        String target = "";
        for (int i = 0; i < m; i++) {
            target = br.readLine();
            try {
                int key = Integer.parseInt(target);
                bw.write(map.get(key) + "\n");
            } catch (Exception e) {
                bw.write(map2.get(target) + "\n");


//                for (Entry<Integer, String> entry : map.entrySet()) {
//                    if (entry.getValue().equals(target)) {
//                        bw.write(entry.getKey() + "\n");
//                    }
//                }
            }
        }

        //* 아웃풋
        bw.flush();
        br.close();
//        sc.close();
    }
}
