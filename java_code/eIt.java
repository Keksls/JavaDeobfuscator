/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;

class eIt
implements Function<Su, int[]> {
    final /* synthetic */ eis_0 a;

    eIt(eis_0 eis_02) {
        this.a = eis_02;
    }

    public int[] a(Su su) {
        return new int[]{su.G(), su.H()};
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((Su)object);
    }
}

