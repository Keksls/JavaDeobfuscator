/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ceq
 */
public class ceq_2
implements ajh_1 {
    public static final String a = "currentPage";
    public static final String b = "playerList";
    public static final String d = "warningList";
    public static final String e = "muteList";
    public static final String f = "penalFile";
    public static final String g = "penalFileFilter";
    public static final String h = "penalFileUiTitle";
    public static final String i = "isPenalFileLoading";
    public static final String j = "sanctionList";
    public static final String k = "currentSearch";
    public static final String l = "searchResult";
    public static final String m = "moderatorsList";
    public static final String n = "moderatorGameServer";
    public static final String o = "moderatorPosition";
    public static final String p = "moderatorInstance";
    public static final String q = "isAdmin";
    public static final String r = "currentPlayer";
    public static final String s = "logs";
    public static final String t = "formattedLogs";
    public static final String u = "maximized";
    public static final String v = "tpLocations";
    public static final String w = "tpLocationSelected";
    public static final String x = "nations";
    public static final String y = "nationSelected";
    public static final String z = "opacity";
    public static final String A = "opacitySliderValue";
    public static final String B = "currentGuild";
    public static final String C = "hasGuildActionsRights";
    public static final String D = "canMutePartitions";
    public static final String E = "currentPartitionMuteStatus";
    public static final String F = "sendLocalizedEnabled";
    private ArrayList<String> G = new ArrayList();
    private final LinkedList<String> H = new LinkedList();
    private LinkedList<String> I = new LinkedList();
    private String J;
    private final List<fjy_0> K = new ArrayList<fjy_0>();
    private ceo_2 L = ceo_2.a;
    private final Map<String, cel_2> M = new LinkedHashMap<String, cel_2>();
    private cel_2 N;
    private cei_2 O;
    private final List<cer_2> P = new ArrayList<cer_2>();
    private final fwl Q = new fwl();
    private boolean R = false;
    private boolean S = ((bvx_0)ans_0.D().h()).a(bWe.aG);
    private final List<String> T;
    private cep_2 U;
    private final List<String> V;
    private cen_2 W;
    private float X = 100.0f - ((bvx_0)ans_0.D().h()).c(bWe.aF);
    private boolean Y;

    public ceq_2() {
        this.T = new ArrayList<String>();
        for (cep_2 enum_ : cep_2.values()) {
            this.T.add(enum_.d());
        }
        this.U = cep_2.a;
        this.V = new ArrayList<String>();
        for (Enum enum_ : cen_2.values()) {
            this.V.add(((cen_2)enum_).b());
        }
        this.W = cen_2.a(azu_0.j().k().bM());
    }

    public void a(String string) {
        this.U = cep_2.a(string);
    }

    public void c(String string) {
        this.W = cen_2.a(string);
    }

    public void a(flu_0 flu_02) {
        this.P.add(new cer_2(flu_02));
    }

    public void a(long l, long l2) {
        for (int k = this.P.size() - 1; k >= 0; --k) {
            flu_0 flu_02 = this.P.get(k).g();
            if (flu_02.a() != l || flu_02.f().getTime() != l2) continue;
            this.P.remove(k);
            break;
        }
    }

    public void a(boolean bl) {
        this.R = bl;
    }

    public void a() {
        this.P.clear();
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string2) {
        if (a.equals(string2)) {
            return this.L.a();
        }
        if (l.equals(string2)) {
            if (!this.I.isEmpty()) {
                return this.I;
            }
            return null;
        }
        if (b.equals(string2)) {
            return this.M.values();
        }
        if (m.equals(string2)) {
            String string3 = bae.h().a("moderationPanel.inGameModerators", new Object[0]) + " :";
            for (String string4 : this.G) {
                string3 = string3 + "\n - " + string4;
            }
            return string3;
        }
        if (o.equals(string2)) {
            int n = azu_0.j().k().G();
            int n2 = azu_0.j().k().H();
            short s2 = azu_0.j().k().I();
            return bae.h().a("moderationPanel.currentPosition", new Object[0]) + " : " + n + ", " + n2 + ", " + s2;
        }
        if (n.equals(string2)) {
            return bae.h().a("moderationPanel.currentGameServer", new Object[0]) + " : " + this.J;
        }
        if (p.equals(string2)) {
            long l = azu_0.j().k().T_();
            return bae.h().a("moderationPanel.currentInstance", new Object[0]) + " : " + l;
        }
        if (r.equals(string2)) {
            return this.N;
        }
        if (d.equals(string2)) {
            ArrayList<cet_2> arrayList = new ArrayList<cet_2>();
            for (eol_0 eol_02 : eol_0.values()) {
                if (eol_02.d() != eom_0.a) continue;
                arrayList.add(new cet_2(eol_02));
            }
            return arrayList;
        }
        if (e.equals(string2)) {
            ArrayList<cet_2> arrayList = new ArrayList<cet_2>();
            for (eol_0 eol_03 : eol_0.values()) {
                if (eol_03.d() != eom_0.b) continue;
                arrayList.add(new cet_2(eol_03));
            }
            return arrayList;
        }
        if (j.equals(string2)) {
            ArrayList<cet_2> arrayList = new ArrayList<cet_2>();
            for (eol_0 eol_04 : eol_0.values()) {
                if (eol_04.d() != eom_0.c) continue;
                arrayList.add(new cet_2(eol_04));
            }
            return arrayList;
        }
        if (t.equals(string2)) {
            ani_2 ani_22 = new ani_2();
            this.H.forEach(string -> this.a(ani_22, (String)string));
            return ani_22.r();
        }
        if (s.equals(string2)) {
            return Collections.unmodifiableList(this.H);
        }
        if (f.equals(string2)) {
            return this.b();
        }
        if (g.equals(string2)) {
            return this.Q;
        }
        if (h.equals(string2)) {
            return "Penal file of " + this.N.b() + " (account: " + this.N.c() + ")";
        }
        if (i.equals(string2)) {
            return this.R;
        }
        if (q.equals(string2)) {
            emS emS2 = emS.a(azu_0.j().n().v());
            return emS2 == emS.c || emS2 == emS.b;
        }
        if (u.equals(string2)) {
            return this.S;
        }
        if (v.equals(string2)) {
            return this.T;
        }
        if (w.equals(string2)) {
            return this.U.d();
        }
        if (x.equals(string2)) {
            return this.V;
        }
        if (y.equals(string2)) {
            return this.W.b();
        }
        if (z.equals(string2)) {
            return "1,1,1," + this.X / 100.0f;
        }
        if (A.equals(string2)) {
            return Float.valueOf(this.X);
        }
        if (B.equals(string2)) {
            return this.O;
        }
        if (C.equals(string2)) {
            return emp_0.b(azu_0.j().n().v(), emq_0.ab);
        }
        if (D.equals(string2)) {
            return emp_0.b(azu_0.j().n().v(), emq_0.H);
        }
        if (E.equals(string2)) {
            String string5 = this.K.isEmpty() ? "NO" : this.K.stream().map(Enum::name).collect(Collectors.joining(", "));
            return "Zone muted : " + string5;
        }
        if (F.equals(string2)) {
            return this.Y;
        }
        return null;
    }

    @NotNull
    public List<cer_2> b() {
        return this.P.stream().sorted(Comparator.comparing(cer_2::c).reversed()).collect(Collectors.toList());
    }

    private void a(ani_2 ani_22, String string) {
        ani_22.a((CharSequence)string).m();
    }

    public cel_2 c() {
        return this.N;
    }

    public void e(String string) {
        if (string == null) {
            return;
        }
        if (!this.M.containsKey(string)) {
            cel_2 cel_22 = new cel_2(string);
            this.M.put(string, cel_22);
            fis_1.a().a((ajf_1)this, b);
        }
    }

    public void a(cel_2 cel_22) {
        this.M.remove(cel_22.b());
        fis_1.a().a((ajf_1)this, b);
    }

    public void e() {
        this.M.clear();
        fis_1.a().a((ajf_1)this, b);
    }

    public void a(ceo_2 ceo_22) {
        this.L = ceo_22;
        fis_1.a().a((ajf_1)this, a);
    }

    public void f(String string) {
        this.e(string);
        this.N = this.M.get(string);
        this.a();
        this.R = true;
        fis_1.a().a((ajf_1)this, f, h, i);
        daX.a(flz_0.a, flx_0.a, (Object)string);
        fis_1.a().a((ajf_1)this, r, b);
        this.a(ceo_2.b);
    }

    public void g(String string) {
        this.J = string;
        fis_1.a().a((ajf_1)this, n);
    }

    public void a(ArrayList<String> arrayList) {
        this.G = arrayList;
        fis_1.a().a((ajf_1)this, m);
    }

    public void f() {
        this.I.clear();
        fis_1.a().a((ajf_1)this, l);
    }

    public void h(String string) {
        this.I.add(string);
        this.I.sort(String::compareTo);
        fis_1.a().a((ajf_1)this, l);
    }

    public void a(LinkedList<String> linkedList) {
        this.I = linkedList;
        fis_1.a().a((ajf_1)this, l);
    }

    public void i(String string) {
        this.H.addFirst(string);
        fis_1.a().a((ajf_1)this, s);
        fis_1.a().a((ajf_1)this, t);
    }

    public void g() {
        this.H.clear();
        fis_1.a().a((ajf_1)this, s);
        fis_1.a().a((ajf_1)this, t);
    }

    public ceo_2 h() {
        return this.L;
    }

    public void i() {
        this.S = !this.S;
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.aG, this.S);
    }

    public cep_2 j() {
        return this.U;
    }

    public cen_2 k() {
        return this.W;
    }

    public void a(float f2) {
        this.X = f2;
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.aF, 100.0f - this.X);
    }

    public cei_2 l() {
        return this.O;
    }

    public void a(cei_2 cei_22) {
        this.O = cei_22;
        fis_1.a().a((ajf_1)this, B);
    }

    public void a(Collection<fjy_0> collection) {
        this.K.clear();
        this.K.addAll(collection);
        fis_1.a().a((ajf_1)this, E);
    }

    public void b(boolean bl) {
        this.Y = bl;
        fis_1.a().a((ajf_1)this, F);
    }
}

