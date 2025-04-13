/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayf
 */
class ayf_1
implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ aye_2 c;

    ayf_1(aye_2 aye_22, int n, int n2) {
        this.c = aye_22;
        this.a = n;
        this.b = n2;
    }

    @Override
    public void run() {
        this.c.c.setSize(this.a, this.b);
        this.c.b.pack();
    }
}

