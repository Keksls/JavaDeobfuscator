/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from byC
 */
class byc_2
implements Comparator<byo_2> {
    static final byc_2 a = new byc_2(true);
    static final byc_2 b = new byc_2(false);
    private boolean c = true;

    private byc_2(boolean bl) {
        this.c = bl;
    }

    public int a(byo_2 byo_22, byo_2 byo_23) {
        if (byo_22.b() > byo_23.b()) {
            return this.c ? 1 : -1;
        }
        if (byo_22.b() < byo_23.b()) {
            return this.c ? -1 : 1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byo_2)object, (byo_2)object2);
    }
}

