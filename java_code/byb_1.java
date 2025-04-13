/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from byB
 */
class byb_1
implements Comparator<byo_2> {
    static final byb_1 a = new byb_1(true);
    static final byb_1 b = new byb_1(false);
    private boolean c = true;

    private byb_1(boolean bl) {
        this.c = bl;
    }

    public int a(byo_2 byo_22, byo_2 byo_23) {
        return this.c ? byo_22.f().compareTo(byo_23.f()) : byo_23.f().compareTo(byo_22.f());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byo_2)object, (byo_2)object2);
    }
}

