/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bek
 */
class bek_2
implements asb_2<aRE> {
    final /* synthetic */ bej_1 a;

    bek_2(bej_1 bej_12) {
        this.a = bej_12;
    }

    public void a(aRE aRE2) {
        int n = aRE2.c();
        short s2 = aRE2.d();
        short s3 = aRE2.e();
        int[] nArray = aRE2.f();
        eoq_1 eoq_12 = new eoq_1(n, s2, s3);
        for (int n2 : nArray) {
            eok_1 eok_12 = eop_1.a.b(n2);
            if (eok_12 == null) continue;
            eoq_12.a(eok_12);
        }
        eop_1.a.a(eoq_12);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aRE)asu_22);
    }
}

