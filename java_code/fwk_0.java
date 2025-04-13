/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Insets;

/*
 * Renamed from fwK
 */
public abstract class fwk_0
implements fqt {
    protected azj_2 a = null;

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.a == azj_22) {
            return;
        }
        this.a = azj_22;
    }

    @Override
    public azj_2 getModulationColor() {
        return this.a;
    }

    public abstract void a(int var1, int var2, int var3, int var4, float var5);

    public abstract void a(ayo_2 var1, ayo_2 var2, ayo_2 var3, ayo_2 var4, ayo_2 var5, ayo_2 var6, ayo_2 var7, ayo_2 var8, ayo_2 var9);

    public abstract Entity a();

    public abstract void b();

    public void c() {
        this.a = null;
    }

    public abstract void a(boolean var1);

    public abstract void a(azj_2 var1);

    public abstract azj_2 d();

    public abstract void b(azj_2 var1);

    public abstract azj_2 e();

    public abstract void a(float var1);

    public abstract float f();

    public abstract void b(float var1);

    public abstract float g();

    public abstract void a(frs_0 var1);

    public abstract frs_0 h();

    public abstract void a(Insets var1);

    public abstract Insets i();
}

