/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eoP
 */
class eop_0
implements Comparator<fcf> {
    eop_0() {
    }

    public int a(fcf fcf2, fcf fcf3) {
        if (fcf2 == fcf3) {
            return 0;
        }
        if (fcf2.d() && fcf3.d()) {
            return 0;
        }
        if (fcf2.d()) {
            return 1;
        }
        if (fcf3.d()) {
            return -1;
        }
        if (fcf2.c() != fcf3.c()) {
            return fcf3.c() - fcf2.c();
        }
        if (fcf2.l() != fcf3.l()) {
            return fcf3.l() - fcf2.l();
        }
        return fcf2.a() <= fcf3.a() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fcf)object, (fcf)object2);
    }
}

