/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from EK
 */
public final class ek_1 {
    private ek_1() {
    }

    public static void a(ge_1 ge_12, String string, eg_1 eg_12) {
        try {
            short s2 = eg_12.b();
            if (s2 != 1) {
                return;
            }
            ge_12.a(eg_12.e());
            ge_12.a(eg_12.c());
            ge_12.a(Hw.c(string.hashCode(), ge_12.d()));
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to load texture from " + string, iOException);
        }
    }
}

