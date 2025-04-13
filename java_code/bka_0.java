/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bka
 */
public class bka_0
extends bjg_0 {
    public final biX a;

    public bka_0(efh_0 efh_02, String string, boolean bl) {
        super(efh_02);
        this.a = new biX(string, bl);
    }

    public bka_0 a() {
        return new bka_0(this);
    }

    private bka_0(bka_0 bka_02) {
        super(bka_02.c);
        this.a = bka_02.a;
    }

    @Override
    public void a(biI biI2) {
        biI2.a(this.a);
        this.a.a(biI2.bI());
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
        bka_0 bka_02 = (bka_0)object;
        return this.a.a(bka_02.a);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.a.hashCode();
        return n;
    }

    public /* synthetic */ bjg_0 c() {
        return this.a();
    }
}

