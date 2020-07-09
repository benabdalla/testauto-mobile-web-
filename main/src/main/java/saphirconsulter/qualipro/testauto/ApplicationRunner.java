package saphirconsulter.qualipro.testauto;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        List<String> suites = new ArrayList();
        suites.add("classpath:testng.xml");
        testng.setTestSuites(suites);
        testng.run();
    }
}
