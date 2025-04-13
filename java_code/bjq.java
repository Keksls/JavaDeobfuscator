/*
 * Decompiled with CFR 0.152.
 */
public class bjq
extends bjg_0 {
    public final String a;

    public bjq(efh_0 efh_02, String string) {
        super(efh_02);
        this.a = string;
    }

    private bjq(bjq bjq2) {
        super(bjq2.c);
        this.a = bjq2.a;
    }

    public bjq a() {
        return new bjq(this);
    }

    @Override
    public void a(biI biI2) {
        if (biI2.an() == null) {
            bjo.d.error((Object)("Impossible d'appliquer le changement d'anim statique " + this.a));
            return;
        }
        biI2.a(new bjr(this, biI2));
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
        bjq bjq2 = (bjq)object;
        return !(this.a != null ? !this.a.equals(bjq2.a) : bjq2.a != null);
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

