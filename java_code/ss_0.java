/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from SS
 */
public abstract class ss_0
implements abo_1 {
    protected static final Logger a = Logger.getLogger(ss_0.class);
    private ObjectPool c;
    private final HashMap<Long, sr_0> d;
    private final HashMap<Long, sr_0> e = new HashMap();
    private su_0 f;
    private So g;

    protected ss_0() {
        this.d = new HashMap();
    }

    public So a() {
        return this.g;
    }

    public void a(So so) {
        this.g = so;
    }

    public void b() {
        if (this.c != null) {
            try {
                this.c.returnObject((Object)this);
            }
            catch (Exception exception) {
                a.error((Object)"impossible");
            }
        } else {
            a.error((Object)("Double release de " + this.getClass().toString()));
        }
        this.onCheckIn();
    }

    @Override
    public void onCheckOut() {
        this.f = null;
        this.e.clear();
        this.d.clear();
    }

    @Override
    public void onCheckIn() {
        this.g();
        this.f = null;
    }

    public void a(ObjectPool objectPool) {
        this.c = objectPool;
    }

    public Collection<sr_0> c() {
        return this.d.values();
    }

    public Collection<sr_0> d() {
        Collection<sr_0> collection = this.e.values();
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>();
        for (sr_0 sr_02 : collection) {
            if (!sr_02.ad()) continue;
            arrayList.add(sr_02);
        }
        return arrayList;
    }

    public sr_0 a(aff_1 aff_12) {
        int n = aff_12.d();
        int n2 = aff_12.e();
        return this.a(n, n2);
    }

    @Nullable
    public sr_0 a(int n, int n2) {
        for (sr_0 sr_02 : this.d()) {
            if (n != sr_02.G() || n2 != sr_02.H()) continue;
            return sr_02;
        }
        return null;
    }

    public List<sr_0> b(aff_1 aff_12) {
        int n = aff_12.d();
        int n2 = aff_12.e();
        return this.b(n, n2);
    }

    public List<sr_0> b(int n, int n2) {
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>();
        for (sr_0 sr_02 : this.d()) {
            if (n != sr_02.G() || n2 != sr_02.H()) continue;
            arrayList.add(sr_02);
        }
        return arrayList;
    }

    public List<sr_0> a(int n, int n2, int n3) {
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>();
        for (sr_0 sr_02 : this.d()) {
            if (n != sr_02.G() || n2 != sr_02.H() || n3 != sr_02.w()) continue;
            arrayList.add(sr_02);
        }
        return arrayList;
    }

    public List<sr_0> c(@NotNull aff_1 aff_12) {
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>();
        for (sr_0 sr_02 : this.e.values()) {
            if (!aff_12.b(sr_02.G(), sr_02.H())) continue;
            arrayList.add(sr_02);
        }
        return arrayList;
    }

    public int e() {
        return this.e.size();
    }

    public Collection<sr_0> f() {
        return this.e.values();
    }

    public sr_0 a(long l) {
        return this.d.get(l);
    }

    public sr_0 b(long l) {
        return this.e.get(l);
    }

    public void a(su_0 su_02) {
        this.f = su_02;
    }

    public void a(sr_0 sr_02) {
        if (sr_02 == null) {
            return;
        }
        if (this.e.containsKey(sr_02.a_())) {
            a.error((Object)("Unable to spawn area : there is already one with the same ID in the manager, areaId : " + sr_02.a_() + ", area baseId : " + sr_02.A()));
            return;
        }
        assert (!this.e.containsValue(sr_02)) : "Trying to insert an effectArea already present, but with a different Id";
        sr_02.a(this.f);
        this.d.put(sr_02.a_(), sr_02);
        this.e.put(sr_02.a_(), sr_02);
        sr_02.T();
        if (this.f != null) {
            this.f.a(sr_02);
        }
    }

    public void b(sr_0 sr_02) {
        this.a(sr_02, null);
    }

    public void a(sr_0 sr_02, Su su) {
        if (sr_02 == null) {
            return;
        }
        if (this.e.containsKey(sr_02.a_())) {
            this.e.remove(sr_02.a_());
            sr_02.U();
            if (this.f != null) {
                this.f.b(sr_02);
            }
            sr_02.a(10011, null, (apq_2)su);
        }
    }

    public void c(sr_0 sr_02) {
        if (sr_02 == null) {
            return;
        }
        this.d.remove(sr_02.a_());
    }

    public void a(Su su) {
        if (su == null) {
            return;
        }
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>();
        for (sr_0 sr_02 : this.e.values()) {
            if (sr_02.v() != su) continue;
            arrayList.add(sr_02);
        }
        for (sr_0 sr_02 : arrayList) {
            this.b(sr_02);
        }
    }

    public void b(Su su) {
        if (su == null) {
            return;
        }
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>();
        for (sr_0 sr_02 : this.e.values()) {
            if (sr_02.v() != su || !sr_02.H_()) continue;
            arrayList.add(sr_02);
        }
        for (sr_0 sr_02 : arrayList) {
            this.b(sr_02);
        }
    }

    public boolean d(sr_0 sr_02) {
        return sr_02 != null && this.e.containsKey(sr_02.a_());
    }

    public void g() {
        for (sr_0 sr_02 : this.c()) {
            sr_02.z();
        }
        this.e.clear();
        this.d.clear();
    }

    public void a(int n, int n2, short s2, int n3, int n4, short s3, Su su) {
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>();
        for (sr_0 iterable2 : this.e.values()) {
            if (!iterable2.c(n, n2, s2)) continue;
            arrayList.add(iterable2);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<sr_0> arrayList3 = new ArrayList<sr_0>();
        ArrayList<sr_0> arrayList4 = new ArrayList<sr_0>();
        for (sr_0 sr_02 : this.e.values()) {
            if (sr_02.a(su, n3, n4, s3)) {
                if (!arrayList.contains(sr_02)) {
                    arrayList2.add(sr_02);
                    continue;
                }
                arrayList4.add(sr_02);
                continue;
            }
            if (!arrayList.contains(sr_02)) continue;
            arrayList3.add(sr_02);
        }
        Iterator iterator = arrayList2.iterator();
        while (iterator.hasNext()) {
            sr_0 sr_03 = iterator.next();
            sr_03.a(10001, null, (apq_2)su);
        }
        for (sr_0 sr_04 : arrayList4) {
            sr_04.a(10008, null, (apq_2)su);
        }
        for (sr_0 sr_05 : arrayList3) {
            sr_05.a(10002, null, (apq_2)su);
        }
    }

    public boolean c(long l) {
        return this.e.containsKey(l);
    }

    public boolean e(sr_0 sr_02) {
        return this.e.containsKey(sr_02.a_());
    }

    public abstract sr_0 d(long var1);
}

