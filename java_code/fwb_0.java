/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fwb
 */
public class fwb_0
implements adv_1 {
    private final fvE a;
    private long b;

    public fwb_0(fvE fvE2, int n) {
        this.a = fvE2;
        this.b = adi_2.a().a(this, n, 0, 1L);
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    public void a() {
        adi_2.a().a(this.b);
        this.b = 0L;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        adh_2 adh_22;
        if (adt_12 instanceof adh_2 && (adh_22 = (adh_2)adt_12).b() == this.b) {
            if (this.a.isElementMapRoot() && this.a.getElementMap() != null) {
                fpm_0.b().o(this.a.getElementMap().c());
            } else {
                this.a.destroySelfFromParent();
            }
        }
        return false;
    }
}

