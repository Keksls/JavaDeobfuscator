/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fyU
 */
class fyu_0
implements Comparator<fyT> {
    public static final fyu_0 a = new fyu_0();

    private fyu_0() {
    }

    public int a(fyT fyT2, fyT fyT3) {
        return (int)(fyT3.getHeight() * fyT3.getWidth() - fyT2.getHeight() * fyT2.getWidth());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fyT)object, (fyT)object2);
    }
}

