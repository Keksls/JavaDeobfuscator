/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from biz
 */
public class biz_2 {
    private static final Logger b = Logger.getLogger(biz_2.class);
    public static final biz_2 a = new biz_2();
    private final ach_2<biy_2> c = new ach_2();
    private final ach_2<bid_1> d = new ach_2();
    private final ach_2<TIntObjectHashMap<bip_2>> e = new ach_2();
    private final ach_2<TIntObjectHashMap<biw_2>> f = new ach_2();
    private final ach_2<TIntObjectHashMap<bin_2>> g = new ach_2();
    private int h;

    private biz_2() {
    }

    public void a(long l, bhr_1 bhr_12) {
        this.c.a(l, new biy_2(l, bhr_12));
        this.d.a(l, new bid_1(l, bhr_12));
    }

    private bip_2 a(long l, bhx_2 bhx_22) {
        TIntObjectHashMap tIntObjectHashMap = this.e.e(l);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.e.a(l, (TIntObjectHashMap<bip_2>)tIntObjectHashMap);
        }
        bip_2 bip_22 = new bip_2(l, bhx_22);
        tIntObjectHashMap.put(bhx_22.c(), (Object)bip_22);
        return bip_22;
    }

    public bip_2 a(long l, int n) {
        TIntObjectHashMap<bip_2> tIntObjectHashMap = this.e.e(l);
        if (tIntObjectHashMap == null) {
            return null;
        }
        return (bip_2)tIntObjectHashMap.get(n);
    }

    private biw_2 a(long l, int n, int n2, int n3) {
        TIntObjectHashMap tIntObjectHashMap = this.f.e(l);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.f.a(l, (TIntObjectHashMap<biw_2>)tIntObjectHashMap);
        }
        biw_2 biw_22 = new biw_2(l, n, n2, n3);
        tIntObjectHashMap.put(n, (Object)biw_22);
        bhj_1 bhj_12 = bhl_1.a.b(l).w(n);
        ArrayList<bhx_2> arrayList = bhj_12.r();
        int n4 = arrayList.size();
        for (int k = 0; k < n4; ++k) {
            this.a(l, arrayList.get(k));
        }
        return biw_22;
    }

    public biw_2 b(long l, int n) {
        TIntObjectHashMap<biw_2> tIntObjectHashMap = this.f.e(l);
        if (tIntObjectHashMap == null) {
            return null;
        }
        biw_2 biw_22 = (biw_2)tIntObjectHashMap.get(n);
        if (biw_22 == null) {
            b.warn((Object)("On essaye de r\u00e9cup\u00e9rer un achievement qui n'existe pas : id=" + n), (Throwable)new Exception(""));
        }
        return biw_22;
    }

    bix_2 a(long l) {
        TIntObjectHashMap tIntObjectHashMap = this.g.e(l);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.g.a(l, (TIntObjectHashMap<bin_2>)tIntObjectHashMap);
        }
        bix_2 bix_22 = new bix_2(l);
        tIntObjectHashMap.put(bix_22.g(), (Object)bix_22);
        return bix_22;
    }

    biu_2 a(long l, bhq_1 bhq_12, biu_2 biu_22) {
        Object object;
        Object object2;
        Object object3;
        int n = biu_22 == null ? bhq_12.a() : biu_22.o();
        TIntObjectHashMap tIntObjectHashMap = this.g.e(l);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.g.a(l, (TIntObjectHashMap<bin_2>)tIntObjectHashMap);
        }
        biu_2 biu_23 = new biu_2(l, bhq_12, n);
        tIntObjectHashMap.put(bhq_12.a(), (Object)biu_23);
        ArrayList<bhj_1> arrayList = bhq_12.d();
        if (arrayList != null) {
            object3 = arrayList.iterator();
            while (object3.hasNext()) {
                object2 = (bhj_1)object3.next();
                object = this.a(l, ((bhj_1)object2).a(), biu_23.o(), ((bhj_1)object2).E());
                biu_23.b((biw_2)object);
                if (biu_22 == null) continue;
                biu_22.b((biw_2)object);
            }
        }
        if ((object3 = bhq_12.c()) != null) {
            object2 = ((ArrayList)object3).iterator();
            while (object2.hasNext()) {
                object = (bhq_1)object2.next();
                biu_2 biu_24 = this.a(l, (bhq_1)object, biu_23);
                biu_23.a(biu_24);
            }
        }
        return biu_23;
    }

    public bin_2 c(long l, int n) {
        TIntObjectHashMap<bin_2> tIntObjectHashMap = this.g.e(l);
        if (tIntObjectHashMap == null) {
            return null;
        }
        bin_2 bin_22 = (bin_2)tIntObjectHashMap.get(n);
        if (bin_22 == null) {
            b.warn((Object)("On essaye de r\u00e9cup\u00e9rer une categorie qui n'existe pas : id=" + n), (Throwable)new Exception());
        }
        return bin_22;
    }

    public bid_1 b(long l) {
        return this.d.e(l);
    }

    public biy_2 c(long l) {
        return this.c.e(l);
    }

    public bia_1 d(long l, int n) {
        return this.e(l, n) ? (bia_1)this.d.e(l) : (bia_1)this.c.e(l);
    }

    public boolean e(long l, int n) {
        TIntObjectHashMap<biw_2> tIntObjectHashMap = this.f.e(l);
        if (tIntObjectHashMap == null) {
            return false;
        }
        biw_2 biw_22 = (biw_2)tIntObjectHashMap.get(n);
        if (biw_22 == null) {
            return false;
        }
        bid_1 bid_12 = this.d.e(l);
        return bid_12 != null && bid_12.a(biw_22.v()) != null;
    }

    public void a(long l, long l2) {
        bhx_2 bhx_22 = bhp_1.a.c(this.h);
        if (bhx_22 == null) {
            return;
        }
        if (bhx_22.a(l2)) {
            this.a(l, this.h, l2);
        }
    }

    public void a(long l, int n, long l2) {
        if (this.a(n)) {
            return;
        }
        int n2 = this.h;
        this.h = n;
        bhx_2 bhx_22 = bhp_1.a.c(this.h);
        if (bhx_22 == null || !bhx_22.j()) {
            if (ble_1.E().a(7)) {
                ble_1.E().G();
            }
            this.h = -1;
            this.f(l, n2);
            return;
        }
        aqe_0 aqe_02 = bhx_22.b(l2);
        if (aqe_02 == null) {
            b.error((Object)("Compass update requested but no valid instance, objectiveId : " + n + ", instanceId : " + l2));
            return;
        }
        ble_1.E().a(7, (float)aqe_02.a(), (float)aqe_02.b(), (float)aqe_02.c(), aqe_02.d(), (Object)bhx_22, bae.h().a(64, (long)n, new Object[0]), true);
        this.f(l, n2);
        this.f(l, this.h);
    }

    private void f(long l, int n) {
        TIntObjectHashMap<bip_2> tIntObjectHashMap = this.e.e(l);
        if (tIntObjectHashMap == null) {
            return;
        }
        bip_2 bip_22 = (bip_2)tIntObjectHashMap.get(n);
        if (bip_22 != null) {
            fis_1.a().a((ajf_1)bip_22, "isCompassed");
        }
    }

    public boolean a(int n) {
        return ble_1.E().a(7) && this.h == n;
    }

    public void a() {
        this.f.c();
        this.g.c();
        this.e.c();
        this.h = -1;
        this.c.c();
        this.d.c();
    }
}

