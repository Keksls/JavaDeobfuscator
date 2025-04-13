/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import org.apache.log4j.Logger;

/*
 * Renamed from abD
 */
public abstract class abd_0 {
    private static final Logger c = Logger.getLogger(abd_0.class);
    protected Entity3D a;

    public Entity3D a() {
        return this.a;
    }

    public void b() {
        assert (this.a != null);
        this.a.u();
        this.a = null;
    }

    public EntityGroup a(abu abu2) {
        EntityGroup entityGroup = (EntityGroup)EntityGroup.a.d();
        entityGroup.p = abu2;
        assert (this.a == null);
        this.a = abu2.n();
        entityGroup.a(this.a);
        return entityGroup;
    }

    public abstract void a(boolean var1);
}

