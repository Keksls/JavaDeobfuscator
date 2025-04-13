/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from EP
 */
public final class ep_1 {
    private ep_1() {
    }

    public static void a(fb_1 fb_12, gh_0 gh_02) {
        try {
            gh_02.a(fb_12.b().a());
            gh_02.a((byte)0);
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + fb_12.b(), iOException);
        }
    }
}

