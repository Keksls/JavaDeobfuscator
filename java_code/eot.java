/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public final class eot {
    private static final BitSet a = new BitSet();

    private eot() {
    }

    public static boolean a(BitSet bitSet) {
        return a.intersects(bitSet);
    }

    static {
        a.set(1028);
        a.set(1003);
        a.set(1001);
        a.set(1005);
        a.set(1002);
    }
}

