/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from amn
 */
public class amn_0
extends ans_2<amI> {
    private static final Logger b = Logger.getLogger(amn_0.class);
    public static final String a = "playApsSound";
    private static final akf_1[] c = new akf_1[]{new akf_1("soundFileId", null, akg_2.b, false), new akf_1("fightId", null, akg_2.d, false), new akf_1("gain", null, akg_2.d, false), new akf_1("apsId", null, akg_2.d, false), new akf_1("duration", null, akg_2.d, false), new akf_1("fadeOutTime", null, akg_2.d, false), new akf_1("rollOffId", null, akg_2.d, false), new akf_1("loop", null, akg_2.f, false), new akf_1("minPitch", null, akg_2.e, true), new akf_1("maxPitch", null, akg_2.e, true)};

    public amn_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    protected amI b(int n) {
        long l = this.g(0);
        int n2 = this.d(1);
        float f2 = (float)this.d(2) / 100.0f;
        int n3 = this.d(3);
        int n4 = this.d(4);
        int n5 = this.d(5);
        int n6 = this.d(6);
        boolean bl = this.l(7);
        if (n < 10) {
            return new amI(new amJ(l, n2, n3), f2, n4, n5, n6, bl);
        }
        float f3 = this.f(8);
        float f4 = this.f(9);
        return new amI(new amJ(l, n2, n3), f2, f3, f4, n4, n5, n6, bl);
    }

    @Override
    protected void a(amI amI2, akx_2 akx_22) {
        long l = System.currentTimeMillis();
        long l2 = ((amJ)amI2.h()).a();
        if (!alf_1.b().a(l, l2)) {
            return;
        }
        long l3 = amI2.a() != -1 ? l + (long)amI2.a() : -1L;
        long l4 = amI2.b() != 0 ? l3 - (long)amI2.b() : -1L;
        IsoParticleSystem isoParticleSystem = aik_0.a().a(((amJ)amI2.h()).c());
        try {
            if (l2 != 0L) {
                amk_1 amk_12 = isoParticleSystem != null ? aki_0.h().a(l2, amI2.j(), amI2.i(), amI2.f() ? 0 : 1, l3, l4, ((amJ)amI2.h()).b(), isoParticleSystem, amI2.e(), false) : aki_0.h().a(l2, amI2.j(), amI2.i(), amI2.f() ? 0 : 1, l3, l4, ((amJ)amI2.h()).b());
                if (amk_12 != null) {
                    alf_1.b().a(((amJ)amI2.h()).c(), amk_12.b(), l, l2);
                }
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

