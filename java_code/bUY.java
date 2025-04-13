/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bUY
implements Comparator<Object> {
    final /* synthetic */ bUW a;

    bUY(bUW bUW2) {
        this.a = bUW2;
    }

    @Override
    public int compare(Object object, Object object2) {
        return (int)(((bVo)object).b() - ((bVo)object2).b());
    }
}

