/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Optional;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cae
 */
final class cae_2
extends cap_2 {
    private static final String a = "getElementId";
    private static final String c = "Retourne l'id de l'\u00e9l\u00e9ment du sort, -1 si pas d'\u00e9l\u00e9ment";
    private static final akf_1[] d = new akf_1[]{new akf_1("elementId", null, akg_2.d, false)};

    cae_2(LuaState luaState, bbo_0 bbo_02) {
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
        Optional<Byte> optional = this.b.u();
        if (optional.isPresent()) {
            this.a(optional.get());
        } else {
            this.q(-1);
        }
    }

    @Override
    public String b() {
        return c;
    }
}

