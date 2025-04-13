/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from apN
 */
public final class apn_1 {
    protected static final Logger a = Logger.getLogger(apn_1.class);
    private static final boolean b = false;
    private static final ArrayList<apn_1> c = new ArrayList();
    private static boolean d;
    private static double e;
    private afe_2 f;
    private afe_2 g;
    private final ArrayList<apm_1> h = new ArrayList();

    static void d() {
        for (apn_1 apn_12 : c) {
            try {
                apn_12.g();
            }
            catch (Exception exception) {
                a.error((Object)"Exception during updateManagers", (Throwable)exception);
            }
        }
    }

    private static void e() {
        if (!d) {
            ado_1.a().a(new apo_1(), 50L);
            d = true;
        }
    }

    private static void f() {
        a.trace((Object)(c.size() + " manager(s) registered"));
    }

    public static boolean a(apn_1 apn_12) {
        if (!d) {
            apn_1.e();
        }
        if (!c.contains(apn_12)) {
            boolean bl = c.add(apn_12);
            return bl;
        }
        return false;
    }

    public static boolean b(apn_1 apn_12) {
        boolean bl = c.remove(apn_12);
        if (!bl) {
            a.error((Object)("Impossible de retirer le manager " + apn_12 + " de la liste."));
        }
        return bl;
    }

    public static double a() {
        return e;
    }

    public static void a(double d2) {
        e = d2;
    }

    public apn_1(boolean bl) {
        this(bl, null);
    }

    public apn_1(boolean bl, apm_1 apm_12) {
        if (bl) {
            this.f = new afe_2();
            this.a(apm_12);
        } else {
            apn_1.a(this);
            this.a(apm_12);
        }
    }

    public void a(apm_1 apm_12) {
        if (apm_12 != null && !this.h.contains(apm_12)) {
            this.h.add(apm_12);
        }
    }

    public void b(apm_1 apm_12) {
        if (apm_12 != null) {
            this.h.remove(apm_12);
        }
    }

    public void a(long l, afe_2 afe_22, boolean bl) {
        if (afe_22.e().d() == 0.0f && afe_22.f().d() == 0.0f) {
            return;
        }
        afr_2 afr_22 = afe_22.a(l);
        afr_2 afr_23 = this.a(l);
        double d2 = afr_23.e(afr_22).e();
        if (bl || d2 >= e || afe_22.f().d() == 0.0f) {
            afe_2 afe_23 = new afe_2(afe_22);
            for (apm_1 apm_12 : this.h) {
                apm_12.a(l, this.f, afe_23);
            }
            this.f = afe_23;
        }
    }

    public afr_2 a(long l) {
        return this.f.a(l);
    }

    public boolean b() {
        return this.g == null;
    }

    public void a(long l, afe_2 afe_22) {
        if (this.g == null || !afe_22.b().equals(this.g.b())) {
            this.g = new afe_2(afe_22);
        }
    }

    private void g() {
        if (this.g != null) {
            long l = System.currentTimeMillis();
            for (apm_1 apm_12 : this.h) {
                apm_12.a(l, new afe_2(this.g));
            }
            this.g = null;
        }
    }

    public String toString() {
        if (this.g != null) {
            return this.g.toString();
        }
        if (this.f != null) {
            return this.f.toString();
        }
        return "<undefined>";
    }

    public static void c() {
        if (c != null) {
            int n = c.size();
            c.clear();
            d = false;
            a.info((Object)("Nettoyage des vecteurs de mouvement des personnages (" + c.size() + " restants sur " + n + ")"));
        }
    }

    static {
        e = 3.0;
    }
}

