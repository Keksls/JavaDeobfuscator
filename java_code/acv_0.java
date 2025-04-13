/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.Comparator;

/*
 * Renamed from acv
 */
class acv_0
implements Comparator<DisplayedScreenElement> {
    acv_0() {
    }

    public int a(DisplayedScreenElement displayedScreenElement, DisplayedScreenElement displayedScreenElement2) {
        if (displayedScreenElement == null || displayedScreenElement.b == null) {
            return 0;
        }
        if (displayedScreenElement2 == null || displayedScreenElement2.b == null) {
            return 0;
        }
        return displayedScreenElement.b.i - displayedScreenElement2.b.i;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((DisplayedScreenElement)object, (DisplayedScreenElement)object2);
    }
}

