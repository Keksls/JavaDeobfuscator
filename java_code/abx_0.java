/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;

/*
 * Renamed from abX
 */
public class abx_0
extends abw_0 {
    @Override
    protected void a(ArrayList<DisplayedScreenElement> arrayList) {
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            DisplayedScreenElement displayedScreenElement = arrayList.get(k);
            if (!displayedScreenElement.d().i().m()) continue;
            this.a.add(displayedScreenElement);
        }
    }
}

