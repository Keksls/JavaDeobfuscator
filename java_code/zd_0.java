/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from Zd
 */
public class zd_0
implements ahk_0<acb_0> {
    private static final zd_0 b = new zd_0();
    private int c = 0;
    private final Map<apv_2, HashSet<za_0>> d;
    private final TIntObjectHashMap<za_0> e;
    private final ArrayList<za_0> f;
    private final ArrayList<Ze> g = new ArrayList(5);

    private zd_0() {
        this.d = new HashMap<apv_2, HashSet<za_0>>();
        this.e = new TIntObjectHashMap();
        this.f = new ArrayList();
    }

    public static zd_0 a() {
        return b;
    }

    public int b() {
        return ++this.c;
    }

    public void a(Ze ze) {
        if (ze == null) {
            return;
        }
        this.g.add(ze);
    }

    public void b(Ze ze) {
        if (ze == null) {
            return;
        }
        this.g.remove(ze);
    }

    private void a(za_0 za_02, zc_0 zc_02) {
        if (za_02 == null || zc_02 == null) {
            return;
        }
        int n = this.g.size();
        if (n == 0) {
            return;
        }
        zb_0 zb_02 = new zb_0(za_02, zc_02);
        for (int k = 0; k < n; ++k) {
            this.g.get(k).a(zb_02);
        }
    }

    public int a(za_0 za_02) {
        apv_2 apv_22 = za_02.a();
        HashSet<za_0> hashSet = this.d.get(apv_22);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d.put(apv_22, hashSet);
        }
        if (!hashSet.contains(za_02)) {
            za_02.d(this.b());
            hashSet.add(za_02);
            this.e.put(za_02.i(), (Object)za_02);
            this.f.add(za_02);
            this.a(za_02, zc_0.a);
        }
        return za_02.i();
    }

    public final HashSet<za_0> a(apv_2 apv_22) {
        return this.d.get(apv_22);
    }

    public boolean a(apv_2 apv_22, int n) {
        HashSet<za_0> hashSet = this.d.get(apv_22);
        if (hashSet == null) {
            return false;
        }
        for (za_0 za_02 : hashSet) {
            if (za_02.j() != n) continue;
            return true;
        }
        return false;
    }

    public int b(apv_2 apv_22, int n) {
        HashSet<za_0> hashSet = this.d.get(apv_22);
        if (hashSet == null) {
            return 0;
        }
        Iterator<za_0> iterator = hashSet.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            za_0 za_02 = iterator.next();
            if (za_02.j() != n) continue;
            ++n2;
        }
        return n2;
    }

    public final void c() {
        TIntObjectIterator tIntObjectIterator = this.e.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((za_0)tIntObjectIterator.value()).l();
        }
        this.d.clear();
        this.f.clear();
        this.e.clear();
    }

    public final za_0 a(int n) {
        return (za_0)this.e.get(n);
    }

    public void b(int n) {
        TIntObjectIterator tIntObjectIterator = this.e.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            za_0 za_02 = (za_0)tIntObjectIterator.value();
            if (za_02.j() != n) continue;
            HashSet<za_0> hashSet = this.d.get(za_02.a());
            assert (hashSet != null);
            hashSet.remove(za_02);
            this.f.remove(za_02);
            tIntObjectIterator.remove();
            za_02.l();
            this.a(za_02, zc_0.b);
        }
    }

    public void c(apv_2 apv_22, int n) {
        HashSet<za_0> hashSet = this.d.get(apv_22);
        if (hashSet != null) {
            Iterator<za_0> iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                za_0 za_02 = iterator.next();
                if (za_02.j() != n) continue;
                this.e.remove(za_02.i());
                this.f.remove(za_02);
                iterator.remove();
                za_02.l();
                this.a(za_02, zc_0.b);
            }
        }
    }

    public void d(apv_2 apv_22, int n) {
        HashSet<za_0> hashSet = this.d.get(apv_22);
        if (hashSet != null) {
            Iterator<za_0> iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                za_0 za_02 = iterator.next();
                if (za_02.j() != n) continue;
                this.e.remove(za_02.i());
                this.f.remove(za_02);
                iterator.remove();
                za_02.l();
                this.a(za_02, zc_0.b);
                return;
            }
        }
    }

    public final void b(apv_2 apv_22) {
        HashSet<za_0> hashSet = this.d.remove(apv_22);
        if (hashSet != null) {
            for (za_0 za_02 : hashSet) {
                this.e.remove(za_02.i());
                this.f.remove(za_02);
                za_02.l();
                this.a(za_02, zc_0.b);
            }
        }
    }

    public final void b(za_0 za_02) {
        assert (za_02 != null);
        this.c(za_02.i());
    }

    public void c(int n) {
        za_0 za_02 = (za_0)this.e.remove(n);
        if (za_02 != null) {
            this.f.remove(za_02);
            HashSet<za_0> hashSet = this.d.get(za_02.a());
            assert (hashSet != null);
            hashSet.remove(za_02);
            if (hashSet.isEmpty()) {
                this.d.remove(za_02.a());
            }
            za_02.l();
            this.a(za_02, zc_0.b);
        }
    }

    @Override
    public void a(acb_0 acb_02, float f2, float f3) {
        int n = this.f.size();
        for (int k = 0; k < n; ++k) {
            afv afv2;
            za_0 za_02 = this.f.get(k);
            if (za_02.a() instanceof afv && (afv2 = (afv)za_02.a()) != null && !afv2.at()) continue;
            float f4 = za_02.d();
            float f5 = za_02.e();
            float f6 = za_02.f();
            float f7 = acb_02.c(f4, f5);
            float f8 = acb_02.a(f4, f5, f6);
            za_02.a(f7, f8, za_02.b(), za_02.c());
            Entity entity = za_02.k();
            if (entity == null) continue;
            entity.f = f4;
            entity.g = f5;
            acb_02.a(entity, false);
        }
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        int n2;
        TIntArrayList tIntArrayList = new TIntArrayList();
        int n3 = this.f.size();
        for (n2 = 0; n2 < n3; ++n2) {
            za_0 za_02 = this.f.get(n2);
            if (!za_02.h()) {
                tIntArrayList.add(za_02.i());
                continue;
            }
            za_02.a(acb_02, n);
        }
        for (n2 = tIntArrayList.size() - 1; n2 >= 0; --n2) {
            this.c(tIntArrayList.getQuick(n2));
        }
    }
}

