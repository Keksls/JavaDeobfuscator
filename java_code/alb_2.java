/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

/*
 * Renamed from aLb
 */
public class alb_2
extends alc_1
implements ake_1 {
    public static final int e = -1;
    public static final int f = -1;
    private int m = -1;
    private akr_1[] n;
    private Map<String, Object> o;
    private int p = -1;
    protected boolean g = true;
    private final acn_2<String, akr_2> q = new acn_2(1);
    private static final String r = "execution_Time";
    protected akx_2 h;
    private final boolean s;

    public alb_2(int n, int n2, int n3) {
        super(n, n2, n3);
        this.s = false;
    }

    public alb_2() {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.s = false;
    }

    public void a(akr_1 ... akr_1Array) {
        if (this.n == null) {
            this.n = akr_1Array;
            return;
        }
        int n = this.n.length;
        akr_1[] akr_1Array2 = new akr_1[n + akr_1Array.length];
        System.arraycopy(this.n, 0, akr_1Array2, 0, n);
        System.arraycopy(akr_1Array, 0, akr_1Array2, n, akr_1Array.length);
        this.n = akr_1Array2;
    }

    public int n() {
        return this.m;
    }

    public void e(int n) {
        this.m = n;
    }

    public void a(Map<String, Object> map) {
        this.o = map;
    }

    @Override
    public long o() {
        if (this.s) {
            a.error((Object)("Interruption d'une boucle infinie dans une action de script actionId=" + this.e() + " scriptId=" + this.n()));
            return 0L;
        }
        if (this.m != 0 && this.m != -1) {
            try {
                this.h = aks_1.a().a(this.m, this.n, this.o, (ake_1)this, false);
                if (this.h != null) {
                    akr_2 akr_22 = this.q.e(r);
                    if (akr_22 != null && akr_22.a() == akg_2.e) {
                        this.g = false;
                        return ((Double)akr_22.b()).longValue();
                    }
                    this.p = this.h.d();
                    this.g = true;
                    return -1L;
                }
            }
            catch (AssertionError assertionError) {
                a.error((Object)"ERREUR CRITIQUE DANS UN SCRIPT", (Throwable)((Object)assertionError));
            }
        }
        this.p = -1;
        this.j();
        return -1L;
    }

    @Override
    public void a(akx_2 akx_22) {
        if (this.p != akx_22.d() && this.p != -1) {
            a.error((Object)("on tente de finir une action de script(" + this.p + ") demand\u00e9 par la fin d'un autre script(" + akx_22.d() + ")"));
        }
        akx_22.c(this);
        akr_2 akr_22 = this.q.e(r);
        if (akr_22 != null && akr_22.a() == akg_2.e) {
            this.g = false;
            return;
        }
        this.p = -1;
        if (this.g) {
            this.j();
            this.g = false;
        }
        this.h = null;
    }

    @Override
    public void a(akx_2 akx_22, akd_2 akd_22, String string) {
        assert (this.p == akx_22.d() || this.p == -1);
        akx_22.c(this);
        this.p = -1;
        this.j();
    }

    @Override
    public void b(akx_2 akx_22) {
        this.q.a(r, akx_22.c(r));
    }

    public int p() {
        return this.p;
    }

    @Override
    protected void l() {
    }
}

