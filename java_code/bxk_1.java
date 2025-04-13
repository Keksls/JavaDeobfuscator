/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxK
 */
class bxk_1 {
    private final short a;
    private final byte b;
    private final int c;

    protected bxk_1(short s2, byte by, int n) {
        this.a = s2;
        this.b = by;
        this.c = n;
    }

    public short a() {
        return this.a;
    }

    public byte b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        bxk_1 bxk_12 = (bxk_1)object;
        if (this.a != bxk_12.a) {
            return false;
        }
        if (this.b != bxk_12.b) {
            return false;
        }
        return this.c == bxk_12.c;
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + this.b;
        n = 31 * n + this.c;
        return n;
    }

    public String toString() {
        return "Definition{m_breedId=" + this.a + ", m_sex=" + this.b + ", m_smileyEnumId=" + this.c + "}";
    }
}

