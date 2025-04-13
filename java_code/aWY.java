/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aWY
extends aXj {
    private static final List<Byte> e = List.of(Byte.valueOf((byte)0), Byte.valueOf((byte)1), Byte.valueOf((byte)2), Byte.valueOf((byte)3), Byte.valueOf((byte)4), Byte.valueOf((byte)6));
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private final int f;
    private final Object[] g;

    public aWY(int n, Object ... objectArray) {
        this.f = n;
        this.g = objectArray;
    }

    @Override
    public boolean a() {
        switch (this.f) {
            case 0: {
                return true;
            }
            case 2: 
            case 3: {
                return this.g.length == 0 || e.contains((byte)((Byte)this.g[0]));
            }
            case 1: {
                return this.g.length >= 3 && e.contains((byte)((Byte)this.g[0])) && (Integer)this.g[1] > 0 && (Integer)this.g[2] > 0;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Can't use this command: you're not logged in!");
            return;
        }
        if (!emp_0.b(azu_0.j().n().v(), emq_0.bq)) {
            aVo.a().d("You do not have the rights to use this command.");
            return;
        }
        switch (this.f) {
            case 0: {
                aWY.c();
                break;
            }
            case 1: {
                this.a(aaw_22);
                break;
            }
            case 2: {
                this.b(aaw_22);
                break;
            }
            case 3: {
                this.c(aaw_22);
            }
        }
    }

    private void a(aaw_2 aaw_22) {
        cky_1 cky_12 = new cky_1((Byte)this.g[0], (Integer)this.g[1], (Integer)this.g[2]);
        aaw_22.c(cky_12);
    }

    private void b(aaw_2 aaw_22) {
        if (this.g.length > 0) {
            ckz_1 ckz_12 = new ckz_1((Byte)this.g[0]);
            aaw_22.c(ckz_12);
        } else {
            for (byte by : e) {
                ckz_1 ckz_13 = new ckz_1(by);
                aaw_22.c(ckz_13);
            }
        }
    }

    private void c(aaw_2 aaw_22) {
        if (this.g.length > 0) {
            ckw_0 ckw_02 = new ckw_0((Byte)this.g[0]);
            aaw_22.c(ckw_02);
        } else {
            for (byte by : e) {
                ckw_0 ckw_03 = new ckw_0(by);
                aaw_22.c(ckw_03);
            }
        }
    }

    private static void c() {
        aWY.a("=== Lag command === ");
        aWY.c("/!\\ Please ask a dev before starting lag /!\\");
        aWY.a("\"help\" | \"h\" : show help");
        aWY.a("\"start\" &lt;Server Id&gt; &lt;Ping in ms&gt; &lt;Duration in min&gt; : start lag on given server with specified intensity and duration");
        aWY.a("\"stop\" &lt;Server Id&gt; : stop lag on given server");
        aWY.a("\"stop\" : stop lag on all servers");
        aWY.a("\"info\" &lt;Server Id&gt; : get lag info for given server");
        aWY.a("\"info\" : get lag info for all servers");
        aWY.a("");
        aWY.a("Server IDs :");
        for (byte by : e) {
            aWY.a("  - " + by + " : " + Xf.a(by));
        }
    }
}

