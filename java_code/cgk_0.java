/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cGk
 */
class cgk_0
implements abb_0 {
    final /* synthetic */ frO a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ abu c;

    cgk_0(frO frO2, ArrayList arrayList, abu abu2) {
        this.a = frO2;
        this.b = arrayList;
        this.c = abu2;
    }

    @Override
    public void animationEnded(abu abu2) {
        this.a.setAnimName((String)this.b.get(1));
        this.c.b(this);
    }
}

