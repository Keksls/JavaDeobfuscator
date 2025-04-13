/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from deR
 */
class der_0
implements fzp_0 {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ deq_0 c;

    der_0(deq_0 deq_02, long l, long l2) {
        this.c = deq_02;
        this.a = l;
        this.b = l2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 2) {
            byp_2.a().a(this.a, this.b);
        } else {
            fis_1.a().a((ajf_1)byp_2.a().d(this.a), "rank");
        }
    }
}

