import java.util.*;
import java.io.*;
import java.util.Map.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> setOne = new HashSet<>();
        HashSet<String> setTwo = new HashSet<>();

        //* 인풋
        String[] nums = br.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        for (int i = 0; i < n; i++) {
            setOne.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            setTwo.add(br.readLine());
        }

        //* 시스템
        setOne.retainAll(setTwo);
        int len = setOne.size();
        String[] strs = new String[len];
        int i = 0;
        for (String str : setOne) {
            strs[i++] = str;
        }
        Arrays.sort(strs);

        //* 아웃풋
        bw.write(len + "\n");
        for (String str : strs) {
            bw.write(str + "\n");
        }

        //* 마무리
        bw.flush();
        br.close();
    }
}
