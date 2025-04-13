/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import gnu.trove.map.hash.THashMap;

/*
 * Renamed from cKW
 */
class ckw_1<T extends fkt_0> {
    private final THashMap<Entity, T> b = new THashMap();
    final THashMap<T, Entity> c = new THashMap();
    static final /* synthetic */ boolean a;

    ckw_1() {
    }

    public Entity a(Entity entity, T t) {
        Entity entity2 = (Entity)this.c.put(t, (Object)entity);
        if (entity2 != null) {
            this.b.remove((Object)entity2);
        }
        this.b.put((Object)entity, t);
        return entity2;
    }

    public Entity a(T t) {
        return (Entity)this.c.get(t);
    }

    public T a(EntitySprite entitySprite) {
        return (T)((fkt_0)this.b.get((Object)entitySprite));
    }

    public Entity b(T t) {
        Entity entity = (Entity)this.c.remove(t);
        this.b.remove((Object)entity);
        if (!a && this.c.size() != this.b.size()) {
            throw new AssertionError();
        }
        return entity;
    }

    public T a(Entity entity) {
        fkt_0 fkt_02 = (fkt_0)this.b.remove((Object)entity);
        this.c.remove((Object)fkt_02);
        if (!a && this.c.size() != this.b.size()) {
            throw new AssertionError();
        }
        return (T)fkt_02;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
    }

    static {
        a = !cks_2.class.desiredAssertionStatus();
    }
}

