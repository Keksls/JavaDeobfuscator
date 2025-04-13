/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbA
 */
class bba_0
implements abb_0 {
    private final biI b;
    private final blx_1 c;
    final /* synthetic */ bbx_0 a;

    public bba_0(bbx_0 bbx_02, biI biI2, blx_1 blx_12) {
        this.a = bbx_02;
        this.b = biI2;
        this.c = blx_12;
    }

    @Override
    public void animationEnded(abu abu2) {
        int[] nArray = this.a.h.d();
        int n = this.a.h.a();
        aff_1 aff_12 = new aff_1(nArray);
        if (n <= 1) {
            this.c.a(this.c.P_().c(aff_12));
        } else {
            this.c.a(new aff_1(this.a.h.a(n - 2)).c(aff_12));
        }
        this.c.a(aff_12);
        this.b.b((float)nArray[0], (float)nArray[1], (float)nArray[2]);
        this.a.a(this.b, this.c);
        this.b.e("AnimCourseTp02-Fin");
        this.b.b(this);
    }
}

