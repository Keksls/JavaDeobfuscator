/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class ahs
extends abt<ahv> {
    private static final Logger g = Logger.getLogger(ahs.class);
    private static final int h = 18;
    private static final ahs i = new ahs();
    protected final TLongObjectHashMap<ahv> d;
    final ArrayList<ahv> e = new ArrayList(8);
    protected final TLongObjectHashMap<TLongArrayList> f;
    private final ArrayList<ahw> j;
    private final ArrayList<ahx> k;
    private final HashMap<Long, ahw> l;
    private final HashMap<Long, ahx> m;
    private final TLongObjectProcedure<ahv> n = new aht(this);

    public static ahs d() {
        return i;
    }

    protected ahs() {
        this.d = new TLongObjectHashMap();
        this.f = new TLongObjectHashMap();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new HashMap();
        this.m = new HashMap();
    }

    public void a(ahv ahv2) {
        if (!this.d.containsKey(ahv2.a())) {
            ahv2.h(ahv2.aI());
            this.d.put(ahv2.a(), (Object)ahv2);
            aff_1 aff_12 = ahv2.ap();
            TLongArrayList tLongArrayList = this.e(aff_12.d(), aff_12.e());
            tLongArrayList.add(ahv2.a());
            this.a(ahv2, aff_12.d(), aff_12.e(), aff_12.f());
            this.d(ahv2);
        } else {
            g.warn((Object)("Impossible d'ajouter l'\u00e9l\u00e9ment id=" + ahv2.a() + " en " + ahv2.G() + ":" + ahv2.H() + " car il en existe d\u00e9j\u00e0 avec cet ID."));
        }
    }

    public void b(ahv ahv2) {
        if (ahv2 != null) {
            this.d.remove(ahv2.a());
            long l = this.c(ahv2);
            this.a(ahv2, l);
            this.e(ahv2);
            ahv2.release();
        } else {
            g.error((Object)"Impossible de retirer un element null");
        }
    }

    private long c(ahv ahv2) {
        return Hw.c(ahv2.ap().d(), ahv2.ap().e());
    }

    public void a(long l) {
        ahv ahv2 = (ahv)this.d.get(l);
        if (ahv2 != null) {
            this.b(ahv2);
        } else {
            g.warn((Object)("Impossible de supprimer un element d'ID " + l + " qui n'existe pas"));
        }
    }

    public void e() {
        g.info((Object)"Supression de tout les Element du AnimatedElementSceneViewManager.");
        Object[] objectArray = new ahv[this.d.size()];
        for (Object object : objectArray = (ahv[])this.d.values(objectArray)) {
            this.b((ahv)object);
        }
        if (!this.d.isEmpty()) {
            g.error((Object)("Il reste encore " + this.d.size() + " apr\u00e8s la supression !!!"));
        }
    }

    public boolean c(int n, int n2) {
        return this.f.contains(Hw.c(n, n2));
    }

    public ahv b(long l) {
        return (ahv)this.d.get(l);
    }

    public ArrayList<ahv> d(int n, int n2) {
        ArrayList<ahv> arrayList = new ArrayList<ahv>();
        TLongArrayList tLongArrayList = (TLongArrayList)this.f.get(Hw.c(n, n2));
        if (tLongArrayList != null) {
            for (int k = tLongArrayList.size() - 1; k >= 0; --k) {
                arrayList.add((ahv)this.d.get(tLongArrayList.get(k)));
            }
            return arrayList;
        }
        return arrayList;
    }

    public int f() {
        return this.d.size();
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        int n2;
        int n3 = this.d.size();
        Object[] objectArray = new ahv[n3];
        this.d.values(objectArray);
        this.c.clear();
        for (n2 = 0; n2 < n3; ++n2) {
            Object object = objectArray[n2];
            if (!((abz_0)object).a((ahg_0)acb_02, n)) continue;
            if (((ahv)object).aH()) {
                this.e.add((ahv)object);
                continue;
            }
            this.c.add(object);
        }
        int n4 = this.e.size();
        for (n2 = 0; n2 < n4; ++n2) {
            this.b(this.e.get(n2));
        }
        this.e.clear();
    }

    @Override
    public void a(acb_0 acb_02, float f2, float f3) {
        this.c.clear();
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ahv ahv2 = (ahv)tLongObjectIterator.value();
            if (ahv2.a(acb_02)) {
                this.c.add(ahv2);
            }
            this.a(ahv2, acb_02);
        }
    }

    public void g() {
        long l;
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            Iterator<ahx> iterator = (ahv)tLongObjectIterator.value();
            ((abu)((Object)iterator)).R();
            ((ahv)((Object)iterator)).release();
        }
        this.d.clear();
        this.c.clear();
        this.l.clear();
        for (ahw object : this.j) {
            l = System.currentTimeMillis();
            this.b(object, l);
        }
        this.m.clear();
        for (ahx ahx2 : this.k) {
            l = System.currentTimeMillis();
            this.b(ahx2, l);
        }
    }

    public void a(long l, int n, int n2) {
        ahv ahv2 = (ahv)this.d.get(l);
        if (ahv2 != null) {
            long l2 = this.c(ahv2);
            this.a(ahv2, l2);
            TLongArrayList tLongArrayList = this.e(n, n2);
            tLongArrayList.add(ahv2.a());
        }
    }

    private TLongArrayList e(int n, int n2) {
        long l = Hw.c(n, n2);
        TLongArrayList tLongArrayList = (TLongArrayList)this.f.get(l);
        if (tLongArrayList == null) {
            tLongArrayList = new TLongArrayList();
            this.f.put(l, (Object)tLongArrayList);
        }
        return tLongArrayList;
    }

    private void a(ahv ahv2, long l) {
        TLongArrayList tLongArrayList = (TLongArrayList)this.f.get(l);
        if (tLongArrayList == null) {
            g.error((Object)("Pas d'elements enregistr\u00e9s \u00e0 la position " + ahv2.ap() + " l'IE " + ahv2));
            return;
        }
        ahx_2.a(tLongArrayList, ahv2.a());
        if (tLongArrayList.isEmpty()) {
            this.f.remove(l);
        }
    }

    private void d(ahv ahv2) {
        for (ahw ahw2 : this.l.values()) {
            ahw2.a(ahv2);
        }
    }

    private void e(ahv ahv2) {
        for (ahx ahx2 : this.m.values()) {
            ahx2.b(ahv2);
        }
    }

    public void a(ahw ahw2, long l) {
        if (this.j.contains(ahw2)) {
            return;
        }
        this.j.add(ahw2);
        this.b(ahw2, l);
    }

    public void a(ahx ahx2, long l) {
        if (this.k.contains(ahx2)) {
            return;
        }
        this.k.add(ahx2);
        this.b(ahx2, l);
    }

    public void b(ahw ahw2, long l) {
        if (!this.l.containsKey(l) && !this.l.containsValue(ahw2)) {
            this.l.put(l, ahw2);
        }
    }

    public void b(ahx ahx2, long l) {
        if (!this.m.containsKey(l) && !this.m.containsValue(ahx2)) {
            this.m.put(l, ahx2);
        }
    }

    public void c(long l) {
        if (this.m.containsKey(l)) {
            this.m.remove(l);
        }
    }

    public void d(long l) {
        if (this.l.containsKey(l)) {
            this.l.remove(l);
        }
    }

    public Iterator<ahv> h() {
        return this.c.iterator();
    }

    public TLongObjectIterator<ahv> i() {
        return this.d.iterator();
    }

    @Override
    public void a(TObjectProcedure<? super ahv> tObjectProcedure) {
        this.d.forEachValue(tObjectProcedure);
    }

    @Override
    public void c() {
        this.d.forEachValue((TObjectProcedure)new ahu(this));
    }
}

