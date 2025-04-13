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
 * Renamed from aml
 */
public class aml_0
extends ans_2<amm_0> {
    private static final Logger b = Logger.getLogger(aml_0.class);
    public static final String a = "play3DSound";
    private static final akf_1[] c = new akf_1[]{new akf_1("soundFileId", "Id du fichier son", akg_2.b, false), new akf_1("posX", "Position x", akg_2.d, false), new akf_1("posY", "Position y", akg_2.d, false), new akf_1("posZ", "Position z", akg_2.d, false), new akf_1("isLoop", "Si le son boucle", akg_2.f, true), new akf_1("isStereo", "Si on active le mode st\u00e9r\u00e9o", akg_2.f, true), new akf_1("minPitch", null, akg_2.e, true), new akf_1("maxPitch", null, akg_2.e, true)};

    public aml_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return "Joue un son (\u00e9v\u00e8nement sonore relativement court) plac\u00e9 \u00e0 une position sp\u00e9cifique du monde.";
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    protected amm_0 b(int n) {
        long l = this.g(0);
        int n2 = this.d(1);
        int n3 = this.d(2);
        int n4 = this.d(3);
        if (n < 5) {
            return new amm_0(l, n2, n3, n4);
        }
        boolean bl = this.l(4);
        if (n < 6) {
            return new amm_0(l, n2, n3, n4, bl);
        }
        boolean bl2 = this.l(5);
        if (n < 8) {
            return new amm_0(l, n2, n3, n4, bl, bl2);
        }
        float f2 = this.f(6);
        float f3 = this.f(7);
        return new amm_0(l, n2, n3, n4, bl, bl2, f2, f3);
    }

    @Override
    protected void a(amm_0 amm_02, akx_2 akx_22) {
        try {
            if (amm_02.a() > 0L) {
                aki_0.h().a(amm_02.a(), 1.0f, amm_02.i(), amm_02.g() ? 0 : 1, -1L, -1L, akx_22.o());
            } else {
                b.warn((Object)"Pas de son sp\u00e9cifi\u00e9 (ID<=0)");
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

