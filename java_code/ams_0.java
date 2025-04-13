/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ams
 */
public class ams_0
extends ans_2<anj_1> {
    private static final akf_1[] a = new akf_1[]{new akf_1("musicFileId", "Id du fichier \u00e0 jouer", akg_2.b, false)};

    public ams_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "playMusic";
    }

    @Override
    public String b() {
        return "Joue une musique (son relativement long, et bouclant) au sein du monde.";
    }

    @Override
    public akf_1[] e() {
        return a;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    protected anj_1 b(int n) {
        long l = this.g(0);
        return new anj_1(l);
    }

    @Override
    protected void a(anj_1 anj_12, akx_2 akx_22) {
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

