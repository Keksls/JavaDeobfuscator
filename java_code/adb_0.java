/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;

/*
 * Renamed from adb
 */
public class adb_0 {
    static final TIntHashSet a = new TIntHashSet();
    public final float b = 0.001f;
    public final float c = 2.0f;
    public final float d = 10.0f;
    private float e = 0.0f;

    public void a(acs_0 acs_02, int n) {
        this.e += (float)n;
        ArrayList<acq_0> arrayList = acs_02.g();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            DisplayedScreenElement[] displayedScreenElementArray;
            acq_0 acq_02 = arrayList.get(k);
            if (acq_02 == null || (displayedScreenElementArray = acq_02.d()) == null) continue;
            for (DisplayedScreenElement displayedScreenElement : displayedScreenElementArray) {
                float f2;
                int n2;
                if (!displayedScreenElement.g() || !a.contains(n2 = displayedScreenElement.d().i().a())) continue;
                float f3 = displayedScreenElement.G();
                float f4 = (float)Math.sqrt(f3 * f3 + (f2 = (float)displayedScreenElement.H()) * f2) + 2.0f * this.e / 1000.0f;
                float f5 = 0.001f * Hw.h((float)Math.PI * 2 * f4 / 10.0f);
                if (f5 < 0.0f) {
                    f5 *= 0.2f;
                }
                BatchTransformer batchTransformer = displayedScreenElement.e().D();
                float f6 = batchTransformer.c().c()[12];
                float f7 = batchTransformer.c().c()[13];
                batchTransformer.c().a(new float[]{1.0f + f5, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f + f5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f6, f7, 0.0f, 1.0f});
            }
        }
    }

    static {
        a.add(10208);
        a.add(11138);
        a.add(10036);
        a.add(10211);
        a.add(17702);
        a.add(17704);
        a.add(17712);
        a.add(17713);
        a.add(17755);
        a.add(17756);
    }
}

