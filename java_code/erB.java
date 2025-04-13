/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class erB
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Deprecated
    public erB() {
    }

    public erB(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public Enum c() {
        return eyO.dy;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof eox_1)) {
            throw new aob_1("On essaye d'acc\u00e9der \u00e0 l'historique de combat d'un objet qui n'en poss\u00e8de pas");
        }
        int n = (int)this.b.a(object, object2, object3, object4);
        eox_1 eox_12 = (eox_1)object;
        eow_1 eow_12 = eox_12.a();
        return eow_12.b(n);
    }

    static {
        a.add(new aov_1[]{aov_1.b});
    }
}

