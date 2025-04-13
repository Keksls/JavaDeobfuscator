/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from ES
 */
public final class es_1 {
    private es_1() {
    }

    public static void a(fe_1 fe_12, gh_0 gh_02) {
        try {
            gh_02.a(fe_12.b().a());
            String[] stringArray = fe_12.c();
            String[] stringArray2 = fe_12.d();
            int n = stringArray.length + stringArray2.length;
            if (fe_12.e() != null) {
                ++n;
            }
            gh_02.a((byte)n);
            for (int k = 0; k < stringArray.length; ++k) {
                gh_02.a(stringArray[k]);
                gh_02.a(stringArray2[k]);
            }
            if (fe_12.e() != null) {
                gh_02.a(fe_12.e());
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + fe_12.b(), iOException);
        }
    }
}

