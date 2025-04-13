/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class esK
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return new ArrayList<aov_1[]>(a);
    }

    public esK() {
    }

    public esK(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (!(eqq_12 instanceof epq_2)) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer le point de reSpawn sur un character inexistant ou qui n'est pas un joueur");
        }
        return this.e() * ((epq_2)eqq_12).dJ();
    }

    @Override
    public Enum c() {
        return eyO.bE;
    }

    static {
        a.add(aov_1.j);
    }
}

