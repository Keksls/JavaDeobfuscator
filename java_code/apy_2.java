/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from apY
 */
public class apy_2 {
    private final Set<aff_1> a = new LinkedHashSet<aff_1>();
    private final boolean b;
    private static final Logger c = Logger.getLogger(apy_2.class);
    private final aff_1 d = new aff_1();
    private final aff_1 e = new aff_1();

    public apy_2(Iterable<int[]> iterable, boolean bl) {
        for (int[] nArray : iterable) {
            this.a.add(new aff_1(nArray[0], nArray[1]));
        }
        this.b = bl;
    }

    public Iterable<int[]> a(int n, int n2, short s2, int n3, int n4, short s3, aej_2 aej_22) {
        aqa_1 aqa_12 = this.a(n, n2, n3, n4, aej_22);
        ArrayList<int[]> arrayList = new ArrayList<int[]>(this.a.size());
        for (aff_1 aff_12 : this.a) {
            arrayList.add(aqa_12.a(aff_12.d(), aff_12.e()));
        }
        return arrayList;
    }

    public boolean a(int n, int n2, short s2, int n3, int n4, short s3, aej_2 aej_22, int n5, int n6, short s4) {
        aqa_1 aqa_12 = this.a(n, n2, n3, n4, aej_22);
        this.d.b(aqa_12.b(n5, n6));
        return this.a.contains(this.d);
    }

    public boolean a(int n, int n2, short s2, int n3, int n4, short s3, aej_2 aej_22, int n5, int n6, short s4, byte n7) {
        aqa_1 aqa_12 = this.a(n, n2, n3, n4, aej_22);
        this.d.b(aqa_12.b(n5, n6));
        if (n7 <= 0) {
            return this.a.contains(this.d);
        }
        for (int k = -n7; k <= n7; ++k) {
            for (int i2 = -n7; i2 <= n7; ++i2) {
                this.e.c(this.d.d() + k, this.d.e() + i2, (short)0);
                if (!this.a.contains(this.e)) continue;
                return true;
            }
        }
        return false;
    }

    private aqa_1 a(int n, int n2, int n3, int n4, aej_2 aej_22) {
        aej_2 aej_23 = new afs_2(n - n3, n2 - n4, 0).b(aej_22);
        return aqa_1.a(n, n2, aej_23, this.b);
    }
}

