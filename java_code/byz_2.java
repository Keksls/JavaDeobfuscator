/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from byz
 */
class byz_2
implements Comparator<byo_2> {
    static final byz_2 a = new byz_2(true);
    static final byz_2 b = new byz_2(false);
    private boolean c = true;

    private byz_2(boolean bl) {
        this.c = bl;
    }

    public int a(byo_2 byo_22, byo_2 byo_23) {
        if (byo_22.c() > byo_23.c()) {
            return this.c ? 1 : -1;
        }
        if (byo_22.c() < byo_23.c()) {
            return this.c ? -1 : 1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byo_2)object, (byo_2)object2);
    }
}

