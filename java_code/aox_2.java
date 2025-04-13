/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aoX
 */
public class aox_2 {
    public static final aox_2 a = new aox_2(null);
    public static final Comparator<aow_1> b = new aoz_2();
    public static final Comparator<aow_1> c = new aoy_1();
    private final abq_2<aow_1> d;

    public aox_2(Comparator<aow_1> comparator) {
        this.d = new abq_2<aow_1>(comparator);
    }

    public void a(long l, long l2) {
        aow_1 aow_12 = this.a(l);
        if (aow_12 == null) {
            aow_12 = new aow_1(l);
            this.d.add(aow_12);
        }
        aow_12.a(l2);
    }

    @Nullable
    public aow_1 a(long l) {
        for (int k = 0; k < this.d.size(); ++k) {
            aow_1 aow_12 = (aow_1)this.d.get(k);
            if (aow_12.a() != l) continue;
            return aow_12;
        }
        return this.b();
    }

    public int b(long l) {
        for (int k = 0; k < this.d.size(); ++k) {
            aow_1 aow_12 = (aow_1)this.d.get(k);
            if (!aow_12.b(l)) continue;
            return k;
        }
        return -1;
    }

    @Nullable
    public aow_1 a(int n) {
        if (n < 0 || n >= this.d.size()) {
            return this.b();
        }
        return (aow_1)this.d.get(n);
    }

    private aow_1 b() {
        return null;
    }

    public boolean a(TObjectProcedure<aow_1> tObjectProcedure) {
        for (int k = 0; k < this.d.size(); ++k) {
            if (tObjectProcedure.execute((Object)((aow_1)this.d.get(k)))) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return "PlayerRanking{m_ranks=" + this.d.size() + "}";
    }

    public int a() {
        return this.d.size();
    }
}

