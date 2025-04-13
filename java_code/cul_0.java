/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cUl
 */
public class cul_0
extends cto_0 {
    @Override
    public boolean d() {
        Optional optional = bhh_1.a(end_0.h);
        if (optional.isPresent() && ((fhz)optional.get()).b() != null) {
            this.c(bae.h().a("pvp.change.state.mru.action.already.pending", new Object[0]));
            return false;
        }
        return true;
    }

    @Override
    public String r() {
        return "pvp.change.state.mru.action";
    }

    @Override
    protected int t() {
        return cUL.l.aH;
    }

    @Override
    public cSS v() {
        return new cul_0();
    }

    @Override
    protected Tv a() {
        return Tv.a;
    }
}

