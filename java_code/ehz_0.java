/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eHZ
 */
public class ehz_0
extends eHG {
    private static final aqr_2 C = new eFw(new eFv("Params", new eFu("nb de rolls", eFx.b), new eFu("0 = cellule, 1 = cibles (default)", eFx.c)), new eFv("V\u00e9rifie le critere sur les cellules de la zone (pas sur l'effet de base)", new eFu("nb de rolls", eFx.b), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eFx.c)), new eFv("Utilise la direction vers la cellule cible", new eFu("nb de rolls", eFx.b), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eFx.c), new eFu("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", eFx.c)), new eFv("Calcul la zone avec la cellule du caster en cellule cible", new eFu("nb de rolls", eFx.b), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eFx.c), new eFu("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", eFx.c), new eFu("Calcul la zone avec la cellule du caster en cellule cible (1=oui)", eFx.c)), new eFv("Retrait des cellules deja utilis\u00e9es", new eFu("nb de rolls", eFx.b), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eFx.c), new eFu("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", eFx.c), new eFu("Calcul la zone avec la cellule du caster en cellule cible (1=oui)", eFx.c), new eFu("Retire de la liste les cellules d\u00e9j\u00e0 cibl\u00e9es (1=oui)", eFx.c)), new eFv("M\u00e9lange les cibles avant d'appliquer la limite", new eFu("nb de rolls", eFx.b), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eFx.c), new eFu("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", eFx.c), new eFu("Calcul la zone avec la cellule du caster en cellule cible (1=oui)", eFx.c), new eFu("UNUSED : Retire de la liste les cellules d\u00e9j\u00e0 cibl\u00e9es (1=oui)", eFx.c), new eFu("On m\u00e9lange les cibles avant d'appliquer la limite (oui = 1 (defaut), non = 0)", eFx.c)), new eFv("Tri des cellules avant d'appliquer la limite", new eFu("nb de rolls", eFx.b), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eFx.c), new eFu("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", eFx.c), new eFu("Calcul la zone avec la cellule du caster en cellule cible (1=oui)", eFx.c), new eFu("UNUSED : Retire de la liste les cellules d\u00e9j\u00e0 cibl\u00e9es (1=oui)", eFx.c), new eFu("On m\u00e9lange les cibles avant d'appliquer la limite (oui = 1 (defaut), non = 0)", eFx.c), new eFu("Tri des cellules, voir effet pour les valeurs, outrepasse le m\u00e9lange (0 pour le tri par d\u00e9faut)", eFx.c)));
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H = true;
    private int I = 0;

    public ehz_0() {
        this.M();
    }

    @Override
    public aqr_2 c_() {
        return C;
    }

    @Override
    public eHG aD() {
        ehz_0 ehz_02 = new ehz_0();
        this.a(ehz_02);
        ehz_02.H = this.H;
        return ehz_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (!this.D()) {
            return;
        }
        if (this.c == null) {
            a.error((Object)"Pas de genericEffect, \u00e7a ne devrait pas arriver");
            this.ba();
            return;
        }
        tg_0 tg_02 = this.h.e();
        if (tg_02 == null) {
            a.error((Object)("pas de fightmap sur le context " + this.h));
            return;
        }
        List<int[]> list = this.aM();
        if (list.isEmpty()) {
            this.ba();
            return;
        }
        if (this.H) {
            Collections.shuffle(list);
        }
        if (this.I > 0) {
            this.a(list);
        }
        efn_0 efn_02 = efn_0.a(false, false, (ejh_0)sd_02);
        if (this.a(eff_0.o) && efn_02.g() == -1) {
            efn_02.a(this.aZ());
        }
        this.v = Math.min(list.size(), this.v);
        for (int k = 0; k < this.v; ++k) {
            int[] nArray = list.get(k);
            for (efh_0 efh_02 : this.B) {
                short s2 = tg_02.i(nArray[0], nArray[1]);
                efh_02.a((Sm)this.k(), this.e, this.h, efc_0.a(), nArray[0], nArray[1], s2, null, efn_02, false);
            }
        }
    }

    @Override
    private void a(List<int[]> list) {
        eJV eJV2 = eJV.a(this.I);
        eJZ eJZ2 = eJV2.a(this.e.P_());
        list.sort(eJZ2);
    }

    private List<int[]> aM() {
        tg_0 tg_02 = this.h.e();
        if (tg_02 == null) {
            return Collections.emptyList();
        }
        if (this.aR()) {
            return this.a(tg_02);
        }
        aej_2 aej_22 = this.aQ();
        aff_1 aff_12 = this.aP();
        aff_1 aff_13 = this.aN();
        Iterable<int[]> iterable = ((efh_0)this.c).u().a(aff_12.d(), aff_12.e(), aff_12.f(), aff_13.d(), aff_13.e(), aff_13.f(), aej_22);
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        apc_2 apc_22 = ((efh_0)this.c).Q();
        aff_1 aff_14 = new aff_1();
        for (int[] nArray : iterable) {
            short s2;
            int n;
            int n2 = nArray[0];
            if (!tg_02.o(n2, n = nArray[1]) || !tg_02.c(n2, n) || (s2 = tg_02.i(n2, n)) == Short.MIN_VALUE) continue;
            if (this.D && apc_22 != null) {
                aff_14.c(n2, n, s2);
                if (!apc_22.b(this.e, aff_14, this, this.h)) continue;
            }
            arrayList.add(nArray);
        }
        return arrayList;
    }

    private List<int[]> a(tg_0 tg_02) {
        List<int[]> list = tg_02.x();
        apc_2 apc_22 = ((efh_0)this.c).Q();
        if (!this.D || apc_22 == null) {
            return list;
        }
        aff_1 aff_12 = new aff_1();
        Iterator<int[]> iterator = list.iterator();
        while (iterator.hasNext()) {
            int n;
            int[] nArray = iterator.next();
            int n2 = nArray[0];
            short s2 = tg_02.i(n2, n = nArray[1]);
            if (s2 == Short.MIN_VALUE) continue;
            aff_12.c(n2, n, s2);
            if (apc_22.b(this.e, aff_12, this, this.h)) continue;
            iterator.remove();
        }
        return list;
    }

    private aff_1 aN() {
        if (this.e != null) {
            return this.e.P_();
        }
        return this.g;
    }

    private aff_1 aP() {
        if (this.F) {
            return this.e.P_();
        }
        return this.g;
    }

    private aej_2 aQ() {
        if (this.e == null) {
            return aej_2.h;
        }
        if (this.E) {
            return this.e.P_().c(this.g);
        }
        return this.e.F();
    }

    @Override
    boolean a_(sd_0 sd_02) {
        if (((efh_0)this.c).F() >= 3 && ((efh_0)this.c).a(2, this.aZ(), eFb.a) == 1) {
            return true;
        }
        return super.a_(sd_02);
    }

    @Override
    public void j(sd_0 sd_02) {
        super.j(sd_02);
        this.D = false;
        this.H = true;
        this.I = 0;
        if (((efh_0)this.c).F() >= 3) {
            boolean bl = this.D = ((efh_0)this.c).a(2, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 4) {
            boolean bl = this.E = ((efh_0)this.c).a(3, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 5) {
            boolean bl = this.F = ((efh_0)this.c).a(4, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 6) {
            boolean bl = this.G = ((efh_0)this.c).a(5, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 7) {
            boolean bl = this.H = ((efh_0)this.c).a(6, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 8) {
            this.I = ((efh_0)this.c).a(7, this.aZ(), eFb.a);
        }
    }

    @Override
    public void z() {
        super.z();
        this.D = false;
        this.F = false;
        this.E = false;
        this.G = false;
        this.H = true;
        this.I = 0;
    }

    private boolean aR() {
        return ((efh_0)this.c).u().d() == aqe_1.m;
    }

    @Override
    public /* synthetic */ eHV aE() {
        return this.aD();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

