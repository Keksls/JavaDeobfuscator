/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from EQ
 */
public final class eq_1 {
    private eq_1() {
    }

    public static void a(fc_1 fc_12, gh_0 gh_02) {
        try {
            gh_02.a(fc_12.b().a());
            gh_02.a((byte)0);
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + fc_12.b(), iOException);
        }
    }
}

