/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public abstract class XW<PartitionType extends XW> {
    public static final int a = 9;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    private PartitionType[] p;
    private List<PartitionType> q;

    public int a() {
        return this.k;
    }

    public int b() {
        return this.l;
    }

    public int c() {
        return this.m;
    }

    public int d() {
        return this.n;
    }

    public List<PartitionType> e() {
        return this.q;
    }

    public PartitionType[] f() {
        return this.p;
    }

    public void a(@NotNull PartitionType[] PartitionTypeArray) {
        assert (PartitionTypeArray.length == 9);
        this.p = PartitionTypeArray;
        this.q = Arrays.asList(PartitionTypeArray);
    }

    public PartitionType a(int n) {
        if (n >= 0 && n <= 8) {
            return this.p[n];
        }
        return null;
    }

    public void a(int n, PartitionType PartitionType) {
        if (n >= 0 && n <= 8) {
            this.p[n] = PartitionType;
        }
    }

    public boolean a(int n, int n2) {
        int n3 = this.l * this.n;
        if (n2 < n3 || n2 >= n3 + this.n) {
            return false;
        }
        int n4 = this.k * this.m;
        return n >= n4 && n < n4 + this.m;
    }

    public void a(int n, int n2, int n3, int n4) {
        this.k = n;
        this.l = n2;
        this.m = n3;
        this.n = n4;
    }
}

