/*
 * Decompiled with CFR 0.152.
 */
class cXa
implements Runnable {
    private final int b;
    private final boolean c;
    final /* synthetic */ cww_0 a;

    cXa(cww_0 cww_02, int n, boolean bl) {
        this.a = cww_02;
        this.b = n;
        this.c = bl;
    }

    @Override
    public void run() {
        this.a.a(this.c, this.b);
        if (this.c) {
            cww_0.j.put(this.b, null);
        } else {
            cww_0.k.put(this.b, null);
        }
    }
}

