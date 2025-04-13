/*
 * Decompiled with CFR 0.152.
 */
public class bju
extends bjg_0 {
    public final String a;

    public bju(efh_0 efh_02, String string) {
        super(efh_02);
        this.a = string;
    }

    private bju(bju bju2) {
        super(bju2.c);
        this.a = bju2.a;
    }

    public bju a() {
        return new bju(this);
    }

    @Override
    public void a(biI biI2) {
        if (biI2.an() == null) {
            bjs_0.d.error((Object)("Impossible d'appliquer le changement d'anim statique " + this.a));
            return;
        }
        biI2.a(new bjv_0(this, biI2));
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
        bju bju2 = (bju)object;
        return !(this.a != null ? !this.a.equals(bju2.a) : bju2.a != null);
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

