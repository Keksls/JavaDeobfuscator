/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from eUY
 */
public class euy_1
extends evk_1 {
    public static final short a = 0;
    public static final short b = 1;
    public static final short c = 2;
    private final int e;
    private final long f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final ArrayList<efh_0> k = new ArrayList();

    public euy_1(int n, int n2, long l, int n3, int n4, int n5, int n6) {
        super(n, 0, ezy_1.a, 0);
        this.e = n2;
        this.f = l;
        this.g = n3;
        this.h = n4;
        this.i = n5;
        this.j = n6;
    }

    public int a() {
        return this.e;
    }

    public long d() {
        return this.f;
    }

    public boolean e() {
        return this.f >= 0L;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    public int i() {
        return this.j;
    }

    public void a(efh_0 efh_02) {
        this.k.add(efh_02);
    }

    public Iterator<efh_0> j() {
        return this.k.iterator();
    }
}

