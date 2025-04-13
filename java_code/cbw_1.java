/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import org.apache.log4j.Logger;

/*
 * Renamed from cbW
 */
public final class cbw_1
implements afk_0<afe_0>,
ahj_0 {
    private static final Logger b = Logger.getLogger(cbw_1.class);
    public static final cbw_1 a = new cbw_1();
    private boolean c = true;

    public void a(afe_0 afe_02, int n, int n2, short s2) {
        DisplayedScreenElement displayedScreenElement = abY.a(acs_0.b(), n, n2, s2);
        if (displayedScreenElement == null) {
            return;
        }
        boolean bl = acw.a().b(displayedScreenElement.aq());
        this.a(bl);
    }

    @Override
    public void a() {
        boolean bl = acw.a().b();
        this.a(bl);
    }

    private void a(boolean bl) {
        if (bl != this.c) {
            cbt_1.a.c(bl);
            this.c = bl;
        }
    }

    public boolean b() {
        return this.c;
    }

    @Override
    public /* synthetic */ void cellPositionChanged(ahh_0 ahh_02, int n, int n2, short s2) {
        this.a((afe_0)ahh_02, n, n2, s2);
    }
}

