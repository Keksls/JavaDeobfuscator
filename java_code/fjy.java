/*
 * Decompiled with CFR 0.152.
 */
public class fjy
extends fjB {
    private final int e;
    private final int f;
    private final fat<fjz> g = new fat();

    public fjy(long l, int n, int n2, int n3) {
        super(l, n);
        this.e = n2;
        this.f = n3;
    }

    public fjy(long l, int n, int n2, int n3, int n4, fjv fjv2) {
        super(l, n, n4, fjv2);
        this.e = n2;
        this.f = n3;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public fjz a(Object object, Object object2, Object object3, Object object4) {
        return this.g.a(object, object2, object3, object4);
    }

    public fjz a(fjz fjz2) {
        this.g.a(fjz2);
        return fjz2;
    }

    public fjz a(int n) {
        return this.g.a(n);
    }
}

