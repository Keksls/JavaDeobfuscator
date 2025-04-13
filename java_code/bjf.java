/*
 * Decompiled with CFR 0.152.
 */
public class bjf
extends bjg_0 {
    public final String a;
    private final String b;
    biE d;
    bMb e;

    public bjf(efh_0 efh_02, String string, String string2) {
        super(efh_02);
        this.a = string;
        this.b = string2;
        this.d = null;
        this.e = null;
    }

    private bjf(bjf bjf2) {
        super(bjf2.c);
        this.a = bjf2.a;
        this.b = bjf2.b;
        this.d = null;
        this.e = null;
    }

    @Override
    public void a(biI biI2) {
        if (biI2.bI() != azu_0.j().k()) {
            return;
        }
        if (biI2.bI().ak() && biI2.bI().bz().e() != elp_0.e) {
            return;
        }
        bjg bjg2 = new bjg(this, abd_1.c());
        bjg2.m(this.a);
        bjg2.a(aej_2.b);
        bjg2.e("AnimStatique");
        bjg2.g(ahi_0.j.a());
        bjg2.a(agm.a());
        bjg2.b((byte)4);
        bjg2.b(biI2.G(), (float)biI2.H(), (float)biI2.I());
        afz_0.d().a(bjg2);
        this.e = new bMb(bjg2, true);
        biI2.a(this.e);
        ((afv)biI2).a(this.e);
        aff_1 aff_12 = bMb.a(biI2.be(), biI2.bf(), biI2.bg());
        bjg2.b(aff_12.d(), (float)aff_12.e(), (float)aff_12.f());
        this.d = bjg2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bjf bjf2 = (bjf)object;
        if (this.b != null ? !this.b.equals(bjf2.b) : bjf2.b != null) {
            return false;
        }
        return !(this.a != null ? !this.a.equals(bjf2.a) : bjf2.a != null);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.a != null ? this.a.hashCode() : 0);
        n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
        return n;
    }

    public bjf a() {
        return new bjf(this);
    }

    public biE b() {
        return this.d;
    }

    public /* synthetic */ bjg_0 c() {
        return this.a();
    }
}

