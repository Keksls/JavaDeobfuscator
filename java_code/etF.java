/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.List;

@Criterion(description="Return a global variable value related to the key, returns -1 if an error occurs", signatures={@Signature(description="Return the global variable", params={@Parameter(name="type (see GlobalVariableTypes enum)", type=VarType.NUMBER), @Parameter(name="key", type=VarType.STRING)})})
public class etF
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final epg_0 b;
    private final String c;

    public etF(ArrayList<aot_2> arrayList) {
        this.b = epg_0.a((byte)((aoq_1)arrayList.get(0)).a(null, null, null, null));
        this.c = ((apd_2)arrayList.get(1)).b().toLowerCase();
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        try {
            switch (this.b) {
                case a: {
                    return eph_0.a.a(this.c) ? -1L : 0L;
                }
                case b: {
                    return eph_0.a.b(this.c);
                }
                case c: {
                    return eph_0.a.c(this.c);
                }
                case d: {
                    return eph_0.a.d(this.c);
                }
                case e: {
                    return eph_0.a.e(this.c);
                }
            }
            return -1L;
        }
        catch (NumberFormatException numberFormatException) {
            d.error((Object)"Exception raised", (Throwable)numberFormatException);
            return -1L;
        }
        catch (ClassCastException classCastException) {
            d.error((Object)"Exception raised", (Throwable)classCastException);
            return -1L;
        }
    }

    @Override
    public Enum c() {
        return eyO.bb;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b, aov_1.a};
        a.add(aov_1Array);
    }
}

