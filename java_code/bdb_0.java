/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from bDb
 */
public class bdb_0
extends bFZ
implements bEw {
    static final Logger t = Logger.getLogger(bdb_0.class);
    private static final TObjectProcedure<Object> u = new bdc_1();
    private eun_1 v;
    private static final String w = "\\{[^\\{\\}]*\\}";
    public static final String q = "(\\{[^\\{\\}]*\\})+";
    private static final String J = "(\\{[^\\{\\}]*\\})+(;[a-zA-Z0-9\\.]*)?";
    private static final Pattern K = Pattern.compile("\\{[^\\{\\}]*\\}");
    public static final Pattern r = Pattern.compile("(\\{[^\\{\\}]*\\})+");
    private String L;
    private final List<bdf_0> M = new ArrayList<bdf_0>();
    private ArrayList<akx_2> N;

    private void ap() {
        assert (this.L == null);
        this.L = "";
        assert (this.M.isEmpty());
    }

    private void aq() {
        this.L = null;
        this.M.clear();
    }

    private String ar() {
        return bae.h().a(this.L, new Object[0]);
    }

    private cSS[] aD() {
        int n = this.M.size();
        cSS[] cSSArray = new cSS[n];
        for (int k = 0; k < n; ++k) {
            bdf_0 bdf_02 = this.M.get(k);
            cTF cTF2 = (cTF)cSY.w.a();
            cTF2.a(bdf_02.a);
            cTF2.a(bdf_02.b);
            cTF2.b(Tv.N[k]);
            cSSArray[k] = cTF2;
        }
        return cSSArray;
    }

    private void aE() {
        if (!this.l.matches(J)) {
            t.error((Object)("[LD] Erreur de param\u00e8tres pour l'IE : " + this.d + " - Param\u00e8tres : " + this.l));
            this.L = "";
            this.i(false);
            return;
        }
        Matcher matcher = r.matcher(this.l);
        if (!matcher.find() || matcher.groupCount() != 1) {
            t.error((Object)("[LD] Erreur de param\u00e8tres pour l'IE : " + this.d + " - Param\u00e8tres : " + this.l));
            this.L = "";
            this.i(false);
            return;
        }
        String string = matcher.group();
        if (matcher.hitEnd()) {
            this.L = "";
            this.i(false);
        } else {
            this.L = this.l.substring(matcher.end() + 1);
        }
        Matcher matcher2 = K.matcher(string);
        while (matcher2.find()) {
            String string2 = matcher2.group();
            String string3 = matcher2.group().substring(1, string2.length() - 1);
            String[] stringArray = string3.split(";");
            this.M.add(new bdf_0(Integer.valueOf(stringArray[0]), stringArray[1]));
        }
    }

    private void aF() {
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 3 && stringArray.length != 2) {
            t.error((Object)("[LevelDesign] Un GenericActivableInteractiveElement doit avoir 2 param\u00e8tres - typeId=" + this.af() + " / id=" + this.a_()));
            this.L = "";
            this.i(false);
            return;
        }
        this.M.add(new bdf_0(Integer.valueOf(stringArray[0]), stringArray[1]));
        if (stringArray.length == 3) {
            this.L = stringArray[2];
        } else {
            this.L = "";
            this.i(false);
        }
    }

    @Override
    public fii Z() {
        return fij.a().a(this.v.n());
    }

    @Override
    public short ao() {
        return 0;
    }

    protected bdb_0() {
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.g = 1;
        this.f(true);
        assert (this.v == null);
        assert (this.N == null);
        this.ap();
        this.b(true);
        this.g(true);
        this.i(true);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.v = null;
        this.aG();
        this.aq();
    }

    @Override
    public boolean N() {
        if (!super.N()) {
            return false;
        }
        cSS[] cSSArray = this.aI();
        if (cSSArray == null || cSSArray.length <= 0) {
            return false;
        }
        for (cSS cSS2 : cSSArray) {
            if (cSS2 == null) continue;
            cSS2.a(this);
            if (!cSS2.p() || !cSS2.c()) continue;
            return true;
        }
        return false;
    }

    @Override
    public String al_() {
        if (this.v == null) {
            return this.ar();
        }
        return bae.h().a(106, (long)this.v.m(), new Object[0]);
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (!this.P()) {
            return false;
        }
        this.a(tv);
        this.b(tv);
        return true;
    }

    @Override
    public Tv ap_() {
        if (this.v != null) {
            return this.v.d();
        }
        return Tv.N[0];
    }

    @Override
    public Tv[] r() {
        if (this.v != null) {
            return this.v.e();
        }
        return Tv.N;
    }

    @Override
    public cSS[] az_() {
        if (this.v == null) {
            return this.aD();
        }
        bmr_1 bmr_12 = azu_0.j().k();
        euq_1[] euq_1Array = this.v.a();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int k = 0; k < euq_1Array.length; ++k) {
            euq_1 euq_12 = euq_1Array[k];
            if (euq_12.l()) continue;
            fii fii2 = fij.a().a(euq_12.f());
            if (euq_12.k() == 0) {
                t.error((Object)("Le visual " + k + " du generic param " + this.v.m() + " n'a pas de group d'action"));
                continue;
            }
            ani_2 ani_22 = new ani_2();
            short s2 = euq_12.i();
            ArrayList<bgi_2> arrayList2 = new ArrayList<bgi_2>();
            eup_1 eup_12 = null;
            for (eup_1 eup_13 : euq_12.g()) {
                if (eup_13.b() != s2) continue;
                eup_12 = eup_13;
                break;
            }
            if (eup_12 == null) continue;
            for (euo_1 euo_12 : eup_12.e()) {
                bgi_2 bgi_22 = bgk_1.a(euo_12);
                if (bgi_22 == null || bgi_22.c() != null && !bgi_22.c().b(bmr_12, null, null, bmr_12.Q_())) continue;
                String string = bgi_22.f();
                if (string != null) {
                    if (ani_22.q() != 0) {
                        ani_22.m();
                    }
                    ani_22.a((CharSequence)string);
                }
                boolean bl = bgi_22.a(bmr_12);
                boolean bl2 = bgi_22.b(bmr_12);
                if (!bl || !bl2) continue;
                arrayList2.add(bgi_22);
            }
            if (eup_12.e().length != 0 && arrayList2.isEmpty()) continue;
            cte_0 cte_02 = (cte_0)cSY.X.a();
            cte_02.a(fii2.c());
            cte_02.d("desc.mru." + fii2.d());
            cte_02.a(bDZ.b(euq_12.b(), euq_12.c(), euq_12.e(), euq_12.d()));
            cte_02.a(bDZ.a(euq_12.b(), euq_12.c(), euq_12.e(), euq_12.d()));
            int n = 1;
            cte_02.c(true);
            cte_02.c(ani_22.r());
            cte_02.a(s2);
            cte_02.a(arrayList2);
            arrayList.add(cte_02);
        }
        return arrayList.toArray(new cSS[arrayList.size()]);
    }

    @Override
    public void ar_() {
        super.ar_();
        try {
            int n = Integer.parseInt(this.l);
            eun_1 eun_12 = (eun_1)evl_1.a.a(evg_1.p, n);
            if (eun_12 == null) {
                t.error((Object)("[LD] L'IE de g\u00e9n\u00e9ric " + this.d + " \u00e0 un parametre [" + n + "] qui ne correspond a rien dans les Admins"));
                return;
            }
            this.v = eun_12;
        }
        catch (NumberFormatException numberFormatException) {
            t.warn((Object)("ancien param\u00e9trage pour l'IE g\u00e9n\u00e9ric " + this.a_()));
            if (!this.l.isEmpty() && this.l.charAt(0) == '{') {
                this.aE();
            }
            this.aF();
        }
    }

    @Override
    public boolean aF_() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.b.a(new emh_0[]{bmr_12});
    }

    @Override
    public void aD_() {
        super.aD_();
        if (this.v == null) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("elementId", this.a_());
        for (euq_1 euq_12 : this.v.a()) {
            if (!euq_12.l()) continue;
            eup_1 eup_12 = euq_12.h();
            for (euo_1 euo_12 : eup_12.e()) {
                if (euo_12.f() != evd_2.a) continue;
                akx_2 akx_22 = cgm_2.a(epe_0.b, euo_12.a(), hashMap);
                if (this.N == null) {
                    this.N = new ArrayList();
                }
                this.N.add(akx_22);
                akx_22.b();
            }
        }
    }

    @Override
    public void aE_() {
        super.aE_();
        this.aG();
    }

    private void aG() {
        if (this.N == null) {
            return;
        }
        for (akx_2 akx_22 : this.N) {
            akx_22.a(u);
            akx_22.h();
            akx_22.f();
        }
        this.N = null;
    }

    @Override
    public bgf_1 aG_() {
        if (this.G == null) {
            this.G = new bge_0(this);
        }
        return this.G;
    }

    @Override
    public boolean y() {
        return true;
    }

    static /* synthetic */ void a(bdb_0 bdb_02, abm_1 abm_12) {
        bdb_02.a(abm_12);
    }
}

