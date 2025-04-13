/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class aUxx
implements ajh_1 {
    private static final Logger e = Logger.getLogger(aUxx.class);
    private static final aUxx f = new aUxx();
    private int g = 0;
    private final TIntObjectHashMap<aUv> h = new TIntObjectHashMap();
    public static final String a = "chatTextStyle";
    public static final String b = "allFiltersList";
    public static final String[] d = new String[]{"chatTextStyle", "allFiltersList"};
    private int i = -1;
    private int j = -1;

    public static aUxx a() {
        return f;
    }

    @Override
    public String[] d() {
        return d;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.b();
        }
        if (string.equals(b)) {
            return this.w();
        }
        return null;
    }

    public String b() {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        aUz aUz2 = aUz.values()[bvx_02.d(bWe.W)];
        return "white" + (aUz2 != null ? aUz2.a() : aUz.d.a()) + "Bordered";
    }

    public aUv a(aUr aUr2) {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            if (!aUv2.a(aUr2)) continue;
            return aUv2;
        }
        return null;
    }

    public int b(aUr aUr2) {
        aUv aUv2 = this.a(aUr2);
        return aUv2 == null ? -1 : aUv2.a();
    }

    public boolean c(aUr aUr2) {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            if (aUv2.h() != aUr2) continue;
            return true;
        }
        return false;
    }

    public boolean a(aup_0 aup_02) {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            aUr aUr2 = aUv2.h();
            if (aUr2 == null) {
                e.error((Object)("Vue courante de la fen\u00eatre de chat d'id=" + aUv2.a() + " inexistante !!!"));
                continue;
            }
            if (!aUr2.a(aup_02)) continue;
            return true;
        }
        return false;
    }

    public aUv c() {
        if (this.f().r()) {
            return this.f();
        }
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            if (!aUv2.r()) continue;
            return aUv2;
        }
        return null;
    }

    public aUv e() {
        aUv aUv2 = new aUv(this.v());
        this.h.put(aUv2.a(), (Object)aUv2);
        return aUv2;
    }

    private int v() {
        for (int k = 0; k < this.h.size(); ++k) {
            if (this.h.get(k) != null) continue;
            return k;
        }
        return this.h.size();
    }

    public aUv a(int n) {
        if (this.h.get(n) != null) {
            e.error((Object)("Window d\u00e9j\u00e0 pr\u00e9sente \u00e0 l'index : " + n));
            return null;
        }
        aUv aUv2 = new aUv(n);
        this.h.put(aUv2.a(), (Object)aUv2);
        return aUv2;
    }

    public void a(int n, int n2) {
        if (!this.h.containsKey(n)) {
            e.error((Object)("on cherche \u00e0 supprimer une fen\u00eatre de chat inconnue d'id=" + n));
            return;
        }
        if (this.g == n) {
            if (n2 == -1) {
                n2 = this.i(n);
            }
            if (n2 == -1) {
                e.error((Object)"impossible d'atteindre une fen\u00eatre de chat ! On annule la suppression dans le manager");
                return;
            }
            this.g = n2;
        }
        aUv aUv2 = (aUv)this.h.remove(n);
        aUv2.o();
        aUv2.n();
    }

    private int i(int n) {
        for (int n2 : this.h.keys()) {
            if (n == n2) continue;
            return n2;
        }
        return -1;
    }

    public aUv f() {
        return (aUv)this.h.get(this.g);
    }

    public int g() {
        return this.h.size();
    }

    public aUv b(int n) {
        return (aUv)this.h.get(n);
    }

    public void c(int n) {
        this.g = n;
    }

    public void a(aUv aUv2) {
        if (aUv2 != null) {
            this.g = aUv2.a();
        } else {
            e.warn((Object)"On essaye de d\u00e9finir une vue pas enregistr\u00e9e dans le ChatWindowManager comme vue courante. (Ignor\u00e9)");
        }
    }

    public TIntObjectIterator<aUv> h() {
        return this.h.iterator();
    }

    public aUv i() {
        return (aUv)this.h.get(0);
    }

    @Nullable
    public aUr a(String string, aUe aUe2) {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            TIntObjectIterator<aUr> tIntObjectIterator2 = ((aUv)tIntObjectIterator.value()).c();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                aUr aUr2 = (aUr)tIntObjectIterator2.value();
                if (!aUr2.o().equals(string) || !aUr2.r().equals(aUe2)) continue;
                return aUr2;
            }
        }
        return null;
    }

    @Nullable
    public aUv d(int n) {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            TIntObjectIterator<aUr> tIntObjectIterator2 = aUv2.c();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                aUr aUr2 = (aUr)tIntObjectIterator2.value();
                if (aUr2.f() != n) continue;
                return aUv2;
            }
        }
        return null;
    }

    public boolean e(int n) {
        return this.j == n;
    }

    public boolean f(int n) {
        return this.i == n;
    }

    public void j() {
    }

    public void k() {
        aUv aUv2 = this.f();
        if (aUv2 == null) {
            return;
        }
        aUr aUr2 = aUv2.h();
        if (aUr2 == null) {
            return;
        }
        aUr2.t();
    }

    public void l() {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((aUv)tIntObjectIterator.value()).m();
        }
    }

    public aUv a(aUr aUr2, int n, int n2) {
        aUv aUv2 = this.b(n);
        aUv aUv3 = n2 == -1 ? aUxx.a().e() : this.b(n2);
        this.a(aUv2, aUr2, n2);
        aUv3.b(aUr2);
        aUv3.a((auc_0)aUr2);
        cww_0.c().a(aUv2);
        cww_0.c().a(aUv3);
        bdk_1.a(aUv3);
        return aUv3;
    }

    public void a(aUv aUv2, aUr aUr2, int n) {
        aUv2.a(aUr2, n == -1);
        if (aUv2.j() == 0) {
            int n2 = aUv2.a();
            this.a(n2, n);
            cww_0.c().a(n2);
        } else {
            aUv2.e();
        }
    }

    public int m() {
        int n = 0;
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            n += aUv2.a(true);
        }
        return n;
    }

    public ArrayList<aUr> n() {
        ArrayList<aUr> arrayList = new ArrayList<aUr>();
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            TIntObjectIterator<aUr> tIntObjectIterator2 = aUv2.c();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                arrayList.add((aUr)tIntObjectIterator2.value());
            }
        }
        arrayList.sort(new auy_0(this));
        return arrayList;
    }

    private ArrayList<auxx_0> w() {
        ArrayList<auxx_0> arrayList = new ArrayList<auxx_0>();
        for (aUn aUn2 : aul_0.a().d()) {
            if (!aUn2.g()) continue;
            arrayList.add(new auxx_0(aUn2, false));
        }
        arrayList.sort(Comparator.comparingInt(auxx_0::c));
        return arrayList;
    }

    private ArrayList<auxx_0> x() {
        ArrayList<auxx_0> arrayList = new ArrayList<auxx_0>();
        for (aUn aUn2 : aul_0.a().d()) {
            if (!aUn2.f()) continue;
            arrayList.add(new auxx_0(aUn2, false));
        }
        arrayList.sort(Comparator.comparingInt(auxx_0::c));
        return arrayList;
    }

    public void o() {
        try {
            aUf.e();
        }
        catch (Exception exception) {
            e.error((Object)"Erreur \u00e0 la sauvegarde du chat :");
            e.error((Object)"Exception during saveChatConfiguration", (Throwable)exception);
        }
    }

    public void p() {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((aUv)tIntObjectIterator.value()).p();
        }
        this.h.clear();
    }

    public void q() {
        this.p();
        try {
            aUf.h();
        }
        catch (Exception exception) {
            e.error((Object)"Erreur \u00e0 la suppression du fichier utilisateur du chat");
            e.error((Object)"Exception during cleanAndDeletePreferences", (Throwable)exception);
        }
    }

    public void r() {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            fis_1.a().a((ajf_1)aUv2, aUv2.d());
            aUv2.q();
        }
        fis_1.a().a((ajf_1)this, b);
    }

    public void s() {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            aUv aUv2 = (aUv)tIntObjectIterator.value();
            TIntObjectIterator<aUr> tIntObjectIterator2 = aUv2.c();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                ((aUr)tIntObjectIterator2.value()).a();
            }
        }
    }

    public int t() {
        return this.j;
    }

    public void g(int n) {
        this.j = n;
    }

    public int u() {
        return this.i;
    }

    public void h(int n) {
        this.i = n;
    }
}

