/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;

/*
 * Renamed from Eq
 */
public final class eq_2 {
    private eq_2() {
    }

    public static void a(fi_1 fi_12, eg_1 eg_12) {
        try {
            fi_12.a(Long.parseLong(eg_12.e()));
        }
        catch (EOFException eOFException) {
            throw new RuntimeException("Unable to load " + fi_12.b(), eOFException);
        }
    }
}

