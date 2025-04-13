/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import java.nio.ByteBuffer;

public final class eCC {
    public static byte[] a(TIntIntHashMap tIntIntHashMap) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(tIntIntHashMap.size() * 8);
        TIntIntIterator tIntIntIterator = tIntIntHashMap.iterator();
        while (tIntIntIterator.hasNext()) {
            tIntIntIterator.advance();
            byteBuffer.putInt(tIntIntIterator.key());
            byteBuffer.putInt(tIntIntIterator.value());
        }
        return byteBuffer.array();
    }

    public static byte[] a(ecz_0 ecz_02) {
        abx_2 abx_22 = new abx_2();
        abx_22.a(ecz_02.a());
        abx_22.a(ecz_02.b());
        abx_22.a(ecz_02.c());
        abx_22.a(ecz_02.d());
        abx_22.a(ecz_02.e());
        abx_22.a(ecz_02.j().a());
        abx_22.b(eCC.a(ecz_02.h()));
        return abx_22.c();
    }

    public static ecz_0 a(ByteBuffer byteBuffer) {
        ecz_0 ecz_02 = new ecz_0(byteBuffer.getLong(), byteBuffer.getInt(), byteBuffer.getLong(), byteBuffer.getLong());
        ecz_02.a(byteBuffer.getLong());
        ecz_02.a(eCJ.a(byteBuffer.get()));
        ecz_02.a(eCC.b(byteBuffer));
        return ecz_02;
    }

    private static byte[] a(eCE eCE2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(25);
        byteBuffer.putLong(eCE2.a());
        byteBuffer.putLong(eCE2.d());
        byteBuffer.put(eCE2.b().a());
        byteBuffer.putLong(eCE2.c().h());
        return byteBuffer.array();
    }

    public static eCE b(ByteBuffer byteBuffer) {
        eCE eCE2 = new eCE(byteBuffer.getLong(), byteBuffer.getLong());
        eCE2.a(eCL.a(byteBuffer.get()));
        eCE2.a(wt_0.b(byteBuffer.getLong()));
        return eCE2;
    }

    public static byte[] a(ecy_0 ecy_02) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(13);
        byteBuffer.putInt(ecy_02.a());
        byteBuffer.putLong(ecy_02.b());
        byteBuffer.put((byte)(ecy_02.c() ? 1 : 0));
        return byteBuffer.array();
    }

    public static ecy_0 c(ByteBuffer byteBuffer) {
        ecy_0 ecy_02 = new ecy_0(byteBuffer.getInt());
        ecy_02.a(byteBuffer.getLong());
        ecy_02.a(byteBuffer.get() == 1);
        return ecy_02;
    }

    public static byte[] a(eCH eCH2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(22);
        byteBuffer.putLong(eCH2.a());
        byteBuffer.putLong(eCH2.b());
        byteBuffer.putShort(eCH2.c());
        byteBuffer.putShort(eCH2.d());
        byteBuffer.putShort(eCH2.e());
        return byteBuffer.array();
    }

    public static eCH d(ByteBuffer byteBuffer) {
        eCH eCH2 = new eCH(byteBuffer.getLong(), byteBuffer.getLong(), byteBuffer.getShort(), byteBuffer.getShort(), byteBuffer.getShort());
        return eCH2;
    }
}

