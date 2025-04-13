/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bzi
 */
class bzi_1
implements Comparator<bnh_1> {
    bzi_1() {
    }

    public int a(bnh_1 bnh_12, bnh_1 bnh_13) {
        byp_1 byp_12 = dbO.a().d();
        if (byp_12 == null) {
            return 0;
        }
        byr_1 byr_12 = byp_12.c(bnh_12.a_());
        byr_1 byr_13 = byp_12.c(bnh_13.a_());
        if (byr_12 == null || byr_13 == null) {
            return 0;
        }
        return byr_13.k() - byr_12.k();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bnh_1)object, (bnh_1)object2);
    }
}

