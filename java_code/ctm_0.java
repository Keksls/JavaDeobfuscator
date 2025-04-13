/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

/*
 * Renamed from cTM
 */
public class ctm_0
extends cto_0 {
    private final EnumSet<ctn_0> a = EnumSet.noneOf(ctn_0.class);

    @Override
    protected Tv a() {
        return Tv.m;
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        if (bmr_12.bM() != bmr_12.bN()) {
            this.a.add(ctn_0.a);
            return false;
        }
        return super.d();
    }

    @Override
    public String q() {
        String string = super.q();
        ani_2 ani_22 = new ani_2().a((CharSequence)string);
        if (this.a.contains((Object)ctn_0.a)) {
            bmr_1 bmr_12 = azu_0.j().k();
            int n = bmr_12.bN();
            String string2 = bae.h().a(39, (long)n, new Object[0]);
            ani_22.m().a(h).a((CharSequence)bae.h().a("critere.getNationId", string2, n)).j();
        }
        return ani_22.r();
    }

    @Override
    public String r() {
        return "desc.mru.lookAt";
    }

    @Override
    protected int t() {
        return cUL.l.aH;
    }

    @Override
    public cSS v() {
        return new ctm_0();
    }
}

