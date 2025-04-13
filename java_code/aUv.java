/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aUv
implements ajh_1 {
    private static final Logger i = Logger.getLogger(aUv.class);
    public static final int a = 4;
    public static final String b = "currentView";
    public static final String d = "list";
    public static final String e = "windowId";
    public static final String f = "canAddView";
    public static final String g = "isInLine";
    public static final String[] h = new String[]{"currentView", "list", "canAddView", "windowId", "isInLine"};
    private int j = 0;
    private final TIntObjectHashMap<aUr> k = new TIntObjectHashMap();
    private int l = -1;
    private boolean m = false;
    private Integer n = null;

    public aUv(int n) {
        this.l = n;
    }

    public int a() {
        return this.l;
    }

    public aUr b() {
        int n = aUxx.a().m() + 1;
        int n2 = this.k.size();
        if (n2 >= 4) {
            aUh.a("error.chatViewMaxReached", new Object[0]);
            return null;
        }
        int n3 = this.s();
        aUr aUr2 = new aUr(n3, bae.h().a("chat.pipeName.personnal", n), aUe.a, aup_0.v, false);
        bdk_1.a(aUr2);
        this.k.put(n3, (Object)aUr2);
        fis_1.a().a((ajf_1)this, d, f);
        return aUr2;
    }

    public aUr a(int n, String string, aUe aUe2) {
        int n2 = n == -1 ? this.s() : n;
        int n3 = this.k.size();
        if (n3 >= 4) {
            aUh.a("error.chatViewMaxReached", new Object[0]);
            return null;
        }
        aUr aUr2 = new aUr(n2, string, aUe2, aup_0.w, false, true);
        this.k.put(n2, (Object)aUr2);
        fis_1.a().a((ajf_1)this, d);
        return aUr2;
    }

    private int s() {
        for (int k = 0; k < this.k.size(); ++k) {
            if (this.k.get(k) != null) continue;
            return k;
        }
        return this.k.size();
    }

    public void a(aUr aUr2, boolean bl) {
        int n = aUr2.f();
        this.a(n, bl);
    }

    public void a(int n, boolean bl) {
        if (!this.k.containsKey(n)) {
            return;
        }
        aUr aUr2 = (aUr)this.k.remove(n);
        if (aUr2 != null) {
            if (bl) {
                aUr2.k();
            }
            this.d(n);
            fis_1.a().a((ajf_1)this, d, f);
        }
    }

    private void d(int n) {
        for (int k = n; k < this.k.size(); ++k) {
            aUr aUr2 = (aUr)this.k.remove(k + 1);
            if (aUr2 == null) {
                i.error((Object)("Erreur de continuit\u00e9 dans les indices des vues \u00e0 l'indice : " + (k + 1)));
                return;
            }
            aUr2.a(k);
            this.k.put(k, (Object)aUr2);
        }
    }

    public aUr a(int n) {
        return (aUr)this.k.get(n);
    }

    public TIntObjectIterator<aUr> c() {
        return this.k.iterator();
    }

    public boolean a(aUr aUr2) {
        return this.k.containsValue((Object)aUr2);
    }

    private aUr t() {
        return this.g() > 0 ? (aUr)this.f()[0] : null;
    }

    public void e() {
        this.a((auc_0)this.t());
    }

    public Object[] f() {
        return this.k.values();
    }

    public int g() {
        return this.a(false);
    }

    public int a(boolean bl) {
        if (!bl) {
            return this.k.size();
        }
        int n = 0;
        TIntObjectIterator tIntObjectIterator = this.k.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (((aUr)tIntObjectIterator.value()).p()) continue;
            ++n;
        }
        return n;
    }

    public aUr b(int n) {
        this.j = n;
        this.q();
        return this.h();
    }

    public aUr h() {
        return (aUr)this.k.get(this.j);
    }

    public int i() {
        return this.j;
    }

    public int j() {
        return this.k.size();
    }

    public void a(auc_0 auc_02) {
        this.b(auc_02.f());
    }

    @Override
    public String[] d() {
        return h;
    }

    @Override
    public Object b(String string) {
        if (string.equals(d)) {
            ArrayList<aUr> arrayList = new ArrayList<aUr>();
            for (Object object : this.f()) {
                aUr aUr2 = (aUr)object;
                arrayList.add(aUr2);
            }
            arrayList.sort(new auw_0(this));
            Boolean bl = (Boolean)fis_1.a().e("chat.enable.interactions");
            if (bl != null && !bl.booleanValue()) {
                return arrayList.subList(0, 1);
            }
            return arrayList;
        }
        if (string.equals(b)) {
            return this.h();
        }
        if (string.equals(e)) {
            return this.l;
        }
        if (string.equals(f)) {
            return this.k.size() < 4;
        }
        if (g.equals(string)) {
            return this.m;
        }
        return null;
    }

    public boolean k() {
        return this.m;
    }

    public void b(boolean bl) {
        if (bl == this.m) {
            return;
        }
        this.m = bl;
        fis_1.a().a((ajf_1)this, g);
    }

    public Integer l() {
        return this.n;
    }

    public void a(Integer n) {
        this.n = n;
    }

    public void m() {
        TIntObjectIterator tIntObjectIterator = this.k.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUr aUr2 = (aUr)tIntObjectIterator.value();
            aUr2.h();
            aUr2.t();
        }
    }

    public void b(aUr aUr2) {
        int n = this.k.size();
        if (n >= 4) {
            aUh.a("error.chatViewMaxReached", new Object[0]);
            return;
        }
        if (this.k.containsKey(aUr2.f())) {
            aUr2.a(this.s());
        }
        this.k.put(aUr2.f(), (Object)aUr2);
        fis_1.a().a((ajf_1)this, d);
    }

    public String toString() {
        return "wId=" + this.l + " curVId=" + this.j + " vieSize=" + this.j();
    }

    public void n() {
        TIntObjectIterator tIntObjectIterator = this.k.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((aUr)tIntObjectIterator.value()).t();
        }
    }

    public void o() {
        TIntObjectIterator<aUr> tIntObjectIterator = this.c();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((aUr)tIntObjectIterator.value()).k();
        }
    }

    public void p() {
        this.o();
        this.k.clear();
    }

    public void q() {
        aUr aUr2 = this.h();
        if (aUr2 == null) {
            i.error((Object)("On tente de rafra\u00eechir la vue courante du chat d'id=" + this.l + " alors qu'elle n'existe pas !"));
            return;
        }
        fis_1.a().a((ajf_1)aUr2, auc_0.j);
        aUr2.s();
        aUr2.n();
    }

    public void a(aUr aUr2, int n) {
        if (aUr2 == null) {
            return;
        }
        aUr2.a(n);
        aUr aUr3 = (aUr)this.k.put(n, (Object)aUr2);
        this.a(aUr3, n + 1);
    }

    public void c(int n) {
        for (aUr aUr2 : (aUr[])this.k.values()) {
            aUr2.a(aUr2.f() + n);
            this.k.put(aUr2.f(), (Object)aUr2);
        }
    }

    public boolean r() {
        return this.k.size() < 4;
    }

    public void a(TObjectProcedure<? super aUr> tObjectProcedure) {
        this.k.forEachValue(tObjectProcedure);
    }
}

