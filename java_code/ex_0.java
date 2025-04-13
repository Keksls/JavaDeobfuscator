/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from EX
 */
public final class ex_0 {
    private ex_0() {
    }

    public static void a(fj_1 fj_12, gh_0 gh_02) {
        try {
            gh_02.a(fj_12.b().a());
            gh_02.a((byte)1);
            gh_02.a(fj_12.c());
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + fj_12.b(), iOException);
        }
    }
}

