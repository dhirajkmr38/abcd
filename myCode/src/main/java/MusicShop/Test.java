package MusicShop;

public class Test
{

    public static void main( String args[] )
    {
        Integer a = new Integer(  "1234");

        String a1="1234?><+_)**6726236513778~!!!@@@";

        char b[] = (a.toString()).toCharArray();
        char b1[]={'1','2','3'};

        int i =0;
        int j = b.length-1;

        while(i<j){
             char temp =b[i];
             b[i]=b[j];
             b[j]=temp;
             ++i;
             --j;
        }
        System.out.println(b);
    }


}
