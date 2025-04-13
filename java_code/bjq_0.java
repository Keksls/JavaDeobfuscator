/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjQ
 */
public class bjq_0
extends bjg_0 {
    public final String a;
    public final String b;
    public biE d;

    public bjq_0(efh_0 efh_02, String string, String string2) {
        super(efh_02);
        this.a = string;
        this.b = string2;
        this.d = null;
    }

    private bjq_0(bjq_0 bjq_02) {
        super(bjq_02.c);
        this.a = bjq_02.a;
        this.b = bjq_02.b;
        this.d = null;
    }

    private static aej_2 a(String string) {
        if (string == null) {
            return null;
        }
        if (string.charAt(1) == '_') {
            try {
                int n = Integer.parseInt("" + string.charAt(0));
                return aej_2.a(n);
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        return null;
    }

    @Override
    public void a(biI biI2) {
        boolean bl;
        boolean bl2;
        bjr_0 bjr_02 = new bjr_0(this, abd_1.c());
        bjr_02.m(this.a);
        aej_2 aej_22 = bjq_0.a(this.b);
        boolean bl3 = bl2 = aej_22 == null;
        if (bl2) {
            bjr_02.a(biI2.aC());
        } else {
            bjr_02.a(aej_22);
        }
        bjr_02.e("AnimStatique");
        bjr_02.g(ahi_0.j.a());
        bjr_02.a(agk.a());
        bjr_02.b(biI2.G(), (float)biI2.H(), (float)biI2.I());
        afz_0.d().a(bjr_02);
        boolean bl4 = bl = this.b == null;
        if (!bl) {
            bjr_02.e(bl2 ? this.b : this.b.substring(2));
        }
        biI2.a(bjr_02, bl, bl, bl2);
        this.d = bjr_02;
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
        bjq_0 bjq_02 = (bjq_0)object;
        if (this.b != null ? !this.b.equals(bjq_02.b) : bjq_02.b != null) {
            return false;
        }
        return !(this.a != null ? !this.a.equals(bjq_02.a) : bjq_02.a != null);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.a != null ? this.a.hashCode() : 0);
        n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
        return n;
    }

    public bjq_0 a() {
        return new bjq_0(this);
    }

    public /* synthetic */ bjg_0 c() {
        return this.a();
    }
}

