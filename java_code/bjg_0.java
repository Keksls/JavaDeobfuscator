/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjG
 */
public abstract class bjg_0 {
    protected final efh_0 c;

    protected bjg_0(efh_0 efh_02) {
        this.c = efh_02;
    }

    public abstract void a(biI var1);

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bjg_0 bjg_02 = (bjg_0)object;
        return this.c.i() == bjg_02.c.i();
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public abstract <U extends bjg_0> U c();
}

