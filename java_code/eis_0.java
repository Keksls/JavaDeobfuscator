/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Ordering
 */
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eIs
 */
public final class eis_0
extends eHV {
    private static final aqr_2 v = new eFw(new eFv("Param standard", new eFu("Nb Cibles Max", eFx.c)), new eFv("Check de critere sur les cibles", new eFu("Nb Cibles Max", eFx.c), new eFu("Critere sur les cibles = 1, critere sur effet de base = 0 (defaut)", eFx.c)), new eFv("Pas de shuffle sur la liste des cibles", new eFu("Nb Cibles Max", eFx.c), new eFu("Critere sur les cibles = 1, critere sur effet de base = 0 (defaut)", eFx.c), new eFu("On m\u00e9lange les cibles avant d'appliquer la limite (oui = 1 (defaut), non = 0)", eFx.c)), new eFv("Tri des cibles", new eFu("Nb Cibles Max", eFx.c), new eFu("Critere sur les cibles = 1, critere sur effet de base = 0 (defaut)", eFx.c), new eFu("On m\u00e9lange les cibles avant d'appliquer la limite (oui = 1 (defaut), non = 0)", eFx.c), new eFu("Tri des cellules, voir effet pour les valeurs, outrepasse le m\u00e9lange (0 pour le tri par d\u00e9faut)", eFx.c)));
    private int C;
    private boolean D;
    private boolean E = true;
    private int F;

    @Override
    public aqr_2 c_() {
        return v;
    }

    @Override
    public eHV aE() {
        eis_0 eis_02 = new eis_0();
        eis_02.C = this.C;
        eis_02.E = this.E;
        eis_02.D = this.D;
        return eis_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        this.ba();
        if (this.B == null && this.D()) {
            return;
        }
        List<Su> list = eiu_0.a(this, this.D);
        if (this.E) {
            Collections.shuffle(list);
        }
        if (this.F > 0) {
            this.a(list);
        }
        this.C = Math.min(list.size(), this.C);
        for (int k = 0; k < this.C; ++k) {
            this.a(this.B.iterator(), sd_02, false, list.get(k));
        }
    }

    @Override
    private void a(List<Su> list) {
        eJV eJV2 = eJV.a(this.F);
        eJZ eJZ2 = eJV2.a(this.e.P_());
        Ordering ordering = Ordering.from((Comparator)eJZ2).onResultOf((Function)new eIt(this));
        list.sort((Comparator<Su>)ordering);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(Iterator<efh_0> iterator, sd_0 sd_02, boolean bl, Su su) {
        efn_0 efn_02 = efn_0.a(bl, false, (ejh_0)sd_02);
        if (this.a(eff_0.o) && efn_02.g() == -1) {
            efn_02.a(this.aZ());
        }
        try {
            this.a(iterator, efn_02, su);
        }
        catch (Exception exception) {
            a.error((Object)("Exception levee lors de l'execution d'un groupe d'effets id " + ((efh_0)this.c).i()), (Throwable)exception);
        }
        finally {
            efn_02.a();
        }
    }

    private void a(Iterator<efh_0> iterator, Sr sr, Su su) {
        while (iterator.hasNext()) {
            efh_0 efh_02 = iterator.next();
            efh_02.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), su.G(), su.H(), su.I(), su, sr, false);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        fil_0 fil_02;
        if (this.c == null) {
            return;
        }
        this.D = false;
        this.E = true;
        this.F = 0;
        if (((efh_0)this.c).F() >= 1) {
            this.C = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        }
        if (((efh_0)this.c).F() >= 2) {
            boolean bl = this.D = ((efh_0)this.c).a(1, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 3) {
            boolean bl = this.E = ((efh_0)this.c).a(2, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 4) {
            this.F = ((efh_0)this.c).a(3, this.aZ(), eFb.a);
        }
        if ((fil_02 = fim_0.a().a(((efh_0)this.c).i())) != null) {
            this.B = fil_02.b(this.aZ());
        }
    }

    @Override
    boolean a_(sd_0 sd_02) {
        if (((efh_0)this.c).F() >= 2 && ((efh_0)this.c).a(1, this.aZ(), eFb.a) == 1) {
            return true;
        }
        return super.a_(sd_02);
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public void z() {
        super.z();
        this.C = -1;
        this.D = false;
        this.E = true;
        this.F = 0;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aE();
    }
}

