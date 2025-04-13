/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aAq
 */
public class aaq_1 {
    protected static final Logger a = Logger.getLogger(aaq_1.class);
    protected boolean[][] b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected boolean g;
    static final char h = 'X';
    static final char i = '-';
    static final char j = ' ';

    protected aaq_1() {
    }

    protected aaq_1(int n) {
        this.a(n);
    }

    protected aaq_1(int n, int n2) {
        this.a(n, n2);
    }

    protected aaq_1(boolean[][] blArray) {
        this.c = blArray.length;
        if (this.c > 0) {
            this.d = blArray[0].length;
            this.b = blArray;
        }
    }

    public aaq_1(int n, int n2, List<int[]> list) {
        this.a(n, n2);
        this.a(list);
    }

    protected void a(int n) {
        this.c = 2 * n + 1;
        this.d = 2 * n + 1;
        this.e = n;
        this.f = n;
        this.b = new boolean[this.c][this.d];
    }

    protected void a(int n, int n2) {
        this.c = 2 * n + 1;
        this.d = 2 * n2 + 1;
        this.e = n;
        this.f = n2;
        this.b = new boolean[this.c][this.d];
    }

    public void a(aaq_1 aaq_12) {
        this.b = (boolean[][])aaq_12.b.clone();
        for (int k = 0; k < this.c; ++k) {
            this.b[k] = (boolean[])aaq_12.b[k].clone();
        }
        this.c = aaq_12.c;
        this.d = aaq_12.d;
        this.e = aaq_12.e;
        this.f = aaq_12.f;
        this.g = aaq_12.g;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public void c() {
        this.e = this.c / 2;
        this.f = this.d / 2;
    }

    public void b(int n, int n2) {
        this.e = n;
        this.f = n2;
    }

    public boolean c(int n, int n2) {
        return this.b[n][n2];
    }

    public void a(boolean[][] blArray) {
        this.b = blArray;
        this.g = false;
    }

    public void a(List<int[]> list) {
        for (int[] nArray : list) {
            this.b[nArray[0] + this.c][nArray[1] + this.d] = true;
        }
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public void a(int n, int n2, aas_1 aas_12, aas_1 aas_13) {
        block44: {
            block46: {
                float f2;
                boolean[] blArray;
                int n3;
                block45: {
                    boolean[][] blArray2 = null;
                    n3 = 0;
                    if (n != this.c) {
                        float f3 = (float)this.c / (float)n;
                        blArray2 = this.b;
                        this.b = new boolean[n][];
                        if (n < this.c) {
                            switch (aas_12) {
                                case a: 
                                case b: 
                                case c: {
                                    for (n3 = 0; n3 < n; ++n3) {
                                        this.b[n3] = blArray2[n3];
                                    }
                                    break;
                                }
                                case d: {
                                    for (n3 = 0; n3 < n; ++n3) {
                                        this.b[n3] = blArray2[Math.round((float)n3 * f3)];
                                    }
                                    break;
                                }
                            }
                        } else {
                            switch (aas_12) {
                                case a: {
                                    for (n3 = 0; n3 < this.c; ++n3) {
                                        this.b[n3] = blArray2[n3];
                                    }
                                    for (n3 = this.c; n3 < n; ++n3) {
                                        this.b[n3] = new boolean[n2];
                                    }
                                    break;
                                }
                                case b: {
                                    for (n3 = 0; n3 < n; ++n3) {
                                        this.b[n3] = blArray2[n3 % this.c];
                                    }
                                    break;
                                }
                                case d: {
                                    for (n3 = 0; n3 < n; ++n3) {
                                        this.b[n3] = blArray2[(int)((float)n3 * f3)];
                                    }
                                    break;
                                }
                                case c: {
                                    for (n3 = 0; n3 < n; ++n3) {
                                        this.b[n3] = n3 / this.c % 2 == 0 ? blArray2[n3 % this.c] : blArray2[this.c - n3 % this.c - 1];
                                    }
                                    break;
                                }
                            }
                        }
                        this.c = n;
                    }
                    if (n2 == this.d) break block44;
                    blArray = null;
                    f2 = (float)this.d / (float)n2;
                    if (n2 >= this.d) break block45;
                    switch (aas_13) {
                        case a: 
                        case b: 
                        case c: {
                            for (int k = 0; k < this.c; ++k) {
                                blArray = this.b[k];
                                this.b[k] = new boolean[n2];
                                for (n3 = 0; n3 < n2; ++n3) {
                                    this.b[k][n3] = blArray[n3];
                                }
                            }
                            break block46;
                        }
                        case d: {
                            for (int k = 0; k < this.c; ++k) {
                                blArray = this.b[k];
                                this.b[k] = new boolean[n2];
                                for (n3 = 0; n3 < n2; ++n3) {
                                    this.b[k][n3] = blArray[(int)((float)n3 * f2)];
                                }
                            }
                            break;
                        }
                    }
                    break block46;
                }
                switch (aas_13) {
                    case a: {
                        for (int k = 0; k < this.c; ++k) {
                            blArray = this.b[k];
                            this.b[k] = new boolean[n2];
                            for (n3 = 0; n3 < n2; ++n3) {
                                this.b[k][n3] = blArray[n3];
                            }
                        }
                        break;
                    }
                    case b: {
                        for (int k = 0; k < this.c; ++k) {
                            blArray = this.b[k];
                            this.b[k] = new boolean[n2];
                            for (n3 = 0; n3 < n2; ++n3) {
                                this.b[k][n3] = blArray[n3 % this.d];
                            }
                        }
                        break;
                    }
                    case d: {
                        for (int k = 0; k < this.c; ++k) {
                            blArray = this.b[k];
                            this.b[k] = new boolean[n2];
                            try {
                                for (n3 = 0; n3 < n2; ++n3) {
                                    this.b[k][n3] = blArray[(int)((float)n3 * f2)];
                                }
                                continue;
                            }
                            catch (Exception exception) {
                                a.info((Object)((int)((float)n3 * f2)));
                            }
                        }
                        break;
                    }
                    case c: {
                        for (int k = 0; k < this.c; ++k) {
                            blArray = this.b[k];
                            this.b[k] = new boolean[n2];
                            for (n3 = 0; n3 < n2; ++n3) {
                                this.b[k][n3] = n3 / this.c % 2 == 0 ? blArray[n3 % this.d] : blArray[this.d - n3 % this.d - 1];
                            }
                        }
                        break;
                    }
                }
            }
            this.d = n2;
        }
        this.g = false;
    }

    public void f() {
        if (!this.g) {
            int n;
            int n2;
            int n3;
            this.g = true;
            boolean bl = false;
            int n4 = this.c;
            boolean bl2 = false;
            int n5 = this.d;
            boolean bl3 = false;
            for (n3 = 0; n3 < this.c; ++n3) {
            }
            for (n3 = 0; n3 < this.c; ++n3) {
                bl3 = true;
                for (n2 = 0; n2 < this.d; ++n2) {
                    if (!this.b[n3][n2]) continue;
                    bl3 = false;
                }
            }
            this.e += 0;
            this.f += 0;
            n2 = n4 - 0;
            int n6 = n5 - 0;
            boolean[][] blArray = this.b;
            for (n = 0; n < this.c; ++n) {
                blArray[n] = this.b[n];
            }
            this.c = n2;
            this.d = n6;
            this.b = new boolean[this.c][];
            for (n = 0; n < this.c; ++n) {
                this.b[n] = new boolean[this.d];
                for (int k = 0; k < this.d; ++k) {
                    this.b[n][k] = blArray[n + 0][k + 0];
                }
            }
        }
    }

    public void a(aaq_1 aaq_12, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        n += this.e - aaq_12.e;
        n2 += this.f - aaq_12.f;
        for (int k = 0; k < aaq_12.c; ++k) {
            n3 = k + n;
            if (n3 < 0 || n3 >= this.c) continue;
            for (int i2 = 0; i2 < aaq_12.d; ++i2) {
                n4 = i2 + n2;
                if (n4 < 0 || n4 >= this.d) continue;
                boolean[] blArray = this.b[n3];
                int n5 = n4;
                blArray[n5] = blArray[n5] | aaq_12.b[k][i2];
            }
        }
    }

    public void b(aaq_1 aaq_12) {
        this.a(aaq_12, 0, 0);
    }

    public void b(aaq_1 aaq_12, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        n += this.e - aaq_12.e;
        n2 += this.f - aaq_12.f;
        for (int k = 0; k < aaq_12.c; ++k) {
            n3 = k + n;
            if (n3 < 0 || n3 >= this.c) continue;
            for (int i2 = 0; i2 < aaq_12.d; ++i2) {
                n4 = i2 + n2;
                if (n4 < 0 || n4 >= this.d) continue;
                boolean[] blArray = this.b[n3];
                int n5 = n4;
                blArray[n5] = blArray[n5] | aaq_12.b[k][i2];
            }
        }
    }

    public void c(aaq_1 aaq_12) {
        this.b(aaq_12, 0, 0);
    }

    public void c(aaq_1 aaq_12, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        n += this.e - aaq_12.e;
        n2 += this.f - aaq_12.f;
        for (int k = 0; k < aaq_12.c; ++k) {
            n3 = k + n;
            if (n3 < 0 || n3 >= this.c) continue;
            for (int i2 = 0; i2 < aaq_12.d; ++i2) {
                n4 = i2 + n2;
                if (n4 < 0 || n4 >= this.d) continue;
                boolean[] blArray = this.b[n3];
                int n5 = n4;
                blArray[n5] = blArray[n5] & aaq_12.b[k][i2];
            }
        }
        this.g = false;
    }

    public void d(aaq_1 aaq_12) {
        this.c(aaq_12, 0, 0);
    }

    public void d(aaq_1 aaq_12, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        n += this.e - aaq_12.e;
        n2 += this.f - aaq_12.f;
        for (int k = 0; k < aaq_12.c; ++k) {
            n3 = k + n;
            if (n3 < 0 || n3 >= this.c) continue;
            for (int i2 = 0; i2 < aaq_12.d; ++i2) {
                n4 = i2 + n2;
                if (n4 < 0 || n4 >= this.d) continue;
                boolean[] blArray = this.b[n3];
                int n5 = n4;
                blArray[n5] = blArray[n5] & !aaq_12.b[k][i2];
            }
        }
        this.g = false;
    }

    public void e(aaq_1 aaq_12) {
        this.d(aaq_12, 0, 0);
    }

    public void g() {
        for (int k = 0; k < this.c; ++k) {
            for (int i2 = 0; i2 < this.d; ++i2) {
                this.b[k][i2] = !this.b[k][i2];
            }
        }
    }

    public void h() {
        for (int k = 0; k < this.c; ++k) {
            for (int i2 = 0; i2 < this.d; ++i2) {
                this.b[k][i2] = false;
            }
        }
        this.g = false;
    }

    public void i() {
        this.e = this.c - this.e - 1;
        for (int k = 0; k < this.c / 2; ++k) {
            boolean[] blArray = this.b[k];
            this.b[k] = this.b[this.c - k - 1];
            this.b[this.c - k - 1] = blArray;
        }
    }

    public void j() {
        this.f = this.d - this.f - 1;
        for (int k = 0; k < this.c; ++k) {
            for (int i2 = 0; i2 < this.d / 2; ++i2) {
                boolean bl = this.b[k][i2];
                this.b[k][i2] = this.b[k][this.d - 1 - i2];
                this.b[k][this.d - 1 - i2] = bl;
            }
        }
    }

    public void k() {
        this.i();
        this.j();
    }

    public void l() {
        boolean[][] blArray = this.b;
        int n = this.c;
        this.c = this.d;
        this.d = n;
        int n2 = this.d - 1;
        n = this.e;
        this.e = this.f;
        this.f = n2 - n;
        this.b = new boolean[this.c][];
        for (int k = 0; k < this.c; ++k) {
            this.b[k] = new boolean[this.d];
            for (int i2 = 0; i2 < this.d; ++i2) {
                this.b[k][i2] = blArray[n2 - i2][k];
            }
        }
    }

    public void m() {
        this.k();
    }

    public void n() {
        boolean[][] blArray = this.b;
        int n = this.c;
        this.c = this.d;
        this.d = n;
        int n2 = this.c - 1;
        n = this.e;
        this.e = n2 - this.f;
        this.f = n;
        this.b = new boolean[this.c][];
        for (int k = 0; k < this.c; ++k) {
            this.b[k] = new boolean[this.d];
            for (int i2 = 0; i2 < this.d; ++i2) {
                this.b[k][i2] = blArray[i2][n2 - k];
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.e < 0 ? this.e : 0;
        int n2 = this.e >= this.c ? this.e + 1 : this.c;
        int n3 = this.f < 0 ? this.f : 0;
        int n4 = this.f >= this.d ? this.f + 1 : this.d;
        for (int k = n3; k < n4; ++k) {
            for (int i2 = n; i2 < n2; ++i2) {
                if (i2 == this.e && k == this.f) {
                    stringBuilder.append("(");
                    if (i2 < 0 || i2 >= this.c || k < 0 || k >= this.d) {
                        stringBuilder.append(' ');
                    } else {
                        stringBuilder.append(this.b[i2][k] ? (char)'X' : '-');
                    }
                    stringBuilder.append(")");
                    continue;
                }
                stringBuilder.append(" ");
                if (i2 < 0 || i2 >= this.c || k < 0 || k >= this.d) {
                    stringBuilder.append(' ');
                } else {
                    stringBuilder.append(this.b[i2][k] ? (char)'X' : '-');
                }
                stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

