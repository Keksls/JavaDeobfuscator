/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class dbh
implements Comparator<bVs> {
    final /* synthetic */ dbd a;

    dbh(dbd dbd2) {
        this.a = dbd2;
    }

    public int a(bVs bVs2, bVs bVs3) {
        return Hw.e(bVs2.a() - bVs3.a());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bVs)object, (bVs)object2);
    }
}

