/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXI
 */
public class exi_2
extends exk_2
implements Comparable<exi_2> {
    public static final String a = "isEnutrofPurseLoot";
    public static final String b = "isPvpLoot";
    private short i;
    private long j;
    private final ezr_0 k;
    private final boolean l;
    private final boolean m;

    public exi_2(ezr_0 ezr_02) {
        super(0L);
        this.b(ezr_02);
        this.k = ezr_02;
        this.l = false;
        this.m = false;
    }

    public exi_2(eZn eZn2) {
        super(eZn2.m());
        this.k = eyo_1.g().d(eZn2.a());
        this.b(this.k);
        this.i = eZn2.l();
        this.j = eZn2.m();
        this.l = eZn2.j();
        this.m = eZn2.k();
    }

    public exi_2(iy_0 iy_02) {
        super(0L);
        this.k = eyo_1.g().d(iy_02.c());
        this.b(this.k);
        this.i = (short)iy_02.e();
        this.j = 0L;
        this.l = iy_02.g();
        this.m = iy_02.i();
    }

    @Override
    public Object b(String string) {
        if (a.equals(string)) {
            return this.o();
        }
        if (b.equals(string)) {
            return this.s();
        }
        return super.b(string);
    }

    @Override
    public short e() {
        return this.i;
    }

    @Override
    public long a() {
        return this.j;
    }

    public boolean o() {
        return this.l;
    }

    public boolean s() {
        return this.m;
    }

    @Override
    public void a(long l) {
        this.j = l;
    }

    @Override
    public void a(short s2) {
        this.i = s2;
        exv_2 exv_22 = d.c();
        if (exv_22 != null) {
            exv_22.a(this);
        }
    }

    public void a(exk_2 exk_22) {
        this.h = exk_22.h;
    }

    @Override
    public exk_2 t() {
        return this.b(0L);
    }

    @Override
    public exk_2 b(long l) {
        exj_2 exj_22 = new exj_2(l, this.k, this);
        exj_22.a(this.l());
        exj_22.f = false;
        exj_22.g = 0;
        return exj_22;
    }

    public int a(exi_2 exi_22) {
        if (exi_22 == null) {
            return -1;
        }
        int n = exw_1.n().compare(this.G(), exi_22.G());
        if (n != 0) {
            return n;
        }
        return Integer.signum(exi_22.c() - this.c());
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((exi_2)object);
    }
}

