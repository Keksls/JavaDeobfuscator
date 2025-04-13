/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;

public class aPB {
    private static final Logger b = Logger.getLogger(aPB.class);
    private final aPy[][] c;
    private final tg_0 d;
    private final TIntArrayList e = new TIntArrayList();
    private int f = Integer.MAX_VALUE;
    private int g = Integer.MIN_VALUE;

    public aPB(tg_0 tg_02) {
        this.d = tg_02;
        this.c = new aPy[tg_02.B()][tg_02.C()];
        this.a(tg_02);
        this.b();
    }

    private void b() {
        this.e.clear();
        int n = this.d.B();
        int n2 = this.d.C();
        int n3 = this.d.z();
        int n4 = this.d.A();
        for (int k = 0; k < n; ++k) {
            for (int i2 = 0; i2 < n2; ++i2) {
                for (aPx aPx2 : this.c[k][i2].a) {
                    if (!this.e.contains(aPx2.b)) {
                        this.e.add(aPx2.b);
                    }
                    if (aPx2.b()) continue;
                    this.c(k + n3, i2 + n4);
                }
            }
        }
        this.e.sort();
    }

    private void c(int n, int n2) {
        short s2 = this.d.i(n, n2);
        if (s2 == Short.MIN_VALUE) {
            return;
        }
        if (s2 > this.g) {
            this.g = s2;
        }
        if (s2 < this.f) {
            this.f = s2;
        }
    }

    private void a(tg_0 tg_02) {
        int n;
        int n2;
        int n3 = tg_02.B();
        int n4 = tg_02.C();
        int n5 = tg_02.z();
        int n6 = tg_02.A();
        short s2 = tg_02.m();
        short s3 = tg_02.n();
        boolean[][] blArray = this.b(tg_02);
        for (int k = 0; k < n3; ++k) {
            for (n2 = 0; n2 < n4; ++n2) {
                if (blArray[k][n2]) {
                    n = tg_02.c(k + n5, n2 + n6) ? 1 : 0;
                    this.c[k][n2] = aPy.a(n != 0, k + n5, n2 + n6, (int)s2, s3);
                    continue;
                }
                this.c[k][n2] = aPy.b;
            }
        }
        HashMap<Integer, Set<Integer>> hashMap = new HashMap<Integer, Set<Integer>>();
        n2 = 0;
        for (n = 0; n < n3; ++n) {
            for (int k = 0; k < n4; ++k) {
                n2 += this.a(n, k, s2, s3, n4, n3, hashMap);
            }
        }
        while (n2 > 0) {
            n2 = 0;
            Set set = hashMap.entrySet();
            hashMap.clear();
            for (Map.Entry entry : set) {
                int n7 = (Integer)entry.getKey();
                Iterator iterator = ((Set)entry.getValue()).iterator();
                while (iterator.hasNext()) {
                    int n8 = (Integer)iterator.next();
                    n2 += this.a(n7, n8, s2, s3, n4, n3, hashMap);
                }
            }
        }
    }

    private int a(int n, int n2, int n3, int n4, int n5, int n6, Map<Integer, Set<Integer>> map) {
        int n7 = aPy.a(n, n2, n3, n4, this.c);
        if (n7 == 0) {
            return 0;
        }
        if (n > 0) {
            map.putIfAbsent(n - 1, new HashSet());
            if (n2 > 0) {
                map.get(n - 1).add(n2 - 1);
            }
            if (n2 < n5 - 1) {
                map.get(n - 1).add(n2 + 1);
            }
        }
        map.putIfAbsent(n, new HashSet());
        if (n2 > 0) {
            map.get(n).add(n2 - 1);
        }
        if (n2 < n5 - 1) {
            map.get(n).add(n2 + 1);
        }
        if (n < n6 - 1) {
            map.putIfAbsent(n + 1, new HashSet());
            if (n2 > 0) {
                map.get(n + 1).add(n2 - 1);
            }
            if (n2 < n5 - 1) {
                map.get(n + 1).add(n2 + 1);
            }
        }
        return n7;
    }

    private boolean[][] b(tg_0 tg_02) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = tg_02.B();
        int n6 = tg_02.C();
        int n7 = tg_02.z();
        int n8 = tg_02.A();
        boolean[][] blArray = new boolean[tg_02.B()][tg_02.C()];
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = -1;
            n2 = n6;
            for (n = 0; n < n6; ++n) {
                if (!tg_02.c(n4 + n7, n + n8)) continue;
                n3 = n;
                break;
            }
            for (n = n6 - 1; n >= n3; --n) {
                if (!tg_02.c(n4 + n7, n + n8)) continue;
                n2 = n;
                break;
            }
            n2 = Math.min(n6 - 1, n2);
            for (n = Math.max(0, n3); n <= n2; ++n) {
                blArray[n4][n] = true;
            }
            if (n3 == -1) continue;
            for (n = n3; n <= n2; ++n) {
                blArray[n4][n] = true;
            }
        }
        for (n4 = 0; n4 < n6; ++n4) {
            n3 = -1;
            n2 = n5;
            for (n = 0; n < n5; ++n) {
                if (!tg_02.c(n + n7, n4 + n8)) continue;
                n3 = n;
                break;
            }
            for (n = n5 - 1; n >= Math.max(0, n3); --n) {
                if (!tg_02.c(n + n7, n4 + n8)) continue;
                n2 = n;
                break;
            }
            n2 = Math.min(n5 - 1, n2);
            if (n3 == -1) continue;
            assert (n2 != n5);
            for (n = n3; n <= n2; ++n) {
                blArray[n][n4] = true;
            }
        }
        return blArray;
    }

    public aPz a(int n, int n2, int n3) {
        bNK bNK2;
        int n4;
        if (!this.d.o(n, n2)) {
            return null;
        }
        int n5 = n - this.d.z();
        aPx aPx2 = this.c[n5][n4 = n2 - this.d.A()].a(n3);
        if (aPx2 == null) {
            return null;
        }
        if (aPx2.a > this.g) {
            return null;
        }
        if (aPx2.b < this.f) {
            return null;
        }
        int n6 = this.a(aPx2, n5, n4 + 1);
        int n7 = this.a(aPx2, n5 + 1, n4);
        int n8 = aPx2.a();
        if (aPx2.b() && (bNK2 = bNT.f().c(n, n2)) != null) {
            n8 += Math.min(bNK2.y(), 4);
        }
        return new aPz(aPx2.d, n8, n8 - n6, n8 - n7, n, n2, aPx2.e);
    }

    public ys_0 a(int n, int n2, short s2) {
        return this.d.c(n, n2, s2);
    }

    public int a() {
        return this.d.m();
    }

    public aPy a(int n, int n2) {
        if (!this.d.o(n, n2)) {
            return null;
        }
        return this.c[n - this.d.z()][n2 - this.d.A()];
    }

    public boolean b(int n, int n2) {
        return this.d.o(n + this.d.z(), n2 + this.d.A());
    }

    private int a(aPx aPx2, int n, int n2) {
        if (!this.b(n, n2)) {
            return this.f;
        }
        short s2 = this.d.i(n + this.d.z(), n2 + this.d.A());
        if (s2 != Short.MIN_VALUE) {
            return s2;
        }
        aPy aPy2 = this.c[n][n2];
        aPx aPx3 = aPy2.b(aPx2.b);
        if (aPx3 == null) {
            return aPy2.a.isEmpty() ? (int)this.d.m() : aPx2.a();
        }
        return Math.max(aPx2.a, aPx3.a());
    }

    public float a(float f2) {
        int n = this.e.indexOf((int)f2);
        return (float)n / (float)this.e.size();
    }
}

