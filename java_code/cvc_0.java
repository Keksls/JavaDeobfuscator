/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVC
 */
class cvc_0
implements ftt_0 {
    final /* synthetic */ ftQ a;
    final /* synthetic */ cVA b;

    cvc_0(cVA cVA2, ftQ ftQ2) {
        this.b = cVA2;
        this.a = ftQ2;
    }

    @Override
    public void a() {
        this.b.q();
        this.a.b(this);
        if (this.b.p != null) {
            this.b.p.f(true);
            this.b.p.a(0.0f, 100.0f);
            this.b.p = null;
        }
    }
}

