/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntLongHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntLongHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public class bVt
implements fci,
fcl {
    public static final bVt a = new bVt();
    private TIntObjectHashMap<abd_2> c;
    private TIntLongHashMap d;
    protected static final Logger b = Logger.getLogger(bVt.class);

    private bVt() {
    }

    @Override
    public void a(faU faU2) {
    }

    @Override
    public void a(faX faX2, faU faU2) {
    }

    @Override
    public void a(int n, faX faX2) {
        adw_1.a.a(new bVu(this, n), bqy_0.c);
    }

    void a(faU faU2, int n) {
        abd_2 abd_22;
        if (n == -1) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        if (bmr_12 != faU2) {
            return;
        }
        faV faV2 = bmr_12.fE();
        if (faV2 == null) {
            return;
        }
        faX faX2 = faV2.m();
        bMn bMn2 = bMs.a.a(n);
        if (bMn2 == null) {
            return;
        }
        if (!bmr_12.ak()) {
            bmr_12.w(true);
        }
        String string = bMn2.d();
        abd_2 abd_23 = faX2.d(n);
        if (abd_23 == null) {
            return;
        }
        if (abd_23.a() > 1) {
            b.error((Object)"[DESIGN] pas pr\u00e9vu : on a plusieurs buffs diff\u00e9rents sur un m\u00eame mdc, impossible de cr\u00e9er le popup de notification pour le joueur");
            return;
        }
        if (this.c == null) {
            this.c = new TIntObjectHashMap();
            this.d = new TIntLongHashMap();
        }
        if ((abd_22 = (abd_2)this.c.get(n)) == null) {
            this.c.put(n, (Object)abd_23);
            this.d.put(n, -1L);
            return;
        }
        if (this.d.get(n) != -1L && (double)(System.currentTimeMillis() - this.d.get(n)) < 150000.0) {
            b.info((Object)("[DESIGN] Message de changement de bonus spam\u00e9 sur le mdc d'id=" + n));
            return;
        }
        this.c.put(n, (Object)abd_23);
        this.d.put(n, System.currentTimeMillis());
    }

    public void a() {
        if (this.c != null) {
            this.c.clear();
            this.d.clear();
        }
    }
}

