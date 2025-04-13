/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class erE
extends esi_0 {
    private static final ArrayList<aov_1[]> e = new ArrayList();
    protected final apd_2 a;
    protected final aoq_1 b;
    protected final apc_2 c;
    private eqq_1 f;
    private final String g;

    public erE(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        this.a = (apd_2)arrayList.get(0);
        this.b = (aoq_1)arrayList.get(1);
        this.c = (apc_2)arrayList.get(2);
        this.g = by == 1 ? ((apd_2)arrayList.get(3)).b() : "";
    }

    protected List<Integer> c(Object object, Object object2, Object object3, Object object4) {
        String string = this.a.b();
        long l = this.b.a(object, object2, object3, object4);
        boolean bl = this.c.b(object, object2, object3, object4);
        eyJ eyJ2 = eyJ.a(string);
        eqq_1 eqq_12 = erQ.b(eyJ2, object, object2, object4, object3);
        if (eqq_12 == null) {
            return null;
        }
        if (!(eqq_12 instanceof epq_2)) {
            return null;
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            throw new aob_1("Unable to retrieve fight");
        }
        Function<sr_0, Integer> function = bl ? sr_02 -> erE.a(epq_22, elm_02.g(), sr_02) : sr_02 -> erE.b(epq_22, sr_02);
        Collection<sr_0> collection = elm_02.i().f();
        if (!this.g.isEmpty()) {
            this.d(object, object2, object4, object3);
        }
        return collection.stream().filter(sr_02 -> erE.a(this.f, sr_02)).filter(sr_02 -> erE.a(l, sr_02)).map(function).filter(erE::a).collect(Collectors.toList());
    }

    protected static boolean a(eqq_1 eqq_12, sr_0 sr_02) {
        if (eqq_12 == null) {
            return true;
        }
        Su su = sr_02.v();
        if (!(su instanceof app_2)) {
            return false;
        }
        return su.a_() == eqq_12.a_();
    }

    protected static boolean a(Integer n) {
        return n > 0;
    }

    protected static boolean a(long l, sr_0 sr_02) {
        return sr_02.A() == l;
    }

    protected static Integer b(eqq_1 eqq_12, sr_0 sr_02) {
        aff_1 aff_12 = eqq_12.P_();
        return aff_12.e(sr_02.P_());
    }

    protected static Integer a(epq_2 epq_22, tg_0 tg_02, sr_0 sr_02) {
        uq_0 uq_02 = uq_0.a();
        uq_02.a((int)epq_22.W(), epq_22.X(), epq_22.fV());
        uq_02.a(tg_02);
        uq_02.a(epq_22.P_());
        ut_0 ut_02 = new ut_0();
        ut_02.c = 400;
        ut_02.b = 256;
        ut_02.d = false;
        uq_02.a(ut_02);
        uq_02.b(sr_02.P_());
        return uq_02.g();
    }

    @Override
    protected List<aov_1[]> i() {
        return e;
    }

    @Override
    public boolean a() {
        return true;
    }

    protected void d(Object object, Object object2, Object object3, Object object4) {
        this.f = erQ.a(this.g, object, object2, object3, object4);
    }

    static {
        e.add(new aov_1[]{aov_1.a, aov_1.b, aov_1.c});
        e.add(new aov_1[]{aov_1.a, aov_1.b, aov_1.c, aov_1.a});
    }
}

