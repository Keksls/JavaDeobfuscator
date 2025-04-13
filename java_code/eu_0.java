/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from EU
 */
public final class eu_0 {
    private eu_0() {
    }

    public static void a(fg_1 fg_12, gh_0 gh_02) {
        try {
            gh_02.a(fg_12.b().a());
            gh_02.a((byte)0);
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + fg_12.b(), iOException);
        }
    }
}

