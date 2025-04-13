/*
 * Decompiled with CFR 0.152.
 */
public class eGp
extends eGH
implements eKf {
    private static final int z = 0;
    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 3;
    private static final aqr_2 D = new eFw(new eFv("Valeur", new eFu("Valeur", eFx.b)), new eFv("Valeur + config", new eFu("Valeur", eFx.b), new eFu("0 = NONE / 1 = ARMOR_GIVEN / 2 = ARMOR_RECEIVED / 3 = ARMOR_GIVEN + ARMOR_RECEIVED (d\u00e9faut)", eFx.c)), new eFv("Valeur + config + \u00e9l\u00e9ment", new eFu("Valeur", eFx.b), new eFu("0 = NONE / 1 = ARMOR_GIVEN / 2 = ARMOR_RECEIVED / 3 = ARMOR_GIVEN + ARMOR_RECEIVED (d\u00e9faut)", eFx.c), new eFu("Element (0 pour ignorer)", eFx.c)));
    private int E = 0;

    public eGp() {
        super(eps_0.Y);
    }

    @Override
    public aqr_2 c_() {
        return D;
    }

    public eGp aF() {
        eGp eGp2 = new eGp();
        eGp2.w = this.w;
        eGp2.E = 0;
        eGp2.M();
        return eGp2;
    }

    @Override
    public void j(sd_0 sd_02) {
        this.m = 0;
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        int n = this.aN();
        if (!eGp.h(n)) {
            a.error((Object)("Invalid armor parameter " + n + " in effect id=" + this.o()));
            return;
        }
        this.m = Hw.c((float)this.m * this.i(n));
        if (((efh_0)this.c).F() > 2) {
            int n2 = ((efh_0)this.c).a(2, this.aZ(), eFb.a);
            efa_0 efa_02 = efa_0.a((byte)n2);
            if (efa_02 == null) {
                a.error((Object)("Invalid element parameter " + n2 + " in effect id=" + this.o()));
                return;
            }
            if (efa_02.i()) {
                this.m = Hw.c((float)this.m * this.a(efa_02));
            }
        }
        this.m = Hw.c((float)this.m * this.j(n));
    }

    private static boolean h(int n) {
        return n >= 0 && n <= 3;
    }

    private int aN() {
        if (((efh_0)this.c).F() < 2) {
            return 3;
        }
        return ((efh_0)this.c).a(1, this.aZ(), eFb.a);
    }

    private float a(efa_0 efa_02) {
        int n = 0;
        eps_0 eps_02 = efa_02.c();
        if (this.e.a(eps_02)) {
            n += this.e.c(eps_02);
        }
        if (this.e.a(eps_0.p)) {
            n += this.e.c(eps_0.p);
        }
        if (this.e.a(eps_0.ac)) {
            n += this.e.c(eps_0.ac);
        }
        if (this.e.a(eps_0.af)) {
            n += this.e.c(eps_0.af);
        }
        if (this.e.a(eps_0.ad)) {
            n += this.e.c(eps_0.ad);
        }
        return Math.max(1.0f + (float)n / 100.0f, 0.0f);
    }

    private float i(int n) {
        if (n == 0) {
            return 1.0f;
        }
        int n2 = 0;
        if ((n == 1 || n == 3) && this.e.a_() != this.f.a_() && this.e.a(eps_0.au)) {
            n2 += this.e.c(eps_0.au);
        }
        if ((n == 2 || n == 3) && this.f.a(eps_0.av)) {
            n2 += this.f.c(eps_0.av);
        }
        return Math.max(1.0f + (float)n2 / 100.0f, 0.0f);
    }

    private float j(int n) {
        if (n == 0) {
            return 1.0f;
        }
        return Math.max(1.0f + (float)this.E / 100.0f, 0.0f);
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public int g(int n) {
        return this.E += n;
    }

    @Override
    public /* synthetic */ eGH aG() {
        return this.aF();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aF();
    }
}

