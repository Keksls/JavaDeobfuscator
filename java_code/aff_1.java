/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aFf
 */
public class aff_1 {
    private static final Logger b = Logger.getLogger(aff_1.class);
    private int c;
    private int d;
    private short e;

    public aff_1() {
    }

    public aff_1(aff_1 aff_12) {
        this.c(aff_12.c, aff_12.d, aff_12.e);
    }

    public aff_1(int[] nArray) {
        this.b(nArray);
    }

    public aff_1(int n, int n2, short s2) {
        this.c(n, n2, s2);
    }

    public aff_1(aff_1 aff_12, afs_2 afs_22) {
        this.c(aff_12.c + afs_22.a(), aff_12.d + afs_22.b(), (short)(aff_12.e + afs_22.c()));
    }

    public aff_1(int n, int n2) {
        this.c = n;
        this.d = n2;
        this.e = 0;
    }

    public afd_1 a() {
        return new afd_1(this.c, this.d);
    }

    public aff_1 a(int n) {
        this.c *= n;
        this.d *= n;
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof aff_1)) {
            return false;
        }
        aff_1 aff_12 = (aff_1)object;
        return this.c == aff_12.c && this.d == aff_12.d && this.e == aff_12.e;
    }

    public int hashCode() {
        long l = 1L;
        l = 31L * l + (long)(this.c & 0xFF);
        l = 31L * l + (long)(this.c >> 8 & 0xFF);
        l = 31L * l + (long)(this.c >> 16 & 0xFF);
        l = 31L * l + (long)(this.c >> 24 & 0xFF);
        l = 31L * l + (long)(this.d & 0xFF);
        l = 31L * l + (long)(this.d >> 8 & 0xFF);
        l = 31L * l + (long)(this.d >> 16 & 0xFF);
        l = 31L * l + (long)(this.d >> 24 & 0xFF);
        l = 31L * l + (long)(this.e & 0xFF);
        l = 31L * l + (long)(this.e >> 8 & 0xFF);
        l = 31L * l + (long)(this.e >> 16 & 0xFF);
        l = 31L * l + (long)(this.e >> 24 & 0xFF);
        return (int)(l ^ l >> 32);
    }

    public int b() {
        long l = 1L;
        l = 31L * l + (long)(this.c & 0xFF);
        l = 31L * l + (long)(this.c >> 8 & 0xFF);
        l = 31L * l + (long)(this.c >> 16 & 0xFF);
        l = 31L * l + (long)(this.c >> 24 & 0xFF);
        l = 31L * l + (long)(this.d & 0xFF);
        l = 31L * l + (long)(this.d >> 8 & 0xFF);
        l = 31L * l + (long)(this.d >> 16 & 0xFF);
        l = 31L * l + (long)(this.d >> 24 & 0xFF);
        return (int)(l ^ l >> 32);
    }

    public String toString() {
        return "{Point3 : (" + this.c + ", " + this.d + ", " + this.e + ")}";
    }

    public void a(int n, int n2, int n3) {
        this.c += n;
        this.d += n2;
        this.e = (short)(this.e + n3);
    }

    public void a(aff_1 aff_12) {
        this.c += aff_12.c;
        this.d += aff_12.d;
        this.e = (short)(this.e + aff_12.e);
    }

    public void a(int n, int n2) {
        this.c += n;
        this.d += n2;
    }

    public boolean b(int n, int n2) {
        return this.c == n && this.d == n2;
    }

    public boolean b(int n, int n2, int n3) {
        return this.c == n && this.d == n2 && this.e == n3;
    }

    public boolean a(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        aff_1 aff_12 = (aff_1)object;
        return this.c == aff_12.c && this.d == aff_12.d;
    }

    @Nullable
    public aej_2 b(aff_1 aff_12) {
        int n = aff_12.c - this.c;
        n = Integer.compare(n, 0);
        int n2 = aff_12.d - this.d;
        n2 = Integer.compare(n2, 0);
        return aej_2.a(n, n2);
    }

    public aej_2 a(int n, int n2, short s2) {
        int n3 = n - this.c;
        n3 = Integer.compare(n3, 0);
        int n4 = n2 - this.d;
        n4 = Integer.compare(n4, 0);
        return aej_2.a(n3, n4);
    }

    @Nullable
    public aej_2 c(aff_1 aff_12) {
        int n = Math.abs(aff_12.c - this.c);
        int n2 = Math.abs(aff_12.d - this.d);
        aej_2 aej_22 = this.b(aff_12);
        return aff_1.a(n, n2, aej_22);
    }

    public static aej_2 a(int n, int n2, aej_2 aej_22) {
        if (aej_22 == null) {
            return null;
        }
        if (aej_22.c()) {
            return aej_22;
        }
        switch (aej_22) {
            case a: {
                return n > n2 ? aej_2.b : aej_2.h;
            }
            case e: {
                return n > n2 ? aej_2.f : aej_2.d;
            }
            case g: {
                return n > n2 ? aej_2.f : aej_2.h;
            }
            case c: {
                return n > n2 ? aej_2.b : aej_2.d;
            }
        }
        return null;
    }

    public aej_2 d(aff_1 aff_12) {
        int n = aff_12.c - this.c;
        n = n == 0 ? n : n / Math.abs(n);
        int n2 = aff_12.d - this.d;
        n2 = n2 == 0 ? n2 : n2 / Math.abs(n2);
        return aej_2.a(n, n2);
    }

    public int e(aff_1 aff_12) {
        return Math.abs(aff_12.c - this.c) + Math.abs(aff_12.d - this.d);
    }

    public int b(int n, int n2, short s2) {
        return Math.abs(n - this.c) + Math.abs(n2 - this.d);
    }

    public int c(int n, int n2) {
        return Math.abs(n - this.c) + Math.abs(n2 - this.d);
    }

    public int a(int[] nArray) {
        assert (nArray != null && nArray.length >= 2);
        return Math.abs(nArray[0] - this.c) + Math.abs(nArray[1] - this.d);
    }

    public int f(aff_1 aff_12) {
        int n = this.e(aff_12);
        if (n <= 1) {
            return 0;
        }
        return n - 1;
    }

    public void c() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public void b(int[] nArray) {
        if (nArray.length > 1) {
            this.c = nArray[0];
            this.d = nArray[1];
            this.e = nArray.length > 2 ? (short)nArray[2] : (short)0;
        } else {
            throw new IllegalArgumentException("La longueur du tableau passe en parametre n'est pas adaptee : " + nArray.length);
        }
    }

    public void c(int n, int n2, short s2) {
        this.c = n;
        this.d = n2;
        this.e = s2;
    }

    public void g(aff_1 aff_12) {
        this.c = aff_12.c;
        this.d = aff_12.d;
        this.e = aff_12.e;
    }

    public void a(aej_2 aej_22) {
        this.c += aej_22.m;
        this.d += aej_22.n;
    }

    public void a(afr_2 afr_22) {
        this.c = (int)((float)this.c + afr_22.a());
        this.d = (int)((float)this.d + afr_22.b());
        this.e = (short)((float)this.e + afr_22.c());
    }

    public void c(int n, int n2, int n3) {
        this.c -= n;
        this.d -= n2;
        this.e = (short)(this.e - n3);
    }

    public void h(aff_1 aff_12) {
        this.c -= aff_12.c;
        this.d -= aff_12.d;
        this.e = (short)(this.e - aff_12.e);
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public short f() {
        return this.e;
    }

    public void b(int n) {
        this.c = n;
    }

    public void c(int n) {
        this.d = n;
    }

    public void a(short s2) {
        this.e = s2;
    }

    public int[] g() {
        return new int[]{this.c, this.d, this.e};
    }

    public boolean d(int n, int n2) {
        return n == this.c && n2 == this.d || n == this.c - 1 && n2 == this.d || n == this.c && n2 == this.d - 1 || n == this.c + 1 && n2 == this.d || n == this.c && n2 == this.d + 1;
    }

    public boolean e(int n, int n2) {
        return this.d(n, n2) || n == this.c - 1 && n2 == this.d - 1 || n == this.c + 1 && n2 == this.d + 1 || n == this.c - 1 && n2 == this.d + 1 || n == this.c + 1 && n2 == this.d - 1;
    }

    public boolean i(aff_1 aff_12) {
        if (aff_12 == null) {
            return false;
        }
        if (this.equals(aff_12)) {
            return false;
        }
        return this.c == aff_12.c || this.d == aff_12.d;
    }

    public boolean a(aff_1 aff_12, aff_1 aff_13) {
        if (aff_12 == null || aff_13 == null) {
            return false;
        }
        if (this.equals(aff_12) || this.equals(aff_13)) {
            return false;
        }
        return this.c == aff_12.c && this.c == aff_13.c || this.d == aff_12.d && this.d == aff_13.d;
    }

    public boolean j(aff_1 aff_12) {
        if (aff_12 == null) {
            return false;
        }
        if (this.equals(aff_12)) {
            return false;
        }
        return Math.abs(this.c - aff_12.c) == Math.abs(this.d - aff_12.d);
    }

    public boolean b(aff_1 aff_12, aff_1 aff_13) {
        if (aff_12 == null || aff_13 == null) {
            return false;
        }
        if (this.equals(aff_12) || this.equals(aff_13)) {
            return false;
        }
        boolean bl = Math.abs(this.c - aff_12.c) == Math.abs(this.d - aff_12.d);
        boolean bl2 = Math.abs(this.c - aff_13.c) == Math.abs(this.d - aff_13.d);
        return bl && bl2;
    }
}

