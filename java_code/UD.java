/*
 * Decompiled with CFR 0.152.
 */
public class UD
implements tw_0 {
    private final tw_0[] a;

    public UD(tw_0 ... tw_0Array) {
        this.a = tw_0Array;
    }

    public boolean isValid(ts_0 ts_02) {
        for (tw_0 tw_02 : this.a) {
            if (tw_02.isValid(ts_02)) continue;
            return false;
        }
        return true;
    }
}

