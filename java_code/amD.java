/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class amD
extends ans_2<amE> {
    public static final String a = "setMusicMix";
    private static final akf_1[] b = new akf_1[]{new akf_1("targetGain", "Volume entre 0 et 100", akg_2.e, false), new akf_1("fadeOutTime", "Temps de transition", akg_2.e, true)};

    public amD(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return "R\u00e8gle le volume auquel mettre la musique lorsqu'on joue les sons de combat, et le temps de transition vers ce volume";
    }

    @Override
    public akf_1[] e() {
        return b;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    protected amE b(int n) {
        float f2 = (float)this.e(0);
        if (n < 2) {
            return new amE(f2);
        }
        float f3 = (float)this.e(1);
        return new amE(f2, f3);
    }

    @Override
    protected void a(amE amE2, akx_2 akx_22) {
        aki_0.h().a(amE2.a(), amE2.b());
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

