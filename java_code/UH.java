/*
 * Decompiled with CFR 0.152.
 */
public class UH<T>
implements UG {
    private final T a;
    private final short b;

    public UH(T t, short s2) {
        this.a = t;
        this.b = s2;
    }

    @Override
    public int a() {
        return this.a.hashCode();
    }

    @Override
    public short c() {
        return this.b;
    }

    @Override
    public apc_2 d() {
        return null;
    }

    public T b() {
        return this.a;
    }
}

