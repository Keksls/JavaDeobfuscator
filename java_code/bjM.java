/*
 * Decompiled with CFR 0.152.
 */
public class bjM
extends bjg_0 {
    public bjM(efh_0 efh_02) {
        super(efh_02);
    }

    public bjM a() {
        return new bjM(this);
    }

    bjM(bjM bjM2) {
        super(bjM2.c);
    }

    @Override
    public void a(biI biI2) {
        this.a(biI2, true);
    }

    public void a(biI biI2, boolean bl) {
        biI2.v(true);
        if (bl) {
            biI2.bI().aQ();
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
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public /* synthetic */ bjg_0 c() {
        return this.a();
    }
}

