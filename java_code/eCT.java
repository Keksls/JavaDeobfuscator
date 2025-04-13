/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class eCT {
    private final eCM[] a;
    private final short b;
    private final short c;
    private final boolean d;

    public eCT(eCM[] eCMArray, short s2, short s3, boolean bl) {
        this.a = eCMArray;
        this.b = s2;
        this.c = s3;
        this.d = bl;
    }

    public eCM[] a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }

    public short c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "RecipeMaterialSlot{m_materialTypes=" + Arrays.toString(this.a) + ", m_minLevel=" + this.b + ", m_minRarity=" + this.c + ", m_optionnal=" + this.d + "}";
    }

    public boolean equals(Object object) {
        if (!(object instanceof eCT)) {
            return false;
        }
        eCT eCT2 = (eCT)object;
        for (eCM eCM2 : eCT2.a()) {
            if (ahi_2.a(this.a, eCM2)) continue;
            return false;
        }
        return this.b == eCT2.b() && this.c == eCT2.b() && this.d == eCT2.d();
    }
}

