/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.occlusion.shadow.RedrawEntity;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aeE
 */
public class aee_0
extends aex {
    private static final Logger c = Logger.getLogger(aee_0.class);
    private final ArrayList<RedrawEntity> d = new ArrayList();
    public static final aee_0 b = new aee_0();

    private aee_0() {
    }

    @Override
    public void a() {
        super.a();
        this.d.clear();
    }

    @Override
    public abd_0 b() {
        return new aed_0();
    }

    @Override
    protected void a(Entity entity, Entity entity2) {
        super.a(entity, entity2);
        this.d.add(new RedrawEntity(entity2, azf_2.f));
    }

    @Override
    protected void a(int n, Entity entity) {
    }

    @Override
    public void a(acb_0 acb_02) {
        int n = this.d.size();
        for (int k = 0; k < n; ++k) {
            acb_02.a(this.d.get(k), false);
        }
    }
}

