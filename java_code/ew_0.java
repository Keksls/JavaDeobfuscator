/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from EW
 */
public final class ew_0 {
    private ew_0() {
    }

    public static void a(fi_1 fi_12, gh_0 gh_02) {
        try {
            gh_02.a(fi_12.b().a());
            gh_02.a((byte)1);
            gh_02.a(Long.toString(fi_12.c()));
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + fi_12.b(), iOException);
        }
    }
}

