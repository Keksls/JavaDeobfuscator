/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.packrect.Rect
 *  com.jogamp.opengl.util.packrect.RectVisitor
 */
import com.jogamp.opengl.util.packrect.Rect;
import com.jogamp.opengl.util.packrect.RectVisitor;
import java.util.List;

/*
 * Renamed from ayb
 */
class ayb_2
implements RectVisitor {
    final /* synthetic */ List a;
    final /* synthetic */ aya_1 b;

    ayb_2(aya_1 aya_12, List list) {
        this.b = aya_12;
        this.a = list;
    }

    public void visit(Rect rect) {
        ayl_2 ayl_22 = (ayl_2)rect.getUserData();
        if (!ayl_22.f()) {
            this.a.add(rect);
        }
    }
}

