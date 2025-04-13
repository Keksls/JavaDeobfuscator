/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eEo
 */
class eeo_0
implements Comparator<eEv> {
    eeo_0() {
    }

    public int a(eEv eEv2, eEv eEv3) {
        return -Long.compare(eEv2.g(), eEv3.g());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((eEv)object, (eEv)object2);
    }
}

