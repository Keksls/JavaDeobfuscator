/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TShortObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TShortObjectProcedure;
import java.io.IOException;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

public class YY {
    private static final Logger a = Logger.getLogger(YY.class);
    private static final YY b = new YY();
    private aby_2 c;
    private int d = 0;
    private String e = "./";

    public static YY a() {
        return b;
    }

    public final void b() {
        this.c = null;
        this.d = 0;
    }

    public final void a(String string) {
        this.e = string;
    }

    public final void a(long l) {
        this.b();
        String string = String.format(this.e, l);
        try {
            this.b(string);
        }
        catch (IOException iOException) {
            a.error((Object)("Probl\u00e9me lors du chargement des infos de group " + string), (Throwable)iOException);
        }
    }

    private void b(String string) {
        arf_1 arf_12 = arf_1.a(arl_1.b(string));
        arf_12.a(ByteOrder.LITTLE_ENDIAN);
        this.d = 1 + arf_12.h();
        this.c = new aby_2(this.d * this.d);
        int n = arf_12.h();
        for (int k = 0; k < n; ++k) {
            short s2 = arf_12.b();
            short s3 = arf_12.b();
            short[] sArray = arf_12.b(s3);
            this.a(s2, sArray, true);
        }
    }

    void a(int n, short[] sArray, boolean bl) {
        int n2 = Math.abs(n) * this.d;
        for (int k = 0; k < sArray.length; ++k) {
            this.c.a(n2 + Math.abs(sArray[k]), bl);
        }
    }

    public final boolean a(int n, int n2) {
        if (n == 0) {
            return n2 <= 0;
        }
        int n3 = n < 0 ? -n : n;
        int n4 = n2 < 0 ? -n2 : n2;
        return this.c.a(n3 * this.d + n4);
    }

    public final int c() {
        return this.d;
    }

    public void a(int n, TShortObjectHashMap<short[]> tShortObjectHashMap) {
        this.d = n + 1;
        this.c = new aby_2(this.d * this.d);
        this.c.a(0, true);
        tShortObjectHashMap.forEachEntry((TShortObjectProcedure)new YZ(this));
    }
}

