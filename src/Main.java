
public class Main {
    public static void main(String[] args) {

        int res = 0;
        int left = 0;
        int  right =1;

        String s = "juikopzyxtsrqpedc";
        char[] arr = s.toCharArray();

        for(int i = 0; i<arr.length-1;i++){
            if(arr[i]>arr[right]){
                right++;
            }
            else{
                if(res<right-left){
                    res = right-left;
                }
                left=right;
                right++;
            }
        }
        if(res<right-left){
            res = right-left;
        }

        System.out.println(res);
    }
}