/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import java.util.List;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from amt
 */
public class amt_0
extends anr_2<amu_0> {
    private static final Logger b = Logger.getLogger(amt_0.class);
    public static final String a = "playRandomApsSound";
    private static final akf_1[] c = new akf_1[]{new akf_1("fightId", null, akg_2.d, false), new akf_1("apsId", null, akg_2.d, false), new akf_1("duration", null, akg_2.d, false), new akf_1("fadeOutTime", null, akg_2.d, false), new akf_1("rollOffId", null, akg_2.d, false), new akf_1("loop", null, akg_2.f, false), new akf_1("soundId, gain", null, akg_2.h, true)};

    public amt_0(LuaState luaState) {
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

    protected amu_0 b(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        int n4 = this.d(2);
        int n5 = this.d(3);
        int n6 = this.d(4);
        boolean bl = this.l(5);
        if (n < 7) {
            return new amu_0(n2, n3, n4, n5, n6, bl);
        }
        List<anj_1> list = this.a(6, n, false);
        return new amu_0(n2, n3, n4, n5, n6, bl, list);
    }

    @Override
    protected void a(amu_0 amu_02, akx_2 akx_22) {
        anj_1 anj_12 = this.a(amu_02.g());
        long l = System.currentTimeMillis();
        if (!alf_1.b().a(l, anj_12.a())) {
            return;
        }
        long l2 = l + (long)amu_02.c();
        long l3 = amu_02.d() != 0 ? l2 - (long)amu_02.d() : 0L;
        IsoParticleSystem isoParticleSystem = aik_0.a().a(amu_02.b());
        try {
            if (anj_12.a() != 0L) {
                amk_1 amk_12 = isoParticleSystem == null ? aki_0.h().a(anj_12.a(), anj_12.j(), anj_12.i(), amu_02.f() ? 0 : 1, l2, l3, amu_02.a()) : aki_0.h().a(anj_12.a(), anj_12.j(), anj_12.i(), amu_02.f() ? 0 : 1, l2, l3, amu_02.a(), isoParticleSystem, amu_02.e(), false);
                if (amk_12 != null) {
                    alf_1.b().a(amu_02.b(), amk_12.b(), l, anj_12.a());
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

