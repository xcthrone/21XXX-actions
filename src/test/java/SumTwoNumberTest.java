import org.junit.Assert;
import org.junit.Test;

/**
 * @author :xc-throne
 * @date : 2023/11/23
 * @description: 单元测试
 */


public class SumTwoNumberTest {

    @Test
    public void testTwoSum(){
        SumTwoNumber sumTwoNumber = new SumTwoNumber();
        int[] nums1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        Assert.assertArrayEquals(new int[]{2,1},sumTwoNumber.twoSum(nums1,target1));
    }

}
