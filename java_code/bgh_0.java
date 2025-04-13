/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bgH
 */
public class bgh_0
extends eew_0 {
    static final Logger a = Logger.getLogger(bgh_0.class);
    private static final bgh_0 b = new bgh_0();
    private asy_2<ate_0> c = new bgi_0(this);

    protected bgh_0() {
    }

    @Override
    public void a(asy_2<ate_0> asy_22) {
        this.c = asy_22;
    }

    public static bgh_0 a() {
        return b;
    }

    @Override
    @Nullable
    protected final efh_0 b(int n) {
        if (n <= 0) {
            return null;
        }
        ate_0 ate_02 = this.c.a(n);
        if (ate_02 == null) {
            return null;
        }
        return this.a(ate_02);
    }

    public final efh_0 c(int n) {
        efh_0 efh_02 = this.b(n);
        if (efh_02 != null) {
            this.a(efh_02);
        }
        return efh_02;
    }

    protected final efh_0 a(ate_0 ate_02) {
        boolean bl = ate_02.h();
        eFy eFy2 = bl ? (ate_02.f() ? this.d(ate_02) : this.c(ate_02)) : this.b(ate_02);
        eFy2.a(sc_0.a(ate_02.L()));
        eFy2.a(SA.a(ate_02.M()));
        eFy2.a(SB.a(ate_02.K()));
        eFy2.b(ate_02.af());
        eFy2.a(ate_02.ag());
        eFy2.f_(ate_02.N());
        eFy2.b(ate_02.ai());
        eFy2.c(ate_02.aj());
        eFy2.e(ate_02.ak());
        eFy2.a(ate_02.ah());
        this.a(ate_02, ate_02.i(), eFy2);
        return eFy2;
    }

    private void a(ate_0 ate_02, int n, eFy eFy2) {
        String[] stringArray;
        if (ate_02.T().trim().length() == 0) {
            return;
        }
        for (String string : stringArray = Cz.a(ate_02.T(), '~')) {
            String[] stringArray2 = string.split("\\|", -1);
            if (stringArray2.length % 2 != 0) {
                a.error((Object)("HMI error : Nombre de param\u00e8tres d\u00e9cod\u00e9s: " + stringArray2.length + " Attendu: 8 [" + ate_02.T() + "]"));
                continue;
            }
            Byte by = 0;
            Byte by2 = 0;
            Byte by3 = 0;
            String string2 = "";
            boolean bl = false;
            for (int k = 0; k < stringArray2.length; k += 2) {
                String string3 = stringArray2[k];
                String string4 = stringArray2[k + 1];
                if (string3.equals("start")) {
                    by = Byte.parseByte(string4);
                    continue;
                }
                if (string3.equals("end")) {
                    by2 = Byte.parseByte(string4);
                    continue;
                }
                if (string3.equals("type")) {
                    by3 = Byte.parseByte(string4);
                    continue;
                }
                if (string3.equals("data")) {
                    string2 = string4;
                    continue;
                }
                if (!string3.equals("broadcast")) continue;
                bl = Boolean.parseBoolean(string4);
            }
            rg_0 rg_02 = rh_0.a().a(by3, string2, bl);
            if (rg_02 != null) {
                switch (by) {
                    case 0: {
                        eFy2.a(rg_02);
                        break;
                    }
                    case 1: {
                        eFy2.c(rg_02);
                        break;
                    }
                    case 2: {
                        eFy2.b(rg_02);
                        break;
                    }
                    default: {
                        a.error((Object)("Impossible d'enregistrer le d\u00e9but d'une HMIAction pour l'effet " + n + " : type de d\u00e9but non connu : " + by));
                    }
                }
                switch (by2) {
                    case 11: {
                        eFy2.e(rg_02);
                        break;
                    }
                    case 12: {
                        eFy2.d(rg_02);
                        break;
                    }
                    case 10: {
                        rg_02.b(true);
                        break;
                    }
                    default: {
                        a.error((Object)("Impossible d'enregistrer la fin d'une HMIAction pour l'effet " + n + " : type de fin non connu : " + by2));
                        break;
                    }
                }
                continue;
            }
            a.error((Object)("Erreur lors du chargement de l'HMIAction de type " + by3 + " sur l'effet " + n));
        }
    }

    private eFy b(ate_0 ate_02) {
        return new eFy(ate_02.i(), ate_02.j(), this.g(ate_02), ate_02.r(), ate_02.s(), ate_02.t(), ate_02.u(), ate_02.v(), ate_02.w(), ate_02.x(), this.f(ate_02), this.e(ate_02), ate_02.A(), ate_02.H(), ate_02.I(), ate_02.J(), ate_02.c(), ate_02.d(), ate_02.e(), ate_02.O(), ate_02.U(), ate_02.V(), bgh_0.j(ate_02), ate_02.P(), ate_02.Q(), ate_02.R(), ate_02.am(), ate_02.Z(), false, false, ate_02.aa(), bgh_0.k(ate_02), ate_02.ac(), ate_02.ad(), ate_02.ae());
    }

    private eFy c(ate_0 ate_02) {
        return new efb_0(ate_02.i(), ate_02.j(), this.g(ate_02), ate_02.r(), ate_02.s(), ate_02.t(), ate_02.u(), ate_02.v(), ate_02.w(), ate_02.x(), this.f(ate_02), this.e(ate_02), ate_02.A(), this.h(ate_02), this.i(ate_02), ate_02.H(), ate_02.I(), ate_02.J(), ate_02.c(), ate_02.d(), ate_02.e(), ate_02.O(), ate_02.U(), ate_02.V(), bgh_0.j(ate_02), ate_02.P(), ate_02.Q(), ate_02.R(), ate_02.am(), ate_02.Z(), true, ate_02.aa(), bgh_0.k(ate_02), ate_02.ac(), ate_02.ad(), ate_02.ae());
    }

    private eFy d(ate_0 ate_02) {
        return new eFs(ate_02.i(), ate_02.j(), this.g(ate_02), ate_02.r(), ate_02.s(), ate_02.t(), ate_02.u(), ate_02.v(), ate_02.w(), ate_02.x(), this.f(ate_02), this.e(ate_02), ate_02.A(), this.h(ate_02), this.i(ate_02), ate_02.D(), ate_02.E(), ate_02.F(), ate_02.G(), ate_02.H(), ate_02.I(), ate_02.J(), ate_02.c(), ate_02.d(), ate_02.e(), ate_02.O(), ate_02.U(), ate_02.V(), bgh_0.j(ate_02), ate_02.P(), ate_02.Q(), ate_02.R(), ate_02.am(), ate_02.Z(), true, ate_02.aa(), bgh_0.k(ate_02), ate_02.ab(), ate_02.ac(), ate_02.ad(), ate_02.ae());
    }

    private emw_2 e(ate_0 ate_02) {
        return new emw_2(ate_02.z());
    }

    private long f(ate_0 ate_02) {
        long l = 0L;
        if (ate_02.y().startsWith("CRITICAL")) {
            l |= 1L;
        }
        return l;
    }

    private aqd_1 g(ate_0 ate_02) {
        aqd_1 aqd_12 = null;
        try {
            aqd_12 = aqe_1.a(ate_02.n(), ate_02.m(), ate_02.l());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a.error((Object)("Illegal Argument exception pour l'AOE de l'effect d'id : " + ate_02.i()));
        }
        return aqd_12;
    }

    private int h(ate_0 ate_02) {
        boolean bl = ate_02.h();
        return bl ? ate_02.B() : -1;
    }

    private float i(ate_0 ate_02) {
        boolean bl = ate_02.h();
        return bl ? ate_02.C() : -1.0f;
    }

    private static apc_2 j(ate_0 ate_02) {
        apc_2 apc_22 = null;
        try {
            apc_22 = eyS.c(ate_02.W());
        }
        catch (Exception exception) {
            a.error((Object)("Erreur lors de la compilation du crit\u00e8re de l'effet " + ate_02.i() + " de l'item " + ate_02.k() + " de type " + ate_02.X()), (Throwable)exception);
        }
        return apc_22;
    }

    private static aqd_1 k(ate_0 ate_02) {
        short s2 = ate_02.q();
        int[] nArray = ate_02.p();
        short s3 = ate_02.o();
        aqd_1 aqd_12 = null;
        try {
            if (s2 > 0) {
                aqd_12 = aqe_1.a(s2, nArray, s3);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a.error((Object)("zone d'effet vide incorrecte pour l'effet d'id : " + ate_02.i()));
        }
        return aqd_12;
    }
}

