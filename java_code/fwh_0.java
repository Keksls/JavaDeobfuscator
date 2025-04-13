/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fwH
 */
public class fwh_0 {
    private static final Logger b = Logger.getLogger(fwh_0.class);
    private final ArrayList<fjg_1> c = new ArrayList();
    private final ArrayList<EntitySprite> d = new ArrayList();
    private final ArrayList<EntitySprite> e = new ArrayList();

    public void a(ArrayList<fjg_1> arrayList) {
        this.c.clear();
        this.c.addAll(arrayList);
        this.c();
    }

    public fjg_1 a(int n) {
        return this.c.get(n);
    }

    public EntitySprite b(int n) {
        return this.d.get(n);
    }

    public EntitySprite c(int n) {
        return this.e.get(n);
    }

    public void a(fjg_1 fjg_12) {
        this.c.add(fjg_12);
        this.d.add(fwh_0.a(this));
        this.e.add(fwh_0.a(this));
        assert (this.d.size() == this.c.size());
    }

    public void b(fjg_1 fjg_12) {
        int n = this.c.indexOf(fjg_12);
        if (n != -1) {
            this.c.remove(n);
            this.d.remove(n).u();
            this.e.remove(n).u();
        }
        assert (this.d.size() == this.c.size());
    }

    public int a() {
        return this.c.size();
    }

    public void b() {
        this.c.clear();
        for (int k = this.d.size() - 1; k >= 0; --k) {
            this.d.remove(k).u();
        }
        this.d.clear();
        assert (this.d.size() == this.c.size());
    }

    private void c() {
        int n = this.c.size();
        assert (this.d.size() == this.e.size());
        while (this.d.size() > n) {
            this.d.remove(this.d.size() - 1).u();
            this.e.remove(this.e.size() - 1).u();
        }
        for (int k = this.d.size(); k < n; ++k) {
            EntitySprite entitySprite = fwh_0.a("MapOverlay");
            EntitySprite entitySprite2 = fwh_0.a("MapOverlay");
            this.d.add(entitySprite);
            this.e.add(entitySprite2);
        }
        assert (this.d.size() == this.c.size() && this.d.size() == this.e.size());
    }

    private static EntitySprite a(Object object) {
        EntitySprite entitySprite = (EntitySprite)EntitySprite.a.d();
        entitySprite.p = object;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.j.d();
        entitySprite.a(geometrySprite);
        geometrySprite.u();
        return entitySprite;
    }

    public void a(float f2, float f3) {
        int n = this.d.size();
        for (int k = 0; k < n; ++k) {
            EntitySprite entitySprite = this.d.get(k);
            entitySprite.a(entitySprite.j() - f3, entitySprite.g() - f2);
            EntitySprite entitySprite2 = this.e.get(k);
            entitySprite2.a(entitySprite2.j() - f3, entitySprite2.g() - f2);
        }
    }

    public fwg_0 d(int n) {
        if (n < 0 || n >= this.c.size()) {
            return null;
        }
        return new fwg_0(this.c.get(n), this.d.get(n), this.e.get(n));
    }
}

