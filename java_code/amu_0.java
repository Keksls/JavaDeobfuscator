/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;

/*
 * Renamed from amu
 */
public class amu_0 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    private final List<anj_1> g;

    public amu_0(int n, int n2, int n3, int n4, int n5, boolean bl) {
        this(n, n2, n3, n4, n5, bl, Collections.emptyList());
    }

    public amu_0(int n, int n2, int n3, int n4, int n5, boolean bl, List<anj_1> list) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = bl;
        this.g = list;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public List<anj_1> g() {
        return this.g;
    }
}

