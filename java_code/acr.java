/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.Comparator;

class acr
implements Comparator<DisplayedScreenElement> {
    acr() {
    }

    public int a(DisplayedScreenElement displayedScreenElement, DisplayedScreenElement displayedScreenElement2) {
        if (displayedScreenElement == displayedScreenElement2) {
            return 0;
        }
        return displayedScreenElement.b.i - displayedScreenElement2.b.i;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((DisplayedScreenElement)object, (DisplayedScreenElement)object2);
    }
}

