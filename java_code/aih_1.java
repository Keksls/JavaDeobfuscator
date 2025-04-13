/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * Renamed from aIH
 */
public final class aih_1 {
    private static final int a = -1;
    private static final int b = 16384;
    private static final int c = 0;
    private static final int[] d = new int[]{0, 0};
    private static final String e = "\t\u0000\u0002\u0002\u0001\u0000\u0002\u0002\u0012\u0000\u0001\u0002\u0001\u0000\u0001\u0003\u001e\u0000\u0001\u0000\u001a\u0000\u0001\u0001\uffa3\u0000";
    private static final char[] f = aih_1.b("\t\u0000\u0002\u0002\u0001\u0000\u0002\u0002\u0012\u0000\u0001\u0002\u0001\u0000\u0001\u0003\u001e\u0000\u0001\u0000\u001a\u0000\u0001\u0001\uffa3\u0000");
    private static final int[] g = aih_1.b();
    private static final String h = "\u0002\u0001\u0002\u0002\u0001\u0001\u0003\u0000\u0001\u0003\u0001\u0001\u0001\u0003\u0001\u0000\u0002\u0003";
    private static final int[] i = aih_1.c();
    private static final String j = "\u0000\u0000\u0000\u0004\u0000\b\u0000\f\u0000\u0010\u0000\b\u0000\u0014\u0000\u0018\u0000\u0004\u0000\u001c\u0000\u0010\u0000 \u0000\f\u0000\u0018";
    private static final int[] k = aih_1.d();
    private static final String l = "\u0001\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0002\u0001\u0006\u0001\u0000\u0005\u0002\u0004\u0000\u0001\u0005\u0001\u0007\u0001\b\u0001\t\u0001\u0005\u0001\n\u0001\u0005\u0001\u000b\u0001\b\u0001\f\u0001\b\u0001\r\u0001\u0005\u0001\u0007\u0001\b\u0001\u000b\u0001\b\u0001\f\u0001\b\u0001\u000e";
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final String[] p = new String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
    private static final int[] q = aih_1.e();
    private static final String r = "\u0003\u0001\u0001\t\u0001\u0001\u0003\u0000\u0003\u0001\u0001\u0000\u0001\t\u0001\u0001";
    private Reader s;
    private int t;
    private int u = 0;
    private char[] v = new char[16384];
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private int C;
    private boolean D = true;
    private boolean E;

    private static int[] b() {
        int[] nArray = new int[14];
        int n = 0;
        n = aih_1.a(h, n, nArray);
        return nArray;
    }

    private static int a(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++);
            char c2 = string.charAt(n2++);
            do {
                nArray[n3++] = c2;
            } while (--n5 > 0);
        }
        return n3;
    }

    private static int[] c() {
        int[] nArray = new int[14];
        int n = 0;
        n = aih_1.b(j, n, nArray);
        return nArray;
    }

    private static int b(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++) << 16;
            nArray[n3++] = n5 | string.charAt(n2++);
        }
        return n3;
    }

    private static int[] d() {
        int[] nArray = new int[36];
        int n = 0;
        n = aih_1.c(l, n, nArray);
        return nArray;
    }

    private static int c(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++);
            int n6 = string.charAt(n2++);
            do {
                nArray[n3++] = --n6;
            } while (--n5 > 0);
        }
        return n3;
    }

    private static int[] e() {
        int[] nArray = new int[14];
        int n = 0;
        n = aih_1.d(r, n, nArray);
        return nArray;
    }

    private static int d(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++);
            char c2 = string.charAt(n2++);
            do {
                nArray[n3++] = c2;
            } while (--n5 > 0);
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(String[] stringArray) {
        try {
            String string;
            InputStream inputStream;
            Object object;
            if (stringArray.length > 0) {
                object = new File(stringArray[0]);
                if (!((File)object).exists()) throw new IOException("Could not find " + stringArray[0]);
                if (!((File)object).canRead()) throw new IOException("Could not open " + stringArray[0]);
                inputStream = new FileInputStream((File)object);
            } else {
                inputStream = System.in;
            }
            object = new aih_1(inputStream);
            while ((string = ((aih_1)object).a()) != null) {
                System.out.println(string);
            }
            return;
        }
        catch (IOException iOException) {
            System.out.println(iOException.getMessage());
        }
    }

    public String a() {
        return this.k();
    }

    private static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int k = 0; k < string.length(); ++k) {
            if (string.charAt(k) == '\\' && k < string.length()) {
                ++k;
            }
            stringBuilder.append(string.charAt(k));
        }
        return stringBuilder.toString();
    }

    aih_1(Reader reader) {
        this.s = reader;
    }

    aih_1(InputStream inputStream) {
        this(new InputStreamReader(inputStream));
    }

    private static char[] b(String string) {
        char[] cArray = new char[65536];
        int n = 0;
        int n2 = 0;
        while (n < 26) {
            int n3 = string.charAt(n++);
            char c2 = string.charAt(n++);
            do {
                cArray[n2++] = c2;
            } while (--n3 > 0);
        }
        return cArray;
    }

    private boolean f() {
        int n;
        if (this.y > 0) {
            System.arraycopy(this.v, this.y, this.v, 0, this.z - this.y);
            this.z -= this.y;
            this.x -= this.y;
            this.w -= this.y;
            this.y = 0;
        }
        if (this.x >= this.v.length) {
            char[] cArray = new char[this.x * 2];
            System.arraycopy(this.v, 0, cArray, 0, this.v.length);
            this.v = cArray;
        }
        if ((n = this.s.read(this.v, this.z, this.v.length - this.z)) > 0) {
            this.z += n;
            return false;
        }
        if (n == 0) {
            int n2 = this.s.read();
            if (n2 == -1) {
                return true;
            }
            this.v[this.z++] = (char)n2;
            return false;
        }
        return true;
    }

    private void g() {
        this.E = true;
        this.z = this.y;
        if (this.s != null) {
            this.s.close();
        }
    }

    private void a(Reader reader) {
        this.s = reader;
        this.D = true;
        this.E = false;
        this.y = 0;
        this.z = 0;
        this.w = 0;
        this.x = 0;
        this.C = 0;
        this.B = 0;
        this.A = 0;
        this.u = 0;
    }

    private int h() {
        return this.u;
    }

    private void a(int n) {
        this.u = n;
    }

    private String i() {
        return new String(this.v, this.y, this.w - this.y);
    }

    private char b(int n) {
        return this.v[this.y + n];
    }

    private int j() {
        return this.w - this.y;
    }

    private void c(int n) {
        String string;
        try {
            string = p[n];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            string = p[0];
        }
        throw new Error(string);
    }

    private void d(int n) {
        if (n > this.j()) {
            this.c(2);
        }
        this.w -= n;
    }

    private String k() {
        int n = this.z;
        char[] cArray = this.v;
        char[] cArray2 = f;
        int[] nArray = k;
        int[] nArray2 = i;
        int[] nArray3 = q;
        block7: while (true) {
            int n2;
            int n3 = this.w;
            int n4 = -1;
            this.x = this.y = n3;
            int n5 = this.y;
            this.t = d[this.u];
            while (true) {
                int n6;
                if (n5 < n) {
                    n2 = cArray[n5++];
                } else {
                    if (this.E) {
                        n2 = -1;
                        break;
                    }
                    this.x = n5;
                    this.w = n3;
                    n6 = this.f();
                    n5 = this.x;
                    n3 = this.w;
                    cArray = this.v;
                    n = this.z;
                    if (n6 != 0) {
                        n2 = -1;
                        break;
                    }
                    n2 = cArray[n5++];
                }
                n6 = nArray[nArray2[this.t] + cArray2[n2]];
                if (n6 == -1) break;
                this.t = n6;
                int n7 = nArray3[this.t];
                if ((n7 & 1) != 1) continue;
                n4 = this.t;
                n3 = n5;
                if ((n7 & 8) == 8) break;
            }
            this.w = n3;
            switch (n4 < 0 ? n4 : g[n4]) {
                case 3: {
                    return aih_1.a(this.i().substring(1, this.i().length() - 1));
                }
                case 4: {
                    continue block7;
                }
                case 2: 
                case 5: {
                    continue block7;
                }
                case 1: {
                    return aih_1.a(this.i());
                }
                case 6: {
                    continue block7;
                }
            }
            if (n2 == -1 && this.y == this.x) {
                this.E = true;
                return null;
            }
            this.c(1);
        }
    }
}

