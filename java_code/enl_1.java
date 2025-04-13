/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eNl
 */
class enl_1
implements Comparator<ekl_0> {
    enl_1() {
    }

    public int a(ekl_0 ekl_02, ekl_0 ekl_03) {
        aff_1 aff_12 = ekl_02.P_();
        aff_1 aff_13 = ekl_03.P_();
        return aff_12.d() - aff_13.d() + (aff_12.e() - aff_13.e());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ekl_0)object, (ekl_0)object2);
    }
}

