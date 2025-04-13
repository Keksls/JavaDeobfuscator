/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eyi
 */
public class eyi_0
extends esf {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public eyi_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 instanceof Su && ((Su)object2).a(eoz_1.t)) {
            return 0;
        }
        return 1;
    }

    @Override
    public Enum c() {
        return eyO.am;
    }
}

