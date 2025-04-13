/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bys
 */
class bys_2
implements Comparator<byj_2> {
    final /* synthetic */ byp_2 a;

    bys_2(byp_2 byp_22) {
        this.a = byp_22;
    }

    public int a(byj_2 byj_22, byj_2 byj_23) {
        return byj_22.i().d() - byj_23.i().d();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byj_2)object, (byj_2)object2);
    }
}

