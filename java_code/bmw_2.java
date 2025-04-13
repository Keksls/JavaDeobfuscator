/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bmW
 */
class bmw_2
implements Comparator<cUb> {
    bmw_2() {
    }

    public int a(cUb cUb2, cUb cUb3) {
        String string = bae.h().a("desc.mru." + cUb2.r(), new Object[0]);
        String string2 = bae.h().a("desc.mru." + cUb3.r(), new Object[0]);
        return string.compareTo(string2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((cUb)object, (cUb)object2);
    }
}

