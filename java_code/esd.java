/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class esd
extends esf {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public esd(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        sd_0 sd_02;
        if (object3 instanceof ejh_0 && (sd_02 = ((ejh_0)object3).v()) != null && sd_02.bt_() == efc_0.ct.a()) {
            return 0;
        }
        return 1;
    }

    @Override
    public Enum c() {
        return eyO.al;
    }
}

