/*
 * Decompiled with CFR 0.152.
 */
public class bji
extends bjg_0 {
    public final String a;

    public bji(efh_0 efh_02, String string) {
        super(efh_02);
        this.a = string;
    }

    public bji a() {
        return new bji(this);
    }

    private bji(bji bji2) {
        super(bji2.c);
        this.a = bji2.a;
    }

    @Override
    public void a(biI biI2) {
        biI2.f(this.a);
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
        bji bji2 = (bji)object;
        return !(this.a != null ? !this.a.equals(bji2.a) : bji2.a != null);
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

