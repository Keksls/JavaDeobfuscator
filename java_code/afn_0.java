/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from afN
 */
public final class afn_0 {
    private static final afn_0 a = new afn_0();
    private final HashMap<afm_0, afo_0> b = new HashMap();

    public static afn_0 a() {
        return a;
    }

    private afn_0() {
        this.a(afm_0.a, afX::g);
        this.a(afm_0.b, afr_0::f);
        this.a(afm_0.c, afs_0::f);
        this.a(afm_0.e, afW::f);
        this.a(afm_0.o, afq_0::f);
        this.a(afm_0.f, afU::new);
        this.a(afm_0.g, afl_0::new);
        this.a(afm_0.h, afv_0::new);
        this.a(afm_0.d, afT::new);
    }

    public void a(afm_0 afm_02, afo_0 afo_02) {
        this.b.put(afm_02, afo_02);
    }

    public afp_0 a(afm_0 afm_02) {
        afo_0 afo_02 = this.b.get((Object)afm_02);
        if (afo_02 == null) {
            return null;
        }
        return afo_02.create();
    }
}

