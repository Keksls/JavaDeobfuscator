/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class btc
implements Comparator<btb> {
    public static final btc a = new btc();

    public int a(btb btb2, btb btb3) {
        int n = btb2.o() - btb3.o();
        if (n != 0) {
            return n;
        }
        return Long.compare(btb2.p(), btb3.p());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((btb)object, (btb)object2);
    }
}

