/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from aud
 */
public final class aud_1 {
    private static final boolean a = false;
    private static final aud_1 b = new aud_1();
    private ArrayList<abj_1> c;
    private float d;
    private float e;
    private HashMap<String, Integer> f;
    private int g;
    private aue_1 h;

    public static aud_1 a() {
        return b;
    }

    public void a(abj_1 abj_12) {
    }

    public final void b() {
        if (this.f != null) {
            this.f.clear();
        }
        this.g = 0;
    }

    public void a(Geometry geometry) {
    }

    public void a(aui_2 aui_22) {
    }

    public void c() {
    }

    private aud_1() {
        this.b();
    }

    private void a(aui_2 aui_22, abj_1 abj_12) {
        float f2 = 200.0f * (float)abj_12.d() / (float)abj_12.e();
        aui_22.a(this.d, this.e, f2, 14.0f, -12582912);
        aui_22.a(this.d + f2, this.e, 200.0f - f2, 14.0f, -16760832);
        this.h.a(abj_12.c().getSimpleName() + "(" + abj_12.d() + "/" + abj_12.e() + ")");
        this.e -= 16.0f;
    }
}

