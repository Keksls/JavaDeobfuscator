/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eCs
 */
public class ecs_0 {
    public static final ecs_0 a = new ecs_0(-1, 0);
    private final int b;
    private final short c;

    public ecs_0(int n, short s2) {
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
        ecs_0 ecs_02 = (ecs_0)object;
        return this.b == ecs_02.b && this.c == ecs_02.c;
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

