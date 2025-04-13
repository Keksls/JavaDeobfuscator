/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bmv
 */
final class bmv_2
extends eqk_2 {
    private final oy_1 b;
    final /* synthetic */ bmr_1 a;

    bmv_2(bmr_1 bmr_12, oy_1 oy_12) {
        this.a = bmr_12;
        this.b = oy_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
        List<ezo_1> list = null;
        if (this.a.dN == null) {
            this.a.dN = new ezm_1();
        } else {
            list = this.a.dN.i();
            this.a.dN.j();
        }
        if (this.a.dN.g() == 0) {
            ezj_1 ezj_12 = ezj_1.a();
            this.a.dN.a(ezj_12);
            this.a.dN.b(0);
        } else {
            bmr_1.ed().error((Object)"Part for active equipment sheet received from world, but BuildSheetSet is not empty.");
        }
        if (list != null) {
            for (ezo_1 ezo_12 : list) {
                this.a.dN.a(ezo_12);
            }
        }
    }
}

