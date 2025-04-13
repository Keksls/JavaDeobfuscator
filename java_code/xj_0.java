/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TShortArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from XJ
 */
public class xj_0 {
    private static final Logger b = Logger.getLogger(xj_0.class);
    private final int c;
    private final int d;
    private final short e;

    public xj_0(int n, int n2, short s2) {
        this.c = n;
        this.d = n2;
        this.e = s2;
    }

    public short a(int n, int n2, int n3, xk_0 xk_02) {
        assert (n >= 0 && n < this.c);
        assert (n2 >= 0 && n2 < this.d);
        if (xk_02 == null) {
            return this.e;
        }
        int n4 = xk_02.a();
        if (n4 == 1) {
            return xk_02.a(0);
        }
        int n5 = n + n2 * this.c;
        return xk_02.b(n5);
    }

    public xk_0 a(@NotNull short[] sArray) {
        int n;
        assert (sArray.length == this.c * this.d);
        TShortArrayList tShortArrayList = new TShortArrayList();
        for (n = 0; n < sArray.length; ++n) {
            if (tShortArrayList.contains(sArray[n])) continue;
            tShortArrayList.add(sArray[n]);
        }
        n = tShortArrayList.size();
        if (n == 0) {
            throw new xl_0("pas de cellsValue");
        }
        if (n > 16) {
            throw new xl_0("Trop de valeur diff\u00e9rentes");
        }
        return xk_0.a(tShortArrayList, sArray, this.e);
    }

    public short a() {
        return this.e;
    }
}

