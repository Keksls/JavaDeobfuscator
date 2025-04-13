/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from euA
 */
public class eua_0
extends esi_0 {
    private aoq_1 a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    public int f() {
        if (this.a.b() && this.a.a()) {
            return (int)this.a.a(null, null, null, null);
        }
        return -1;
    }

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public eua_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a = (aoq_1)arrayList.get(0);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        Iterable<fio_0<Object>> iterable;
        if (!this.a.a()) {
            throw new aob_1("L'id n'est pas un entier");
        }
        int n = this.f();
        if (object instanceof epq_2) {
            iterable = ((epq_2)object).aZ();
        } else if (object instanceof Iterable) {
            iterable = (Iterable)object;
        } else {
            throw new aob_1("CriterionUser is neither a BasicCharacterInfo nor a SpellInventory");
        }
        int n2 = 0;
        for (fio_0<Object> fio_02 : iterable) {
            if (!(fio_02 instanceof fio_0)) {
                throw new aob_1("Inventory is not a spell inventory");
            }
            fio_0<Object> fio_03 = fio_02;
            if (((fin_0)fio_03.r()).q() != n) continue;
            n2 += fio_03.c();
        }
        return super.e() * (long)n2;
    }

    @Override
    public Enum c() {
        return eyO.I;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        b.add(aov_1Array);
    }
}

