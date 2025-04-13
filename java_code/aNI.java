/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;

public class aNI {
    private static final int b = Integer.MAX_VALUE;
    private final int c;
    private final int d;
    private final float e;
    private final float f;
    private final int g;
    private final int h;
    final /* synthetic */ aNF a;

    aNI(aNF aNF2, int n, int n2) {
        this.a = aNF2;
        this.c = n;
        this.d = n2;
        this.e = aNF.a(aNF2, n);
        this.f = aNF.b(aNF2, (float)n2);
        if (azu_0.j().k() == null) {
            this.g = Integer.MAX_VALUE;
            this.h = Integer.MAX_VALUE;
            return;
        }
        ArrayList<DisplayedScreenElement> arrayList = aNF2.a(n, n2, azu_0.j().k().L(), acj.b, 0.0f, 0.0f);
        if (arrayList == null || arrayList.isEmpty()) {
            this.g = Integer.MAX_VALUE;
            this.h = Integer.MAX_VALUE;
        } else {
            this.g = arrayList.get(0).G();
            this.h = arrayList.get(0).H();
        }
    }

    public boolean a() {
        return this.g != Integer.MAX_VALUE && this.h != Integer.MAX_VALUE;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public float d() {
        return this.e;
    }

    public float e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.h;
    }

    public String toString() {
        return "WakfuWorldScene.MousePosition(m_mouseX=" + this.b() + ", m_mouseY=" + this.c() + ", m_adjMouseX=" + this.d() + ", m_adjMouseY=" + this.e() + ", m_worldCellX=" + this.f() + ", m_worldCellY=" + this.g() + ")";
    }
}

