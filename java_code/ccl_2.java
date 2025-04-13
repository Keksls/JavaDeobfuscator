/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccL
 */
public class ccl_2 {
    private float a;
    private short[] b;
    private final aet_0 c = new aet_0();

    public void a(arf_1 arf_12) {
        this.c.a(arf_12);
        this.a = arf_12.d();
        this.b = arf_12.b(4);
    }

    public float a() {
        return this.a;
    }

    short a(ccm_2 ccm_22) {
        return this.b[ccm_22.ordinal()];
    }

    public afo[] b() {
        afo[] afoArray = this.c.e();
        return afoArray == null ? cdi_1.p : afoArray;
    }

    public afs[] c() {
        afs[] afsArray = this.c.f();
        return afsArray == null ? cdi_1.q : afsArray;
    }

    public aeu_0[] d() {
        aeu_0[] aeu_0Array = this.c.i();
        return aeu_0Array == null ? cdi_1.o : aeu_0Array;
    }
}

