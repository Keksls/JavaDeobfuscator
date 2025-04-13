/*
 * Decompiled with CFR 0.152.
 */
public class bjK
extends bjg_0 {
    private final short a;

    public bjK(efh_0 efh_02, short s2) {
        super(efh_02);
        this.a = s2;
    }

    public bjK(bjK bjK2) {
        super(bjK2.c);
        this.a = bjK2.a;
    }

    @Override
    public void a(biI biI2) {
        biI2.d(this.a);
    }

    public float a() {
        return this.a;
    }

    public bjK b() {
        return new bjK(this);
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
        bjK bjK2 = (bjK)object;
        return bjK2.a == this.a;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.a;
        return n;
    }

    public /* synthetic */ bjg_0 c() {
        return this.b();
    }
}

