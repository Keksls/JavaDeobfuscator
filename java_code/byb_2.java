/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Renamed from byb
 */
public class byb_2
implements ajh_1 {
    public static final String a = "currentList";
    public static final String b = "currentPage";
    public static final String d = "totalPage";
    public static final String[] e = new String[]{"currentList"};
    private final ArrayList<bym_2> f = new ArrayList();
    private short g = 0;
    private int h;

    public void a(short s2) {
        this.g = s2;
    }

    public short a() {
        return this.g;
    }

    public void a(ArrayList<bya_1> arrayList) {
        eqn_0 eqn_02 = czr_0.a().d();
        this.f.clear();
        if (eqn_02 == null) {
            eqn_02 = eqn_0.d;
        }
        Comparator<bya_1> comparator = null;
        switch (eqn_02) {
            case c: {
                comparator = new byc_1(this);
                break;
            }
            case d: {
                comparator = new byd_2(this);
                break;
            }
            case e: {
                comparator = new bye_2(this);
                break;
            }
            case f: {
                comparator = new byf_2(this);
                break;
            }
            case a: {
                comparator = new byg_2(this);
                break;
            }
            case b: {
                comparator = new byh_2(this);
            }
        }
        arrayList.sort(comparator);
        for (int k = 0; k < arrayList.size(); ++k) {
            int n = !eqn_02.a() ? this.g * 9 + k + 1 : this.h - (this.g * 9 + k);
            this.f.add(new bym_2(arrayList.get(k), n));
        }
        fis_1.a().a((ajf_1)this, a);
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f;
        }
        if (string.equals(b)) {
            return this.g + 1;
        }
        if (string.equals(d)) {
            return this.b();
        }
        return null;
    }

    private int b() {
        return Hw.d((float)this.h / 9.0f);
    }

    public void a(int n) {
        this.h = n;
        fis_1.a().a((ajf_1)this, b, d);
    }
}

