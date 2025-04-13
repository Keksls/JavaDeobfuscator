/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from esw
 */
public final class esw_0
extends esi_0 {
    private static final ArrayList<aov_1[]> b = new ArrayList();
    boolean a;

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    esw_0() {
    }

    public esw_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        if (arrayList.size() == 1) {
            this.a = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        }
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
        boolean bl = object4 instanceof elm_0;
        boolean bl2 = object4 instanceof efq_0;
        if (!bl && !bl2) {
            throw new aob_1("On essaie de compter les fighters en dehors d'un combat...");
        }
        if (!(object instanceof eqq_1)) {
            throw new aob_1("On essaie de compter les fighters d'un caster qui n'est pas un perso");
        }
        elm_0 elm_02 = bl ? (elm_0)object4 : ((efq_0)object4).l();
        if (elm_02 == null) {
            return 0L;
        }
        eqq_1 eqq_12 = erQ.b(this.a, object, object2, object4, object3);
        return elm_02.e(eqq_12.Y()).size();
    }

    @Override
    public Enum c() {
        return eyO.eS;
    }

    static {
        b.add(esa_0.i);
        b.add(esa_0.j);
    }
}

