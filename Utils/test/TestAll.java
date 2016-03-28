import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import utils.MessageBuilderTest;
import utils.StringUtilsTest;

/**
 * Created by summer on 3/25/16.
 */
//在测试单元中增加测试用例
public class TestAll extends TestSuite {
    public static Test suite() {
        TestSuite testSuite = new TestSuite("TestSuite Test");
        testSuite.addTestSuite(MessageBuilderTest.class);
        testSuite.addTestSuite(StringUtilsTest.class);
        //testSuite.addTestSuite(LogUtilsTest.class);
        return testSuite;
    }

//运行测试单元 alt + enter
    public static void main (String args[])
    {
        TestRunner.run(suite());
    }
}