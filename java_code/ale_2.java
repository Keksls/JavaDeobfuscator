/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aLe
 */
final class ale_2
implements akx_1 {
    public static final boolean a = false;
    private static final Logger b = Logger.getLogger(ale_2.class);
    private final Collection<aky_2> c = new ArrayList<aky_2>();
    private final LinkedList<aku_1> d = new LinkedList();

    ale_2() {
    }

    public LinkedList<aku_1> e() {
        return this.d;
    }

    @Override
    public void b(aku_1 aku_12) {
        this.d.add(aku_12);
    }

    public aku_1 d(int n) {
        aku_1 aku_12 = this.a(n);
        if (aku_12 != null) {
            this.d.remove(aku_12);
        }
        return aku_12;
    }

    @Override
    public aku_1 a(int n) {
        for (aku_1 aku_12 : this.d) {
            if (aku_12.c() != n) continue;
            return aku_12;
        }
        return null;
    }

    @Override
    public aku_1 a(int n, int n2) {
        for (aku_1 aku_12 : this.d) {
            if (aku_12.e() != n2 || aku_12.d() != n) continue;
            return aku_12;
        }
        return null;
    }

    @Override
    public aku_1 c(int n) {
        for (aku_1 aku_12 : this.d) {
            if (aku_12.d() != n) continue;
            return aku_12;
        }
        return null;
    }

    public aku_1 e(int n) {
        for (aku_1 aku_12 : this.d) {
            if (aku_12.h() != (long)n) continue;
            return aku_12;
        }
        return null;
    }

    public Iterable<Long> f() {
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (aku_1 aku_12 : this.d) {
            long l = aku_12.h();
            if (l == Long.MIN_VALUE || arrayList.contains(l)) continue;
            arrayList.add(l);
        }
        return arrayList;
    }

    public aku_1 a(int n, int n2, int n3) {
        for (aku_1 aku_12 : this.d) {
            if (aku_12.h() != (long)n || aku_12.d() != n2 || aku_12.e() != n3) continue;
            return aku_12;
        }
        return null;
    }

    @Override
    public void a(aky_2 aky_22) {
        this.c.add(aky_22);
    }

    @Override
    public void b(aky_2 aky_22) {
        this.c.remove(aky_22);
    }

    @Override
    public void b() {
        if (this.d == null || this.d.isEmpty()) {
            this.g();
            return;
        }
        aku_1 aku_12 = this.d.getFirst();
        this.a(aku_12, true);
    }

    @Override
    public void a(aku_1 aku_12, boolean bl) {
        if (this.d != null && this.d.contains(aku_12)) {
            aku_1 aku_13;
            Iterator iterator = this.d.iterator();
            while (iterator.hasNext() && (aku_13 = (aku_1)iterator.next()) != aku_12) {
                if (aku_13.k()) continue;
                if (bl) {
                    aku_13.a((akw_2)this);
                } else {
                    iterator.remove();
                }
                this.a(aku_13, "Forced execution");
            }
        }
        if (bl) {
            aku_12.a((akw_2)this);
        } else {
            this.d(aku_12.c());
        }
        this.a(aku_12, "In Group order");
    }

    private void a(aku_1 aku_12, String string) {
        try {
            aku_12.a(true);
            aku_12.a();
        }
        catch (Throwable throwable) {
            b.error((Object)("[_FL_] ACTION FAILURE (" + string + ") " + ale_2.c(aku_12) + " - with " + this.d.size() + " when crush"), throwable);
            this.a(aku_12);
        }
    }

    private static String c(aku_1 aku_12) {
        return aku_12.getClass().getSimpleName() + " : " + aku_12.c() + " #" + aku_12.hashCode();
    }

    @Override
    public void a(aku_1 aku_12) {
        aku_12.b(this);
        this.d(aku_12.c());
        this.b();
    }

    @Override
    public void c() {
        b.info((Object)("Kill des actions de la pile (" + this.d.size() + ")"));
        ArrayList<aku_1> arrayList = new ArrayList<aku_1>();
        for (aku_1 aku_12 : this.d) {
            aku_12.b(this);
            arrayList.add(aku_12);
        }
        this.d.clear();
        for (aku_1 aku_12 : arrayList) {
            if (aku_12 instanceof alb_2) {
                int n = ((alb_2)aku_12).p();
                if (n == -1) continue;
                aks_1.a().d(n);
                continue;
            }
            if (!(aku_12 instanceof alc_1)) continue;
            alc_1 alc_12 = (alc_1)aku_12;
            adi_2.a().a(alc_12);
        }
        this.g();
    }

    private void g() {
        for (aky_2 aky_22 : this.c.toArray(new aky_2[this.c.size()])) {
            aky_22.a(this);
        }
    }

    @Override
    public void d() {
        while (!this.d.isEmpty()) {
            aku_1 aku_12 = this.d.remove();
            aku_12.b(this);
            this.a(aku_12, "Executing all actions");
        }
    }

    @Override
    public aku_1 b(int n) {
        for (aku_1 aku_12 : this.d) {
            if (aku_12.m() != n) continue;
            return aku_12;
        }
        return null;
    }

    public /* synthetic */ List a() {
        return this.e();
    }
}

