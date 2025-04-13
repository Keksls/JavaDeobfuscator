/*
 * Decompiled with CFR 0.152.
 */
public class ddC {
    private final String a;
    private final long b;
    private final bly_0 c;
    private final boolean d;

    ddC(String string, boolean bl, long l, bly_0 bly_02) {
        this.a = string;
        this.d = bl;
        this.b = Math.max(0L, l);
        this.c = bly_02;
    }

    ddC(String string, boolean bl, long l) {
        this(string, bl, l, bly_0.a);
    }

    ddC(String string, long l) {
        this(string, l <= 0L, l);
    }

    ddC(String string) {
        this(string, 0L);
    }

    public boolean a() {
        return this.d;
    }

    public long b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public bly_0 d() {
        return this.c;
    }
}

