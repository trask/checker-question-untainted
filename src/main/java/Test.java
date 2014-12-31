import org.checkerframework.checker.tainting.qual.Untainted;

class Test {
    public void test1(String tainted) {
        StringBuilder sb = new @Untainted StringBuilder();
        sb.append(tainted);
        untainted(sb.toString());
    }
    public void test2(String tainted) {
        StringBuilder sb = new @Untainted StringBuilder();
        untainted(sb.append(tainted).toString());
    }
    public void untainted(@Untainted String s) {}
}
