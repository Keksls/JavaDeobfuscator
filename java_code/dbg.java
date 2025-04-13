/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class dbg
implements Comparator<bVs> {
    final /* synthetic */ dbd a;

    dbg(dbd dbd2) {
        this.a = dbd2;
    }

    public int a(bVs bVs2, bVs bVs3) {
        return (int)(bVs2.g() * 100.0f - bVs3.g() * 100.0f);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bVs)object, (bVs)object2);
    }
}

