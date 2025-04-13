/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.log4j.Logger;

/*
 * Renamed from bLK
 */
public class blk_0
extends fxp_0<EntityGroup> {
    private static final Logger a = Logger.getLogger(blk_0.class);
    private EntityGroup b;
    private EntitySprite c;
    private ayo_2 d;
    private azj_2 e;

    protected EntityGroup a() {
        this.c = (EntitySprite)EntitySprite.a.d();
        this.c.p = this;
        this.b = (EntityGroup)EntityGroup.a.d();
        this.b.p = this;
        EntityGroup entityGroup = (EntityGroup)EntityGroup.a.d();
        entityGroup.a(this.c);
        entityGroup.a((Entity)this.b);
        return entityGroup;
    }

    public EntityGroup b() {
        return this.b;
    }

    @Override
    protected void c() {
        fxq_0.a(this.c);
    }

    @Override
    public void a(fxe_0 fxe_02) {
        if (this.e != null) {
            fwQ.a(0, 0, this.d.e(), this.d.d(), this.d, fxe_02.j(), this.c);
            int n = fxe_02.f();
            int n2 = fxe_02.e();
            this.c.a((float)(n2 / 2), (float)(-n / 2), (int)(1.7f * (float)n), (int)(1.7f * (float)n2));
            this.c.c().a(axn_2.b, axn_2.f);
        }
    }

    @Override
    public void d() {
        super.d();
        this.b = null;
        this.c = null;
    }

    public void a(ayo_2 ayo_22, azj_2 azj_22) {
        this.d = ayo_22;
        this.e = azj_22;
    }

    @Override
    protected /* synthetic */ Entity e() {
        return this.a();
    }
}

