/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from byk
 */
public class byk_2 {
    public static final byk_2 a = new byk_2();
    private erg_1 b;
    private final TIntObjectHashMap<bxy_1> c = new TIntObjectHashMap();

    private byk_2() {
    }

    public void a() {
        bot_2 bot_22 = (bot_2)azu_0.j().k().eV();
        this.b = bot_22.f();
        this.c();
    }

    public void b() {
        this.c.forEachValue((TObjectProcedure)new byl_2(this));
        this.c.clear();
    }

    private void c() {
        for (eqp_2 eqp_22 : eqp_2.values()) {
            eqd_0 eqd_02 = eqp_22.a();
            this.c.put(eqd_02.a(), (Object)new bxy_1(eqd_02));
        }
    }

    public bxy_1 a(int n) {
        return (bxy_1)this.c.get(n);
    }

    public boolean a(TObjectProcedure<bxy_1> tObjectProcedure) {
        return this.c.forEachValue(tObjectProcedure);
    }
}

