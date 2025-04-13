/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eue
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    public eue(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by == 1) {
            this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        }
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            throw new aob_1("Pas de personnage trouv\u00e9 pour executer le critere");
        }
        return XZ.a(eqq_12.G());
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.eM;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.j);
    }
}

