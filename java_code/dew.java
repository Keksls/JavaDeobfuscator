/*
 * Decompiled with CFR 0.152.
 */
public class dew
implements Runnable {
    private static final int a = 20;
    private static final float b = 250.0f;
    private final fsQ c;
    private long d;
    private dex e;

    public dew(fsQ fsQ2) {
        this.c = fsQ2;
        this.e = dex.a;
    }

    public void a() {
        ado_1.a().a(this, 20L, -1);
    }

    public void b() {
        ado_1.a().b(this);
    }

    public void a(dex dex2) {
        this.e = dex2;
    }

    @Override
    public void run() {
        if (this.c == null) {
            return;
        }
        long l = System.nanoTime();
        long l2 = (l - this.d) / 1000000L;
        this.d = l;
        if (this.e == dex.a) {
            return;
        }
        float f2 = this.c.getOffset();
        float f3 = (float)l2 / 250.0f;
        float f4 = this.e == dex.b ? f2 - f3 : f2 + f3;
        this.c.setOffset(f4);
    }
}

