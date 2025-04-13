/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Iterator;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cab
 */
public final class cab_2
extends cap_2 {
    private static final String a = "getEffectArea";
    private static final String c = "Retourne un tableau contenant la liste des cellules (x,y) de l'aire d'effet de l'effet";
    private static final akf_1[] d = new akf_1[]{new akf_1("cells", null, akg_2.d, false), new akf_1("cells", null, akg_2.g, true)};

    public cab_2(LuaState luaState, bbo_0 bbo_02) {
        super(luaState, bbo_02);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return d;
    }

    @Override
    public void a(int n) {
        Iterable<int[]> iterable = cab_2.a(this.b);
        if (iterable == null) {
            this.q(0);
            return;
        }
        Iterator<int[]> iterator = iterable.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            iterator.next();
            ++n2;
        }
        this.q(n2);
        iterator = iterable.iterator();
        this.L.newTable();
        int n3 = this.L.getTop();
        int n4 = 1;
        while (iterator.hasNext()) {
            int[] nArray = iterator.next();
            this.L.pushNumber((double)n4++);
            this.L.newTable();
            int n5 = this.L.getTop();
            this.L.pushString("x");
            this.L.pushNumber((double)nArray[0]);
            this.L.setTable(n5);
            this.L.pushString("y");
            this.L.pushNumber((double)nArray[1]);
            this.L.setTable(n5);
            this.L.setTable(n3);
        }
        ++this.e;
    }

    public static Iterable<int[]> a(bbo_0 bbo_02) {
        ejh_0 ejh_02 = bbo_02.y();
        if (ejh_02 == null) {
            return null;
        }
        efh_0 efh_02 = (efh_0)ejh_02.f();
        if (efh_02 == null) {
            return null;
        }
        aqd_1 aqd_12 = efh_02.u();
        if (aqd_12 == null) {
            return null;
        }
        aff_1 aff_12 = ejh_02 instanceof eHV ? ((eHV)ejh_02).aF() : ejh_02.j();
        Su su = ejh_02.h();
        Iterable<int[]> iterable = su != null ? aqd_12.a(aff_12.d(), aff_12.e(), aff_12.f(), su.G(), su.H(), aff_12.f(), su.F()) : aqd_12.a(aff_12.d(), aff_12.e(), aff_12.f(), aff_12.d(), aff_12.e(), aff_12.f());
        return iterable;
    }

    @Override
    public String b() {
        return c;
    }
}

