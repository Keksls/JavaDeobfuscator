/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from EV
 */
public final class ev_0 {
    private ev_0() {
    }

    public static void a(fh_1 fh_12, gh_0 gh_02) {
        try {
            gh_02.a(fh_12.b().a());
            gh_02.a((byte)0);
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + fh_12.b(), iOException);
        }
    }
}

