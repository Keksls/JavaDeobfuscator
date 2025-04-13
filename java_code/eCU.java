/*
 * Decompiled with CFR 0.152.
 */
public class eCU {
    public static final eCU a = new eCU(-1, 0);
    private final int b;
    private final short c;

    public eCU(int n, short s2) {
        this.b = n;
        this.c = s2;
    }

    public int a() {
        return this.b;
    }

    public short b() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        eCU eCU2 = (eCU)object;
        return this.b == eCU2.b && this.c == eCU2.c;
    }

    public int hashCode() {
        int n = this.b;
        n = 31 * n + this.c;
        return n;
    }

    public String toString() {
        return "RecipeResultItem{m_itemId=" + this.b + ", m_quantity=" + this.c + "}";
    }
}

