/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class eHV
extends ejh_0 {
    protected static final aqr_2 w = new eFw(new eFv("Default", new eFu[0]), new eFv("Getion nombre max d'effets \u00e0 ex\u00e9cuter", new eFu("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eFx.b)), new eFv("Gestion r\u00e9ussite", new eFu("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eFx.b), new eFu("0 : effet standard (default), 1 : effet avec r\u00e9ussite", eFx.c)), new eFv("Gestion cible ou cellule", new eFu("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eFx.b), new eFu("0 : effet standard (default), 1 : effet avec r\u00e9ussite", eFx.c), new eFu("0 : effet sur cellule, 1 : effet sur cible (default)", eFx.c)), new eFv("Gestion probabilit\u00e9 relative", new eFu("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eFx.b), new eFu("0 : effet standard (default), 1 : effet avec r\u00e9ussite", eFx.c), new eFu("0 : effet sur cellule, 1 : effet sur cible (default)", eFx.c), new eFu("0 : rien (default), 1 : proba relative (on ne garde que les effets valides et on recalcule leurs proba entre eux) ", eFx.c)), new eFv("Gestion tansmission cible ou cellule de la cible aux effets enfants", new eFu("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eFx.b), new eFu("0 : effet standard (default), 1 : effet avec r\u00e9ussite", eFx.c), new eFu("0 : effet sur cellule, 1 : effet sur cible (default)", eFx.c), new eFu("0 : rien (default), 1 : proba relative (on ne garde que les effets valides et on recalcule leurs proba entre eux) ", eFx.c), new eFu("0 : transmet la cellule de la cible, 1 : transmet la cible (default)", eFx.c)), new eFv("Gestion modifications caster et target", new eFu("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eFx.b), new eFu("0 : effet standard (default), 1 : effet avec r\u00e9ussite", eFx.c), new eFu("0 : effet sur cellule, 1 : effet sur cible (default)", eFx.c), new eFu("0 : rien (default), 1 : proba relative (on ne garde que les effets valides et on recalcule leurs proba entre eux) ", eFx.c), new eFu("0 : transmet la cellule de la cible, 1 : transmet la cible (default)", eFx.c), new eFu("0 : rien (default), 1 : target devient caster : 1, 2 : inverse target et caster", eFx.c)));
    public static final byte x = 0;
    public static final byte y = 1;
    public static final byte z = 2;
    private int v = 0;
    private boolean C = false;
    private boolean D = false;
    protected boolean A = true;
    private byte E = 0;
    protected fil_0 B;
    private final ArrayList<efh_0> F = new ArrayList();

    @Override
    public aqr_2 c_() {
        return w;
    }

    public eHV aE() {
        eHV eHV2 = new eHV();
        eHV2.B = null;
        eHV2.v = this.v;
        eHV2.C = this.C;
        eHV2.D = this.D;
        eHV2.A = this.A;
        return eHV2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.B != null && this.D()) {
            this.aD();
            if (this.D) {
                short s2 = this.aZ();
                int n = 0;
                this.F.clear();
                for (efh_0 efh_02 : this.B) {
                    Iterable<Su> iterable = apr_2.a().a(this.h(), this.h.c(), efh_02.U(), this.g.d(), this.g.e(), this.g.f(), efh_02.k());
                    if (iterable.iterator().hasNext()) continue;
                    int n2 = efh_02.O();
                    int n3 = efh_02.P();
                    if (s2 < n2 || s2 > n3) continue;
                    if (efh_02.s()) {
                        n = (short)((float)n + efh_02.b(s2));
                        this.F.add(efh_02);
                        continue;
                    }
                    if (efh_02.Q() != null) {
                        if (!efh_02.Q().b(sd_02 != null ? sd_02.h() : this.e, this.f, this, this.h)) continue;
                        n = (short)((float)n + efh_02.b(s2));
                        this.F.add(efh_02);
                        continue;
                    }
                    n = (short)((float)n + efh_02.b(s2));
                    this.F.add(efh_02);
                }
                Iterator<efh_0> iterator = this.F.iterator();
                while (iterator.hasNext()) {
                    efh_0 efh_02;
                    efh_02 = iterator.next();
                    if (xc_0.a(n) <= xh_0.a(efh_02.b(s2))) continue;
                    iterator.remove();
                }
                this.a(this.F.iterator(), sd_02, true);
            } else {
                this.a(this.B.iterator(), sd_02, false);
            }
        }
        this.j(true);
    }

    private void aD() {
        if (this.E == 0) {
            return;
        }
        if (this.E == 1) {
            if (this.f != null) {
                this.e = this.f;
            } else {
                a.error((Object)("On veut changer le caster d'un groupe d'effet pas la cible mais la cible est nulle, on ne fait rien, effectId = " + this.o()));
            }
        } else if (this.E == 2) {
            if (this.f != null && this.e != null) {
                Su su = this.f;
                this.f = this.e;
                this.e = su;
            } else {
                a.error((Object)("On veut inverser le caster et la target d'un groupe mais l'un des deux est null, on ne fait rien, effectId = " + this.o()));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(Iterator<efh_0> iterator, sd_0 sd_02, boolean bl) {
        efn_0 efn_02 = this.a((ejh_0)sd_02, bl);
        try {
            if (this.a(eff_0.o) && efn_02.g() == -1) {
                efn_02.a(this.aZ());
            }
            this.a(iterator, efn_02);
        }
        catch (Exception exception) {
            a.error((Object)("Exception levee lors de l'execution d'un groupe d'effets id " + (this.c == null ? -1 : ((efh_0)this.c).i())), (Throwable)exception);
        }
        finally {
            efn_02.a();
        }
    }

    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = efn_0.a(bl, false, ejh_02);
        efn_02.a(false);
        return efn_02;
    }

    private void a(Iterator<efh_0> iterator, efn_0 efn_02) {
        efh_0 efh_02;
        int n = 0;
        int n2 = 0;
        block2: while (iterator.hasNext() && this.a(efh_02 = iterator.next(), n2, n) && (this.v <= 0 || !(!this.C ? n >= this.v : n2 >= this.v))) {
            Ss ss;
            if (this.R()) {
                if (this.f == null) {
                    a.error((Object)("Impossible d'executer l'effet " + efh_02.i() + " on a plus de cible"));
                    return;
                }
                try {
                    ss = efh_02.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), this.f.G(), this.f.H(), this.f.I(), this.A ? this.f : null, efn_02, true);
                }
                catch (Exception exception) {
                    a.error((Object)("Pb a l''execution de l'effet " + efh_02.i()), (Throwable)exception);
                    return;
                }
                if (ss != null && ss.e() > 0) {
                    ++n2;
                }
                ++n;
                if (ss == null) continue;
                ss.f();
                continue;
            }
            aff_1 aff_12 = new aff_1(this.aF());
            if (this.c == null || ((efh_0)this.c).u() == null) continue;
            aqd_1 aqd_12 = ((efh_0)this.c).u();
            Iterable<int[]> iterable = aqd_12.a(aff_12.d(), aff_12.e(), aff_12.f(), this.e.G(), this.e.H(), this.e.I(), this.e.F());
            for (int[] nArray : iterable) {
                aff_12.b(nArray[0]);
                aff_12.c(nArray[1]);
                if (this.a(aff_12) && this.h.e().o(aff_12.d(), aff_12.e())) {
                    ss = efh_02.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), aff_12.d(), aff_12.e(), aff_12.f(), null, efn_02, true);
                    if (ss != null && ss.e() > 0) {
                        ++n2;
                    }
                    ++n;
                    if (ss != null) {
                        ss.f();
                    }
                }
                if (this.v <= 0 || !(this.C ? n2 >= this.v : n >= this.v)) continue;
                continue block2;
            }
        }
    }

    protected boolean a(efh_0 efh_02, int n, int n2) {
        return true;
    }

    private boolean a(aff_1 aff_12) {
        short s2;
        tg_0 tg_02 = this.h.e();
        if (tg_02 == null) {
            a.error((Object)("On tente d'execute un groupe d'effets sur cellule sans FightMap " + ((efh_0)this.c).i()));
            return false;
        }
        if (tg_02.c(aff_12.d(), aff_12.e()) && (s2 = tg_02.i(aff_12.d(), aff_12.e())) != Short.MIN_VALUE) {
            aff_12.a(s2);
            return true;
        }
        return false;
    }

    @Override
    public void al() {
        super.al();
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        this.B = null;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.v = 0;
        if (this.c == null) {
            return;
        }
        if (fim_0.a() == null) {
            return;
        }
        fil_0 fil_02 = fim_0.a().a(((efh_0)this.c).i());
        if (fil_02 != null) {
            this.B = fil_02.b(s2);
        }
        if (((efh_0)this.c).F() >= 1) {
            this.v = ((efh_0)this.c).a(0, s2, eFb.a);
        }
        if (((efh_0)this.c).F() >= 2) {
            boolean bl = this.C = ((efh_0)this.c).a(1, s2, eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 4) {
            boolean bl = this.D = ((efh_0)this.c).a(3, s2, eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 5) {
            boolean bl = this.A = ((efh_0)this.c).a(4, s2, eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 6) {
            this.E = (byte)((efh_0)this.c).a(5, s2, eFb.a);
        }
    }

    @NotNull
    public aff_1 aF() {
        return this.j();
    }

    public boolean aG() {
        return false;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    protected boolean aA() {
        return true;
    }

    public boolean aI() {
        return this.E == 1;
    }

    public boolean aJ() {
        return this.A;
    }

    @Override
    public boolean R() {
        if (this.c != null && ((efh_0)this.c).F() >= 3) {
            return ((efh_0)this.c).a(2) == 1.0f;
        }
        return true;
    }

    @Override
    public boolean S() {
        if (this.c != null && ((efh_0)this.c).F() >= 3) {
            return ((efh_0)this.c).a(2) == 0.0f;
        }
        return false;
    }

    @Override
    public void z() {
        super.z();
        this.C = false;
        this.D = false;
        this.v = -1;
        this.A = true;
        this.E = 0;
        this.B = null;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aE();
    }
}

