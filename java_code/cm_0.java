/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.strategy.HashingStrategy
 */
import gnu.trove.strategy.HashingStrategy;
import java.util.Arrays;

/*
 * Renamed from CM
 */
class cm_0
implements HashingStrategy<short[]> {
    cm_0() {
    }

    public final int a(short[] sArray) {
        int n = 1;
        for (short s2 : sArray) {
            n = 31 * n + s2;
        }
        return n;
    }

    public final boolean a(short[] sArray, short[] sArray2) {
        return Arrays.equals(sArray, sArray2);
    }

    public /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((short[])object, (short[])object2);
    }

    public /* synthetic */ int computeHashCode(Object object) {
        return this.a((short[])object);
    }
}

