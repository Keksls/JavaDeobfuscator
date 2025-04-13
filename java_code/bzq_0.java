/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Iterator;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZQ
 */
class bzq_0
extends akk_2 {
    private static final akf_1[] a = new akf_1[]{new akf_1("actionId", null, akg_2.d, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("targetId", null, akg_2.d, false)};
    private static final String c = "getNextActionEffectArea";
    private static final String d = "Permet de r?cup?rer la liste des cellules de la zone d'un effet";
    private final akx_1 g;

    bzq_0(LuaState luaState, akx_1 akx_12) {
        super(luaState);
        this.g = akx_12;
    }

    @Override
    public final String a() {
        return c;
    }

    @Override
    public final akf_1[] e() {
        return a;
    }

    @Override
    public akf_1[] f() {
        return b;
    }

    @Override
    public void a(int n) {
        int n2;
        byte by = emd_1.d.a();
        aku_1 aku_12 = this.g.a(by, n2 = this.d(0));
        if (!(aku_12 instanceof bbo_0)) {
            this.q(0);
            return;
        }
        Iterable<int[]> iterable = cab_2.a((bbo_0)((Object)aku_12));
        if (iterable == null) {
            this.q(0);
            return;
        }
        Iterator<int[]> iterator = iterable.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            iterator.next();
            ++n3;
        }
        this.q(n3);
        iterator = iterable.iterator();
        this.L.newTable();
        int n4 = 1;
        while (iterator.hasNext()) {
            int[] nArray = iterator.next();
            this.L.pushNumber((double)n4++);
            this.L.newTable();
            this.L.pushString("x");
            this.L.pushNumber((double)nArray[0]);
            this.L.setTable(-3);
            this.L.pushString("y");
            this.L.pushNumber((double)nArray[1]);
            this.L.setTable(-3);
            this.L.setTable(-3);
        }
        ++this.e;
    }

    @Override
    public String b() {
        return d;
    }
}

