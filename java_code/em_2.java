/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;

/*
 * Renamed from Em
 */
public final class em_2 {
    private em_2() {
    }

    public static void a(fe_1 fe_12, byte by, eg_1 eg_12) {
        try {
            int n = (by - 1) / 2;
            String[] stringArray = new String[n];
            String[] stringArray2 = new String[n];
            for (int k = 0; k < n; ++k) {
                stringArray[k] = eg_12.e();
                stringArray2[k] = eg_12.e();
            }
            fe_12.a(stringArray);
            fe_12.b(stringArray2);
            if (by % 2 != 0) {
                fe_12.a(eg_12.e());
            }
        }
        catch (EOFException eOFException) {
            throw new RuntimeException("Unable to load " + fe_12.b(), eOFException);
        }
    }
}

