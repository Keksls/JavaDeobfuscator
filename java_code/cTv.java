/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.Optional;

public class cTv
extends cto_0 {
    private final EnumSet<cTw> a = EnumSet.noneOf(cTw.class);

    @Override
    protected void a(Tv tv, TF tF, pj_0 pj_02) {
        if (!azu_0.j().c(cWe.a())) {
            cWe.a().a((bae_1)pj_02);
        }
    }

    @Override
    public boolean d() {
        Optional<fhe_0> optional;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.bM() < 1) {
            this.a.add(cTw.a);
        }
        if (bmr_12.dE().a() != null && !bmr_12.dE().a().c(bmr_12.U_()).isEmpty()) {
            this.a.add(cTw.d);
        }
        if ((optional = cxj_2.a.c()).isEmpty()) {
            this.a.add(cTw.b);
            return false;
        }
        fhe_0 fhe_02 = optional.get();
        Optional<fhc_0> optional2 = fhd_0.a.a(fhe_02.f());
        if (optional2.isEmpty()) {
            this.a.add(cTw.b);
            return false;
        }
        if (bmr_12.dI() == null || bmr_12.dI().e() != optional2.get().b()) {
            this.a.add(cTw.b);
            return false;
        }
        for (long l : euw_2.a.e(bmr_12.U_())) {
            bmr_1 bmr_13 = (bmr_1)euw_2.a.d(l);
            if (bmr_13 == null) continue;
            if (bmr_13.dr() < fhe_02.e().b()) {
                this.a.add(cTw.c);
                return false;
            }
            if (bmr_13.bM() >= 1) continue;
            this.a.add(cTw.a);
            return false;
        }
        bae_1 bae_12 = (bae_1)this.l;
        fhg fhg2 = bae_12.p();
        if (!fhg2.c()) {
            this.a.add(cTw.b);
            return false;
        }
        return this.a.isEmpty() && super.d();
    }

    @Override
    public String r() {
        return "mru.battleground.enter";
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2();
        String string = this.f();
        ani_22.a((CharSequence)bae.h().a(66, (long)azu_0.j().k().dI().e(), new Object[0]));
        Optional<fhe_0> optional = cxj_2.a.c();
        if (optional.isPresent()) {
            fhe_0 fhe_02 = optional.get();
            ani_22.a((CharSequence)" (");
            ani_22.a(this.a.contains((Object)cTw.c) ? h : g);
            ani_22.a((CharSequence)bae.h().a("stasis.dungeon.level.range", fhe_02.e().b(), fhe_02.e().c())).j().a(')');
        }
        if (ani_22.q() > 0) {
            ani_22.m();
        }
        ani_22.a((CharSequence)string);
        if (this.a.contains((Object)cTw.a)) {
            ani_22.m().a(h).a((CharSequence)bae.h().a("battleground.error.nation", new Object[0])).j();
        }
        if (this.a.contains((Object)cTw.d)) {
            ani_22.m().a(h).a((CharSequence)bae.h().a("battleground.error.companions", new Object[0])).j();
        }
        if (this.a.contains((Object)cTw.c)) {
            ani_22.m().a(h).a((CharSequence)bae.h().a("battleground.error.level", new Object[0])).j();
        }
        if (this.a.contains((Object)cTw.b)) {
            ani_22.m().a(h).a((CharSequence)bae.h().a("battleground.error.active", new Object[0])).j();
        }
        return ani_22.r();
    }

    @Override
    public cSS v() {
        return new cTv();
    }
}

