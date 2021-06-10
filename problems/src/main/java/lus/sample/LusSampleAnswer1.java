package lus.sample;

public class LusSampleAnswer1 {

    public int findLusLength(String a, String b) {
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }
}
