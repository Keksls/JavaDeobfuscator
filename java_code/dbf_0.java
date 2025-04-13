/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from dbf
 */
class dbf_0
implements Comparator<bVs> {
    final /* synthetic */ dbd a;

    dbf_0(dbd dbd2) {
        this.a = dbd2;
    }

    public int a(bVs bVs2, bVs bVs3) {
        return bVs2.c() - bVs3.c();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bVs)object, (bVs)object2);
    }
}

