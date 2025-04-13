/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from byA
 */
class bya_2
implements Comparator<byo_2> {
    static final bya_2 a = new bya_2(true);
    static final bya_2 b = new bya_2(false);
    private boolean c = true;

    private bya_2(boolean bl) {
        this.c = bl;
    }

    public int a(byo_2 byo_22, byo_2 byo_23) {
        return this.c ? byo_22.e() - byo_23.e() : byo_23.e() - byo_22.e();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byo_2)object, (byo_2)object2);
    }
}

