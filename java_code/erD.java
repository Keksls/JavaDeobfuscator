/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class erD
extends esf {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    public erD(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof eox_1)) {
            throw new aob_1("On essaye d'acc\u00e9der \u00e0 l'historique de combat d'un objet qui n'en poss\u00e8de pas");
        }
        eox_1 eox_12 = (eox_1)object;
        eow_1 eow_12 = eox_12.a();
        return eow_12.a() ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.dx;
    }
}

