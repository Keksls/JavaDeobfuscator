/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import java.util.List;

public abstract class aPl
extends ahl_0 {
    protected final tg_0 b;
    protected final int c;
    protected final aPo d;
    protected final List<Entity> e = new ArrayList<Entity>();
    protected final boolean f;

    aPl(bvx_2 bvx_22, aPp aPp2, boolean bl) {
        this.b = bvx_22.g();
        this.c = bvx_22.c();
        this.d = new aPo(this.b, aPp2);
        this.f = bl;
    }

    @Override
    public void a() {
        super.a();
        this.d.a();
    }

    @Override
    public boolean a(Entity entity, boolean bl) {
        boolean bl2 = this.b.c(Hw.b(entity.f), Hw.b(entity.g));
        if (!bl2) {
            return this.f;
        }
        if (this.e.contains(entity)) {
            return entity.h <= (float)this.b.n() && entity.h + entity.j >= (float)this.b.m();
        }
        return true;
    }

    @Override
    public boolean a(abu abu2) {
        return abu2.az() == this.c;
    }

    protected void a(List<DisplayedScreenElement> list) {
        this.e.clear();
        list.forEach(displayedScreenElement -> this.e.add(displayedScreenElement.e()));
    }

    @Override
    public void a(ahg_0 ahg_02, List<DisplayedScreenElement> list) {
        this.a(list);
    }
}

