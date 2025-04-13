/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.List;

public class aPm
extends aPl {
    aPm(bvx_2 bvx_22, aPp aPp2, boolean bl) {
        super(bvx_22, aPp2, bl);
    }

    @Override
    public void a(ahg_0 ahg_02, List<DisplayedScreenElement> list) {
        super.a(ahg_02, list);
        this.d.a(list);
        this.d.b().forEach(entity -> ahg_02.b((Entity)entity, true));
        if (this.f) {
            list.stream().filter(displayedScreenElement -> !this.d.b((DisplayedScreenElement)displayedScreenElement)).forEach(displayedScreenElement -> ahg_02.a(displayedScreenElement.e(), true));
        }
    }
}

