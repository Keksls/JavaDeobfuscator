/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bsm
 */
public class bsm_1
implements ajh_1 {
    public static final String a = "roomTypePermList";
    public static final String b = "individualList";
    public static final String d = "individualMaxSizeText";
    public static final String e = "individualMaxSizeReached";
    private final ffn f;
    private final bsa_1[] g;

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.g;
        }
        if (string.equals(b)) {
            return this.e();
        }
        if (string.equals(e)) {
            int n = this.f.a().size();
            return n >= 25;
        }
        if (string.equals(d)) {
            ani_2 ani_22 = new ani_2();
            int n = this.f.a().size();
            ani_22.a((CharSequence)bae.h().a("dimBag.individualCappedSize", n, 25));
            return ani_22.r();
        }
        return null;
    }

    private Object e() {
        ArrayList<bsn_1> arrayList = new ArrayList<bsn_1>();
        for (ffm ffm2 : this.f.a()) {
            arrayList.add(new bsn_1(this, ffm2.a(), ffm2.b()));
        }
        return arrayList;
    }

    public void a(ffl ffl2) {
        this.f.a(ffl2);
    }

    public void a(ffm ffm2) {
        int n = this.f.a().size();
        if (n >= 25) {
            aUh.a("desc.individualRightsMaxSizeReached", new Object[0]);
            return;
        }
        this.f.a(ffm2);
        this.f();
        fis_1.a().a((ajf_1)this, b, a, d, e);
    }

    public void a(long l) {
        this.f.b(l);
        this.f();
        fis_1.a().a((ajf_1)this, b, a, d, e);
    }

    private void f() {
        for (bsa_1 bsa_12 : this.g) {
            bsa_12.c();
        }
    }

    public bsm_1(ffn ffn2) {
        this.f = ffn2;
        this.g = this.a();
    }

    public bsa_1[] a() {
        int[] nArray = this.b();
        bsa_1[] bsa_1Array = new bsa_1[nArray.length];
        for (int k = 0; k < nArray.length; ++k) {
            bsa_1Array[k] = new bsa_1(nArray[k], this.f);
        }
        return bsa_1Array;
    }

    public int[] b() {
        int n;
        Object object;
        int n2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        bsx_2 bsx_22 = azu_0.j().k().di();
        for (n2 = 0; n2 < 9; n2 = (int)((byte)(n2 + 1))) {
            object = bsx_22.b((byte)n2, true);
            if (object == null || arrayList.contains(n = ((exk_2)object).aT_())) continue;
            arrayList.add(n);
        }
        n2 = arrayList.size();
        object = new int[n2];
        for (n = 0; n < n2; ++n) {
            object[n] = (Integer)arrayList.get(n);
        }
        return object;
    }

    public ffn c() {
        return this.f;
    }
}

