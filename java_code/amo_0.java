/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from amo
 */
public class amo_0
extends ans_2<anj_1> {
    public static final String a = "playFightMusic";
    private static final akf_1[] b = new akf_1[]{new akf_1("musicFileId", "Id du fichier \u00e0 jouer", akg_2.b, false), new akf_1("gainModification", "Modification du volume \u00e0 appliquer entre 0 et 200%", akg_2.d, true)};

    public amo_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return "Joue une musique (son relativement long, et bouclant) en combat.";
    }

    @Override
    public akf_1[] e() {
        return b;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    protected anj_1 b(int n) {
        long l = this.g(0);
        if (n > 1) {
            return new anj_1(l, (float)this.d(1) / 100.0f);
        }
        return new anj_1(l, -1.0f);
    }

    @Override
    protected void a(anj_1 anj_12, akx_2 akx_22) {
        float f2 = anj_12.j();
        if (f2 == -1.0f) {
            aki_0.h().b(anj_12.a());
        } else {
            aki_0.h().b(anj_12.a(), f2);
        }
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

