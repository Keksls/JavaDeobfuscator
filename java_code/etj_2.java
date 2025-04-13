/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eTJ
 */
class etj_2
implements Comparator<etn_2> {
    etj_2() {
    }

    public int a(etn_2 etn_22, etn_2 etn_23) {
        afe_1 afe_12 = fkk_0.a((int)etn_22.b());
        afe_1 afe_13 = fkk_0.a((int)etn_23.b());
        if (afe_12.a() == 0) {
            return 1;
        }
        if (afe_13.a() == 0) {
            return -1;
        }
        if (afe_12.b() == afe_13.b()) {
            return afe_12.a() - afe_13.a();
        }
        return afe_12.b() - afe_13.b();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((etn_2)object, (etn_2)object2);
    }
}

