/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from exz
 */
public class exz_0
extends esf {
    private static final String h = "teamAreas";
    private static final String i = "ownAreas";
    private static final ArrayList<aov_1[]> j = new ArrayList();
    public static final byte a = 1;
    public static final byte b = 2;
    public static final byte f = 3;
    protected final String g;
    private final aoq_1 k;
    private final byte l;

    @Override
    protected List<aov_1[]> i() {
        return j;
    }

    protected exz_0(String string, aoq_1 aoq_12, aov_2 aov_22) {
        this.g = string;
        this.k = aoq_12;
        this.l = aov_22.b(null, null, null, null) ? (byte)2 : (byte)1;
    }

    public exz_0(ArrayList<aot_2> arrayList) {
        String string;
        boolean bl;
        byte by = this.a(arrayList);
        this.g = ((apd_2)arrayList.get(0)).b();
        this.k = (aoq_1)arrayList.get(1);
        this.l = by == 1 ? (byte)((bl = ((apc_2)arrayList.get(2)).b(null, null, null, null)) ? 2 : 1) : (by == 2 ? (i.equalsIgnoreCase(string = ((apd_2)arrayList.get(2)).b()) ? (byte)2 : (h.equalsIgnoreCase(string) ? (byte)3 : (byte)1)) : (byte)1);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a(this.g, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        long l = this.k.a(object, object2, object3, object4);
        elm_0 elm_02 = null;
        if (object4 instanceof elm_0) {
            elm_02 = (elm_0)object4;
        } else if (object4 instanceof efq_0) {
            elm_02 = ((efq_0)object4).l();
        }
        if (elm_02 == null) {
            return -1;
        }
        Collection<sr_0> collection = elm_02.i().f();
        for (sr_0 sr_02 : collection) {
            if (sr_02.A() != l || !this.a(eqq_12, sr_02) || !this.a(sr_02, object, object2, object3, object4) || !(eqq_12 instanceof Su ? sr_02.a((Su)((Object)eqq_12), eqq_12.P_().d(), eqq_12.P_().e(), eqq_12.P_().f()) : sr_02.c(eqq_12.P_()))) continue;
            return 0;
        }
        return -1;
    }

    private boolean a(eqq_1 eqq_12, sr_0 sr_02) {
        if (this.l == 2) {
            Su su = erQ.c(eqq_12);
            return su == null || erQ.c(sr_02) == su;
        }
        if (this.l == 3) {
            return eqq_12 != null && eqq_12.Y() == sr_02.Y();
        }
        return true;
    }

    protected boolean a(sr_0 sr_02, Object object, Object object2, Object object3, Object object4) {
        return true;
    }

    public aoq_1 b() {
        return this.k;
    }

    @Override
    public Enum c() {
        return eyO.dk;
    }

    static {
        j.add(new aov_1[]{aov_1.a, aov_1.b});
        j.add(new aov_1[]{aov_1.a, aov_1.b, aov_1.c});
        j.add(new aov_1[]{aov_1.a, aov_1.b, aov_1.a});
    }
}

