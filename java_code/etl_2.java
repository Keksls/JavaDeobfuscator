/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTL
 */
public abstract class etl_2 {
    private final short a;
    private final int b;
    private final short c;

    protected etl_2(short s2, int n, short s3) {
        this.a = s2;
        this.b = n;
        this.c = s3;
    }

    public abstract int a();

    public final short i() {
        return this.a;
    }

    public final int j() {
        return this.b;
    }

    public final short k() {
        return this.c;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{m_id=" + this.a + ", m_categoryId=" + this.b + ", m_maxQuantity=" + this.c + "}";
    }
}

