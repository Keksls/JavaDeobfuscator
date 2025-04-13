/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from ET
 */
public final class et_1 {
    private static final String a = "#optimized";

    private et_1() {
    }

    public static void a(ff_1 ff_12, gh_0 gh_02) {
        try {
            gh_02.a(ff_12.b().a());
            String[] stringArray = ff_12.c();
            byte[] byArray = ff_12.d();
            if (stringArray == null) {
                gh_02.a((byte)0);
                return;
            }
            gh_02.a((byte)(2 * stringArray.length + 1));
            gh_02.a(a);
            for (String string : stringArray) {
                gh_02.a(string);
            }
            for (byte by : byArray) {
                gh_02.a(by);
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + ff_12.b(), iOException);
        }
    }
}

