/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import java.nio.ByteBuffer;

/*
 * Renamed from eNt
 */
public final class ent_1 {
    public static byte[] a(TLongObjectHashMap<enr_0> tLongObjectHashMap) {
        abx_2 abx_22 = new abx_2();
        short s2 = (short)tLongObjectHashMap.size();
        abx_22.a(s2);
        tLongObjectHashMap.forEachEntry((TLongObjectProcedure)new enu_2(abx_22));
        return abx_22.c();
    }

    public static TLongObjectHashMap<enr_0> a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        TLongObjectHashMap tLongObjectHashMap = new TLongObjectHashMap();
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            enr_0 enr_02 = ens_0.a(byArray2);
            tLongObjectHashMap.put(l, (Object)enr_02);
        }
        return tLongObjectHashMap;
    }
}

