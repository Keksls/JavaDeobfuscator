/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDD
 */
public final class cdd_0
implements Runnable {
    private final long b;
    private final boolean c;
    final /* synthetic */ cdw_0 a;

    public cdd_0(cdw_0 cdw_02, long l, boolean bl) {
        this.a = cdw_02;
        this.b = l;
        this.c = bl;
    }

    @Override
    public void run() {
        this.a.a(this.b, this.c);
    }
}

