/*
 * Decompiled with CFR 0.152.
 */
public class bKm {
    private Object a;
    private int b = 0;
    private long c = 0L;

    public boolean a(Object object) {
        int n = object.hashCode();
        boolean bl = object != this.a || n != this.b || System.currentTimeMillis() - this.c > 1000L;
        this.a = object;
        this.b = n;
        this.c = System.currentTimeMillis();
        return bl;
    }

    public void a() {
        this.b = 0;
        this.c = 0L;
    }
}

