/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjl
 */
public class bjl_0
extends bjg_0 {
    public final String a;
    String b;

    public bjl_0(efh_0 efh_02, String string) {
        super(efh_02);
        this.a = string;
    }

    private bjl_0(bjl_0 bjl_02) {
        super(bjl_02.c);
        this.a = bjl_02.a;
    }

    public bjl_0 a() {
        return new bjl_0(this);
    }

    @Override
    public void a(biI biI2) {
        this.b = biI2.N();
        this.a(biI2, true);
    }

    public void a(biI biI2, boolean bl) {
        blx_1 blx_12 = biI2.bI();
        blx_12.c(Integer.parseInt(this.a));
        blx_12.bv().f((String)null);
        if (bl) {
            blx_12.aQ();
        } else {
            biI2.m(this.a);
        }
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
        bjl_0 bjl_02 = (bjl_0)object;
        return !(this.a != null ? !this.a.equals(bjl_02.a) : bjl_02.a != null);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.a != null ? this.a.hashCode() : 0);
        return n;
    }

    public /* synthetic */ bjg_0 c() {
        return this.a();
    }
}

