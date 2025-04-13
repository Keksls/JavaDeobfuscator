/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from ER
 */
public final class er_1 {
    private er_1() {
    }

    public static void a(fd_1 fd_12, gh_0 gh_02) {
        try {
            gh_02.a(fd_12.b().a());
            int n = fd_12.d() == 0 ? 1 : 2;
            gh_02.a((byte)n);
            gh_02.a(fd_12.c());
            if (n == 2) {
                gh_02.a((byte)fd_12.d());
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + fd_12.b(), iOException);
        }
    }
}

