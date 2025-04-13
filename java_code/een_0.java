/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Comparator;

/*
 * Renamed from eEN
 */
public class een_0 {
    private static final int c = 200;
    private static final int d = 10;
    public static final int a = 20;
    private static final Comparator<eel_0> e = new eEO();
    private final abq_2<eel_0> f = new abq_2<eel_0>(4, e);

    public void a(eel_0 eel_02) {
        this.f.add(eel_02);
    }

    public boolean a(TObjectProcedure<eel_0> tObjectProcedure) {
        int n = this.f.size();
        for (int k = 0; k < n; ++k) {
            eel_0 eel_02 = (eel_0)this.f.get(k);
            if (tObjectProcedure.execute((Object)eel_02)) continue;
            return false;
        }
        return true;
    }

    public boolean a(TObjectProcedure<eel_0> tObjectProcedure, int n, eEH eEH2) {
        int n2 = this.f.size();
        for (int k = 0; k < n2; ++k) {
            eel_0 eel_02 = (eel_0)this.f.get(k);
            if (!eel_02.a(n, eEH2)) {
                return false;
            }
            if (tObjectProcedure.execute((Object)eel_02)) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return "RewardList{m_rewards=" + this.f.size() + "}";
    }

    public static int a(int n) {
        assert (n > 0 && n <= 200);
        return (n - 1) / 10;
    }

    public static int b(int n) {
        assert (n >= 0 && n < 20);
        return n * 10 + 1;
    }

    public static int c(int n) {
        assert (n >= 0 && n < 20);
        return (n + 1) * 10;
    }
}

