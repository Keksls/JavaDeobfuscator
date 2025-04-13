/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ahG
 */
public class ahg_0
extends azy_2 {
    public static final float o = 86.0f;
    public static final float p = 43.0f;
    public static final float q = 10.0f;
    public static final float r = 4.8f;
    protected float s = 86.0f;
    protected float t = 43.0f;
    protected float u = 10.0f;
    protected final ArrayList<Entity> v;
    protected final ArrayList<Entity> w;
    protected final TLongArrayList x;
    protected final ArrayList<Entity> y;
    protected final ahm_0 z;
    private ahl_0 a = ahl_0.a;

    public ahg_0() {
        this.z = this.a();
        this.v = new ArrayList(2048);
        this.x = new TLongArrayList(2048);
        this.w = new ArrayList(1024);
        this.y = new ArrayList(3072);
    }

    public void a(@NotNull ahl_0 ahl_02) {
        this.a.a();
        this.a = ahl_02;
    }

    public void a(Entity entity, boolean bl) {
        if (!this.a.a(entity, bl)) {
            return;
        }
        this.b(entity, bl);
    }

    public void b(Entity entity, boolean bl) {
        if (bl) {
            this.v.add(entity);
        } else {
            this.w.add(entity);
        }
    }

    public final void c(Entity entity, boolean bl) {
        if (bl) {
            this.v.remove(entity);
        } else {
            this.w.remove(entity);
        }
    }

    public float w() {
        return this.s;
    }

    public void f(float f2) {
        this.s = f2;
    }

    public float x() {
        return this.t;
    }

    public void g(float f2) {
        this.t = f2;
    }

    public float y() {
        return this.u;
    }

    public void h(float f2) {
        this.u = f2;
    }

    public final ahm_0 z() {
        return this.z;
    }

    public ahq_0 s() {
        return (ahq_0)this.z;
    }

    public ahh_0 A() {
        return this.s().u();
    }

    public void a(ahh_0 ahh_02) {
        this.s().a(ahh_02);
    }

    public void j() {
        this.s().r();
    }

    public float B() {
        if (this.z != null) {
            return this.s().t();
        }
        return 1.0f;
    }

    public void i(float f2) {
        if (this.z != null) {
            this.s().a(f2);
        }
    }

    protected ahm_0 a() {
        return new ahq_0(this);
    }

    public float c(float f2, float f3) {
        return (f2 - f3) * this.s * 0.5f;
    }

    public float d(float f2, float f3) {
        return -(f2 + f3) * this.t * 0.5f;
    }

    public float a(float f2, float f3, float f4) {
        return this.d(f2, f3) + f4 * this.u;
    }

    public float e(float f2, float f3) {
        return f2 / this.s - f3 / this.t;
    }

    public float b(float f2, float f3, float f4) {
        return f2 / this.s - (f3 - f4 * this.u) / this.t;
    }

    public float f(float f2, float f3) {
        return -(f2 / this.s + f3 / this.t);
    }

    public float c(float f2, float f3, float f4) {
        return -(f2 / this.s + (f3 - f4 * this.u) / this.t);
    }

    protected long a(int n, int n2, int n3, int n4) {
        return ahi_0.a(n, n2, n3, n4);
    }

    public ArrayList<Entity> C() {
        return this.v;
    }

    public boolean a(aiG aiG2, Entity entity, int n, int n2, int n3, int n4, boolean bl) {
        entity.e = this.a(n, n2, n3, n4);
        return true;
    }

    public final boolean a(aiG aiG2, Entity entity, int n, int n2, int n3, int n4) {
        return this.a(aiG2, entity, n, n2, n3, n4, false);
    }

    public float[] a(aiG aiG2) {
        return acw.a().a(aiG2);
    }

    public void a(List<DisplayedScreenElement> list) {
        this.a.a(this, list);
    }

    public boolean a(abu abu2) {
        return this.a.a(abu2);
    }

    public static float b(int n, int n2) {
        return (float)(n - n2) * 86.0f * 0.5f;
    }

    public static float c(int n, int n2) {
        return (float)(-(n + n2)) * 43.0f * 0.5f;
    }

    public void i(boolean bl) {
        if (this.z instanceof ahq_0) {
            ((ahq_0)this.z).c(bl);
        }
    }
}

