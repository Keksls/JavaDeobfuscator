/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from eqN
 */
public class eqn_2 {
    public static final eqn_2 a = new eqn_2();

    private eqn_2() {
    }

    public int a() {
        return 10000;
    }

    public int b() {
        return 16942;
    }

    public int c() {
        return 25100;
    }

    public int d() {
        return 25101;
    }

    public void a(TIntProcedure tIntProcedure) {
        for (int n : eqq_2.e) {
            if (tIntProcedure.execute(n)) continue;
            return;
        }
    }

    public int e() {
        return 1;
    }

    public int f() {
        return 2;
    }

    public double g() {
        return 0.9;
    }
}

