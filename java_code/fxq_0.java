/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.log4j.Logger;

/*
 * Renamed from fxq
 */
public class fxq_0
extends fxp_0<EntitySprite> {
    private static final Logger a = Logger.getLogger(fxq_0.class);

    protected EntitySprite a() {
        return (EntitySprite)EntitySprite.a.d();
    }

    @Override
    protected void c() {
        fxq_0.a(this.f());
    }

    public static void a(Entity entity) {
        ayx_2 ayx_22 = new ayx_2();
        ayx_22.a(new afj_1(afr_2.f, -0.7853982f));
        ayx_22.b(0.5f * Hw.n, Hw.n, 1.0f);
        ayx_2 ayx_23 = new ayx_2();
        ayx_23.a(new afj_1(afr_2.d, -1.0471976f));
        entity.D().a(ayx_22);
        entity.D().a(ayx_23);
    }

    @Override
    public void a(ays_2 ays_22) {
        ((EntitySprite)this.f()).b(ays_22);
    }

    @Override
    public void a(fxe_0 fxe_02) {
        ayo_2 ayo_22 = fxe_02.h();
        if (ayo_22 == null) {
            return;
        }
        int n = fxe_02.f();
        int n2 = fxe_02.e();
        fwQ.a(-n / 2, n2 / 2, n, n2, ayo_22, fxe_02.j(), (EntitySprite)this.f());
        ((EntitySprite)this.f()).c().a(axn_2.b, axn_2.f);
    }

    @Override
    protected /* synthetic */ Entity e() {
        return this.a();
    }
}

