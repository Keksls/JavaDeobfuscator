/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from aLa
 */
public class ala_2
implements aky_2 {
    protected static final Logger a = Logger.getLogger(ala_2.class);
    private static final ala_2 b = new ala_2();
    private ald_2 c = alf_2.a;
    private akx_1 d;
    private final LinkedList<akx_1> e = new LinkedList();
    private boolean f = false;

    public static ala_2 a() {
        return b;
    }

    public akx_1 a(aku_1 aku_12) {
        if (this.d == null) {
            this.d = this.c.a();
        }
        this.d.b(aku_12);
        aku_12.a(this.d);
        return this.d;
    }

    public akx_1 b(aku_1 aku_12) {
        akx_1 akx_12 = this.c.a();
        akx_12.b(aku_12);
        this.e.add(akx_12);
        aku_12.a(akx_12);
        return akx_12;
    }

    public void b() {
        if (this.d != null) {
            this.d.c();
        }
        this.d = null;
    }

    public void c() {
        this.b();
        int n = this.e.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.e.get(k).c();
                continue;
            }
            catch (Exception exception) {
                a.error((Object)"", (Throwable)exception);
            }
        }
        this.e.clear();
        this.f = false;
    }

    public akx_1 d() {
        return this.d;
    }

    public LinkedList<akx_1> e() {
        return this.e;
    }

    public void f() {
        if (this.d == null) {
            return;
        }
        this.e.add(this.d);
        this.d = null;
        if (!this.f) {
            this.i();
        }
    }

    private void i() {
        if (!this.f && !this.e.isEmpty()) {
            this.f = true;
            akx_1 akx_12 = this.e.getFirst();
            akx_12.a(this);
            akx_12.b();
        }
    }

    @Override
    public void a(akx_1 akx_12) {
        this.e.remove(akx_12);
        this.f = false;
        this.i();
    }

    public void g() {
        a.info((Object)("Action In Execution : " + this.f));
        if (!this.e.isEmpty()) {
            for (akx_1 object : this.e) {
                a.info((Object)("Executing Action Group (" + object.a().size() + " actions)"));
                for (aku_1 aku_12 : object.a()) {
                    a.info((Object)(" * " + aku_12.getClass().getSimpleName()));
                }
            }
        }
        if (this.d != null) {
            a.info((Object)("Pending Action Group (" + this.d.a().size() + " groupes)"));
            for (aku_1 aku_13 : this.d.a()) {
                a.info((Object)(" - " + aku_13.getClass().getSimpleName()));
            }
        } else {
            a.info((Object)"Pending Action Group is null");
        }
    }

    public void h() {
        while (!this.e.isEmpty()) {
            akx_1 akx_12 = this.e.getFirst();
            akx_12.b(this);
            akx_12.d();
            this.e.remove(akx_12);
        }
    }

    public void a(ald_2 ald_22) {
        this.c = ald_22;
    }
}

