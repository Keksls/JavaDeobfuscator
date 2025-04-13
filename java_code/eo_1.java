/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from EO
 */
public final class eo_1 {
    private eo_1() {
    }

    public static void a(fa_1 fa_12, gh_0 gh_02) {
        try {
            gh_02.a(fa_12.b().a());
            int n = 1;
            if (fa_12.d() != 0 || fa_12.e() != 0 || fa_12.f() != 0) {
                n = 4;
            }
            gh_02.a((byte)n);
            gh_02.a(fa_12.c());
            if (n == 4) {
                gh_02.a(fa_12.d());
                gh_02.a(fa_12.e());
                gh_02.a(fa_12.f());
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + fa_12.b(), iOException);
        }
    }
}

