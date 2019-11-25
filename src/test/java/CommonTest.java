import common.ReverseString;
import org.junit.Assert;
import org.junit.Test;

public class CommonTest {


    @Test
    public void testReverseString(){
        ReverseString string = new ReverseString();
        String testString = "soonam";
        /*char []arr = {'h','e','l','l','o'};
        String actualReturn = string.reverseString(arr);
        Assert.assertEquals("manoos",actualReturn);*/

        String actualReturn = string.oldMethod(testString);
        System.out.printf("actualReturn : "  + actualReturn);
        Assert.assertEquals("manoos",actualReturn);
    }

}
