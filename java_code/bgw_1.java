/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TLongIterator;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bGW
 */
public class bgw_1 {
    private static final Logger a = Logger.getLogger(bgw_1.class);
    private final evs_1 b;
    private final bmr_1 c;

    public bgw_1(evs_1 evs_12, bmr_1 bmr_12) {
        this.b = evs_12;
        this.c = bmr_12;
    }

    @NotNull
    public <T extends cUz> T a(@NotNull T t, fii fii2, evt_1 evt_12) {
        t.a(fii2.c());
        t.d("desc.mru." + fii2.d());
        t.a(this.h(evt_12));
        t.a(this.b(evt_12));
        t.d(this.a(evt_12));
        t.b(this.f(evt_12));
        t.a(evt_12.n());
        t.a(evt_12);
        return t;
    }

    public boolean a(evt_1 evt_12) {
        return this.d(evt_12) || this.e(evt_12) || !this.c(evt_12);
    }

    public boolean a(TF tF) {
        evt_1 evt_12 = this.b.a(tF, tF, this, ((epq_2)((Object)tF)).Q_());
        if (evt_12 == null) {
            return false;
        }
        if (euw_2.a.h(this.c.U_()) <= 1) {
            return true;
        }
        if (!eoe_0.n.contains(evt_12.n()) && !eoe_0.o.contains(evt_12.n())) {
            return true;
        }
        aUh.a("error.heroCantAccessToThisWorld", new Object[0]);
        return false;
    }

    public boolean b(evt_1 evt_12) {
        if (this.b == null) {
            return false;
        }
        evh_2 evh_22 = new evh_2(this.c, this.b, evt_12);
        return evh_22.a() && evh_22.b();
    }

    private boolean c(evt_1 evt_12) {
        fam_0 fam_02 = this.c.cB();
        far far2 = fam_02.d(evt_12.t());
        if (far2 == null) {
            return true;
        }
        int n = far2.b();
        ezb_2 ezb_22 = ezd_2.a.a(n);
        if (ezb_22 == null) {
            return true;
        }
        bgx_1 bgx_12 = new bgx_1(ezb_22.c());
        euw_2.a.b(this.c.U_(), bgx_12);
        return bgx_12.a();
    }

    private boolean d(evt_1 evt_12) {
        if (this.b == null || evt_12 == null) {
            return true;
        }
        if (evt_12.t() < 0) {
            return false;
        }
        return this.c.cB().e(evt_12.t());
    }

    private boolean e(evt_1 evt_12) {
        if (this.b == null) {
            return false;
        }
        bmr_1 bmr_12 = this.c;
        return !evt_12.d().b(bmr_12, null, null, bmr_12.Q_());
    }

    private String f(evt_1 evt_12) {
        return this.a(evt_12.d(), evt_12);
    }

    private String a(apc_2 apc_22, evt_1 evt_12) {
        String string;
        String string2 = this.g(evt_12);
        String string3 = this.a(apc_22);
        boolean bl = true;
        ani_2 ani_22 = new ani_2();
        if (string2 != null && !string2.isEmpty()) {
            ani_22.a((CharSequence)string2);
            bl = false;
        }
        if (string3 != null && !string3.isEmpty()) {
            if (!bl) {
                ani_22.m();
            }
            ani_22.a((CharSequence)string3);
        }
        return (string = ani_22.toString()).isEmpty() ? null : string;
    }

    private String g(evt_1 evt_12) {
        if (this.b == null || evt_12 == null) {
            return null;
        }
        ani_2 ani_22 = new ani_2();
        if (evt_12.t() > 0) {
            String string = this.j(evt_12);
            String string2 = bte.a(this.c, evt_12.t());
            ani_22.a((CharSequence)string);
            if (!string2.isEmpty()) {
                ani_22.m().a().a(azf_2.h.w()).a((CharSequence)string2).b();
            }
        } else {
            Optional<bao_2> optional = ban_2.a.c(this.b.m());
            if (optional.isEmpty()) {
                return null;
            }
            ani_22.a((CharSequence)bae.h().a(89, (long)this.b.m(), new Object[0])).a((CharSequence)" (");
            int n = optional.get().d();
            bgx_1 bgx_12 = new bgx_1(n);
            euw_2.a.b(this.c.U_(), bgx_12);
            boolean bl = bgx_12.a();
            ani_22.i().a((bl ? azf_2.j : azf_2.h).w());
            ani_22.a((CharSequence)bae.h().a("required.level.custom", n));
            ani_22.j().a((CharSequence)")\n");
            ani_22.a((CharSequence)bae.h().a("infinite.waves.player.limit", new Object[0]));
        }
        return ani_22.r();
    }

    private String a(apc_2 apc_22) {
        if (this.b == null) {
            return null;
        }
        if (apc_22.b(this.c, null, null, this.c.Q_())) {
            return null;
        }
        edo_0 edo_02 = new edo_0(this.c, null, null, this.c.Q_());
        String string = eDm.a((aot_2)apc_22, edo_02);
        if (string.isEmpty()) {
            return null;
        }
        ani_2 ani_22 = new ani_2();
        ani_22.i().a(azf_2.h);
        ani_22.a((CharSequence)string);
        return ani_22.r();
    }

    private String h(evt_1 evt_12) {
        if (this.b == null) {
            return null;
        }
        int n = euw_2.a.h(this.c.U_());
        int n2 = evt_12.l() * n;
        int n3 = evt_12.i();
        bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(n3);
        ani_2 ani_22 = new ani_2();
        if (bjw_12 != null) {
            boolean bl = !this.a(n3, evt_12);
            ani_22.i().a((bl ? azf_2.h : azf_2.j).w());
            ani_22.a((CharSequence)"[").a((CharSequence)bjw_12.e()).a((CharSequence)"]").a((CharSequence)" x").a(this.i(evt_12));
            ani_22.j();
        }
        if (n2 > 0) {
            if (bjw_12 != null) {
                ani_22.m();
            }
            ani_22.i().a((this.a(n2) ? azf_2.j : azf_2.h).w());
            ani_22.a((CharSequence)bae.h().a("kama.shortGain", n2)).j();
        }
        return ani_22.r();
    }

    private boolean a(long l) {
        eyu_1 eyu_12 = this.c.dK();
        if (eyu_12 == null) {
            return false;
        }
        return eyu_12.a() >= l;
    }

    private boolean a(int n, evt_1 evt_12) {
        int n2 = this.i(evt_12);
        int n3 = evl_2.a(this.c.R(), n);
        if (n3 >= n2) {
            return true;
        }
        boolean bl = true;
        TLongIterator tLongIterator = euw_2.a.e(this.c.R()).iterator();
        while (tLongIterator.hasNext()) {
            bmr_1 bmr_12 = (bmr_1)euw_2.a.d(tLongIterator.next());
            if (n == 0) continue;
            int n4 = bmr_12.da().h(n);
            ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
            ewz_2 ewz_22 = ewx_22.a(n);
            if (ewz_22 == null) {
                n2 -= n4;
                bl = false;
                continue;
            }
            short s2 = ewz_22.b();
            if (s2 >= evt_12.j()) continue;
            bl = false;
        }
        return n2 <= 0 || bl;
    }

    private short i(evt_1 evt_12) {
        int n = evt_12.i();
        bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(n);
        if (bjw_12 == null) {
            return evt_12.j();
        }
        if (bjw_12.b(ext_1.u)) {
            return evt_12.j();
        }
        boolean bl = bjw_12.b(ext_1.b);
        if (this.a() || bl) {
            int n2 = euw_2.a.h(this.c.U_());
            return (short)(evt_12.j() * n2);
        }
        return evt_12.j();
    }

    private boolean a() {
        short[] sArray = this.b.e();
        boolean bl = false;
        for (int k = 0; k < sArray.length; ++k) {
            short s2 = sArray[k];
            cct_1 cct_12 = ccs_1.a().a(s2);
            if (cct_12 == null) continue;
            bl |= cct_12.c();
        }
        return bl;
    }

    private String j(evt_1 evt_12) {
        if (evt_12 == null) {
            return bae.h().a(89, (long)this.b.m(), new Object[0]);
        }
        fam_0 fam_02 = this.c.cB();
        far far2 = fam_02.d(evt_12.t());
        if (far2 == null) {
            return bae.h().a(89, (long)this.b.m(), new Object[0]);
        }
        int n = far2.b();
        ezb_2 ezb_22 = ezd_2.a.a(n);
        if (ezb_22 == null) {
            return bae.h().a(89, (long)this.b.m(), new Object[0]);
        }
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)bae.h().a(137, (long)n, new Object[0])).a((CharSequence)" (");
        boolean bl = this.c(evt_12);
        ani_22.i().a((bl ? azf_2.j : azf_2.h).w());
        if (evt_12.r()) {
            short s2 = ezi_1.a(ezb_22.c());
            ani_22.a((CharSequence)bae.h().a("downscale.mru.modifiedLevelForDungeon", s2));
            try {
                ani_22.a(bac.a(116), 10, 9, null, null);
            }
            catch (gm_0 gm_02) {
                a.error((Object)"Exception raised", (Throwable)gm_02);
            }
        } else {
            ani_22.a((CharSequence)bae.h().a("required.level.custom", ezb_22.c()));
        }
        ani_22.j().a(')');
        return ani_22.r();
    }
}

