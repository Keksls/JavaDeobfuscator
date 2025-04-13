/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.procedure.TLongIntProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.procedure.TLongIntProcedure;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from eOD
 */
final class eod_1 {
    eod_1() {
    }

    public static byte[] a(eoi_1 eoi_12, int n) {
        abx_2 abx_22 = new abx_2();
        eod_1.a((eoh_1)eoi_12, abx_22);
        eod_1.a(eoi_12, abx_22);
        eod_1.b((eoh_1)eoi_12, abx_22);
        eod_1.b(eoi_12, abx_22);
        return abx_22.c();
    }

    public static eoi_1 a(byte[] byArray, eoi_1 eoi_12) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        eod_1.a(byteBuffer, eoi_12);
        eod_1.b(byteBuffer, eoi_12);
        eod_1.c(byteBuffer, eoi_12);
        eod_1.d(byteBuffer, eoi_12);
        return eoi_12;
    }

    private static void a(eoh_1 eoh_12, abx_2 abx_22) {
        abx_22.a(eoh_12.a());
    }

    private static void a(ByteBuffer byteBuffer, eoi_1 eoi_12) {
        eoi_12.a(byteBuffer.getInt());
    }

    private static void a(eoi_1 eoi_12, abx_2 abx_22) {
        abx_22.a((byte)eoi_12.c());
        eoi_12.d().forEachEntry((TLongIntProcedure)new eoe_1(abx_22, eoi_12));
    }

    private static void b(ByteBuffer byteBuffer, eoi_1 eoi_12) {
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            int n2 = byteBuffer.getInt();
            boolean bl = byteBuffer.get() == 0;
            eoi_12.d().put(l, n2);
            if (!bl) continue;
            eoi_12.g(l);
        }
    }

    private static void b(eoh_1 eoh_12, abx_2 abx_22) {
        TIntObjectHashMap<eou_2<efh_0>> tIntObjectHashMap = eoh_12.b();
        abx_22.a((byte)tIntObjectHashMap.size());
        tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new eof_1(abx_22));
    }

    private static void c(ByteBuffer byteBuffer, eoi_1 eoi_12) {
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.get();
            ArrayList<efh_0> arrayList = new ArrayList<efh_0>();
            for (int i2 = 0; i2 < n3; ++i2) {
                efh_0 efh_02 = eox_2.a.b(byteBuffer.getInt());
                if (efh_02 == null) continue;
                arrayList.add(efh_02);
            }
            eoi_12.a((byte)n2, arrayList);
        }
    }

    private static void b(eoi_1 eoi_12, abx_2 abx_22) {
        abx_2 abx_23 = new abx_2();
        ahh_2 ahh_22 = new ahh_2();
        eoi_12.e().forEachEntry((TIntObjectProcedure)new eog_1(ahh_22, abx_23));
        abx_22.a((byte)ahh_22.c());
        abx_22.a(abx_23);
    }

    private static void d(ByteBuffer byteBuffer, eoi_1 eoi_12) {
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.get();
            ArrayList<efh_0> arrayList = new ArrayList<efh_0>();
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4 = byteBuffer.getInt();
                efh_0 efh_02 = eox_2.a.b(n4);
                if (efh_02 == null) continue;
                arrayList.add(efh_02);
            }
            eoi_12.e().put(n2, arrayList);
        }
    }
}

