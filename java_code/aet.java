/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class aet {
    protected aes[] a;
    protected final ArrayList<aes> b = new ArrayList(300);
    int c;
    int d;

    public final void a(int n, int n2) {
        this.c = n * 18;
        this.d = n2 * 18;
    }

    protected final int a() {
        return this.c;
    }

    protected final int b() {
        return this.d;
    }

    final aes a(int n, int n2, int n3) {
        try {
            int n4 = this.b(n, n2, n3);
            if (n4 < 0) {
                return null;
            }
            if (n4 >= this.a.length) {
                return null;
            }
            return this.a[n4];
        }
        catch (Exception exception) {
            return null;
        }
    }

    public final int b(int n, int n2, int n3) {
        return n - this.c + (n2 - this.d + n3 * 18) * 18;
    }

    final void a(arf_1 arf_12) {
        this.c = arf_12.b() * 18;
        this.d = arf_12.b() * 18;
        this.a = aet.a(this.b, 324, arf_12);
    }

    final void a(float f2) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).a(f2);
        }
    }

    final void b(float f2) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).b(f2);
        }
    }

    public static aes[] a(ArrayList<aes> arrayList, int n, arf_1 arf_12) {
        arrayList.clear();
        aet.a(arrayList, arf_12);
        return aet.b(arrayList, n, arf_12);
    }

    private static void a(ArrayList<aes> arrayList, arf_1 arf_12) {
        int n = arf_12.b() & 0xFFFF;
        for (int k = 0; k < n; ++k) {
            boolean bl = arf_12.l();
            int n2 = arf_12.c();
            int n3 = arf_12.c();
            int n4 = arf_12.c();
            aes aes2 = new aes(n2, n3, n4, bl);
            arrayList.add(aes2);
        }
    }

    private static aes[] b(ArrayList<aes> arrayList, int n, arf_1 arf_12) {
        short s2 = arf_12.b();
        int n2 = arf_12.b();
        aes[] aesArray = new aes[n * s2];
        for (int k = 0; k < n2; ++k) {
            int n3 = arf_12.h();
            int n4 = arf_12.h();
            aesArray[n3] = arrayList.get(n4);
        }
        return aesArray;
    }
}

