/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from cXK
 */
public class cxk_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "actorDescriptorLibrary";
    private final abu d;
    private final int e;

    public cxk_0(int n, int n2) {
        String string = null;
        try {
            string = String.format(azs_0.a().a("ANMInteractiveElementPath"), n2);
        }
        catch (gm_0 gm_02) {
            cxi_0.a.warn((Object)"Probl\u00e8me au chargement de la propri\u00e9t\u00e9 ANMInteractiveElementPath");
        }
        this.d = new abu();
        try {
            this.d.a(string, true);
        }
        catch (IOException iOException) {
            cxi_0.a.error((Object)("Probl\u00e8me au chargement de " + string));
        }
        this.d.a(String.valueOf(n2));
        this.e = n;
    }

    public int a() {
        return this.e;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a(99, (long)this.e, new Object[0]);
        }
        if (string.equals(b)) {
            return this.d;
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cxk_0)) {
            return false;
        }
        return ((cxk_0)object).e == this.e;
    }
}

