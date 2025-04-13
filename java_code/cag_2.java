/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cag
 */
final class cag_2
extends cap_2 {
    private static final String a = "getMover";
    private static final String c = "Utilisable uniquement sur des effets de mouvement (pousser, tirer...) : \nRetourne l'id du personnage d?plac?";
    private static final akf_1[] d = new akf_1[]{new akf_1("moverId", null, akg_2.b, false)};

    cag_2(LuaState luaState, bbo_0 bbo_02) {
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
    protected void a(int n) {
        ejh_0 ejh_02 = this.b.y();
        if (ejh_02 == null) {
            throw new LuaException("On ne peut pas utiliser la fonction getMovementEffectArrivalCell sur un effet qui est null");
        }
        if (!(ejh_02 instanceof eHs)) {
            throw new LuaException("On ne peut pas utiliser la fonction getMovementEffectArrivalCell sur un effet de type " + ejh_02.getClass().getSimpleName());
        }
        eKm eKm2 = ((eHs)ejh_02).aG();
        if (eKm2 != null) {
            this.b(eKm2.a_());
        } else {
            this.b(-1L);
        }
    }

    @Override
    public String b() {
        return c;
    }
}

