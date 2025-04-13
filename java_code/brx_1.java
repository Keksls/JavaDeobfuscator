/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from brX
 */
class brx_1
implements Comparator<brk_1> {
    final /* synthetic */ brw_0 a;

    brx_1(brw_0 brw_02) {
        this.a = brw_02;
    }

    public int a(brk_1 brk_12, brk_1 brk_13) {
        return brk_12.c() - brk_13.c();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((brk_1)object, (brk_1)object2);
    }
}

