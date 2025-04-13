/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class esZ
extends esi_0 {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public esZ(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (object instanceof aoc_2 && object2 instanceof aoc_2) {
            aoc_2 aoc_22 = (aoc_2)object;
            aoc_2 aoc_23 = (aoc_2)object2;
            return aob_2.c(aoc_22, aoc_23);
        }
        if (object instanceof aoc_2 && object2 instanceof aff_1) {
            aoc_2 aoc_24 = (aoc_2)object;
            aff_1 aff_12 = (aff_1)object2;
            return aob_2.c(aoc_24, aff_12);
        }
        return -1L;
    }

    @Override
    public Enum c() {
        return eyO.ab;
    }
}

