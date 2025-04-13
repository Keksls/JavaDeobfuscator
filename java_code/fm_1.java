/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fm
 */
public class fm_1 {
    protected static final Logger a = Logger.getLogger(fm_1.class);
    private static final fm_1 b = new fm_1();
    private final TIntObjectHashMap<fq_1> c = new TIntObjectHashMap();
    private final TIntArrayList d = new TIntArrayList();

    public static fm_1 a() {
        return b;
    }

    private fm_1() {
        for (int k = 1; k < 17; ++k) {
            int n = 1 << k;
            fq_1 fq_12 = this.a(n);
            if (fq_12 != null) continue;
            throw new RuntimeException("Impossible de cr\u00e9er un des pools par d\u00e9faut : size = " + n + " bytes");
        }
    }

    public fq_1 a(int n) {
        int n2 = this.d.size();
        for (int k = 0; k < n2; ++k) {
            int n3 = this.d.getQuick(k);
            if (n3 < n) continue;
            return (fq_1)this.c.get(n3);
        }
        fq_1 fq_12 = new fq_1(n);
        this.c.put(n, (Object)fq_12);
        this.d.add(n);
        return fq_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    byte[] a(fl_1 fl_12, fo_1 ... fo_1Array) {
        int n;
        Object object;
        if (fo_1Array == null || fo_1Array.length == 0) {
            return new byte[0];
        }
        int n2 = 0;
        int n3 = 0;
        int[] nArray = new int[fo_1Array.length];
        int n4 = fo_1Array.length;
        for (int k = 0; k < n4; ++k) {
            object = fo_1Array[k];
            if (object == null) {
                throw new RuntimeException("Impossible de s\u00e9rialiser le BInarSerial : une part est null");
            }
            if (object == fo_1.c) continue;
            try {
                ((fo_1)object).e();
                nArray[k] = ((fo_1)object).j();
            }
            catch (Exception exception) {
                throw new RuntimeException("Error while calling expectedSize()", exception);
            }
            n2 += 1 + nArray[k];
            ++n3;
        }
        fq_1 fq_12 = this.a(n2 + fo_1Array.length * 5 + 1);
        ByteBuffer byteBuffer = fq_12.a();
        object = new byte[n3];
        int[] nArray2 = new int[n3];
        byteBuffer.put((byte)n3);
        byteBuffer.position(1 + n3 * 5);
        n3 = 0;
        int n5 = fo_1Array.length;
        for (n = 0; n < n5; ++n) {
            fo_1 fo_12 = fo_1Array[n];
            if (fo_12 == fo_1.c) continue;
            fq_1 fq_13 = null;
            ByteBuffer byteBuffer2 = null;
            try {
                int n6 = 1 + nArray[n];
                fq_13 = this.a(n6);
                byteBuffer2 = fq_13.a();
                byteBuffer2.limit(n6);
                byte by = (byte)fl_12.a(fo_12);
                if (by >= 0) {
                    object[n3] = by;
                    nArray2[n3] = byteBuffer.position();
                    byteBuffer2.put(by);
                    fo_12.i();
                    if (nArray[n] > 0) {
                        fo_12.a(byteBuffer2);
                    }
                    ++n3;
                } else {
                    a.error((Object)("Impossible d'ajouter une part non r\u00e9f\u00e9renc\u00e9e : " + fo_12.getClass().getName()));
                }
                byteBuffer2.flip();
                byteBuffer.put(byteBuffer2);
                if (fq_13 == null || byteBuffer2 == null) continue;
                fq_13.a(byteBuffer2);
            }
            catch (Exception exception) {
                try {
                    fo_12.a("Exception lev\u00e9e lors de la s\u00e9rialisation de la part " + fo_12.getClass().getName(), exception);
                    if (fq_13 == null || byteBuffer2 == null) continue;
                    fq_13.a(byteBuffer2);
                }
                catch (Throwable throwable) {
                    if (fq_13 != null && byteBuffer2 != null) {
                        fq_13.a(byteBuffer2);
                    }
                    throw throwable;
                }
            }
            continue;
        }
        for (n = 0; n < n3; ++n) {
            byteBuffer.put(1 + n * 5, (byte)object[n]);
            byteBuffer.putInt(1 + n * 5 + 1, nArray2[n]);
        }
        byteBuffer.flip();
        byte[] byArray = new byte[byteBuffer.limit() - byteBuffer.position()];
        byteBuffer.get(byArray);
        fq_12.a(byteBuffer);
        return byArray;
    }
}

