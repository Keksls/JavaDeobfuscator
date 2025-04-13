/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;

/*
 * Renamed from El
 */
public final class el_1 {
    private el_1() {
    }

    public static void a(fd_1 fd_12, byte by, eg_1 eg_12) {
        try {
            fd_12.a(eg_12.e());
            fd_12.b(by == 2 ? (int)eg_12.a() : 100);
        }
        catch (EOFException eOFException) {
            throw new RuntimeException("Unable to load " + fd_12.b(), eOFException);
        }
    }
}

