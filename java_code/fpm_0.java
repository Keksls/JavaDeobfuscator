/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.THashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.awt.EventQueue;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fpM
 */
public class fpm_0
implements ajy_1,
ann_1,
anp_1 {
    static final Logger C = Logger.getLogger(fpm_0.class);
    private static final fpm_0 D = new fpm_0();
    public static final long a = 0L;
    public static final long b = 1L;
    public static final long c = 2L;
    public static final long d = 4L;
    public static final long e = 8L;
    public static final long f = 16L;
    public static final long g = 64L;
    public static final long h = 128L;
    public static final long i = 256L;
    public static final long j = 512L;
    public static final long k = 1024L;
    public static final long l = 2048L;
    public static final long m = 8192L;
    public static final long n = 16384L;
    public static final long o = 32768L;
    public static final long p = 65536L;
    public static final long q = 131072L;
    public static final long r = 262144L;
    public static final int s = 0;
    public static final int t = 25999;
    public static final int u = 26999;
    public static final int v = 27000;
    public static final int w = 29999;
    private ajh_0 E;
    private fyX F;
    private final fyw_0 G = new fyw_0();
    private final fis_1 H = fis_1.a();
    private final fya_0 I = new fya_0();
    fzf J;
    private fjt_1 K;
    private Oy L;
    private anx_1 M;
    public static final int x = Integer.MAX_VALUE;
    public static final int y = Integer.MIN_VALUE;
    private final List<fki_1> N = new ArrayList<fki_1>();
    private final List<fkk_1> O = new ArrayList<fkk_1>();
    private final THashMap<String, fyb_0> P = new THashMap();
    private final HashMap<String, Class<?>> Q;
    private URL R;
    private int S;
    private final TIntObjectHashMap<fpt_0> T = new TIntObjectHashMap();
    private int U;
    private fpt_0 V;
    private fts_0 W;
    private fpt_0 X;
    private fvb_0 Y;
    public String z;
    public String A;
    public String B;
    private final Collection<String> Z = new ArrayList<String>();
    private final ArrayList<fjd_2> aa = new ArrayList();
    private final Collection<fjd_2> ab = new ArrayList<fjd_2>();
    final ArrayList<ans_1> ac = new ArrayList();
    final Collection<ans_1> ad = new ArrayList<ans_1>();
    final ArrayList<anr_1> ae = new ArrayList();
    final Collection<anr_1> af = new ArrayList<anr_1>();
    private final Stack<fzm_0> ag = new Stack();
    private final Collection<String> ah = new ArrayList<String>();
    private azj_2 ai = new azf_2(0, 0, 0, 0);
    private int aj;
    private anq_1 ak;
    private boolean al = false;

    public static fpm_0 b() {
        return D;
    }

    private fpm_0() {
        this.Q = new HashMap();
        this.a("xulor", fpu_0.class);
    }

    @Override
    public void a(ans_1 ans_12) {
        if (ans_12 != null && !this.ac.contains(ans_12)) {
            this.ac.add(ans_12);
        }
    }

    @Override
    public void b(ans_1 ans_12) {
        this.ad.add(ans_12);
    }

    @Override
    public void a(anr_1 anr_12) {
        if (anr_12 != null && !this.ae.contains(anr_12)) {
            this.ae.add(anr_12);
        }
    }

    @Override
    public void b(anr_1 anr_12) {
        this.af.add(anr_12);
    }

    public void a(String string) {
        if (string != null && !this.ah.contains(string)) {
            this.ah.add(string);
        }
    }

    public azj_2 c() {
        return this.ai;
    }

    public void a(azj_2 azj_22) {
        this.ai = azj_22;
    }

    public fjt_1 d() {
        return this.K;
    }

    public void a(fjt_1 fjt_12) {
        this.K = fjt_12;
    }

    public void a(fzf fzf2) {
        this.J = fzf2;
    }

    public fzf e() {
        return this.J;
    }

    public void a(anx_1 anx_12) {
        this.M = anx_12;
    }

    public anx_1 f() {
        return this.M;
    }

    public fyw_0 g() {
        return this.G;
    }

    public fya_0 h() {
        return this.I;
    }

    @Override
    public void a(ajh_0 ajh_02) {
        this.E = ajh_02;
    }

    public ajh_0 i() {
        return this.E;
    }

    public fyX j() {
        return this.F;
    }

    public void a(fyX fyX2) {
        this.F = fyX2;
    }

    public anq_1 k() {
        return this.ak;
    }

    @Override
    public void a(anq_1 anq_12) {
        this.ak = anq_12;
        this.w();
    }

    public void a(boolean bl) {
        this.al = bl;
    }

    public boolean l() {
        return this.al;
    }

    private void w() {
    }

    @Nullable
    public ajb_1 b(String string) {
        return this.ak.a(string);
    }

    @Override
    public void propertyChange(ajx_1 ajx_12) {
    }

    public String c(String string) {
        if (this.L != null) {
            return this.L.a(string, new Object[0]);
        }
        return string;
    }

    public void a(Oy oy) {
        this.L = oy;
    }

    public String m() {
        StringBuilder stringBuilder = new StringBuilder("# XULOR INFOS #");
        stringBuilder.append('\n').append("- loadedElementCount = ").append(this.P.size());
        stringBuilder.append('\n').append("- loadedElements = \n");
        if (!this.P.isEmpty()) {
            this.P.forEachKey((TObjectProcedure)new fpn_0(this, stringBuilder));
        }
        return stringBuilder.toString();
    }

    public void a(URL uRL) {
        this.R = uRL;
    }

    public boolean d(String string) {
        return this.Q.containsKey(string);
    }

    public void a(String string, Class<?> clazz) {
        this.Q.put(string, clazz);
    }

    public void e(String string) {
        this.Q.remove(string);
    }

    public void n() {
        this.Q.clear();
        this.a("xulor", fpu_0.class);
    }

    public Class<?> f(String string) {
        if (string == null) {
            return this.Q.get("xulor");
        }
        if (!this.Q.containsKey(string)) {
            C.error((Object)("Le package " + string + " est inconnue !"));
            return null;
        }
        return this.Q.get(string);
    }

    public fpt_0 g(String string) {
        return fpt_0.a(string);
    }

    public void a(TIntObjectHashMap<String> tIntObjectHashMap) {
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fpt_0 fpt_02 = this.g((String)tIntObjectIterator.value());
            if (fpt_02 == null) continue;
            this.T.put(tIntObjectIterator.key(), (Object)fpt_02);
        }
    }

    @Deprecated
    public fzm_0 h(String string) {
        return this.a(string, " ", 2L, 0, 0);
    }

    @Deprecated
    public fzm_0 a(String string, long l) {
        return this.a(string, null, l, 0, 0);
    }

    @Deprecated
    public fzm_0 a(String string, String string2, long l) {
        return this.a(string, string2, null, l, 0, 0);
    }

    public fzm_0 a(String string, int n, int n2) {
        return this.a(string, " ", null, 2L, n, n2);
    }

    public fzm_0 a(String string, long l, int n, int n2) {
        return this.a(string, " ", null, l, n, n2);
    }

    public fzm_0 a(String string, String string2, long l, int n, int n2) {
        return this.a(string, " ", string2, l, n, n2);
    }

    public fzm_0 a(String string, String string2, String string3, long l, int n, int n2) {
        return this.a(string, string2, string3, l, null, n, n2);
    }

    public fzm_0 a(String string, String string2, String string3, long l, @Nullable ArrayList<String> arrayList, int n, int n2) {
        return this.a(new fzn_0(n, n2, string, string2, string3, l, arrayList, 0));
    }

    public fzm_0 a(fzn_0 fzn_02) {
        return fzs_0.a().a(fzn_02);
    }

    public fzm_0 b(fzn_0 fzn_02) {
        fzm_0 fzm_02 = null;
        fpt_0 fpt_02 = (fpt_0)this.T.get(fzn_02.i());
        if (fpt_02 != null) {
            String string = "MessageBox_" + this.S++;
            if (this.S > 0x7FFFFFFE) {
                this.S = 0;
            }
            fzm_02 = new fzm_0(string, fzn_02);
            this.a(fpt_02, fzm_02, fzn_02);
        }
        return fzm_02;
    }

    private void a(fpt_0 fpt_02, fzm_0 fzm_02, fzn_0 fzn_02) {
        if (fpt_02 == null) {
            return;
        }
        try {
            fyy_0 fyy_02 = this.I.a(fzm_02.a());
            this.I.a(fyy_02);
            fyb_0 fyb_02 = this.a(fpt_02, this.I, fyy_02);
            if (fyb_02 instanceof fvk_0) {
                fyb_02.setElementMapRoot(true);
                fvk_0 fvk_02 = (fvk_0)fyb_02;
                fvk_02.setId(fzm_02.a());
                fvk_02.setModalLevel((short)20000);
                this.a(fvk_02.getId(), fvk_02, fta_0.getInstance().getLayeredContainer(), 26000, 256L);
                fzq_0.a(fvk_02, fzm_02, fzn_02);
                fzn_02.a(new fpo_0(this, fvk_02, fzn_02));
                this.a(fzm_02);
                fza_0.a().j();
            }
        }
        catch (Exception exception) {
            C.error((Object)"Erreur lors du chargement de la messageBox", (Throwable)exception);
        }
    }

    public void i(String string) {
        this.V = this.g(string);
        if (this.V == null) {
            C.error((Object)("Le chemin '" + string + "' vers le fichier de d\u00e9finition des popupMenu est invalide !"));
        }
    }

    public fts_0 o() {
        if (this.V == null) {
            return null;
        }
        fts_0 fts_02 = null;
        try {
            String string = "PopupMenu_" + this.U++;
            if (this.U > 0x7FFFFFFE) {
                this.U = 0;
            }
            fyy_0 fyy_02 = this.I.a(string);
            this.I.a(fyy_02);
            fyb_0 fyb_02 = this.a(this.V, this.I, fyy_02);
            if (fyb_02 instanceof fts_0) {
                fyb_02.setElementMapRoot(true);
                fts_02 = (fts_0)fyb_02;
                fts_02.setId(string);
                fts_02.setModalLevel((short)30000);
                fts_02.setVisible(false);
                this.F.a().getLayeredContainer().a(fts_02, 30000);
                this.P.put((Object)string, (Object)fts_02);
            }
        }
        catch (Exception exception) {
            C.error((Object)exception.getMessage());
        }
        return fts_02;
    }

    public void a(fts_0 fts_02, int n, int n2) {
        this.p();
        this.W = fts_02;
        fts_02.a(n, n2);
    }

    public void p() {
        if (this.W != null) {
            this.o(this.W.getId());
        }
    }

    public void j(String string) {
        this.X = this.g(string);
        if (this.X == null) {
            C.error((Object)("Le chemin '" + string + "' vers le fichier de d\u00e9finition des mrus est invalide !"));
        }
    }

    public void q() {
        ArrayList arrayList = new ArrayList();
        if (!this.P.isEmpty()) {
            this.P.forEachValue((TObjectProcedure)new fpp_0(this, arrayList));
        }
        for (fyb_0 fyb_02 : arrayList) {
            this.a(fyb_02.getElementMap().c(), true);
        }
    }

    public fvb_0 r() {
        if (this.X == null) {
            return null;
        }
        fvb_0 fvb_02 = null;
        try {
            Object object;
            String string = "MRU";
            fvE fvE2 = (fvE)this.P.get((Object)"MRU");
            if (fvE2 != null) {
                object = new fcv_1(fvE2);
                ((fzs)object).onCheckOut();
                fvE2.dispatchEvent((fzs)object);
                this.a("MRU", true);
            }
            object = this.I.a("MRU");
            this.I.a((fyy_0)object);
            fyb_0 fyb_02 = this.a(this.X, this.I, (fyy_0)object);
            if (fyb_02 instanceof fvb_0) {
                fyb_02.setElementMapRoot(true);
                fvb_02 = (fvb_0)fyb_02;
                fvb_02.setId("MRU");
                fvb_02.setModalLevel((short)30000);
                fvb_02.setVisible(false);
                this.F.a().getLayeredContainer().a(fvb_02, 26999);
                this.P.put((Object)"MRU", (Object)fvb_02);
            }
        }
        catch (Exception exception) {
            C.error((Object)exception.getMessage());
        }
        return fvb_02;
    }

    public void a(fvb_0 fvb_02) {
        this.s();
        this.Y = fvb_02;
        fvb_02.b();
    }

    public void a(fvb_0 fvb_02, int n, int n2) {
        this.s();
        this.Y = fvb_02;
        fyX fyX2 = fpm_0.b().F;
        n = fyX2.b(n);
        n2 = fyX2.c(n2);
        fvb_02.a(n, n2);
    }

    public void s() {
        if (this.Y != null && !this.Y.isUnloading()) {
            this.o(this.Y.getElementMap().c());
        }
    }

    public fyb_0 k(String string) {
        return (fyb_0)this.P.get((Object)string);
    }

    public Iterator<fyb_0> t() {
        return this.P.values().iterator();
    }

    public void a(String string, YQ yQ) {
        this.N.add(new fkj_1(string, yQ));
    }

    public void a(String string, String string2, fka_2 fka_22) {
        this.G.a(string, string2, fka_22);
    }

    public void a(fym_0 fym_02, fyo_0 fyo_02, String string) {
        this.G.a(fym_02, fyo_02, string);
    }

    public void a(String string, String string2) {
        try {
            this.G.a(string, string2);
        }
        catch (RuntimeException runtimeException) {
            C.error((Object)("Error occured during theme loading : " + runtimeException.getMessage()), (Throwable)runtimeException);
        }
    }

    public void l(String string) {
        try {
            this.G.a(string);
        }
        catch (Exception exception) {
            C.error((Object)("Error occured during colors loading : " + exception.getMessage()), (Throwable)exception);
        }
    }

    @Override
    public void a() {
        fdo_2.b().a();
        this.G.b(true);
    }

    public fyb_0 a(String string, String string2, short s2) {
        return this.a(string, string2, 0L, s2);
    }

    public fyb_0 a(String string, String string2, int n, short s2) {
        return this.a(string, string2, n, 0L, s2);
    }

    public fyb_0 a(String string, String string2, long l, short s2) {
        return this.a(string, string2, Integer.MAX_VALUE, l, s2);
    }

    public fyb_0 a(String string, String string2, String string3, boolean bl, int n, int n2, long l, short s2) {
        return this.a(string, string2, Integer.MAX_VALUE, string3, bl, n, n2, l, s2);
    }

    public fyb_0 a(String string, String string2, int n, long l, short s2) {
        fkg_1 fkg_12 = new fkg_1();
        fkg_12.b(string).a(string2).a(n).a(l).a(s2);
        return this.a(fkg_12.a());
    }

    public fyb_0 a(String string, String string2, String string3, String string4, String string5, long l, short s2) {
        fkg_1 fkg_12 = new fkg_1();
        fkg_12.b(string).a(string2).c(string3).d(string4).f(string5).a(l).a(s2);
        return this.a(fkg_12.a());
    }

    public fyb_0 a(String string, String string2, int n, String string3, boolean bl, int n2, int n3, long l, short s2) {
        fkg_1 fkg_12 = new fkg_1();
        fkg_12.b(string).a(string2).a(bl).b(true).b(n2).c(n3).a(n).a(l).a(s2);
        return this.a(fkg_12.a());
    }

    public fyb_0 a(fkf_1 fkf_12) {
        long l = System.nanoTime();
        fyb_0 fyb_02 = this.b(fkf_12);
        int n = fkf_12.h();
        if (n != Integer.MAX_VALUE) {
            this.N.add(new fkk_1(fkf_12.d(), n, 0L));
        }
        if (this.l()) {
            long l2 = System.nanoTime() - l;
            C.info((Object)String.format("[XULOR-DEBUG] Loading of %s take %s ms (%s ns)", fkf_12.d(), l2 / 1000000L, l2));
        }
        return fyb_02;
    }

    private fyb_0 b(fkf_1 fkf_12) {
        long l;
        fpt_0 fpt_02 = fkf_12.a();
        if (fpt_02 == null) {
            return null;
        }
        String string = fkf_12.d();
        if (this.ah.contains(string)) {
            for (int k = this.aa.size() - 1; k >= 0; --k) {
                this.aa.get(k).a(string);
            }
        }
        if (((l = fkf_12.f()) & 0x10L) == 16L) {
            this.r(string);
        }
        URL uRL = fkf_12.i();
        fyb_0 fyb_02 = fkf_12.r();
        fyy_0 fyy_02 = fkf_12.c();
        fyb_0 fyb_03 = fkf_12.g();
        if (fyb_02 != null && fyy_02 == null && (fyy_02 = fyb_02.getElementMap()) != null) {
            fyy_02.b(string);
        }
        boolean bl = false;
        if (string != null && fyy_02 == null && !this.P.containsKey((Object)string)) {
            fyy_02 = this.I.a(string);
            bl = true;
        }
        if (fyy_02 != null) {
            try {
                HashMap<String, String> hashMap = fkf_12.b();
                if (hashMap != null) {
                    for (Map.Entry object2 : hashMap.entrySet()) {
                        fyy_02.b((String)object2.getKey(), (String)object2.getValue());
                    }
                }
                fyy_0 fyy_03 = this.I.b();
                this.I.a(fyy_02);
                URL uRL2 = this.R;
                this.R = uRL;
                if (fyb_02 == null) {
                    fyb_02 = this.a(fpt_02, this.I, fyy_02);
                }
                if ((l & 0x40L) != 64L) {
                    if (fyb_03 == null) {
                        int n;
                        fsn_0 fsn_02 = this.F.a().getLayeredContainer();
                        if ((l & 0x100L) == 256L) {
                            n = 26000;
                            if (this.K != null) {
                                this.K.d();
                            }
                        } else {
                            n = (l & 0x40000L) == 262144L ? -10000 : ((l & 0x10000L) == 65536L ? -40000 : ((l & 4L) == 4L ? 27000 : ((l & 0x20000L) == 131072L ? 25999 : ((l & 2L) == 2L ? 26999 : ((l & 8L) == 8L ? 29999 : 0)))));
                        }
                        if (fyb_02 instanceof fvE) {
                            fsn_02.a((fvE)fyb_02, n);
                            fyb_03 = fsn_02;
                        } else {
                            fsn_02.addFromXML(fyb_02);
                        }
                    } else {
                        fyb_03.addFromXML(fyb_02);
                    }
                }
                fyb_02.setElementMapRoot(bl);
                if ((l & 0x100L) == 256L) {
                    fyd_0.a().b(fyb_02);
                    this.Z.add(string);
                }
                if ((l & 0x200L) == 512L) {
                    fyd_0.a().a(fyb_02);
                    this.Z.add(string);
                }
                this.R = uRL2;
                this.I.a(fyy_03);
            }
            catch (Exception exception) {
                C.error((Object)("Le chargement de " + fpt_02.b + " a \u00e9chou\u00e9"), (Throwable)exception);
            }
            this.a(fyb_02, string, fyb_03, fkf_12.k(), fkf_12.l(), fkf_12.m(), fkf_12.n(), fkf_12.j(), fkf_12.o(), fkf_12.p(), fkf_12.q(), fyy_02, uRL, l, fkf_12.e());
        } else {
            C.error((Object)"On essaye de charger une dialog existant d\u00e9j\u00e0 sans avoir utilis\u00e9 l'option FORCE_RELOAD");
        }
        EventQueue.invokeLater(new fpq_0(this, string));
        return fyb_02;
    }

    private void a(fyb_0 fyb_02, String string, fyb_0 fyb_03, String string2, String string3, String string4, String string5, boolean bl, boolean bl2, int n, int n2, fyy_0 fyy_02, URL uRL, long l, short s2) {
        if (fyb_02 != null) {
            fyb_0 fyb_04;
            Object object;
            if (string != null) {
                this.P.put((Object)string, (Object)fyb_02);
            }
            fkc_1 fkc_12 = null;
            if ((l & 0x400L) == 1024L) {
                fkc_12 = new fkc_1((fvE)fyb_02);
                fkc_12.a(true);
                fkc_12.b(true);
            }
            if ((l & 0x8000L) == 32768L) {
                if (fkc_12 == null) {
                    fkc_12 = new fkc_1((fvE)fyb_02);
                }
                fkc_12.a(true);
            }
            if ((l & 0x4000L) == 16384L) {
                if (fkc_12 == null) {
                    fkc_12 = new fkc_1((fvE)fyb_02);
                }
                fkc_12.b(true);
            }
            if (fkc_12 != null) {
                fyb_02.setUserDefinedManager(fkc_12);
                fyb_02.loadPreferences();
                object = this.ak.a(string);
                if (object != null) {
                    ((ajv_1)object).a(fyb_02);
                }
            }
            if (this.J != null) {
                if ((l & 0x2000L) == 8192L) {
                    this.J.a(string);
                } else {
                    this.J.a(string, false);
                }
            }
            if (string3 != null) {
                object = (fvE)fyb_02;
                if (!(((fvE)object).getLayoutData() instanceof fid_1)) {
                    ((fvE)object).setLayoutData(new fid_1());
                }
                fyb_04 = (fid_1)((fvE)object).getLayoutData();
                ((fid_1)fyb_04).setReferentWidget((fvE)this.P.get((Object)string3));
                if (string2 != null) {
                    ((fid_1)fyb_04).setCascadeMethodEnabled(true);
                }
                ((fid_1)fyb_04).setControlGroup(string5);
            }
            if (string5 != null && (object = fyb_02.getParentOfType(ftv_0.class)) != null) {
                fyb_04 = (ftv_0)object;
                fvE fvE2 = (fvE)fyb_02;
                ((ftv_0)fyb_04).getWindowManager().a(fvE2, string5);
                if (string2 != null) {
                    ((ftv_0)fyb_04).getWindowManager().c(fvE2, string5);
                }
                fpr_0 fpr_02 = new fpr_0(this, fvE2, (ftv_0)fyb_04, string5, string2);
                this.a(fpr_02);
            }
            if (bl2 && fyb_02 instanceof fvE) {
                if (n != Integer.MIN_VALUE) {
                    ((fvE)fyb_02).setX(n);
                }
                if (n2 != Integer.MIN_VALUE) {
                    ((fvE)fyb_02).setY(n2);
                }
            }
        }
    }

    public void m(String string) {
        this.J.a(string);
    }

    public void n(String string) {
        this.J.b(string);
    }

    private void a(String string, fyb_0 fyb_02, fyo fyo2, int n, long l) {
        if (fyo2 instanceof fsn_0) {
            ((fsn_0)fyo2).a((fvE)fyb_02, n);
        } else {
            fyo2.addFromXML(fyb_02);
        }
        if ((l & 0x100L) == 256L) {
            fyd_0.a().b(fyb_02);
            this.Z.add(string);
        }
        if ((l & 0x200L) == 512L) {
            fyd_0.a().a(fyb_02);
            this.Z.add(string);
        }
        this.P.put((Object)string, (Object)fyb_02);
    }

    public fyb_0 a(URL uRL, fya_0 fya_02, fyy_0 fyy_02, boolean bl, URL uRL2, String string, String string2) {
        ath_2 ath_22 = fpm_0.b(uRL);
        return this.G.a(ath_22, uRL, fya_02, fyy_02, bl, uRL2, string, string2);
    }

    public static ath_2 b(URL uRL) {
        ath_2 ath_22 = new ath_2();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(uRL.openStream());
        atg_2 atg_22 = new atg_2();
        atg_22.a(bufferedInputStream);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        ((InputStream)bufferedInputStream).close();
        return ath_22;
    }

    public fyb_0 a(fpt_0 fpt_02, fya_0 fya_02, fyy_0 fyy_02) {
        if (fpt_02.a != null) {
            return this.a(fpt_02.a, fya_02, fyy_02);
        }
        return this.a(fpt_02.b, fya_02, fyy_02, false, null, null, null);
    }

    public fyb_0 a(Class<? extends fyq> clazz, fya_0 fya_02, fyy_0 fyy_02) {
        return (fyb_0)clazz.newInstance().a(fya_02, fyy_02);
    }

    public void o(String string) {
        this.a(string, false);
    }

    public void a(String string, boolean bl) {
        if (!this.P.containsKey((Object)string)) {
            return;
        }
        if (!this.F.a().isVisible()) {
            this.r(string);
        } else if (bl) {
            this.r(string);
        } else {
            this.N.add(new fkk_1(string));
        }
    }

    private void r(String string) {
        fyb_0 fyb_02;
        if (this.P.containsKey((Object)string) && (fyb_02 = (fyb_0)this.P.get((Object)string)) != null) {
            fyb_02.destroySelfFromParent();
        }
    }

    public void p(String string) {
        if (this.P.containsKey((Object)string)) {
            for (int k = this.ac.size() - 1; k >= 0; --k) {
                ans_1 ans_12 = this.ac.get(k);
                if (this.ad.contains(ans_12)) continue;
                ans_12.dialogUnloaded(string);
            }
            fyb_0 fyb_02 = (fyb_0)this.P.remove((Object)string);
            if (fyb_02 != null && this.Z.contains(string)) {
                this.Z.remove(string);
                fyd_0.a().c(fyb_02);
            }
            if (this.J != null) {
                this.J.c(string);
            }
        }
    }

    public void u() {
        this.x();
    }

    private void x() {
        if (!this.P.isEmpty()) {
            C.info((Object)"Unloading All !");
            this.P.forEachKey((TObjectProcedure)new fps_0(this));
            for (int k = this.N.size() - 1; k >= 0; --k) {
                fki_1 fki_12 = this.N.get(k);
                C.info((Object)("Unloading " + fki_12));
                if (!(fki_12 instanceof fkk_1)) continue;
                this.N.remove(k);
            }
        }
        fyd_0.a().b();
        this.Z.clear();
        this.F.a().b();
        this.P.clear();
    }

    public boolean q(String string) {
        fyb_0 fyb_02 = (fyb_0)this.P.get((Object)string);
        return fyb_02 != null && !fyb_02.isUnloading();
    }

    public boolean b(String string, String string2) {
        if (this.P.containsKey((Object)string2)) {
            return false;
        }
        fyb_0 fyb_02 = (fyb_0)this.P.remove((Object)string);
        this.P.put((Object)string2, (Object)fyb_02);
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(ano_1 ano_12, int n) {
        this.aj += n;
        if (this.G.h()) {
            this.G.g();
        }
        this.H.b();
        if (!this.ab.isEmpty()) {
            this.aa.removeAll(this.ab);
            this.ab.clear();
        }
        if (!this.af.isEmpty()) {
            this.ae.removeAll(this.af);
            this.af.clear();
        }
        if (!this.ad.isEmpty()) {
            this.ac.removeAll(this.ad);
            this.ad.clear();
        }
        try {
            List<fki_1> list = this.N;
            synchronized (list) {
                fki_1 fki_12;
                int n2 = this.O.size();
                for (int k = 0; k < n2; ++k) {
                    fki_12 = this.O.get(k);
                    if ((long)(this.aj - ((fkk_1)fki_12).b()) - ((fkk_1)fki_12).c() <= 0L) continue;
                    ((fkk_1)fki_12).f();
                    this.N.add(this.O.remove(k));
                    --k;
                    --n2;
                }
                while (!this.N.isEmpty()) {
                    fki_1 fki_13 = this.N.remove(0);
                    if (fki_13 instanceof fkk_1) {
                        fki_12 = (fkk_1)fki_13;
                        if (!((fkk_1)fki_12).e()) {
                            ((fkk_1)fki_12).a(this.aj);
                            this.O.add((fkk_1)fki_12);
                            continue;
                        }
                        if (((fkk_1)fki_12).d()) {
                            this.x();
                            continue;
                        }
                        this.r(((fkk_1)fki_12).a());
                        continue;
                    }
                    if (fki_13 instanceof fke_1) {
                        fki_12 = (fke_1)fki_13;
                        this.a(((fke_1)fki_12).c, ((fke_1)fki_12).a, ((fke_1)fki_12).b, ((fke_1)fki_12).e, ((fke_1)fki_12).d);
                        continue;
                    }
                    if (fki_13 instanceof fkj_1) {
                        fki_12 = (fkj_1)fki_13;
                        fyb_0 fyb_02 = (fyb_0)this.P.get((Object)((fkj_1)fki_12).a());
                        if (fyb_02 instanceof fvc_0) {
                            ((fvc_0)fyb_02).setTarget(((fkj_1)fki_12).b());
                            continue;
                        }
                        C.error((Object)("Tentative de SetWatcherTarget avec une id invalide " + ((fkj_1)fki_12).a()));
                        continue;
                    }
                    if (fki_13 instanceof fkh_1) {
                        fki_12 = (fkh_1)fki_13;
                        fzd_0.a().a(((fkh_1)fki_12).a);
                        fzd_0.a().a(((fkh_1)fki_12).b);
                        fzd_0.a().b(((fkh_1)fki_12).c);
                        fzd_0.a().a(((fkh_1)fki_12).d);
                        fzd_0.a().c();
                        continue;
                    }
                    if (!(fki_13 instanceof fkl_1)) continue;
                    fzd_0.a().d();
                }
            }
        }
        catch (Throwable throwable) {
            C.error((Object)"Exception dans Xulor.onProcess() : ", throwable);
        }
    }

    @Override
    public void a(ano_1 ano_12, int n, int n2) {
        fjm_1.a().a(this.F, n, n2);
    }

    @Override
    public void a(ano_1 ano_12) {
        this.F = (fyX)ano_12;
    }

    public void a(fzm_0 fzm_02) {
        this.ag.push(fzm_02);
    }

    public void b(fzm_0 fzm_02) {
        this.ag.remove(fzm_02);
    }

    public boolean v() {
        if (this.ag.empty()) {
            return false;
        }
        fzm_0 fzm_02 = this.ag.pop();
        fzm_02.a(32768, null);
        return true;
    }
}

