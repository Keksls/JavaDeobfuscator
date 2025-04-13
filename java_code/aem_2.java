/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEM
 */
public class aem_2 {
    public final aej_2 a;
    public final int b;

    public aem_2(aej_2 aej_22, int n) {
        this.a = aej_22;
        this.b = n;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof aem_2)) {
            return false;
        }
        aem_2 aem_22 = (aem_2)object;
        return aem_22.a == this.a && aem_22.b == this.b;
    }
}

