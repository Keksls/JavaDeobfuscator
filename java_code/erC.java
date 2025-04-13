/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class erC
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    public erC(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    public int b() {
        if (this.b.b() && this.b.a()) {
            return (int)this.b.a(null, null, null, null);
        }
        return -1;
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
        int n = this.b();
        eow_1 eow_12 = eox_12.a();
        return eow_12.a(n) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.dw;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

