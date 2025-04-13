/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

public abstract class aex {
    protected final ArrayList<Entity> a = new ArrayList(128);
    private static aex b = aea_0.b;

    public void a() {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            Entity entity = this.a.get(k);
            if (entity.aw() < 0) continue;
            if (entity instanceof EntityGroup) {
                ArrayList<Entity> arrayList = entity.U();
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    Entity entity2 = arrayList.get(i2);
                    entity2.Q();
                    entity.a(axt_2.b);
                    entity.b(axt_2.b);
                }
                continue;
            }
            entity.Q();
            entity.a(axt_2.b);
            entity.b(axt_2.b);
        }
        this.a.clear();
    }

    public void a(ArrayList<Entity> arrayList) {
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            Entity entity = arrayList.get(k);
            if ((entity.k & 1) == 0) continue;
            int n2 = entity.m;
            int n3 = entity.o;
            int n4 = entity.l;
            int n5 = entity.n;
            float f2 = entity.f + entity.g;
            float f3 = entity.h + entity.j * 0.666f;
            int n6 = this.a.size();
            for (int i2 = k + 1; i2 < n; ++i2) {
                Entity entity2 = arrayList.get(i2);
                if ((entity2.k & 2) == 0 || entity2.l >= n2 || entity2.n >= n3 || entity2.m <= n4 || entity2.o <= n5 || entity2.h + entity2.j <= f3 || entity2.f + entity2.g <= f2) continue;
                this.a(entity, entity2);
            }
            this.a(n6, entity);
        }
    }

    public abstract abd_0 b();

    protected abstract void a(int var1, Entity var2);

    public void a(Matrix44 matrix44, ahm_0 ahm_02) {
    }

    public abstract void a(acb_0 var1);

    protected void a(Entity entity, Entity entity2) {
        this.a.add(entity2);
    }

    public static aex c() {
        return b;
    }

    public static void a(aex aex2) {
        b = aex2;
    }
}

