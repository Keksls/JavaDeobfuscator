/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aPW
 */
public class apw_0
implements ape_0 {
    protected static final Logger a = Logger.getLogger(apw_0.class);
    bwh_0 b;
    private long c;
    private static final float[] d = new float[]{1.0f, 1.0f, 1.0f, 0.9f};
    private static final String e = "STATIC_EFFECT";
    private static final apw_0 f = new apw_0();
    private static int g = 1;
    private final Stack<sr_0> h = new Stack();
    private final HashMap<sr_0, abv_0> i = new HashMap();
    private final HashMap<sr_0, abu> j = new HashMap();
    private final TLongObjectHashMap<TIntArrayList> k = new TLongObjectHashMap();
    private static final TIntProcedure l = new apz_0();

    public static apw_0 a() {
        return f;
    }

    private static int f() {
        if (g == Integer.MAX_VALUE) {
            return 1;
        }
        return g++;
    }

    private apw_0() {
    }

    public void a(sr_0 sr_02) {
        abv_0 abv_02;
        bhn_2 bhn_22 = ((bhr_2)((Object)sr_02)).aq();
        if (bhn_22.o()) {
            this.c(sr_02, bhn_22);
        }
        if (this.k.containsKey(sr_02.a_())) {
            return;
        }
        if (bhn_22.b()) {
            try {
                this.b(sr_02, bhn_22);
            }
            catch (NumberFormatException numberFormatException) {
                a.error((Object)("Aps au format \u00e9trange : '" + bhn_22.c() + "' pour l'area " + bhn_22.p() + "-" + bhn_22.a()));
                return;
            }
        }
        if ((abv_02 = this.a(sr_02, bhn_22)) == null && !bhn_22.l()) {
            if (!bhn_22.i()) {
                return;
            }
            if (sr_02.P() == null) {
                return;
            }
        }
        if (sr_02.P() != null) {
            int n = sr_02.G();
            int n2 = sr_02.H();
            short s2 = sr_02.I();
            Su su = sr_02.v();
            Iterable<int[]> iterable = null;
            if (sr_02 instanceof ekt_0) {
                iterable = ((ekt_0)sr_02).au();
                n = 0;
                n2 = 0;
            } else if (su != null) {
                iterable = sr_02.P().a(n, n2, s2, sr_02.ag(), sr_02.ah(), sr_02.ai(), sr_02.F());
                n = 0;
                n2 = 0;
            } else {
                iterable = sr_02.P().e();
            }
            if (this.b != null) {
                tg_0 tg_02 = this.b.g();
                if (iterable != null) {
                    for (int[] nArray : iterable) {
                        int n3;
                        int n4 = n + nArray[0];
                        if (!tg_02.c(n4, n3 = n2 + nArray[1])) continue;
                        short s3 = tg_02.i(n4, n3);
                        if (abv_02 != null && !abv_02.b(n4, n3, s3)) {
                            abv_02.a(n4, n3, s3);
                        }
                        if (bhn_22.i()) {
                            this.a(bhn_22, n4, n3, s3);
                        }
                        if (!bhn_22.l()) continue;
                        long l = aii_0.a(n4, n3, s3);
                        acz.a().a(l, 1.0f, 1.0f, 1.0f, 0.0f);
                    }
                }
            } else {
                for (int[] nArray : iterable) {
                    int n5 = n + nArray[0];
                    int n6 = n2 + nArray[1];
                    DisplayedScreenElement displayedScreenElement = acs_0.b().d(n5, n6, s2, acV.c);
                    if (displayedScreenElement == null) continue;
                    short s4 = displayedScreenElement.d().c();
                    if (abv_02 != null && !abv_02.b(n5, n6, s4)) {
                        abv_02.a(n5, n6, s4);
                    }
                    if (!bhn_22.i()) continue;
                    this.a(bhn_22, n5, n6, s4);
                }
            }
        } else {
            a.error((Object)"area.getArea() is null");
        }
        if (abv_02 != null) {
            this.i.put(sr_02, abv_02);
        }
    }

    @Nullable
    private abv_0 a(sr_0 sr_02, bhn_2 bhn_22) {
        if (!bhn_22.m()) {
            return null;
        }
        if (this.i.containsKey(sr_02)) {
            return null;
        }
        String string = null;
        try {
            string = azs_0.a().a("highLightGfxPath") + bhn_22.n() + ".tga";
        }
        catch (Exception exception) {
            a.error((Object)"Exception during createElementSelection", (Throwable)exception);
        }
        if (string != null) {
            ays_2 ays_22 = abv_0.a(string);
            return new abv_0(e + apw_0.f(), d, ays_22, aim.b);
        }
        a.error((Object)"Chemin vers la source nulle");
        return null;
    }

    private void b(sr_0 sr_02, bhn_2 bhn_22) {
        apv_2 apv_22;
        if (this.k.contains(sr_02.a_())) {
            return;
        }
        int n = Integer.parseInt(bhn_22.c());
        if (bhn_22.e()) {
            apv_22 = azu_0.j().k();
            if (this.a(sr_02, (bmr_1)apv_22)) {
                n = Integer.parseInt(bhn_22.d());
            } else if (this.b(sr_02, (bmr_1)apv_22)) {
                n = Integer.parseInt(bhn_22.f());
            }
        }
        apv_22 = aij_0.a().a(n, bhn_22.k());
        ahh_0 ahh_02 = bhn_22.h();
        if (ahh_02 != null) {
            ((FreeParticleSystem)apv_22).a(ahh_02);
        } else {
            ((FreeParticleSystem)apv_22).b(sr_02.G(), sr_02.H(), sr_02.I());
        }
        this.a(bhn_22, (FreeParticleSystem)apv_22);
    }

    private boolean a(sr_0 sr_02, bmr_1 bmr_12) {
        return sr_02.v() != null && sr_02.v() == bmr_12;
    }

    private boolean b(sr_0 sr_02, bmr_1 bmr_12) {
        if (this.a(sr_02, bmr_12)) {
            return false;
        }
        if (sr_02 instanceof bgx_2) {
            boolean bl = ((bgx_2)sr_02).au() == 6;
            return bl && sr_02.Y() == bmr_12.Y();
        }
        return false;
    }

    private void c(sr_0 sr_02, bhn_2 bhn_22) {
        Object object;
        abz_0 abz_02;
        Object object2;
        if (this.j.containsKey(sr_02)) {
            return;
        }
        int n = sr_02.G();
        int n2 = sr_02.H();
        short s2 = sr_02.I();
        Su su = sr_02.v();
        boolean bl = sr_02.w() == ele_0.j.a();
        boolean bl2 = sr_02.w() == ele_0.o.a();
        boolean bl3 = bl || bl2;
        boolean bl4 = false;
        if (bl3 && sr_02 instanceof afa_0) {
            object2 = ((afa_0)((Object)sr_02)).e();
            if (object2 != null) {
                abz_02 = object2;
                bl4 = true;
            } else {
                abz_02 = new afe_0(sr_02.a_(), n, n2, s2);
            }
            abz_02.b(n, (float)n2, (float)s2);
            object = (afv)abz_02;
            ((afv)object).a(this.b.c());
            ((abz_0)object).a(bhn_22.s());
            if (bl) {
                ((bgq_2)sr_02).a((afv)object);
            } else if (bl2) {
                ((bgl_2)sr_02).a((afv)object);
            }
        } else {
            abz_02 = new apx_0(this, sr_02.a_(), n, n2, s2);
            abz_02.a(bhn_22.s());
        }
        try {
            object2 = azs_0.a().a("ANMInteractiveElementPath");
            object2 = String.format((String)object2, bhn_22.p());
            abz_02.a((String)object2, true);
            if (bl2) {
                if (su instanceof bnh_1) {
                    abz_02.a(atm_1.b, new bog_2(((bnh_1)su).ew().a()).e());
                } else if (su instanceof bmv_1) {
                    object = ((bmv_1)su).cY();
                    ((bpg_1)object).b((TObjectProcedure<bpj_1>)((TObjectProcedure)bpj_12 -> {
                        if (bpj_12.a == atm_1.b.b()) {
                            bpl_1.a((afv)abz_02, bpj_12);
                        }
                        return true;
                    }));
                }
            }
            abz_02.a(gi_0.k(bhn_22.p()));
        }
        catch (Exception exception) {
            a.error((Object)"Failed to initialize an animated element", (Throwable)exception);
        }
        bhn_22.a(abz_02);
        this.j.put(sr_02, abz_02);
        if (bl3) {
            afz_0.d().a((afv)abz_02);
        } else {
            abe_0.d().a((abu)abz_02);
        }
        if (!bl4) {
            object2 = azu_0.j().k().cP();
            cuy_0.a((bvx_2)object2, abz_02);
            abz_02.a(new apy_0(this, abz_02));
        }
    }

    private void a(bhn_2 bhn_22, int n, int n2, short s2) {
        int n3;
        try {
            n3 = Integer.parseInt(bhn_22.j());
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Aps au format \u00e9trange : '" + bhn_22.j() + "' pour l'area " + bhn_22.p() + "-" + bhn_22.a()));
            return;
        }
        FreeParticleSystem freeParticleSystem = aij_0.a().a(n3);
        freeParticleSystem.b(n, n2, s2);
        this.a(bhn_22, freeParticleSystem);
    }

    private void a(bhn_2 bhn_22, FreeParticleSystem freeParticleSystem) {
        if (freeParticleSystem == null) {
            return;
        }
        if (this.b != null) {
            freeParticleSystem.a(this.b.c());
        }
        aik_0.a().b(freeParticleSystem);
        TIntArrayList tIntArrayList = (TIntArrayList)this.k.get(bhn_22.a());
        if (tIntArrayList == null) {
            tIntArrayList = new TIntArrayList();
            this.k.put(bhn_22.a(), (Object)tIntArrayList);
        }
        tIntArrayList.add(freeParticleSystem.ac());
    }

    public void b(sr_0 sr_02) {
        switch (ele_0.a(sr_02.w())) {
            case e: 
            case o: 
            case j: {
                So so = sr_02.O();
                if (!(so instanceof eFr)) break;
                int n = ((eFr)so).k();
                bwh_0 bwh_02 = bwj_1.a().a(n);
                if (bwh_02 == null) break;
                aPc.f().b(bwh_02, sr_02);
                break;
            }
        }
    }

    private abu d(sr_0 sr_02) {
        Set<sr_0> set = this.j.keySet();
        for (sr_0 sr_03 : set) {
            if (sr_03.a_() != sr_02.a_()) continue;
            return this.j.remove(sr_03);
        }
        return null;
    }

    public void c(sr_0 sr_02) {
        long l;
        TIntArrayList tIntArrayList;
        abv_0 abv_02;
        if (sr_02 == null) {
            a.warn((Object)"On veut supprimer une area null");
            return;
        }
        abu abu2 = this.d(sr_02);
        if (abu2 != null) {
            abe_0.d().b(abu2);
            abu2.R();
        }
        if ((abv_02 = this.i.remove(sr_02)) != null) {
            abv_02.a();
        }
        if ((tIntArrayList = (TIntArrayList)this.k.remove(l = sr_02.a_())) != null) {
            tIntArrayList.forEach(apw_0.l);
        }
        for (sr_0 sr_03 : this.h) {
            if (sr_03.a_() != l) continue;
            this.h.remove(sr_03);
            break;
        }
        this.e(sr_02);
    }

    private void e(sr_0 sr_02) {
        if (sr_02.P() == null) {
            return;
        }
        int n = sr_02.G();
        int n2 = sr_02.H();
        short s2 = sr_02.I();
        Su su = sr_02.v();
        Iterable<int[]> iterable = null;
        if (sr_02 instanceof ekt_0) {
            iterable = ((ekt_0)sr_02).au();
            n = 0;
            n2 = 0;
        } else if (su != null) {
            iterable = sr_02.P().a(n, n2, s2, su.G(), su.H(), su.I(), su.F());
            n = 0;
            n2 = 0;
        } else {
            iterable = sr_02.P().e();
        }
        if (this.b == null || iterable == null) {
            return;
        }
        tg_0 tg_02 = this.b.g();
        for (int[] nArray : iterable) {
            int n3 = n + nArray[0];
            int n4 = n2 + nArray[1];
            bhn_2 bhn_22 = ((bhr_2)((Object)sr_02)).aq();
            if (!tg_02.c(n3, n4) || !bhn_22.l()) continue;
            short s3 = tg_02.i(n3, n4);
            long l = aii_0.a(n3, n4, s3);
            acz.a().a(l, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public void c() {
        for (abu object : this.j.values()) {
            abe_0.d().b(object);
            object.R();
        }
        this.j.clear();
        for (abv_0 abv_02 : this.i.values()) {
            abv_02.a();
        }
        this.i.clear();
        Iterator<Object> iterator = this.k.iterator();
        while (iterator.hasNext()) {
            iterator.advance();
            TIntArrayList tIntArrayList = (TIntArrayList)iterator.value();
            if (tIntArrayList == null) continue;
            tIntArrayList.forEach(l);
        }
        this.k.clear();
        this.c = 0L;
    }

    @Override
    public void b() {
        while (!this.h.empty()) {
            this.a(this.h.pop());
        }
    }

    public void a(sr_0 sr_02, bwh_0 bwh_02) {
        this.h.push(sr_02);
        this.b = bwh_02;
    }

    public bwh_0 d() {
        return this.b;
    }

    public void a(long l) {
        if (this.b == null) {
            return;
        }
        blx_1 blx_12 = this.b.e(l);
        if (blx_12 == null) {
            return;
        }
        blx_1 blx_13 = blx_12.aq();
        ss_0 ss_02 = this.b.i();
        if (ss_02 == null) {
            return;
        }
        long l2 = this.b.r();
        if (l2 == 0L || l2 == -1L) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        long l3 = bmr_12.a_();
        if (this.c != 0L && this.c != l3 || euw_2.a.d(l) != null) {
            for (sr_0 sr_02 : ss_02.f()) {
                if (sr_02.v() == blx_13 && sr_02.w() != ele_0.e.a()) continue;
                this.f(sr_02);
            }
        }
        if (l3 == l && this.b.r() == l) {
            return;
        }
        long l4 = blx_13.a_();
        for (sr_0 sr_03 : ss_02.f()) {
            if (sr_03 == null || sr_03.v() == null || sr_03.v().a_() != l4 || sr_03.w() != ele_0.b.a() && sr_03.w() != ele_0.k.a() && sr_03.w() != ele_0.e.a() || sr_03.a(eld_0.e) && bmr_12.Y() != sr_03.Y()) continue;
            this.a(sr_03, this.b);
        }
        this.c = l4;
        this.b();
    }

    public void e() {
        if (this.b == null) {
            return;
        }
        long l = this.b.r();
        if (l == 0L) {
            return;
        }
        ss_0 ss_02 = this.b.i();
        if (ss_02 == null) {
            return;
        }
        for (sr_0 sr_02 : ss_02.f()) {
            this.f(sr_02);
        }
        this.c = 0L;
    }

    private void f(sr_0 sr_02) {
        boolean bl;
        if (sr_02 == null) {
            return;
        }
        Su su = sr_02.v();
        if (su == null) {
            return;
        }
        boolean bl2 = su instanceof erb_2 && ((erb_2)((Object)su)).cl() != null;
        boolean bl3 = bl = bl2 && ((erb_2)((Object)su)).cl().a_() == this.c;
        if (su.a_() == this.c || bl) {
            boolean bl4;
            boolean bl5 = sr_02.w() == ele_0.b.a();
            boolean bl6 = bl4 = sr_02.w() == ele_0.k.a();
            if (!bl5 && !bl4 && sr_02.w() != ele_0.e.a()) {
                return;
            }
            if (bl5 || bl4) {
                this.b.ae_().filter(blx_12 -> su.a_() != blx_12.a_() && su.a_() != blx_12.aq().a_()).ifPresent(blx_12 -> this.c(sr_02));
            } else {
                this.c(sr_02);
            }
        }
    }
}

