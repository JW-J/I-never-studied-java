package Section6;

public class Question6_3_0 {
    public static void main(String[] args) {
        System.out.println("4의 재귀 : " + fast(4));   // 4 * 3 * 2 * 1
    }
    public static int fast(int num){
        if(num == 1)
            return 1;
        else
            return num * fast(num-1);
    }
}//
