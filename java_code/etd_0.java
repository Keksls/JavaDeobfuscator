/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 */
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from etd
 */
public class etd_0
extends erE {
    public etd_0(ArrayList<aot_2> arrayList) {
        super(arrayList);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        List<Integer> list = this.c(object, object2, object3, object4);
        if (list == null || list.isEmpty()) {
            return -1L;
        }
        return ((Integer)Ordering.natural().max(list)).intValue();
    }

    @Override
    public Enum c() {
        return eyO.gp;
    }
}

