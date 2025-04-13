/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;

/*
 * Renamed from arm
 */
public class arm_2
implements ark_2 {
    private Hashtable<String, arl_2> e = null;
    private arh_2 f = null;
    private int g = 0;
    private arf_2 h = null;
    private boolean i = false;
    aro_2 a = null;
    arp_2 b = null;
    arr_2 c = null;
    arn_2 d = null;

    public arm_2(arh_2 arh_22) {
        this.f = arh_22;
        this.e = new Hashtable();
        this.e();
    }

    private void e() {
        this.a = new aro_2();
        this.b = new arp_2();
        this.b.a(this.f);
        this.c = new arr_2();
        this.d = new arn_2();
    }

    @Override
    public arb_1 b() {
        ++this.g;
        char c2 = '\u0000';
        while (this.f.c()) {
            c2 = this.f.e();
            if (this.i) {
                arv_2 arv_22 = this.f();
                arv_22.a(this.g);
                return arv_22;
            }
            if (c2 == '<') {
                char c3 = this.f.c(this.f.a() + 1);
                if (c3 == '!') {
                    aru_2 aru_22 = this.g();
                    aru_22.a(this.g);
                    return aru_22;
                }
                arw_2 arw_22 = this.d();
                if (arw_22 != null) {
                    if (!arw_22.h()) {
                        this.h = arw_22;
                        if (this.b(arw_22)) {
                            this.i = true;
                        }
                    } else if (this.h != null && this.h.f().equalsIgnoreCase(arw_22.f())) {
                        this.h = null;
                    }
                }
                arw_22.c(this.g);
                return arw_22;
            }
            if (c2 == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t') {
                this.f.d();
                continue;
            }
            if (this.h != null) {
                if (this.h.f().equalsIgnoreCase("script") || this.h.f().equalsIgnoreCase("style")) {
                    arv_2 arv_23 = this.f();
                    arv_23.a(this.g);
                    return arv_23;
                }
                arx_2 arx_22 = this.a((arf_2)null);
                arx_22.a(this.g);
                return arx_22;
            }
            arx_2 arx_23 = this.a((arf_2)null);
            arx_23.a(this.g);
            return arx_23;
        }
        return null;
    }

    private boolean b(arf_2 arf_22) {
        String string = arf_22.f();
        return string.equalsIgnoreCase("script") || string.equalsIgnoreCase("style");
    }

    private arv_2 f() {
        this.i = false;
        this.a.a(this.f);
        this.a.a(this.h);
        arv_2 arv_22 = null;
        try {
            arv_22 = (arv_2)this.a.b();
        }
        catch (aqz_2 aqz_22) {
            aqz_22.printStackTrace();
        }
        return arv_22;
    }

    public arw_2 d() {
        this.b.a(this.f);
        arw_2 arw_22 = null;
        try {
            arw_22 = (arw_2)this.b.d();
        }
        catch (aqz_2 aqz_22) {
            aqz_22.printStackTrace();
        }
        return arw_22;
    }

    public arx_2 a(arf_2 arf_22) {
        this.c.a(this.f);
        this.c.a(arf_22);
        arx_2 arx_22 = null;
        try {
            arx_22 = (arx_2)this.c.c();
        }
        catch (aqz_2 aqz_22) {
            aqz_22.printStackTrace();
        }
        return arx_22;
    }

    private aru_2 g() {
        this.d.a(this.f);
        arb_1 arb_12 = null;
        try {
            arb_12 = this.d.b();
        }
        catch (aqz_2 aqz_22) {
            aqz_22.printStackTrace();
        }
        return (aru_2)arb_12;
    }

    @Override
    public arh_2 a() {
        return this.f;
    }

    @Override
    public boolean c() {
        return this.f.c();
    }

    @Override
    public void a(arl_2 arl_22) {
    }
}

