/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

public final class acn {
    private static final Logger b = Logger.getLogger(acn.class);
    private final TLongObjectHashMap<DisplayedScreenElement> c = new TLongObjectHashMap(8192);

    public acn() {
        this.c.setAutoCompactionFactor(0.0f);
    }

    public DisplayedScreenElement a(long l) {
        assert (l != 0L);
        DisplayedScreenElement displayedScreenElement = (DisplayedScreenElement)this.c.get(l);
        if (displayedScreenElement != null) {
            displayedScreenElement.k_();
            return displayedScreenElement;
        }
        DisplayedScreenElement displayedScreenElement2 = (DisplayedScreenElement)DisplayedScreenElement.a.d();
        this.c.put(l, (Object)displayedScreenElement2);
        return displayedScreenElement2;
    }

    public void a(DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement.aw() <= 0) {
            long l = displayedScreenElement.b.o;
            assert (l != 0L);
            this.c.remove(l);
        }
        displayedScreenElement.u();
    }

    public void a(byte by) {
        TLongObjectIterator tLongObjectIterator = this.c.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            DisplayedScreenElement displayedScreenElement = (DisplayedScreenElement)tLongObjectIterator.value();
            if (displayedScreenElement.d != null || !displayedScreenElement.a(by)) continue;
            displayedScreenElement.b();
        }
    }

    public void a() {
        if (!this.c.isEmpty()) {
            b.error((Object)"la factory contient encore des \u00e9l\u00e9ments!!!");
        }
        this.c.clear();
    }
}

