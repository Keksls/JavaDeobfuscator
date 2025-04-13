/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bwD
 */
public class bwd_0
extends bwu_0 {
    private static final Logger h = Logger.getLogger(bwd_0.class);
    private static final int i = 100;
    public static final int f = 237;
    private final int j;
    private final boolean k;
    private final String[] l;
    private boolean m;

    public bwd_0(exq_1 exq_12, int n) {
        assert (exq_12 != null);
        assert (exq_12.h() != null) : "pas d'arme => utiliser plut\u00f4t BareHandAttack.getInstance()";
        assert (exq_12.h()[0] == exh_2.p) : "pas utilisation d'une arme";
        this.e = n;
        this.j = bwd_0.a(exq_12);
        this.k = false;
        assert (this.j != 237);
        assert (!this.k || exq_12.j()[0] == exh_2.q);
        String string = this.g();
        this.l = new String[]{"AnimStatique03-Fun" + string};
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(biI biI2) {
        super.a(biI2);
        this.m = false;
        biI2.e(this.b());
        biI2.i("AnimHit");
    }

    @Override
    public void e(biI biI2) {
        if (this.m) {
            return;
        }
        this.m = true;
        String string = this.g();
        biI2.e(this.c());
        biI2.g("AnimStatique03-Boucle" + string);
        if (this.j == 219) {
            biI2.i("AnimHit");
        } else {
            biI2.i("AnimHit" + string);
        }
        this.f(biI2);
    }

    @Override
    public void f(biI biI2) {
        afp_0 afp_02;
        String string = this.g();
        if (this.j == 219) {
            afp_02 = afr_0.f();
        } else {
            biI2.i("AnimHit" + string);
            afp_02 = new aOB((short)this.j);
        }
        biI2.a(new agh_0(agm.a(), afp_02, afr_0.f()));
    }

    private String g() {
        return "-" + this.j + (this.k ? "-2" : "");
    }

    @Override
    public boolean a(bwu_0 bwu_02) {
        if (!super.a(bwu_02)) {
            return false;
        }
        bwd_0 bwd_02 = (bwd_0)bwu_02;
        return this.j == bwd_02.j && this.k == bwd_02.k;
    }

    public static int a(exq_1 exq_12) {
        exq_1 exq_13 = exq_12;
        while (!exq_13.i()) {
            if ((exq_13 = exq_13.f()) != null) continue;
            h.error((Object)("Arme pas dans la bonne cat\u00e9gorie " + exq_12.d()));
            return 0;
        }
        return exq_13.d();
    }

    @Override
    protected String b() {
        return "AnimStatique03-Fin" + this.g();
    }

    @Override
    protected String c() {
        return "AnimStatique03-Debut" + this.g();
    }

    @Override
    public String d() {
        return "AnimHit" + this.g();
    }

    @Override
    public String[] e() {
        return this.l;
    }
}

