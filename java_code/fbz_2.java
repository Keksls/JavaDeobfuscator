/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.awt.Point;

/*
 * Renamed from fBZ
 */
public class fbz_2
extends fcf_1 {
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n + n7;
        int n10 = n2 + n6 + n4;
        this.b.a((float)n10, (float)n9, n3, n4);
    }

    public void a(Point point, fjf_2 fjf_22, Insets insets) {
        this.a(point.x, point.y, fjf_22.width, fjf_22.height, insets.top, insets.bottom, insets.left, insets.right);
    }
}

