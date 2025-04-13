/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aLg
 */
final class alg_2
implements akx_1 {
    public static final boolean a = true;
    private static final Logger b = Logger.getLogger(ale_2.class);
    private final ArrayList<aky_2> c = new ArrayList();
    private final List<aku_1> d = new ArrayList<aku_1>();
    private final List<aku_1> e = new ArrayList<aku_1>();
    private aku_1 f;

    alg_2() {
    }

    @Override
    public List<aku_1> a() {
        return this.d;
    }

    @Override
    public void b(aku_1 aku_12) {
        b.info((Object)("[FIGHT_DEBUG] On ajoute l'action " + this.c(aku_12) + " au groupe " + this + " Stack : " + aho_2.a(3, 2)));
        aku_12.a(false);
        this.d.add(aku_12);
        this.e.add(aku_12);
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
    public aku_1 c(int n) {
        for (aku_1 aku_12 : this.d) {
            if (aku_12.d() != n) continue;
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
    public void a(aky_2 aky_22) {
        this.c.add(aky_22);
    }

    @Override
    public void b(aky_2 aky_22) {
        this.c.remove(aky_22);
    }

    @Override
    public void b() {
        if (this.d.isEmpty()) {
            this.e();
            return;
        }
        this.a(this.d.get(0), true);
    }

    @Override
    public void a(aku_1 aku_12, boolean bl) {
        aku_1 aku_13;
        b.info((Object)("[FIGHT_DEBUG] On essaie de runner l'action " + this.c(aku_12) + " dans le groupe " + this));
        if (!this.d.contains(aku_12)) {
            b.error((Object)("On essaie d'executer une action qui n'est pas dans le groupe " + this.c(aku_12) + " dans le groupe " + this));
            return;
        }
        if (!bl) {
            if (this.f == null) {
                this.f = aku_12;
            } else {
                int n = this.e.indexOf(aku_12);
                int n2 = this.e.indexOf(this.f);
                if (n2 < n) {
                    this.f = aku_12;
                }
            }
        }
        if ((aku_13 = this.d.get(0)).k()) {
            return;
        }
        aku_13.a((akw_2)this);
        this.a(aku_13, "In Group order");
    }

    private void a(aku_1 aku_12, String string) {
        if (aku_12.k()) {
            b.error((Object)("On essaie d'executer une action qui l'a d\u00e9j\u00e0 \u00e9t\u00e9 : " + this.c(aku_12) + " dans le groupe " + this));
            return;
        }
        b.info((Object)("[FIGHT_DEBUG] RUN ACTION (" + string + ") " + this.c(aku_12)));
        try {
            aku_12.a(true);
            aku_12.a();
        }
        catch (Throwable throwable) {
            b.error((Object)("[_FL_] ACTION FAILURE (" + string + ") " + this.c(aku_12) + " - " + aho_2.a(throwable) + " with " + this.d.size() + " when crush"));
            this.a(aku_12);
        }
        b.info((Object)("[FIGHT_DEBUG] ACTION COMPLETE (" + string + ") " + this.c(aku_12)));
    }

    private String c(aku_1 aku_12) {
        return aku_12.getClass().getSimpleName() + " : " + aku_12.c() + " #" + aku_12.hashCode();
    }

    @Override
    public void a(aku_1 aku_12) {
        aku_12.b(this);
        if (this.f == aku_12) {
            this.f = null;
        }
        this.d.remove(aku_12);
        if (this.d.isEmpty()) {
            this.e();
        } else if (this.f == null || this.f != aku_12) {
            this.b();
        }
    }

    @Override
    public void c() {
        b.info((Object)("Kill des actions de la pile (" + this.a().size() + ")"));
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
        this.e();
    }

    private void e() {
        aky_2[] aky_2Array = new aky_2[this.c.size()];
        for (aky_2 aky_22 : this.c.toArray(aky_2Array)) {
            aky_22.a(this);
        }
    }

    @Override
    public void d() {
        while (!this.d.isEmpty()) {
            aku_1 aku_12 = this.d.remove(0);
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
}

