/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from amj
 */
public class amj_0
extends ans_2<amk_0> {
    private static final Logger b = Logger.getLogger(amA.class);
    public static final String a = "loopSound";
    private static final akf_1[] c = new akf_1[]{new akf_1("soundFileId", "Id du fichier son", akg_2.b, false), new akf_1("isStereo", "Activation de mode st\u00e9r\u00e9o", akg_2.f, true), new akf_1("gainMod", "Entier compris entre 0 et 200 sp\u00e9cifiant un gain en %", akg_2.e, true), new akf_1("loopingTime", "Temps (en ms) pendant lequel le son doit \u00eatre boucl\u00e9", akg_2.e, true), new akf_1("fadeOut time", "Temps (en ms) \u00e0 partir duquel le volume du son doit \u00eatre diminu\u00e9", akg_2.e, true), new akf_1("minPitch", null, akg_2.e, true), new akf_1("maxPitch", null, akg_2.e, true)};

    public amj_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return "Joue un son (\u00e9v\u00e8nement sonore relativement court) en boucle pendant un temps fix\u00e9.";
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    protected amk_0 b(int n) {
        long l = this.g(0);
        if (n < 2) {
            return new amk_0(l);
        }
        boolean bl = this.l(1);
        if (n < 3) {
            return new amk_0(l, bl);
        }
        float f2 = (float)this.e(2);
        if (n < 4) {
            return new amk_0(l, bl, f2);
        }
        int n2 = this.d(3);
        if (n < 5) {
            return new amk_0(l, bl, f2, n2);
        }
        long l2 = this.d(4);
        if (n < 7) {
            return new amk_0(l, bl, f2, n2, l2);
        }
        float f3 = this.f(5);
        float f4 = this.f(6);
        return new amk_0(l, bl, f2, n2, l2, f3, f4);
    }

    @Override
    protected void a(amk_0 amk_02, akx_2 akx_22) {
        try {
            if (amk_02.a() != 0L) {
                boolean bl = amk_02.f() > 0;
                long l = bl ? System.currentTimeMillis() + (long)amk_02.f() : -1L;
                aki_0.h().a(amk_02.a(), amk_02.e() / 100.0f, amk_02.i(), bl ? 0 : 1, l, amk_02.g(), akx_22.o());
            } else {
                b.error((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.a(b, "soundExtension or soundPath not initialized");
        }
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

