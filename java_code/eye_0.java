/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eyE
 */
public class eye_0
extends esi_0 {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public eye_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    public eye_0() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22;
        if (object == null) {
            if (!(object3 instanceof eyc_0)) throw new aob_1("on cherche l'\u00e9quipement d'un user null");
            epq_22 = ((eyc_0)object3).b();
        } else {
            if (!(object instanceof epq_2)) {
                throw new aob_1("on cherche l'\u00e9quipement d'autre chose qu'un character");
            }
            epq_22 = (epq_2)object;
        }
        exh_1 exh_12 = epq_22.dS();
        TLongObjectIterator<exg_2> tLongObjectIterator = exh_12.i();
        long l = 0L;
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            l += (long)(exg_22.h() - exg_22.i());
        }
        return l;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.m;
    }
}

