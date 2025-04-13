/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aIN
 */
public class ain_2 {
    private final byte[] a;
    private final int b;

    public ain_2(int n) {
        this.b = n;
        int n2 = (n - 1) / 8 + 1;
        this.a = new byte[n2];
    }

    public ain_2(byte[] byArray, int n) {
        this.b = n;
        int n2 = (n - 1) / 8 + 1;
        this.a = new byte[n2];
        System.arraycopy(byArray, 0, this.a, 0, n2);
    }

    public byte[] a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        if (n < 0 || n >= this.b) {
            throw new IndexOutOfBoundsException(Integer.toString(n));
        }
        int n2 = n / 8;
        int n3 = 128 >> n % 8;
        int n4 = n2;
        this.a[n4] = (byte)(this.a[n4] | n3);
    }

    public boolean b(int n) {
        if (n < 0 || n >= this.b) {
            throw new IndexOutOfBoundsException(Integer.toString(n));
        }
        int n2 = n / 8;
        int n3 = 128 >> n % 8;
        return (this.a[n2] & n3) != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BitField[");
        for (int k = 0; k < this.b; ++k) {
            if (!this.b(k)) continue;
            stringBuilder.append(' ');
            stringBuilder.append(k);
        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }

    public String c() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < this.b; ++k) {
            if (this.b(k)) {
                stringBuilder.append('+');
                continue;
            }
            stringBuilder.append('-');
        }
        return stringBuilder.toString();
    }
}

