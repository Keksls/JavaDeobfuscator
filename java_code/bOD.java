/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bOD
implements Comparator<bpl_0> {
    bOD() {
    }

    public int a(bpl_0 bpl_02, bpl_0 bpl_03) {
        byte by;
        efa_0 efa_02 = bpl_02.v();
        efa_0 efa_03 = bpl_03.v();
        byte by2 = efa_02.a();
        if (by2 != (by = efa_03.a())) {
            return by2 < by ? -1 : 1;
        }
        return bpl_02.c() < bpl_03.c() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bpl_0)object, (bpl_0)object2);
    }
}

