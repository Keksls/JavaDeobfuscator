/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from euz
 */
public class euz_0
extends esi_0 {
    private aoq_1 b;
    protected String a;
    private static final ArrayList<aov_1[]> c = new ArrayList();

    public int f() {
        return this.b != null && this.b.b() && this.b.a() ? (int)this.b.a(null, null, null, null) : -1;
    }

    @Override
    protected List<aov_1[]> i() {
        return c;
    }

    public euz_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by == 0) {
            this.b = (aoq_1)arrayList.get(0);
        }
        if (by == 1) {
            this.b = (aoq_1)arrayList.get(0);
            this.a = ((apd_2)arrayList.get(1)).b();
        }
        if (by == 2) {
            this.b = null;
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        fiz<? extends fio_0> fiz2;
        fio_0 fio_02 = null;
        eqq_1 eqq_12 = erQ.a(this.a, object, object2, object4, object3);
        if (this.b == null && object3 instanceof fio_0) {
            fio_02 = (fio_0)object3;
        } else {
            if (!(eqq_12 instanceof epq_2)) {
                throw new aob_1("Le user du crit\u00e8re n'est pas un personnage ou l'id n'est pas un entier");
            }
            fiz2 = ((epq_2)eqq_12).aZ();
            if (fiz2 == null) {
                return 0L;
            }
            fio_02 = (fio_0)fiz2.c((int)this.b.a(object, object2, object3, object4));
        }
        if (eqq_12 instanceof epq_2 && eqq_12.a(eqr_1.b) && fio_02 != null) {
            fiz2 = (epq_2)eqq_12;
            return fiT.a(fio_02.aT_(), ((epq_2)((Object)fiz2)).dz(), (epq_2)((Object)fiz2));
        }
        return fio_02 != null ? super.e() * (long)fio_02.c() : 0L;
    }

    @Override
    public Enum c() {
        return eyO.i;
    }

    static {
        c.add(esa_0.l);
        c.add(new aov_1[]{aov_1.b, aov_1.a});
        c.add(esa_0.i);
    }
}

