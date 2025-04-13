/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from bor
 */
public class bor_1
implements rv_0,
ajh_1 {
    private static final Logger i = Logger.getLogger(bor_1.class);
    public static final String a = "main";
    public static final String b = "mainCustom";
    public static final String d = "hasCustom";
    public static final String e = "isCustomFull";
    public static final String f = "fight";
    public static final String g = "secondary";
    public static final byte h = 8;
    private static final HashMap<String, eps_0> j = new HashMap();
    private final TByteObjectHashMap<bon_2> k = new TByteObjectHashMap();
    private final blx_1 l;
    private final ArrayList<bon_2> m = new ArrayList();
    private final ArrayList<bon_2> n = new ArrayList();
    private final ArrayList<bon_2> o = new ArrayList();
    private final ArrayList<bon_2> p = new ArrayList();
    private static final String q = "highlightedCharacteristics";
    private static final Pattern r;

    private static void b(eps_0 ... eps_0Array) {
        for (eps_0 eps_02 : eps_0Array) {
            j.put(eps_02.name(), eps_02);
        }
    }

    public bor_1(blx_1 blx_12) {
        this.l = blx_12;
        this.a(blx_12);
        this.e();
    }

    private void a(blx_1 blx_12) {
        this.k.put(eps_0.V.a(), (Object)new bof_2(blx_12.a_(eps_0.T), this, blx_12, blx_12.a_(eps_0.b), blx_12.a_(eps_0.T)));
        this.k.put(eps_0.b.a(), (Object)new boz_1(blx_12.a_(eps_0.b), this, blx_12));
        this.k.put(eps_0.T.a(), (Object)new boz_1(blx_12.a_(eps_0.T), this, blx_12, 39));
        this.k.put(eps_0.J.a(), (Object)new bou_1(blx_12.a_(eps_0.J), this));
        this.k.put(eps_0.c.a(), (Object)new bol_2(blx_12.a_(eps_0.c), this, blx_12));
        this.k.put(eps_0.Y.a(), (Object)new bom_2(blx_12.a_(eps_0.Y), this, blx_12));
        this.k.put(eps_0.al.a(), (Object)new boa_1(this, blx_12));
        this.k.put(eps_0.ax.a(), (Object)new boe_1(this, blx_12));
        this.k.put(eps_0.ar.a(), (Object)new boc_1(this, blx_12));
        this.a(blx_12.a_(eps_0.d), (byte)2);
        this.a(blx_12.a_(eps_0.e), (byte)5);
        this.a(blx_12.a_(eps_0.j));
        this.a(blx_12.a_(eps_0.B));
        this.a(blx_12, eps_0.q, eps_0.v, true);
        this.a(blx_12, eps_0.s, eps_0.x, true);
        this.a(blx_12, eps_0.r, eps_0.w, true);
        this.a(blx_12, eps_0.t, eps_0.y, true);
        this.a(blx_12, eps_0.R, eps_0.S, true);
        this.a(blx_12, eps_0.aj, eps_0.ak, true);
        this.a(blx_12, eps_0.v, eps_0.q, false);
        this.a(blx_12, eps_0.x, eps_0.s, false);
        this.a(blx_12, eps_0.w, eps_0.r, false);
        this.a(blx_12, eps_0.y, eps_0.t, false);
        this.a(blx_12, eps_0.S, eps_0.R, false);
        this.a(blx_12, eps_0.ak, eps_0.aj, false);
        this.a(blx_12.a_(eps_0.G));
        this.a(blx_12.a_(eps_0.F));
        this.a(blx_12.a_(eps_0.D));
        this.a(blx_12.a_(eps_0.E));
        this.a(blx_12.a_(eps_0.n));
        this.c(blx_12.a_(eps_0.Q));
        this.b(blx_12.a_(eps_0.i));
        this.c(blx_12.a_(eps_0.h));
        this.b(blx_12.a_(eps_0.H));
        this.b(blx_12.a_(eps_0.ao));
        this.a(blx_12.a_(eps_0.P));
        this.a(blx_12.a_(eps_0.k));
        this.a(blx_12.a_(eps_0.m));
        this.a(blx_12.a_(eps_0.o));
        this.a(blx_12.a_(eps_0.j));
        this.a(blx_12.a_(eps_0.K));
        this.a(blx_12.a_(eps_0.C));
        this.a(blx_12.a_(eps_0.A));
        this.a(blx_12.a_(eps_0.g));
        this.a(blx_12.a_(eps_0.f));
        this.a(blx_12.a_(eps_0.p));
        this.a(blx_12.a_(eps_0.u));
        this.a(blx_12.a_(eps_0.W));
        this.a(blx_12.a_(eps_0.ad));
        this.a(blx_12.a_(eps_0.ae));
        this.a(blx_12.a_(eps_0.ah));
        this.b(blx_12.a_(eps_0.ab));
        this.b(blx_12.a_(eps_0.au));
        this.b(blx_12.a_(eps_0.av));
    }

    private void e() {
        this.h();
        this.g();
        this.f();
    }

    private void f() {
        this.o.add((bon_2)this.k.get(eps_0.K.a()));
        this.o.add((bon_2)this.k.get(eps_0.W.a()));
        this.o.add((bon_2)this.k.get(eps_0.m.a()));
        this.o.add((bon_2)this.k.get(eps_0.n.a()));
        this.o.add((bon_2)this.k.get(eps_0.ad.a()));
        this.o.add((bon_2)this.k.get(eps_0.au.a()));
        this.o.add((bon_2)this.k.get(eps_0.ae.a()));
        this.o.add((bon_2)this.k.get(eps_0.av.a()));
        this.o.add((bon_2)this.k.get(eps_0.o.a()));
        this.o.add((bon_2)this.k.get(eps_0.ab.a()));
        this.o.add((bon_2)this.k.get(eps_0.ah.a()));
    }

    private void g() {
        this.n.add((bon_2)this.k.get(eps_0.H.a()));
        this.n.add((bon_2)this.k.get(eps_0.ao.a()));
        this.n.add((bon_2)this.k.get(eps_0.h.a()));
        this.n.add((bon_2)this.k.get(eps_0.Q.a()));
        this.n.add((bon_2)this.k.get(eps_0.B.a()));
        this.n.add((bon_2)this.k.get(eps_0.j.a()));
        this.n.add((bon_2)this.k.get(eps_0.g.a()));
        this.n.add((bon_2)this.k.get(eps_0.f.a()));
        this.n.add((bon_2)this.k.get(eps_0.C.a()));
        this.n.add((bon_2)this.k.get(eps_0.A.a()));
        this.n.add((bon_2)this.k.get(eps_0.k.a()));
        this.n.add((bon_2)this.k.get(eps_0.P.a()));
    }

    private void h() {
        this.m.add((bon_2)this.k.get(eps_0.b.a()));
        this.m.add((bon_2)this.k.get(eps_0.c.a()));
        this.m.add((bon_2)this.k.get(eps_0.d.a()));
        this.m.add((bon_2)this.k.get(eps_0.e.a()));
    }

    private void a(epa_1 epa_12) {
        this.a(epa_12, (byte)-1);
    }

    private void a(epa_1 epa_12, byte by) {
        eps_0 eps_02 = epa_12.t();
        this.k.put(eps_02.a(), (Object)new boq_2(epa_12, this, by));
    }

    private void b(epa_1 epa_12) {
        this.b(epa_12, (byte)-1);
    }

    private void b(epa_1 epa_12, byte by) {
        eps_0 eps_02 = epa_12.t();
        this.k.put(eps_02.a(), (Object)new bod_1(epa_12, this, by));
    }

    private void c(epa_1 epa_12) {
        this.c(epa_12, (byte)-1);
    }

    private void c(epa_1 epa_12, byte by) {
        eps_0 eps_02 = epa_12.t();
        this.k.put(eps_02.a(), (Object)new boy_1(epa_12, this, by));
    }

    private void a(blx_1 blx_12, eps_0 eps_02, eps_0 eps_03, boolean bl) {
        epa_1 epa_12 = blx_12.a_(eps_02);
        epa_1 epa_13 = blx_12.a_(eps_03);
        this.k.put(epa_12.t().a(), (Object)new bov_1(epa_12, this, blx_12, epa_13, bl));
    }

    public void a(eps_0 ... eps_0Array) {
        for (eps_0 eps_02 : eps_0Array) {
            bon_2 bon_22 = (bon_2)this.k.get(eps_02.a());
            if (bon_22 == null) continue;
            bon_22.u();
        }
    }

    @Override
    public void a(rs_0 rs_02) {
        eps_0 eps_02 = (eps_0)rs_02.p();
        switch (eps_02) {
            case b: 
            case T: 
            case V: 
            case d: 
            case c: 
            case e: 
            case al: 
            case ax: {
                fis_1.a().a((ajf_1)this.l, "timelineDescription");
                break;
            }
            case u: {
                this.a(eps_0.y, eps_0.x, eps_0.v, eps_0.w, eps_0.S, eps_0.ak);
                break;
            }
            case p: {
                this.a(eps_0.t, eps_0.s, eps_0.q, eps_0.r, eps_0.R, eps_0.aj);
            }
        }
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.m;
        }
        if (string.equals(b)) {
            return this.p;
        }
        if (string.equals(d)) {
            return this.p.size() != 0;
        }
        if (string.equals(e)) {
            return this.p.size() >= 8;
        }
        if (string.equals(f)) {
            return this.n;
        }
        if (string.equals(g)) {
            return this.o;
        }
        eps_0 eps_02 = j.get(string);
        if (eps_02 != null) {
            return this.k.get(eps_02.a());
        }
        return null;
    }

    public bon_2 a(eps_0 eps_02) {
        return (bon_2)this.k.get(eps_02.a());
    }

    public void a(eps_0 eps_02, boolean bl) {
        this.a(eps_02, bl, true);
        this.b();
    }

    public void a(eps_0 eps_02, boolean bl, boolean bl2) {
        bon_2 bon_22 = (bon_2)this.k.get(eps_02.a());
        if (bon_22 == null) {
            i.warn((Object)("On essaye de highlighter une caract\u00e9ristique qui n'est pas dans le provider : " + eps_02));
            return;
        }
        bon_22.a(bl);
        if (bl && !this.p.contains(bon_22)) {
            this.p.add(bon_22);
            if (bl2) {
                fis_1.a().a((ajf_1)this, e, b, d);
            }
        } else if (!bl && this.p.contains(bon_22)) {
            this.p.remove(bon_22);
            if (bl2) {
                fis_1.a().a((ajf_1)this, e, b, d);
            }
        }
    }

    private void i() {
        this.p.clear();
        TByteObjectIterator tByteObjectIterator = this.k.iterator();
        while (tByteObjectIterator.hasNext()) {
            tByteObjectIterator.advance();
            ((bon_2)tByteObjectIterator.value()).a(false);
        }
    }

    public void a() {
        this.i();
        String string = azr_0.a().a((byte)1, this.j());
        if (string == null) {
            return;
        }
        Matcher matcher = r.matcher(string);
        while (matcher.find()) {
            byte by = Co.g(matcher.group(1));
            eps_0 eps_02 = eps_0.a(by);
            if (eps_02 == null) continue;
            if (!j.containsKey(eps_02.name())) {
                this.a(eps_02, false, false);
                continue;
            }
            this.a(eps_02, true, false);
        }
        fis_1.a().a((ajf_1)this, e, b, d);
    }

    public void b() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.p.size();
        for (int k = 0; k < n; ++k) {
            stringBuilder.append(this.p.get(k).f().a()).append(";");
        }
        azr_0.a().a((byte)1, this.j(), stringBuilder.toString());
    }

    private String j() {
        return q + this.l.a_();
    }

    public void c() {
        this.m.clear();
        this.m.add((bon_2)this.k.get(eps_0.b.a()));
        this.m.add((bon_2)this.k.get(eps_0.c.a()));
        this.m.add((bon_2)this.k.get(eps_0.d.a()));
        this.m.add((bon_2)this.k.get(eps_0.al.a()));
    }

    static {
        bor_1.b(eps_0.b, eps_0.T, eps_0.V, eps_0.c, eps_0.d, eps_0.e, eps_0.j, eps_0.B, eps_0.J, eps_0.q, eps_0.s, eps_0.r, eps_0.t, eps_0.R, eps_0.aj, eps_0.v, eps_0.x, eps_0.w, eps_0.y, eps_0.S, eps_0.ak, eps_0.G, eps_0.F, eps_0.D, eps_0.E, eps_0.n, eps_0.Q, eps_0.P, eps_0.k, eps_0.m, eps_0.H, eps_0.W, eps_0.ao, eps_0.o, eps_0.j, eps_0.i, eps_0.h, eps_0.K, eps_0.C, eps_0.A, eps_0.g, eps_0.f, eps_0.Y, eps_0.au, eps_0.av, eps_0.ad, eps_0.ae, eps_0.ah, eps_0.ab, eps_0.al, eps_0.ax, eps_0.ar);
        r = Pattern.compile("([0-9]+);?");
    }
}

