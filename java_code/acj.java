/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.List;

public enum acj {
    a(true, new ack()),
    b(true, new acl()),
    c(false, new acm());

    private final boolean d;
    private final aco_0 e;

    static int a(DisplayedScreenElement displayedScreenElement, DisplayedScreenElement displayedScreenElement2) {
        long l = displayedScreenElement.e().e;
        long l2 = displayedScreenElement2.e().e;
        if (l < l2) {
            return 1;
        }
        if (l > l2) {
            return -1;
        }
        return 0;
    }

    private acj(boolean bl, aco_0 aco_02) {
        this.d = bl;
        this.e = aco_02;
    }

    public void a(List<DisplayedScreenElement> list, acp_0 acp_02) {
        this.e.a(acp_02);
        list.sort(this.e);
    }

    public boolean a() {
        return this.d;
    }
}

