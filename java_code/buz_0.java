/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bUZ
 */
class buz_0
implements Comparator<bUP> {
    final /* synthetic */ bUW a;

    buz_0(bUW bUW2) {
        this.a = bUW2;
    }

    public int a(bUP bUP2, bUP bUP3) {
        if (bUP2.a() == null) {
            return -1;
        }
        if (bUP3.a() == null) {
            return 1;
        }
        if (bUP2.a().a() < bUP3.a().a()) {
            return -1;
        }
        if (bUP3.a().a() < bUP2.a().a()) {
            return -1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bUP)object, (bUP)object2);
    }
}

