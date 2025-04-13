/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class etB
extends esi_0 {
    private static final ArrayList<aov_1[]> b = new ArrayList();
    public static final String a = "monster";
    private boolean c;

    public etB(ArrayList<aot_2> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.c = a.equalsIgnoreCase(((apd_2)arrayList.get(0)).b());
    }

    @Override
    public Enum c() {
        return eyO.fp;
    }

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        if (object4 == null) {
            throw new aob_1("Pas de contexte...");
        }
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        byte by = this.c ? (byte)1 : 0;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(elm_02.a(enw_2.c(), enw_2.a(by), enw_2.a(enw_2.a(eoz_1.bh))));
        if (by == 0) {
            arrayList.addAll(elm_02.a(enw_2.c(), enw_2.a((byte)5), enw_2.a(enw_2.a(eoz_1.bh))));
        }
        short s2 = 0;
        for (epq_2 epq_22 : arrayList) {
            s2 = Hw.b(s2, epq_22.dr());
        }
        return s2;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{};
        b.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.a};
        b.add(aov_1Array);
    }
}

