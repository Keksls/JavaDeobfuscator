/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bMz {
    private final int a;
    private final aff_1 b = new aff_1();
    private final ArrayList<bmx_0> c = new ArrayList();
    private int[] d;

    public bMz(int n) {
        this.a = n;
    }

    public int a() {
        return this.a;
    }

    public void a(int n, int n2, short s2) {
        this.b.c(n, n2, s2);
    }

    public aff_1 b() {
        return this.b;
    }

    public void a(bmx_0 bmx_02) {
        this.c.add(bmx_02);
    }

    public ArrayList<bmx_0> c() {
        return this.c;
    }

    public int[] d() {
        return this.d;
    }

    public void a(int[] nArray) {
        this.d = nArray;
    }
}

