public class ObjetTest {

    private String testUn;
    private Integer testDeux;

    public ObjetTest(String testUn, Integer testDeux) {
        this.testUn = testUn;
        this.testDeux = testDeux;
    }

    public ObjetTest() {
    }

    public String getTestUn() {
        return testUn;
    }

    public void setTestUn(String testUn) {
        this.testUn = testUn;
    }

    public Integer getTestDeux() {
        return testDeux;
    }

    public void setTestDeux(Integer testDeux) {
        this.testDeux = testDeux;
    }

    @Override
    public String toString() {
        return "ObjetTest{" +
                "testUn='" + testUn + '\'' +
                ", testDeux=" + testDeux +
                '}';
    }
}
