/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bST
 */
class bst_0
implements Runnable {
    private final int e;
    private int f;
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bSO d;

    bst_0(bSO bSO2, boolean bl, boolean bl2, boolean bl3) {
        this.d = bSO2;
        this.a = bl;
        this.b = bl2;
        this.c = bl3;
        this.e = this.a && this.b ? 2 : 1;
        this.f = 0;
    }

    @Override
    public void run() {
        if (!this.c) {
            return;
        }
        ++this.f;
        if (this.f == this.e) {
            this.d.p();
        }
    }
}

