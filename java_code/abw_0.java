/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;

/*
 * Renamed from abW
 */
public abstract class abw_0 {
    protected final ArrayList<DisplayedScreenElement> a = new ArrayList();

    public void a() {
        this.a.clear();
    }

    public void b() {
        this.a.clear();
    }

    public ArrayList<DisplayedScreenElement> c() {
        return this.a;
    }

    protected abstract void a(ArrayList<DisplayedScreenElement> var1);

    public ArrayList<DisplayedScreenElement> b(ArrayList<DisplayedScreenElement> arrayList) {
        this.a.clear();
        this.a(arrayList);
        return this.a;
    }
}

