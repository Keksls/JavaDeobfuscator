/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import org.apache.log4j.Logger;

/*
 * Renamed from fxo
 */
public class fxo_0
extends fxp_0<Entity3D> {
    private static final Logger a = Logger.getLogger(fxo_0.class);

    protected Entity3D a() {
        return (Entity3D)Entity3D.c.d();
    }

    @Override
    protected void c() {
        fxq_0.a(this.f());
    }

    @Override
    public void a(fxe_0 fxe_02) {
        Entity3D entity3D = (Entity3D)this.f();
        entity3D.c();
        ayo_2 ayo_22 = fxe_02.h();
        if (ayo_22 == null) {
            return;
        }
        int n = fxe_02.f();
        int n2 = fxe_02.e();
        fwQ.a(-n / 2, n2 / 2, n, n2, ayo_22, fxe_02.j(), entity3D);
        for (int k = 0; k < entity3D.V(); ++k) {
            entity3D.b(k).a(axn_2.b, axn_2.f);
        }
    }

    @Override
    protected /* synthetic */ Entity e() {
        return this.a();
    }
}

