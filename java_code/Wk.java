/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TShortObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TShortObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.log4j.Logger;

public final class Wk {
    static final Logger a = Logger.getLogger(Wk.class);

    public static byte[] a(Wg wg) {
        abx_2 abx_22 = new abx_2();
        Wk.d(wg, abx_22);
        Wk.a(wg, abx_22);
        return abx_22.c();
    }

    public static void a(byte[] byArray, vz_0 vz_02, Wg wg) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        Wk.a(wg, byteBuffer);
        Wk.a(wg, byteBuffer, vz_02);
    }

    private static void a(Wg wg, abx_2 abx_22) {
        Wk.b(wg, abx_22);
        Wk.c(wg, abx_22);
    }

    private static void a(Wg wg, ByteBuffer byteBuffer, vz_0 vz_02) {
        Wk.b(wg, byteBuffer, vz_02);
        Wk.c(wg, byteBuffer, vz_02);
    }

    private static void b(Wg wg, ByteBuffer byteBuffer, vz_0 vz_02) {
        Wk.a(wg, byteBuffer, wg.c(), vz_02);
    }

    private static void c(Wg wg, ByteBuffer byteBuffer, vz_0 vz_02) {
        Wk.a(wg, byteBuffer, wg.d(), vz_02);
    }

    private static void b(Wg wg, abx_2 abx_22) {
        Wk.a(abx_22, wg.c());
    }

    private static void c(Wg wg, abx_2 abx_22) {
        Wk.a(abx_22, wg.d());
    }

    private static void a(abx_2 abx_22, TShortObjectHashMap<List<vl_0>> tShortObjectHashMap) {
        abx_22.a(tShortObjectHashMap.size());
        tShortObjectHashMap.forEachEntry((TShortObjectProcedure)new Wl(abx_22));
    }

    private static void a(Wg wg, ByteBuffer byteBuffer, TShortObjectHashMap<List<vl_0>> tShortObjectHashMap, vz_0 vz_02) {
        int n = byteBuffer.getInt();
        Wm wm = new Wm(vz_02);
        wm.a(wg, byteBuffer, n, tShortObjectHashMap);
    }

    private static void d(Wg wg, abx_2 abx_22) {
        TLongHashSet tLongHashSet = wg.b();
        abx_22.a((short)tLongHashSet.size());
        tLongHashSet.forEach(l -> {
            abx_22.a(l);
            return true;
        });
    }

    private static void a(Wg wg, ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            wg.a(byteBuffer.getLong());
        }
    }
}

