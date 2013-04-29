
public class PrintArray {
    @SuppressWarnings("I18n") // the I18n checker correctly issues an error below, but we would like to keep this test in all-systems.
    public static final void print(java.io.PrintStream ps, Object[][] a) {
        if (a == null) {
            ps.println("null");
            return;
        }
        // When analyzing this call, we see an exception about taking the LUB
        // of ATMs with different numbers of qualifiers.
        ps.print('7');
    }
}
