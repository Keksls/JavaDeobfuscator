/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fl
 */
public abstract class fl_1 {
    private static final int a = 0xA00000;
    private static final Logger b = Logger.getLogger(fl_1.class);

    public abstract fo_1[] b_();

    int a(fo_1 fo_12) {
        fo_1[] fo_1Array = this.b_();
        if (fo_1Array != null) {
            for (int k = 0; k < fo_1Array.length; ++k) {
                if (fo_1Array[k] != fo_12) continue;
                return k;
            }
        }
        return -1;
    }

    public final byte[] a(fo_1 ... fo_1Array) {
        if (fo_1Array != null && fo_1Array.length > 0) {
            return fm_1.a().a(this, fo_1Array);
        }
        throw new RuntimeException("Unable to serialize content without parts");
    }

    public final byte[] a(int ... nArray) {
        if (nArray != null && nArray.length > 0) {
            fo_1[] fo_1Array = new fo_1[nArray.length];
            fo_1[] fo_1Array2 = this.b_();
            int n = 0;
            for (int n2 : nArray) {
                fo_1Array[n++] = fo_1Array2[n2];
            }
            return fm_1.a().a(this, fo_1Array);
        }
        throw new RuntimeException("Unable to serialize content without parts");
    }

    public final void a_(byte[] byArray) {
        this.a(byArray, 0);
    }

    public final void a(byte[] byArray, int n) {
        int n2;
        fo_1[] fo_1Array = this.b_();
        if (fo_1Array == null || fo_1Array.length <= 0) {
            return;
        }
        ArrayList<fo_1> arrayList = new ArrayList<fo_1>(fo_1Array.length);
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n3 = byteBuffer.get();
        byte[] byArray2 = new byte[n3];
        int[] nArray = new int[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            byArray2[n2] = byteBuffer.get();
            nArray[n2] = byteBuffer.getInt();
        }
        for (n2 = 0; n2 < n3; ++n2) {
            byte by = byArray2[n2];
            int n4 = nArray[n2];
            int n5 = n2 < n3 - 1 ? nArray[n2 + 1] - n4 - 1 : byteBuffer.limit() - n4 - 1;
            if (n5 <= 0) {
                b.warn((Object)("Part " + by + "(offset=" + n4 + ") is empty for " + this + " ! (voir log serveur)"), (Throwable)new Exception());
                continue;
            }
            if (n5 > 0xA00000) {
                b.error((Object)("Part " + by + "(offset=" + n4 + ") exceeds max limit (" + n5 + " > 10485760 bytes)"), (Throwable)new Exception());
                continue;
            }
            fq_1 fq_12 = fm_1.a().a(n5);
            ByteBuffer byteBuffer2 = fq_12.a();
            byteBuffer.position(n4 + 1);
            byteBuffer2.limit(n5);
            byteBuffer.get(byteBuffer2.array(), 0, n5);
            if (by >= 0 && by < fo_1Array.length) {
                fo_1 fo_12 = fo_1Array[by];
                if (fo_12 == fo_1.c) {
                    b.warn((Object)("Don't know how to unserialise part #" + by + " (EMPTY)."));
                    continue;
                }
                if (fo_12 == null) {
                    b.error((Object)("Part " + by + " of " + this + " is null"), (Throwable)new Exception());
                    continue;
                }
                try {
                    fo_12.i();
                    fo_12.a(byteBuffer2, n);
                    if (!fo_12.h()) {
                        arrayList.add(fo_12);
                    }
                }
                catch (RuntimeException runtimeException) {
                    fo_12.a("Exception lev\u00e9e lors de la d\u00e9serialisation de " + this + ", part :" + by, runtimeException);
                }
                if (byteBuffer2.remaining() > 0) {
                    b.warn((Object)new Exception("Part " + by + " of " + this + " still have " + byteBuffer2.remaining() + " byte(s) left !"));
                }
            }
            fq_12.a(byteBuffer2);
        }
        for (fo_1 fo_13 : arrayList) {
            fo_13.f();
        }
    }

    public final void a(fo_1 fo_12, byte[] byArray, int n) {
        fo_1[] fo_1Array = this.b_();
        if (fo_12 == null || fo_1Array == null || fo_1Array.length <= 0) {
            return;
        }
        int n2 = this.a(fo_12);
        if (n2 < 0) {
            throw new RuntimeException("Unable to find part in BinarSerial class : " + this.getClass().getSimpleName());
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n3 = byteBuffer.get();
        for (int k = 0; k < n3; ++k) {
            byte by = byteBuffer.get();
            int n4 = byteBuffer.getInt();
            if (by != n2) continue;
            byteBuffer.position(n4 + 1);
            try {
                fo_12.i();
                fo_12.a(byteBuffer, n);
                if (!fo_12.h()) {
                    fo_12.f();
                }
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception lev\u00e9e lors de la d\u00e9serialisation de la part :" + n2), (Throwable)runtimeException);
            }
            return;
        }
        throw new RuntimeException("Part (" + n2 + ")doesnt exist in BinarSerial class : " + this.getClass().getSimpleName());
    }
}

