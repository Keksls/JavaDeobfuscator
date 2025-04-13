/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;
import com.ankamagames.framework.graphics.engine.text.GeometryText;

/*
 * Renamed from Zg
 */
public class zg_0 {
    private apv_2 a = null;
    private int b;
    private int c;
    private final EntityText d = (EntityText)EntityText.a.d();

    public zg_0(ayn_2 ayn_22, String string) {
        this(ayn_22, false, string);
    }

    public zg_0(ayn_2 ayn_22, boolean bl, String string) {
        GeometryBackground geometryBackground = (GeometryBackground)GLGeometryBackground.c.d();
        GeometryText geometryText = (GeometryText)GLGeometryText.c.d();
        this.d.a(geometryBackground);
        this.d.a(geometryText);
        this.d.a(ayn_22);
        this.d.a(string);
        geometryBackground.u();
        geometryText.u();
    }

    public apv_2 a() {
        return this.a;
    }

    public void a(apv_2 apv_22) {
        this.a = apv_22;
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public int c() {
        return this.c;
    }

    public void b(int n) {
        this.c = n;
    }

    public float d() {
        if (this.a != null) {
            return this.a.J();
        }
        return 0.0f;
    }

    public float e() {
        if (this.a != null) {
            return this.a.K();
        }
        return 0.0f;
    }

    public float f() {
        if (this.a != null) {
            return this.a.L();
        }
        return 0.0f;
    }

    public EntityText n() {
        return this.d;
    }

    public void a(String string) {
        this.d.a(string);
    }

    public void a(boolean bl) {
        this.d.b(bl);
    }

    public boolean o() {
        return this.d.at();
    }

    public boolean m() {
        return false;
    }

    public void p() {
        this.d.u();
        this.a = null;
    }
}

