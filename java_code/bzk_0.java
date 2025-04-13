/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZK
 */
final class bzk_0
extends akk_2 {
    private static final akf_1[] a = new akf_1[]{new akf_1("posX", null, akg_2.d, false), new akf_1("posY", null, akg_2.d, false), new akf_1("posZ", null, akg_2.d, false)};
    private static final String b = "getAreaPosition";
    private static final String c = "Permet de r?cup?rer les coordonn?es de la zone associ?e de l'action";
    private final baw d;

    bzk_0(LuaState luaState, baw baw2) {
        super(luaState);
        this.d = baw2;
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return a;
    }

    @Override
    protected void a(int n) {
        ss_0 ss_02 = this.d.E();
        if (ss_02 == null) {
            return;
        }
        sr_0 sr_02 = ss_02.b(this.d.f());
        if (sr_02 == null) {
            return;
        }
        this.q(sr_02.G());
        this.q(sr_02.H());
        this.q(sr_02.I());
    }

    @Override
    public String b() {
        return c;
    }
}

