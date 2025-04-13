/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class etp
extends etx_0 {
    public etp(ArrayList<aot_2> arrayList) {
        super(arrayList);
    }

    protected Collection<? extends epq_2> a(elm_0<?> elm_02, eqq_1 eqq_12) {
        if (elm_02 == null || eqq_12 == null) {
            return Collections.emptyList();
        }
        return elm_02.a(enw_2.b(enw_2.a(enw_2.b(eqq_12.Y())), enw_2.c(), enw_2.a(enw_2.h())));
    }

    @Override
    public Enum c() {
        return eyO.aO;
    }
}

