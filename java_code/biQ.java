/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

final class biQ
implements ahr_1 {
    private bwh_0 a;

    biQ() {
    }

    public void a(bwh_0 bwh_02) {
        this.a = bwh_02;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12 instanceof adh_2) {
            this.c();
            return false;
        }
        return true;
    }

    private void c() {
        if (this.a == null) {
            return;
        }
        Collection collection = this.a.j();
        for (blx_1 blx_12 : collection) {
            blx_12.bv().c(blx_12.Y());
        }
    }

    void a() {
        adi_2.a().a(this);
        if (this.a == null) {
            return;
        }
        bvx_2 bvx_22 = azu_0.j().k().cP();
        if (bvx_22 != null && this.a.c() == bvx_22.c()) {
            return;
        }
        Collection collection = this.a.j();
        for (blx_1 blx_12 : collection) {
            blx_12.bv().ce();
        }
    }

    @Override
    public long a_() {
        return 176L;
    }

    @Override
    public void a(long l) {
    }
}

