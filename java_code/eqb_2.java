/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eqB
 */
class eqb_2
implements Comparator<eqy_2> {
    eqb_2() {
    }

    public int a(eqy_2 eqy_22, eqy_2 eqy_23) {
        long l = eqy_23.a() - eqy_22.a();
        if (l > 0L) {
            return 1;
        }
        if (l < 0L) {
            return -1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((eqy_2)object, (eqy_2)object2);
    }
}

