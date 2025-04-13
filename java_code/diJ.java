/*
 * Decompiled with CFR 0.152.
 */
class diJ
implements fzu {
    final /* synthetic */ int[] a;
    final /* synthetic */ ckt_2 b;
    final /* synthetic */ String[] c;
    final /* synthetic */ String d;
    final /* synthetic */ akx_2 e;
    final /* synthetic */ akr_2[] f;
    final /* synthetic */ int g;
    final /* synthetic */ diI h;

    diJ(diI diI2, int[] nArray, ckt_2 ckt_22, String[] stringArray, String string, akx_2 akx_22, akr_2[] akr_2Array, int n) {
        this.h = diI2;
        this.a = nArray;
        this.b = ckt_22;
        this.c = stringArray;
        this.d = string;
        this.e = akx_22;
        this.f = akr_2Array;
        this.g = n;
    }

    @Override
    public boolean run(fzs fzs2) {
        this.a[0] = this.a[0] + 1;
        int n = this.a[0];
        this.b.setBubbleText(this.c[n]);
        if (n == this.c.length - 1) {
            this.b.a(0, (fzu)this, new dik_0(this));
        }
        return false;
    }
}

