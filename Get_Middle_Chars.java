public class MiddleChars {
    public static String middle (String word) {
        int mid;
        mid = (int) (Math.floor(word.length()/2)+1);
        if (word.length() % 2 != 0)
        {
            return word.substring(mid,mid+1);
        }
        else return word.substring(mid-1,mid+1);
    }

    public static void main(String[] args) {
        System.out.println(MiddleChars.middle("Tamer"));
    }
}
