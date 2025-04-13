/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.Map;
import java.util.Set;

public class ffg
extends feX {
    private static final int[] b = new int[ffk.values().length];

    @Override
    public byte c() {
        return 9;
    }

    @Override
    public boolean b(byte by) {
        return by >= 0 && by < this.c();
    }

    @Override
    public short[] c(byte by) {
        int n = by / 3 * 6;
        int n2 = by % 3 * 6;
        return new short[]{(short)n, (short)n2};
    }

    @Override
    public void a(feZ feZ2) {
        TByteHashSet tByteHashSet = new TByteHashSet();
        for (byte by2 = 0; by2 < this.c(); by2 = (byte)(by2 + 1)) {
            tByteHashSet.add(by2);
        }
        Set set = this.a.entrySet();
        for (Map.Entry entry : set) {
            tByteHashSet.remove(((Byte)entry.getKey()).byteValue());
        }
        tByteHashSet.forEach(by -> {
            feY feY2 = feZ2.a();
            this.a(by, feY2);
            return true;
        });
    }
}

