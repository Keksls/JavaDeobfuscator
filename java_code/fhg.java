/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Ordering
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class fhg {
    private static final ImmutableList<Integer> a = Ordering.natural().immutableSortedCopy((Iterable)Lists.newArrayList((Object[])new Integer[]{30, 31, 32, 33, 34}));
    private int b;
    private boolean c;

    public short a() {
        int n = a.indexOf((Object)this.b);
        int n2 = this.c ? 1 : 0;
        return Hw.c((long)(n * 2 + n2));
    }

    public static fhg a(short s2) {
        fhg fhg2 = new fhg();
        fhg2.b = (Integer)a.get(s2 / 2);
        fhg2.c = s2 % 2 != 0;
        return fhg2;
    }

    public void a(int n) {
        this.b = n;
    }

    public int b() {
        return this.b;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public boolean c() {
        return this.c;
    }
}

