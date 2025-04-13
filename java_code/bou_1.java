/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bou
 */
public class bou_1
extends boq_2 {
    public static final float B = 100.0f;

    public bou_1(epa_1 epa_12, bor_1 bor_12) {
        super(epa_12, bor_12, (byte)10);
    }

    @Override
    public String c() {
        Object object;
        float f2 = 0.0f;
        int n = efc_0.cf.a();
        List<sd_0> list = azu_0.j().k().cy().b(n);
        for (sd_0 object22 : list) {
            if (!(object22 instanceof eGb)) continue;
            object = (efh_0)((eGb)object22).f();
            byte by = (byte)object.a(0);
            byte by2 = (byte)object.a(1);
            if (by != eps_0.J.a() || by2 != eps_0.H.a()) continue;
            float f3 = object.a(3);
            f2 += f3 / 100.0f;
        }
        int n2 = (int)Math.floor((float)this.y.a() * f2);
        String string = fkq_1.a(this.a(f2), new String[0]);
        object = fkq_1.a(String.valueOf(n2), new String[0]);
        return bae.h().a("sacrierChrageDescription", string, object);
    }

    private String a(float f2) {
        if (f2 == 0.0f) {
            return "0";
        }
        String string = String.format("%.2f", Float.valueOf(f2));
        if (string.indexOf(46) != -1) {
            int n = string.length();
            for (int k = string.length() - 1; k >= 0 && (string.charAt(k) == '0' || string.charAt(k) == '.'); --k) {
                n = k;
                if (string.charAt(k) == '.') break;
            }
            return string.substring(0, n);
        }
        return string;
    }
}

