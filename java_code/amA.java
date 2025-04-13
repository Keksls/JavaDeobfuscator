/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class amA
extends ans_2<amB> {
    private static final Logger b = Logger.getLogger(amA.class);
    public static final String a = "playSound";
    private static final akf_1[] c = new akf_1[]{new akf_1("soundFileId", "Id du fichier son", akg_2.b, false), new akf_1("isStereo", "Activation de la st\u00e9r\u00e9o", akg_2.f, true), new akf_1("gainModification", "Entier compris entre 0 et 200 % sp\u00e9cifiant une modification du gain", akg_2.e, true), new akf_1("playCount", "Nombre de fois ou le son doit \u00eatre jou\u00e9", akg_2.e, true), new akf_1("minPitch", null, akg_2.e, true), new akf_1("maxPitch", null, akg_2.e, true)};
    private static final akf_1[] d = new akf_1[]{new akf_1("fileId", "uid du son cr??", akg_2.b, false)};

    public amA(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return a;
    }

    @Override
    public String b() {
        return "Joue un son (\u00e9v\u00e8nement sonore relativement court) au sein du monde.";
    }

    @Override
    public final akf_1[] e() {
        return c;
    }

    @Override
    public final akf_1[] f() {
        return d;
    }

    protected amB b(int n) {
        long l = this.g(0);
        if (n < 2) {
            return new amB(l);
        }
        boolean bl = this.l(1);
        if (n < 3) {
            return new amB(l, bl);
        }
        float f2 = (float)this.e(2);
        if (n < 4) {
            return new amB(l, bl, f2);
        }
        int n2 = this.d(3);
        if (n < 6) {
            return new amB(l, bl, f2, n2);
        }
        float f3 = this.f(4);
        float f4 = this.f(5);
        return new amB(l, bl, f2, n2, f3, f4);
    }

    @Override
    protected void a(amB amB2, akx_2 akx_22) {
        try {
            if (amB2.a() != 0L) {
                amk_1 amk_12 = aki_0.h().a(amB2.a(), amB2.e() / 100.0f, amB2.i(), amB2.f(), -1L, -1L, this.m().o());
                this.b(amk_12 == null ? -1L : amk_12.b());
            } else {
                b.error((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.a(b, "soundExtension or soundPath not initialized " + exception);
        }
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

