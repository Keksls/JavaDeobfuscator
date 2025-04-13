/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class etY
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public etY(ArrayList<aot_2> arrayList) {
        this.b = this.a(arrayList) == 0 && ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        Object object5;
        Object object6 = object5 = this.b ? object2 : object;
        if (object5 != null) {
            int n = 0;
            if (object5 instanceof epq_2) {
                n = ((epq_2)object5).fE().n();
            }
            return super.e() * (long)n;
        }
        throw new aob_1("On essaie de r\u00e9cup\u00e9rer l'id de nation d'une cible invalide");
    }

    @Override
    public Enum c() {
        return eyO.aT;
    }

    static {
        a.add(new aov_1[]{aov_1.a});
        a.add(aov_1.j);
    }
}

