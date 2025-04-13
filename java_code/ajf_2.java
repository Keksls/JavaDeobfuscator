/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJf
 */
class ajf_2 {
    final int a;
    final byte[] b;
    final int c;
    final int d;

    ajf_2(int n, byte[] byArray, int n2, int n3) {
        this.a = n;
        this.b = byArray;
        this.c = n2;
        this.d = n3;
        if (n < 0 || n2 < 0 || n3 <= 0 || n2 + n3 > byArray.length) {
            throw new IndexOutOfBoundsException("Illegal Request " + this.toString());
        }
    }

    public int hashCode() {
        return this.a ^ this.c ^ this.d;
    }

    public boolean equals(Object object) {
        if (object instanceof ajf_2) {
            ajf_2 ajf_22 = (ajf_2)object;
            return ajf_22.a == this.a && ajf_22.c == this.c && ajf_22.d == this.d;
        }
        return false;
    }

    public String toString() {
        return "(" + this.a + "," + this.c + "," + this.d + ")";
    }
}

