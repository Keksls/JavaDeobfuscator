/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class etq
extends ety_0 {
    public etq(ArrayList<aot_2> arrayList) {
        super(arrayList);
    }

    @Override
    protected Collection<? extends Su> a(elm_0<?> elm_02, eqq_1 eqq_12) {
        if (elm_02 == null || eqq_12 == null) {
            return Collections.emptyList();
        }
        return elm_02.i(eqq_12.Y());
    }

    @Override
    public Enum c() {
        return eyO.gx;
    }
}

