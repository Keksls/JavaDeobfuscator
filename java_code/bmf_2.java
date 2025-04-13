/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bmf
 */
public class bmf_2
implements Sv,
apk_1 {
    protected static final Logger a = Logger.getLogger(bmf_2.class);
    private static final bmf_2 b = new bmf_2();
    private final TLongObjectHashMap<blx_1> c = new TLongObjectHashMap();
    private final List<blx_1> d = new ArrayList<blx_1>();
    private final List<bmv_1> e = new ArrayList<bmv_1>();
    private final List<bmg_2> f = new ArrayList<bmg_2>();
    private final List<bmg_2> g = new ArrayList<bmg_2>();

    public static bmf_2 a() {
        return b;
    }

    public boolean a(blx_1 blx_12) {
        if (this.d(blx_12)) {
            return false;
        }
        this.b(blx_12);
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(blx_1 blx_12) {
        List<blx_1> list;
        biI biI2 = blx_12.bv();
        azu_0.a(biI2);
        afz_0.d().a(biI2);
        bhf_1.a().a(blx_12.a_(), biI2);
        if (blx_12 instanceof bmv_1 && ((bmv_1)blx_12).cU()) {
            list = this.e;
            synchronized (list) {
                this.e.add((bmv_1)blx_12);
            }
        }
        if (blx_12 instanceof bnh_1) {
            list = this.d;
            synchronized (list) {
                this.d.add(blx_12);
            }
        }
        ((afv)biI2).a(ble_1.E());
        ((afv)biI2).a(blq_0.c());
        blq_0.c().a(biI2);
        this.c(blx_12);
        this.g(blx_12);
    }

    public void c(blx_1 blx_12) {
        if (blx_12.bo() && !blx_12.cX()) {
            blf_1.a(blx_12.a_(), 0, blx_12.G(), blx_12.H(), blx_12.I(), blx_12.T_(), blx_12, ble_1.E().l(), azs_0.a().a(800237), blx_12.dp(), anr_0.G, ble_1.E());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d(blx_1 blx_12) {
        if (blx_12 == null) {
            return true;
        }
        TLongObjectHashMap<blx_1> tLongObjectHashMap = this.c;
        synchronized (tLongObjectHashMap) {
            if (this.c.containsKey(blx_12.a_())) {
                a.error((Object)("Ajout de ce CharacterInfo impossible : il existe d\u00e9j\u00e0 : " + blx_12.a_() + " - " + blx_12 + " - " + this.c.get(blx_12.a_())));
                return true;
            }
            this.c.put(blx_12.a_(), (Object)blx_12);
        }
        return false;
    }

    private void g(blx_1 blx_12) {
        for (bmg_2 bmg_22 : this.f) {
            try {
                bmg_22.a(blx_12);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        this.f.removeAll(this.g);
        this.g.clear();
    }

    public void e(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        this.f(blx_12);
        blx_12.cx();
    }

    public void f(@NotNull blx_1 blx_12) {
        if (blx_12.bw() != null) {
            blx_12.bw().b(blx_12);
        }
        this.b(blx_12.a_());
        if (blx_12 instanceof bmv_1) {
            bmv_1 bmv_12 = (bmv_1)blx_12;
            boq_1.a().a(bmv_12, false);
            bpo_1.a().c(blx_12.a_());
            bbu bbu2 = bmv_12.cM();
            if (bbu2 != null) {
                bbu2.u();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(TLongObjectProcedure<blx_1> tLongObjectProcedure) {
        boolean bl;
        TLongObjectHashMap<blx_1> tLongObjectHashMap = this.c;
        synchronized (tLongObjectHashMap) {
            bl = this.c.forEachEntry(tLongObjectProcedure);
        }
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(TObjectProcedure<blx_1> tObjectProcedure) {
        boolean bl = true;
        List<blx_1> list = this.d;
        synchronized (list) {
            int n = this.d.size();
            for (int k = 0; k < n && (bl = tObjectProcedure.execute((Object)this.d.get(k))); ++k) {
            }
        }
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(TObjectProcedure<blx_1> tObjectProcedure) {
        List<blx_1> list = this.d;
        synchronized (list) {
            for (blx_1 blx_13 : this.d) {
                if (tObjectProcedure.execute((Object)blx_13)) continue;
                return;
            }
        }
        list = this.c;
        synchronized (list) {
            this.c.forEachValue(blx_12 -> {
                if (blx_12.gY() == 5) {
                    return tObjectProcedure.execute(blx_12);
                }
                return true;
            });
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int b() {
        List<blx_1> list = this.d;
        synchronized (list) {
            return this.d.size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public blx_1 a(String string) {
        if (string == null) {
            return null;
        }
        List<blx_1> list = this.d;
        synchronized (list) {
            for (int k = this.d.size() - 1; k >= 0; --k) {
                blx_1 blx_12 = this.d.get(k);
                if (blx_12 == null || !string.equalsIgnoreCase(blx_12.dp())) continue;
                return blx_12;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(long l) {
        blx_1 blx_12;
        Object object = this.c;
        synchronized (object) {
            blx_12 = (blx_1)this.c.remove(l);
        }
        if (blx_12 == null) {
            a.warn((Object)("Tentative de suppression d'un CharacterInfo " + l + " inexistant."));
            return;
        }
        if (blx_12 instanceof bmv_1) {
            object = this.e;
            synchronized (object) {
                this.e.remove(blx_12);
            }
        }
        object = this.d;
        synchronized (object) {
            this.d.remove(blx_12);
        }
        if (blx_12.bm()) {
            this.a(l, blx_12);
        }
        blq_0.c().b(blx_12.bv());
        blx_12.aM();
    }

    private void a(long l, blx_1 blx_12) {
        if (blx_12.bo()) {
            afz_0.d().c(blx_12.bv());
        } else {
            afz_0.d().a(l);
        }
        bhf_1.a().b(blx_12.a_());
        aun_0.a(blx_12.a_());
        der.a(blx_12.a_());
        blf_1.a(0, l, (blo_0)ble_1.E());
        blx_12.bv().c(ble_1.E());
        blx_12.bv().c(blq_0.c());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public blx_1 c(long l) {
        blx_1 blx_12;
        TLongObjectHashMap<blx_1> tLongObjectHashMap = this.c;
        synchronized (tLongObjectHashMap) {
            blx_12 = (blx_1)this.c.get(l);
        }
        return blx_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public blx_1 b(String string) {
        if (string == null) {
            return null;
        }
        TLongObjectHashMap<blx_1> tLongObjectHashMap = this.c;
        synchronized (tLongObjectHashMap) {
            TLongObjectIterator tLongObjectIterator = this.c.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                blx_1 blx_12 = (blx_1)tLongObjectIterator.value();
                if (blx_12 == null || !string.equals(blx_12.dp())) continue;
                return blx_12;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public blx_1 d(long l) {
        TLongObjectHashMap<blx_1> tLongObjectHashMap = this.c;
        synchronized (tLongObjectHashMap) {
            TLongObjectIterator tLongObjectIterator = this.c.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                blx_1 blx_12 = (blx_1)tLongObjectIterator.value();
                if (blx_12 == null || l != blx_12.U_() || blx_12.gY() != 0) continue;
                return blx_12;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        TLongObjectHashMap<blx_1> tLongObjectHashMap = this.c;
        synchronized (tLongObjectHashMap) {
            TLongObjectIterator tLongObjectIterator = this.c.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                blx_1 blx_12 = (blx_1)tLongObjectIterator.value();
                if (blx_12.E() && blx_12.P()) {
                    ++n4;
                    continue;
                }
                if (!blx_12.E() && blx_12.P()) {
                    ++n3;
                    continue;
                }
                if (blx_12.E() && !blx_12.P()) {
                    ++n2;
                    continue;
                }
                ++n;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        int n;
        Object object = this.c;
        synchronized (object) {
            n = this.c.size();
            TLongObjectIterator tLongObjectIterator = this.c.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ((blx_1)tLongObjectIterator.value()).cx();
            }
            this.c.clear();
        }
        object = this.e;
        synchronized (object) {
            this.e.clear();
        }
        object = this.d;
        synchronized (object) {
            this.d.clear();
        }
        boq_1.a().b();
        bpo_1.a().b();
        a.info((Object)("Nettoyage des CharacterInfo contenus dans le CharacterInfoManager (" + this.c.size() + " restants sur " + n + ")"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Su f_(long l) {
        blx_1 blx_12;
        TLongObjectHashMap<blx_1> tLongObjectHashMap = this.c;
        synchronized (tLongObjectHashMap) {
            blx_12 = bzf_1.a(l);
        }
        return blx_12;
    }

    @Override
    public long a(byte by) {
        return 0L;
    }

    public Iterator<blx_1> k() {
        return new acj_1<blx_1>(this.c);
    }

    public List<Su> a(aff_1 aff_12) {
        return this.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<Su> a(int n, int n2, int n3) {
        ArrayList<Su> arrayList = new ArrayList<Su>();
        TLongObjectHashMap<blx_1> tLongObjectHashMap = this.c;
        synchronized (tLongObjectHashMap) {
            TLongObjectIterator tLongObjectIterator = this.c.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                if (aob_2.a((aoc_2)tLongObjectIterator.value(), n, n2) != 0) continue;
                arrayList.add((Su)tLongObjectIterator.value());
            }
        }
        return arrayList;
    }

    public void a(bmg_2 bmg_22) {
        if (!this.f.contains(bmg_22)) {
            this.f.add(bmg_22);
        }
    }

    public void b(bmg_2 bmg_22) {
        if (bmg_22 != null) {
            this.g.add(bmg_22);
        }
    }

    public void c(bmg_2 bmg_22) {
        this.f.remove(bmg_22);
    }
}

