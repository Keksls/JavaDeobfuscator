/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjn
 */
public class bjn_0
extends bjg_0 {
    public final String a;

    public bjn_0(efh_0 efh_02, String string) {
        super(efh_02);
        this.a = string;
    }

    private bjn_0(bjn_0 bjn_02) {
        super(bjn_02.c);
        this.a = bjn_02.a;
    }

    public bjn_0 a() {
        return new bjn_0(this);
    }

    @Override
    public void a(biI biI2) {
        if (biI2.k(this.a)) {
            biI2.e(this.a);
            biI2.bJ();
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
        bjn_0 bjn_02 = (bjn_0)object;
        return !(this.a != null ? !this.a.equals(bjn_02.a) : bjn_02.a != null);
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

