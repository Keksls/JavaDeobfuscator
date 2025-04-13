/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

/*
 * Renamed from bQt
 */
public final class bqt_1 {
    private static final int b = 7;
    private static final int c = 42;
    private boolean d;
    public static final bqt_1 a = new bqt_1();
    private final Hy e = new Hy(7, TimeUnit.SECONDS);

    private bqt_1() {
    }

    public boolean a() {
        return !this.d || this.e.c() <= 0;
    }

    public boolean b() {
        this.d = this.e.a() > 42;
        return this.d;
    }
}

