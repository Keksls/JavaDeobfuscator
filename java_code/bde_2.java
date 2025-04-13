/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdE
 */
class bde_2
implements asb_2<aQH> {
    bde_2() {
    }

    public void a(aQH aQH2) {
        int n = aQH2.c();
        int n2 = aQH2.d();
        fhc_0 fhc_02 = new fhc_0(n, n2);
        bde_2.a(fhc_02, aQH2.e());
        bde_2.a(fhc_02, aQH2.f());
        fhd_0.a.a(fhc_02);
    }

    private static void a(fhc_0 fhc_02, aqj_0 ... aqj_0Array) {
        for (aqj_0 aqj_02 : aqj_0Array) {
            fhi fhi2 = fhi.a(aqj_02.b());
            fhc_02.a(fhi2);
        }
    }

    private static void a(fhc_0 fhc_02, aqi_0 ... aqi_0Array) {
        for (aqi_0 aqi_02 : aqi_0Array) {
            int n = aqi_02.c();
            fho fho2 = fho.a(aqi_02.b());
            int n2 = aqi_02.d();
            int n3 = aqi_02.e();
            int n4 = aqi_02.f();
            int n5 = aqi_02.g();
            fhh fhh2 = new fhh(fho2, n, n2, n3, n4, n5);
            fhc_02.a(fhh2);
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aQH)asu_22);
    }
}

