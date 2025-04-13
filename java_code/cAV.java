/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

public class cAV
extends ps_0 {
    private static final Logger a = Logger.getLogger(cAV.class);
    private final Map<Integer, long[]> b = new HashMap<Integer, long[]>();

    @Override
    public boolean a(byte[] byArray) {
        byte[] byArray2;
        try {
            byArray2 = flI.b(byArray);
        }
        catch (IOException iOException) {
            a.error((Object)("[MARKET] Error while decompressing item prices data: " + Arrays.toString(byArray)), (Throwable)iOException);
            return true;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray2);
        while (byteBuffer.hasRemaining()) {
            int n = byteBuffer.getInt();
            byte by = byteBuffer.get();
            long[] lArray = new long[5];
            for (int k = 0; k < 5; ++k) {
                lArray[k] = (by & 1 << k) > 0 ? byteBuffer.getLong() : -1L;
            }
            this.b.put(n, lArray);
        }
        return true;
    }

    @Override
    public int a() {
        return 15370;
    }

    public Map<Integer, long[]> b() {
        return this.b;
    }
}

