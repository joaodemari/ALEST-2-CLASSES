import java.util.Arrays;
public class Heapsort {

    public static boolean isHeap(int[] array){
        if(array.length == 0 ) return true;

        int lastPosition = array.length - 1;
        int element = array[lastPosition];
        int father = array[lastPosition/2];
        if(father >= element){
            array = Arrays.copyOfRange(array, 0, lastPosition);
            return isHeap(array);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] vetor = {16,15,14,13,12,11,10,9,8,7,6,5};

        System.out.println(isHeap(vetor));
    }
}