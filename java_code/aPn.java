/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.util.List;

public class aPn
extends aPl {
    aPn(bvx_2 bvx_22, aPp aPp2, boolean bl) {
        super(bvx_22, aPp2, bl);
    }

    @Override
    public void a(ahg_0 ahg_02, List<DisplayedScreenElement> list) {
        super.a(ahg_02, list);
        this.d.a(list);
        this.d.c().forEach(entity -> ahg_02.b((Entity)entity, true));
        list.stream().filter(displayedScreenElement -> !this.d.a((DisplayedScreenElement)displayedScreenElement)).forEach(displayedScreenElement -> {
            ahg_02.a(displayedScreenElement.e(), true);
            Entity3D entity3D = this.d.c((DisplayedScreenElement)displayedScreenElement);
            if (entity3D == null) {
                return;
            }
            ahg_02.a(entity3D, true);
        });
    }
}

