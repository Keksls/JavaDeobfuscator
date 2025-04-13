/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.jogamp.opengl.GL2;
import java.util.ArrayList;
import java.util.HashSet;

/*
 * Renamed from acf
 */
class acf_0
implements aug_2 {
    final /* synthetic */ ace_0 a;

    acf_0(ace_0 ace_02) {
        this.a = ace_02;
    }

    @Override
    public void a(aui_2 aui_22) {
        GL2 gL2 = aui_22.e();
        this.a(aui_22, gL2, this.a.n);
        this.a.a(gL2);
        this.a.f.a(aui_22);
        this.a(aui_22, gL2, this.a.I);
    }

    private void a(aui_2 aui_22, GL2 gL2, ArrayList<acG> arrayList) {
        if (!this.a.K) {
            return;
        }
        for (int k = 0; k < arrayList.size(); ++k) {
            acG acG2 = arrayList.get(k);
            acG2.a(gL2);
            acG2.f.a(aui_22);
        }
    }

    @Override
    public void a(Entity entity) {
    }

    @Override
    public void a(Entity entity, int n) {
    }

    @Override
    public void a() {
    }

    @Override
    public void a(HashSet<Entity> hashSet) {
    }
}

