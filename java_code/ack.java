/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

class ack
extends aco_0 {
    ack() {
    }

    public int a(DisplayedScreenElement displayedScreenElement, DisplayedScreenElement displayedScreenElement2) {
        acp_0 acp_02 = this.a();
        float f2 = acp_02.b;
        float f3 = acp_02.c;
        acb_0 acb_02 = acp_02.a;
        float f4 = this.a(displayedScreenElement, f2, f3, acb_02);
        float f5 = this.a(displayedScreenElement2, f2, f3, acb_02);
        return Float.compare(f4, f5);
    }

    private float a(DisplayedScreenElement displayedScreenElement, float f2, float f3, acb_0 acb_02) {
        ScreenElement screenElement = displayedScreenElement.d();
        int n = screenElement.d();
        int n2 = screenElement.e();
        short s2 = screenElement.c();
        float f4 = acb_02.c(n, n2);
        float f5 = acb_02.a((float)n, (float)n2, (float)s2);
        return afq_2.c(f2 - f4, f3 - f5);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((DisplayedScreenElement)object, (DisplayedScreenElement)object2);
    }
}

