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

public class ewb
extends esf {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ewb(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null) {
            return -1;
        }
        if (object instanceof epq_2) {
            return 0;
        }
        if (object instanceof TLongObjectIterator && ((TLongObjectIterator)object).hasNext()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.aD;
    }
}

