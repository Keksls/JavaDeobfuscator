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
 * Renamed from cak
 */
final class cak_2
extends cap_2 {
    private static final String a = "getThrowEffectArrivalCell";
    private static final String c = "Utilisable uniquement sur l'effet 333 \"Jette le personnage port?\" :\n retourne les coordonn?es de la position d'arriv?e du lancer";
    private static final akf_1[] d = new akf_1[]{new akf_1("posX", null, akg_2.d, false), new akf_1("posY", null, akg_2.d, false), new akf_1("posZ", null, akg_2.d, false)};

    cak_2(LuaState luaState, bbo_0 bbo_02) {
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
        if (!(ejh_02 instanceof eJu)) {
            throw new LuaException("On ne peut pas utiliser la fonction getMovementEffectArrivalCell sur un effet de type " + ejh_02.getClass().getSimpleName());
        }
        aff_1 aff_12 = ((eJu)ejh_02).aE();
        this.q(aff_12.d());
        this.q(aff_12.e());
        this.q(aff_12.f());
    }

    @Override
    public String b() {
        return c;
    }
}

