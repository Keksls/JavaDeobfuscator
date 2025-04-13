/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from apL
 */
public final class apl_1
implements Iterable<int[]> {
    public static final apl_1 a = new apl_1();
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    private static final Logger f = Logger.getLogger(apl_1.class);
    private final boolean g;
    private final int[][] h;
    private static final afr_2 i = new afr_2();
    private static final afr_2 j = new afr_2();
    private static final afr_2 k = new afr_2();
    private static final afr_2 l = new afr_2();
    private static final afr_2 m = new afr_2();

    private apl_1() {
        this.g = false;
        this.h = null;
    }

    public apl_1(int n) {
        this.h = new int[n][3];
        this.g = true;
    }

    public apl_1(int[][] nArray) {
        this.h = nArray;
        this.g = true;
    }

    public apl_1(int[] nArray, List<int[]> list) {
        this.h = new int[1 + list.size()][3];
        this.h[0][0] = nArray[0];
        this.h[0][1] = nArray[1];
        this.h[0][2] = nArray[2];
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            int[] nArray2 = list.get(k);
            assert (nArray2.length == 3) : "Cellule de longueur invalide : " + nArray2.length;
            this.h[k + 1][0] = nArray2[0];
            this.h[k + 1][1] = nArray2[1];
            this.h[k + 1][2] = nArray2[2];
        }
        this.g = true;
    }

    public apl_1(List<int[]> list) {
        this.h = new int[list.size()][3];
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            int[] nArray = list.get(k);
            assert (nArray.length == 3) : "Cellule de longueur invalide : " + nArray.length;
            this.h[k][0] = nArray[0];
            this.h[k][1] = nArray[1];
            this.h[k][2] = nArray[2];
        }
        this.g = true;
    }

    public apl_1(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        if (byteBuffer.remaining() > 0 && byteBuffer.remaining() < 65536) {
            this.h = new int[byteBuffer.remaining() / 10][3];
            int n = 0;
            while (byteBuffer.remaining() >= 10) {
                this.h[n][0] = byteBuffer.getInt();
                this.h[n][1] = byteBuffer.getInt();
                this.h[n][2] = byteBuffer.getShort();
                ++n;
            }
            this.g = true;
        } else {
            this.h = null;
            this.g = false;
            f.error((Object)("PathFindResult s\u00e9rialis\u00e9 de longueur louche : " + byArray.length + " @ " + aho_2.a()));
        }
    }

    public void a(int n, int n2, int n3, short s2) {
        this.h[n][0] = n2;
        this.h[n][1] = n3;
        this.h[n][2] = s2;
    }

    public void a(int n, int[] nArray) {
        this.h[n] = nArray;
    }

    public int a() {
        if (!this.g || this.h == null) {
            return 0;
        }
        return this.h.length;
    }

    public boolean b() {
        return this.g;
    }

    public int[] a(int n) {
        assert (n >= 0 && n < this.h.length) : "Trying to get a path step not within the bounds length = " + this.h.length + " stepIndex = " + n;
        if (n < this.h.length) {
            return this.h[n];
        }
        return null;
    }

    public int[] c() {
        if (this.h != null && this.h.length != 0) {
            return this.h[0];
        }
        return null;
    }

    public int[] d() {
        if (this.h != null && this.h.length != 0) {
            return this.h[this.h.length - 1];
        }
        return null;
    }

    public aej_2 b(int n) {
        if (!this.g || n < 0 || n >= this.a()) {
            return null;
        }
        int n2 = this.h[n][0] - this.h[n - 1][0];
        int n3 = this.h[n][1] - this.h[n - 1][1];
        return aej_2.a(n2, n3);
    }

    @Override
    public Iterator<int[]> iterator() {
        if (this.h == null) {
            return new abz_2<int[]>();
        }
        return new aby_1<int[]>((E[])this.h, true);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{ ");
        if (this.g) {
            for (int[] nArray : this.h) {
                stringBuilder.append('[').append(nArray[0]).append(';').append(nArray[1]).append(';').append(nArray[2]).append("] ");
            }
        } else {
            stringBuilder.append("not found");
        }
        return stringBuilder.append('}').toString();
    }

    public ArrayList<afe_2> a(long l, boolean bl) {
        ArrayList<afe_2> arrayList = new ArrayList<afe_2>();
        if (this.h.length < 2) {
            return null;
        }
        i.a(this.h[0]);
        j.a(this.h[1]);
        j.c(i);
        long l2 = 0L;
        int n = 1;
        afe_2 afe_22 = new afe_2();
        afe_2 afe_23 = null;
        afe_22.a(i);
        afe_22.b(l2);
        do {
            k.a(this.h[n]);
            apl_1.l.a(k);
            apl_1.l.c(i);
            if (apl_1.l.a() != j.a() || apl_1.l.b() != j.b() || bl && apl_1.l.c() != j.c()) {
                afe_22.c(i);
                afe_22.c_(l2 += (long)(afe_22.b().e(afe_22.a()).f() * (float)l));
                m.a(afe_22.b());
                m.c(afe_22.a());
                afe_22.b(m);
                if (afe_23 != null) {
                    afe_23.d(j);
                }
                arrayList.add(afe_22);
                j.a(apl_1.l);
                afe_23 = afe_22;
                afe_22 = new afe_2();
                afe_22.a(i);
                afe_22.b(l2);
            }
            i.a(k);
        } while (++n < this.h.length);
        afe_22.c(i);
        afe_22.c_(l2 += (long)(afe_22.b().e(afe_22.a()).f() * (float)l));
        afe_22.b(afe_22.b().e(afe_22.a()));
        arrayList.add(afe_22);
        return arrayList;
    }

    public boolean a(int[] nArray) {
        if (!this.b()) {
            return false;
        }
        for (int[] nArray2 : this) {
            if (nArray2[0] != nArray[0] || nArray2[1] != nArray[1] || nArray2[2] != nArray[2]) continue;
            return true;
        }
        return false;
    }

    public boolean b(int[] nArray) {
        if (!this.b()) {
            return false;
        }
        for (int[] nArray2 : this) {
            if (nArray2[0] != nArray[0] || nArray2[1] != nArray[1]) continue;
            return true;
        }
        return false;
    }

    public int a(int n, int n2, int n3) {
        int n4;
        if (!this.b()) {
            return 0;
        }
        int n5 = n4 = n3 < 0 ? 0 : n3;
        while (n4 < this.h.length) {
            if (this.h[n4][0] == n && this.h[n4][1] == n2) {
                return this.h[n4][2];
            }
            ++n4;
        }
        return 0;
    }

    public apl_1 a(int n, int n2) {
        if (n < 0 || n >= n2 || n2 > this.a()) {
            throw new IllegalArgumentException("0 <= startIndex < endIndex <= getPathLength() non-respect\u00e9");
        }
        apl_1 apl_12 = new apl_1(n2 - n);
        for (int k = n; k < n2; ++k) {
            apl_12.a(k - n, this.a(k));
        }
        return apl_12;
    }

    public static abo_2<apl_1, Integer> a(int[] nArray, @NotNull apl_1 apl_12, @NotNull apl_1 apl_13) {
        int n;
        apl_1 apl_14;
        int n2;
        int[] nArray2 = apl_13.c();
        if (nArray2 == null) {
            f.error((Object)("Le point de d\u00e9part du 2e chemin est null lors d'une fusion de chemin: firstPath=" + apl_12 + ", secondPath=" + apl_13));
            return null;
        }
        int n3 = -1;
        int n4 = -1;
        for (n2 = 0; n2 < apl_12.a(); ++n2) {
            int[] nArray3 = apl_12.a(n2);
            if (nArray3[0] == nArray[0] && nArray3[1] == nArray[1] && nArray3[2] == nArray[2] && n3 == -1) {
                n3 = n2;
                if (n4 != -1) break;
            }
            if (nArray3[0] != nArray2[0] || nArray3[1] != nArray2[1] || nArray3[2] != nArray2[2]) continue;
            n4 = n2;
            if (n3 != -1) break;
        }
        if (n3 == -1) {
            f.error((Object)("La position de d\u00e9part " + nArray[0] + ":" + nArray[1] + ":" + nArray[2] + " n'a pas \u00e9t\u00e9 trouv\u00e9e sur le premier chemin. (path: " + apl_12 + ")"));
            return null;
        }
        if (n4 == -1) {
            f.error((Object)("Le point de jonction " + nArray2[0] + ":" + nArray2[1] + ":" + nArray2[2] + " n'a pas \u00e9t\u00e9 trouv\u00e9 sur le premier chemin. (path: " + apl_12 + ")"));
            return null;
        }
        n2 = 0;
        int n5 = 0;
        if (n3 <= n4) {
            apl_14 = new apl_1(n4 - n3 + apl_13.a());
            for (n = n3; n < n4; ++n) {
                apl_14.a(n2++, apl_12.a(n));
            }
        } else {
            apl_14 = new apl_1(n3 - n4 + apl_13.a());
            for (n = n3; n > n4; --n) {
                apl_14.a(n2++, apl_12.a(n));
            }
            n5 = n3;
            for (n = 0; n < apl_13.a(); ++n) {
                int[] nArray4 = apl_13.a(n);
                if (nArray4 == null) continue;
                if (nArray4[0] != nArray[0] || nArray4[1] != nArray[1] || nArray4[2] != nArray[2]) {
                    ++n5;
                    continue;
                }
                break;
            }
        }
        for (n = 0; n < apl_13.a(); ++n) {
            apl_14.a(n2++, apl_13.a(n));
        }
        return new abo_2<apl_1, Integer>(apl_14, n5);
    }

    public byte[] e() {
        int n = this.a();
        ByteBuffer byteBuffer = ByteBuffer.allocate(n * 10);
        for (int k = 0; k < n; ++k) {
            int[] nArray = this.a(k);
            byteBuffer.putInt(nArray[0]);
            byteBuffer.putInt(nArray[1]);
            byteBuffer.putShort((short)nArray[2]);
        }
        return byteBuffer.array();
    }

    public List<int[]> f() {
        return Arrays.asList(this.h);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof apl_1)) {
            return false;
        }
        apl_1 apl_12 = (apl_1)object;
        if (apl_12.g != this.g || apl_12.h.length != this.h.length) {
            return false;
        }
        int n = this.h.length;
        for (int k = 0; k < n; ++k) {
            int[] nArray = this.h[k];
            int[] nArray2 = apl_12.h[k];
            if (nArray.length == nArray2.length && nArray[0] == nArray2[0] && nArray[1] == nArray2[1] && nArray[2] == nArray2[2]) continue;
            return false;
        }
        return true;
    }
}

