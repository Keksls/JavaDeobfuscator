/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;

public class aPy {
    private static final ys_0[] c = ys_0.b();
    private static final Logger d = Logger.getLogger(aPy.class);
    final List<aPx> a = new ArrayList<aPx>(2);
    static final aPy b = new aPy();

    private aPy() {
    }

    aPx a(int n) {
        for (int k = this.a.size() - 1; k >= 0; --k) {
            if (this.a.get((int)k).b != n) continue;
            return this.a.get(k);
        }
        return null;
    }

    public aPx b(int n) {
        aPx aPx2 = null;
        for (aPx aPx3 : this.a) {
            if (aPx3.b > n || aPx2 != null && aPx3.b <= aPx2.b) continue;
            aPx2 = aPx3;
        }
        return aPx2;
    }

    static aPy a(boolean bl, int n, int n2, int n3, int n4) {
        yx_0 yx_02 = yz_0.a(n, n2);
        if (yx_02 == null) {
            return b;
        }
        int n5 = yx_02.a().a(n, n2, c, 0);
        if (n5 == 0) {
            return b;
        }
        aPy aPy2 = new aPy();
        for (int k = 0; k < n5; ++k) {
            boolean bl2;
            short s2 = aPy.c[k].c;
            int n6 = s2 - aPy.c[k].d;
            if (s2 < n3 || n6 > n4) continue;
            if (n6 < n3) {
                n6 = n3;
            }
            boolean bl3 = bl2 = bl && !yx_02.a(n, n2, s2);
            if (s2 > n4) {
                bl2 = false;
            }
            if (aPy.c[k].z == -1) {
                bl2 = false;
            }
            aPy2.a.add(new aPx(n6, s2, bl2, aPy.c[k].e, 0));
        }
        return aPy2;
    }

    public static Optional<Integer> a(aPy aPy2) {
        return aPy2.a.stream().filter(aPx2 -> !aPx2.b()).map(aPx2 -> aPx2.b).max(Integer::compareTo);
    }

    public static Optional<Integer> b(aPy aPy2) {
        return aPy2.a.stream().filter(aPx::b).map(aPx2 -> aPx2.b).max(Integer::compareTo);
    }

    public static List<aPy> a(aPy[][] aPyArray, int n, int n2) {
        ArrayList<aPy> arrayList = new ArrayList<aPy>();
        if (n > 0) {
            arrayList.add(aPyArray[n - 1][n2]);
            if (n2 > 0) {
                arrayList.add(aPyArray[n - 1][n2 - 1]);
            }
            if (n2 < aPyArray[n].length - 1) {
                arrayList.add(aPyArray[n - 1][n2 + 1]);
            }
        }
        if (n2 > 0) {
            arrayList.add(aPyArray[n][n2 - 1]);
        }
        if (n < aPyArray.length - 1) {
            arrayList.add(aPyArray[n + 1][n2]);
            if (n2 > 0) {
                arrayList.add(aPyArray[n + 1][n2 - 1]);
            }
            if (n2 < aPyArray[n].length - 1) {
                arrayList.add(aPyArray[n + 1][n2 + 1]);
            }
        }
        if (n2 < aPyArray[n].length - 1) {
            arrayList.add(aPyArray[n][n2 + 1]);
        }
        return arrayList;
    }

    public static int a(int n, int n2, int n3, int n4, aPy[][] aPyArray) {
        int n5;
        aPy aPy2 = aPyArray[n][n2];
        HashMap<aPx, aPx> hashMap = new HashMap<aPx, aPx>();
        List<aPy> list = aPy.a(aPyArray, n, n2);
        for (aPx object : aPy2.a) {
            int n6;
            if (!object.b()) continue;
            n5 = 0;
            int n7 = n3;
            int n8 = n3;
            for (aPy aPy3 : list) {
                Optional<Integer> optional = aPy.a(aPy3);
                n7 = Math.max(optional.orElse(n3), n7);
                n5 = optional.isPresent() ? 1 : 0;
                if (n5 != 0) continue;
                n8 = Math.max(aPy.b(aPy3).orElse(n8), n8);
            }
            if (n5 == 0) {
                if (n8 > n4) {
                    n8 = n4;
                }
                n6 = Math.min(object.b, n8);
            } else {
                if (n7 > n4) {
                    n7 = n4;
                }
                n6 = Math.min(object.b, n7 + 4);
            }
            if (n6 == object.b || object.a > n6) continue;
            aPx aPx2 = aPx.a(object, n6 - object.b);
            hashMap.put(object, aPx2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            n5 = aPy2.a.indexOf(entry.getKey());
            if (n5 == -1) {
                d.warn((Object)"Missing Block in size uniformization");
                continue;
            }
            aPy2.a.set(n5, (aPx)entry.getValue());
        }
        return hashMap.size();
    }
}

